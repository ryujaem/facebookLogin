FROM gradle:jdk17 as builder

# 작업 디렉토리 설정
WORKDIR /home/gradle/src

# 소스 코드 복사
COPY --chown=gradle:gradle . /home/gradle/src

# Gradle을 사용하여 애플리케이션 빌드
RUN gradle bootJar --no-daemon

FROM openjdk:17-oracle

# 빌드 단계에서 생성된 JAR 파일 복사
COPY --from=builder /home/gradle/src/build/libs/*.jar /app/app.jar

# 애플리케이션 실행
ENTRYPOINT ["java","-jar","/app/app.jar"]


#ARG JAR_FILE=build/libs/facebookLogin-0.0.1-SNAPSHOT.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java", "-jar", "app.jar"]
