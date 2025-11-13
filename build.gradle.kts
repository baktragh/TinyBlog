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
    implementation("org.springframework.data:spring-data-jpa")
    implementation("org.hibernate:hibernate-core:7.1.4.Final")
    implementation ("mysql:mysql-connector-java:8.0.33")
    implementation("org.hibernate:hibernate-entitymanager:5.6.15.Final")
    //implementation("com.h2database:h2:2.3.230")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.5.7")
}
