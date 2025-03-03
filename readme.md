### TinyBlog

This is an experimental project where I practice creating REST APIs using the Spring Boot library.

## Components
- Blog Entries - Simple blog entries with title, subtitle, main text, and footer
- REST API Controller for manipulating blog entry
- Repositories of blog entries
  - Simple in-memory repository  
  - TODO: Database backed repository (using Spring Data or JPA)
- TODO: A simple front-end (Angular, React or similar)

## Build system
- Gradle
- Using the Application plugin for simple execution
- Using the Spring boot plugin to support Spring Boot

## How to execute
- Run ```gradlew build``` to build the project
- Run ```gradlew run``` to run the project