plugins {
    id("java")
    id("org.springframework.boot") version "3.4.3"
    id("war")
    id("application")
}

application {
    mainClass = "baktra.tinyblog.BlogServiceApplication"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:3.4.3"))
    implementation("org.springframework.boot:spring-boot")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("jakarta.persistence:jakarta.persistence-api")
    implementation("org.springframework.data:spring-data-jpa")
    implementation("org.springframework.data:spring-data-jpa")
    implementation("org.hibernate:hibernate-core-jakarta:5.6.15.Final")
    implementation("com.h2database:h2")



}
