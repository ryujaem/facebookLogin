package com.example.facebookLogin;

import com.example.facebookLogin.Data.*;
import com.example.facebookLogin.Repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller {

    private final UserRepository userRepository;
    private final AllergyRepository allergyRepository;
    private final FavoriteRepository favoriteRepository;
    private final RestaurantRepository restaurantRepository;
    private final MenuRepository menuRepository;
    private final RestaurantService restaurantService;
    private final ReviewRepository reviewRepository;


    @PostMapping("/join")
    public String join(User user) {
        if (userRepository.existsById(user.getId())) {
            return "User with ID " + user.getId() + " already exists!";
        }

        User u = User.builder()
                .id(user.getId())
                .name(user.getName())
                .date(user.getDate())
                .build();

        userRepository.save(u);
        System.out.println(u);

        // Return the user ID as you were doing before
        return user.getId();
    }

    @PostMapping("/allergySave")
    public String allergySave(AllergyData allergyData) {

        System.out.println(allergyData);

        AllergyData allergy = AllergyData.builder()
                .USER_id(allergyData.getUSER_id())
                .seafood(allergyData.getSeafood())
                .lactose(allergyData.getLactose())
                .peach(allergyData.getPeach())
                .beef(allergyData.getBeef())
                .pork(allergyData.getPork())
                .corn(allergyData.getCorn())
                .mushroom(allergyData.getMushroom())
                .broccoli(allergyData.getBroccoli())
                .peanut(allergyData.getPeanut())
                .crustaceans(allergyData.getCrustaceans())
                .pepper(allergyData.getPepper())
                .eggs(allergyData.getEggs())
                .build();

        System.out.println(allergy);
        allergyRepository.save(allergy);

        return "저장완료";
    }

    @PostMapping("/favoriteSave")
    public String favoriteSave(FavoriteData favoriteData) {
        System.out.println(favoriteData);

        FavoriteData favorite = FavoriteData.builder()
                .USER_id(favoriteData.getUSER_id())
                .spicy(favoriteData.getSpicy())
                .bitter(favoriteData.getBitter())
                .sweet(favoriteData.getSweet())
                .sour(favoriteData.getSour())
                .salty(favoriteData.getSalty())
                .build();

        favoriteRepository.save(favorite);
        return "저장성공";
    }

    @GetMapping("/getAllergy/{userId}")
    public AllergyData getAllergyData(String userId) {
        System.out.println(userId);
        return allergyRepository.findById(userId).orElse(null);
    }

    @GetMapping("/getMenuAllergy/{code}")
    public MenuData getMenuData(String code) {
        System.out.println(menuRepository.findById(code).orElse(null));
        return menuRepository.findById(code).orElse(null);
    }

    @PostMapping("/uploadAiRestaurant")
    public List<RestaurantData> uploadAllergies(@RequestBody AllergyData allergies) {

        System.out.println("aaaaaa" + restaurantService.findAiRestaurant(allergies));

        return restaurantService.findAiRestaurant(allergies);
    }

    @GetMapping("/getRestaurant/{menuName}")
    public List<RestaurantData> getRestaurant(@PathVariable("menuName") MenuData menuName) {
        System.out.println(menuName);
        System.out.println(restaurantRepository.findByMenu(menuName));
        return restaurantRepository.findByMenu(menuName);
    }

    @PostMapping("/reviewSave")
    public String reviewSave(@RequestBody ReviewData reviewData) {

        System.out.println(reviewData);

        ReviewData review = ReviewData.builder()
                .userId(reviewData.getUserId())
                .hygiene(reviewData.getHygiene())
                .service(reviewData.getService())
                .variety(reviewData.getVariety())
                .taste(reviewData.getTaste())
                .design(reviewData.getDesign())
                .average(reviewData.getAverage())
                .restaurantsName(reviewData.getRestaurantsName())
                .time(reviewData.getTime())
                .build();

        System.out.println(review);
        reviewRepository.save(review);

        return "저장완료";
    }

    @GetMapping("/getReview/{restaurantsName}")
    public List<ReviewData> getReview(String restaurantsName) {
        System.out.println("bbbbbbbb"+restaurantsName);
        System.out.println("bbbbbbbb"+reviewRepository.findByRestaurantsName(restaurantsName));
        return reviewRepository.findByRestaurantsName(restaurantsName);
    }

    @GetMapping("/getAverages/{restaurantsName}")
    public Float getAverages(String restaurantsName) {

        System.out.println("ccccccc" + restaurantsName);
        System.out.println("ccccccc" + reviewRepository.findAveragesByRestaurantsName(restaurantsName));

        Float average = 0.0F;

        if (reviewRepository.findAveragesByRestaurantsName(restaurantsName) != null){
            average = reviewRepository.findAveragesByRestaurantsName(restaurantsName);
        } else {
            average = 0.0f;
        }

        return average;
    }

    @GetMapping("/getFavorite/{userId}")
    public FavoriteData getFavorite(String userId) {
        System.out.println(userId);
        return favoriteRepository.findById(userId).orElse(null);
    }
}