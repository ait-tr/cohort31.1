# Lesson plan No.14 01/29/2024

1. What we did in the last lesson:
    1. Create a project using Spring Initializr
        - Spring WEB, Thymeleaf, Java Persistence API(JPA)
    2. Creating a project structure:
        - controller
        - entity
          -repository
          3.home.html
        - Thymeleaf connection
        - connecting bootstrap design elements
    4. Connection to the DBMS
        - IDE configuration
        - application.properties file
    5. Development of BlogController and blog page:
        - blog-main.html - list of all posts ("more details..." - will be under each post)
        - blog-add.html - add a new blog (form)
        - blog-details.html - displays the contents of the post
-------------------------------------------------- ----------
    - blod-edit.html - post editing
      - blog-delete.html - deleting a post
        all these pages and their addresses are called **end-points**

2. Plan for today's lesson:

**Exercise 1:**
- finishing the project **blog-demo**:
    - pages and their end-points - controllers:
        - blod-edit.html - post editing
        - blog-delete.html - deleting a post
    - go through the project again: architecture, logic, functionality

**Task 2:**
- create a new Spring Boot project api-demo (REST)
    - web
    - add Lombok and use its annotations
- add a DTO layer to the application (see theory)
    - create a dto package containing the following classes:
        - NewUserDto
        - UserDto
    - add the Swagger tool


================================================================

## План занятия №14 29.01.2024:

1. Что мы сделали на прошлом занятии:

**Задание 1:**
- доделали проект **blog-demo (MVC)**:
  - страницы и их end-points - контроллеры:
      - blod-edit.html - редактирование поста
      - blog-delete.html - удаление поста - **самостоятельно**
  - прошли по проекту еще раз: архитектура, логика, функционал

**Задание 2:**
- создали новый Spring Boot проект api-demo (REST)
    - Spring Web
    - Lombok
- добавили в приложение слой DTO:
    - создаем пакет dto, в нем классы:
        - NewUserDto
        - UserDto

2. План на сегодняшнее занятие:

**Задание 1**
- доделать UserService (вчера не сделали методы)
- проверить приложение со старыми контроллерами, что слой DTO работает

**Задание 2**
- новые контроллеры на REST
- отправка запросов из IDE IntelliJ IDEA
- добавляем инструмент Swagger
- документирование API 





