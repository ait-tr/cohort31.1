# Lesson plan No.13 01/28/2024

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

## План занятия №13 28.01.2024:

1. Что мы сделали на прошлом занятии:
   1. Создание проекта с помощью Spring Initializr
      - Spring WEB, Thymeleaf, Java Persistence API(JPA)
   2. Создание структуры проекта:
      - controller
      - entity
      - repository
   3. home.html
      - подключение Thymeleaf
      - подключение элементов дизайна bootstrap
   4. Подключение к СУБД
      - конфигурирование IDE
      - файл application.properties
   5. Разработка BlogController и страницы блога:
      - blog-main.html - список всех постов ("подробнее..." - будет под каждым постом)
      - blog-add.html - добавлять новый блог (форма)
      - blog-details.html - отображает содержимое поста
------------------------------------------------------------
   - blod-edit.html - редактирование поста
     - blog-delete.html - удаление поста
       все эти страницы и их адреса называются **end-points**

2. План на сегодняшнее занятие:

**Задание 1:**
- доделываем проект **blog-demo**:
  - страницы и их end-points - контроллеры:
     - blod-edit.html - редактирование поста
     - blog-delete.html - удаление поста
  - проходим по проекту еще раз: архитектура, логика, функционал

**Задание 2:**
- создаем новый Spring Boot проект api-demo (REST)
  - web
  - добавляем Lombok и используем его аннотации
- добавляем в приложение слой DTO (см. теория)
  - создаем пакет dto, в нем классы:
    - NewUserDto
    - UserDto
  - добавляем инструмент Swagger





