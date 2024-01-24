# Lesson plan No.11 01/24/2024

1. What we did in the last lesson:

## Followed the steps:

**Task:**
get user data from the registration form, write the user to the repository, display a list of registered users on a separate page.

**Implementation plan:**
- create a form on the registration page for registering users with 3 fields
  (we do it without ID for now, the database will be responsible for this)
    - name (nickname)
    - email
    - password
        - model.User - update
          -repository
            - CrudRepository - 5 standard methods (CRUD):
                - save (create)
                - update
                - delete
                - findById
                - findAll
            - UserRepository - inherited from CrudRepo, add the findByEmail method (Email is a Set of unique IDs)
              impl:
                - UserRepositoryFileImpl - we implement the main (most necessary at the 1st stage) methods:
                  -save
                    - findAll
        - service
            - UserService - connect UserRepository to it, implement methods:
                - addUser
                - findAll
                  do impl
                    - UserServiceImpl - implement 2 methods
        - controller
            - UserController - connect UserService to it
                - @PostMapping
                - @GetMapping

        - specify the file for storing users in application.properties

2. Plan for today's lesson:

**Task 1:**
Finishing mvc-demo1:
- create the necessary html pages:
    - home (done)
    - registration_page (done)
   ----------------------------------
    - success_signUp.html
    - users.html
    - finishing the UserController - request processing
- make navigation between pages
- checking the solution

**Task 2:**
Based on the experience gained, let's make a blog (blog-demo) using the following technologies:
- Spring + Spring Boot, Spring Initializr: Spring WEB, Thymeleaf, Java Persistence API(JPA)
- Thymeleaf template engine
- Bootstrap: page design, CSS
- MySQL DBMS
  Based on MVC architecture, we will create a CRUD application that has the ability to:
- create a blog post;
- edit a blog post;
- display all posts and view each post;
- delete post.

================================================================

## План занятия №11 24.01.2024:

1. Что мы сделали на прошлом занятии:

## Выполнили шаги:

**Задача:**
получить данные пользователя из формы регистрации, записать пользователя в репозиторий, отобразить список зарегистрированных пользователей на отдельной странице.

**План реализации:**
- создаем на странице регистрации форму для регистрации пользователей на 3 поля
  (делаем пока без ID, за это будет отвечать БД)
  - имя (ник)
  - email
  - пароль
    - model.User - обновить
    - repository
        - CrudRepository - 5 типовых методов (CRUD):
            - save (create)
            - update
            - delete
            - findById
            - findAll
        - UserRepository - наследуется от CrudRepo, добавляем метод findByEmail (Email - это Set уникальных ид)
          impl:
            - UserRepositoryFileImpl - делаем имплементацию главных (самых нужных на 1-м этапе) методов:
                - save
                - findAll
    - service
        - UserService - подключаем к нему UserRepository, реализуем методы:
            - addUser
            - findAll
              делаем impl
                - UserServiceImpl - реализуем 2 метода
    - controller
        - UserController - подключаем к нему UserService
            - @PostMapping
            - @GetMapping

    - указываем файл для хранения пользователей в application.properties

2. План на сегодняшнее занятие:

**Задача 1:**
Доделываем mvc-demo1:
- создаем необходимые html-страницы:
  - home (сделана)
  - registration_page (сделана)
  ----------------------------------
  - success_signUp.html
  - users.html
  - доделываем UserController - обработка запросов
- делаем навигацию между страницами
- проверяем решение

**Задача 2:**
На основе полученного опыта давайте сделаем блог (blog-demo) с использованием следующих технологий:
- Spring + Spring Boot, Spring Initializr: Spring WEB, Thymeleaf, Java Persistence API(JPA)
- шаблонизатор Thymeleaf
- Bootstrap: оформление страниц, CSS
- СУБД MySQL
На основе MVC архитектуры сделаем CRUD-приложение, в котором имеется возможность:
- создавать пост для блога;
- редактировать пост для блога;
- отображать все посты и просматривать каждый пост;
- удалить пост.






