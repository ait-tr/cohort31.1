# Lesson plan No.20 02/08/2024

## What we did in the last lesson:

1. **Repeated course topics:**
* Maven, pom.xml - application configuration
* Introduction to Spring - framework, Dependency Injection (DI), Inversion of Control (we give control of the application to the framework)
* Spring annotations (Lombok) - allow you to include standard pieces of code in one word @...
* Spring Boot - a set of libraries for developing and running applications on the Internet and with a SMS
* MVC - model-view-controller, template engines Freemarker, Thymeleaf
* Spring Data JPA - Java Persistence API library for connecting to a DBMS, providing an interface and its CRUD methods (create, read, update, delete)
* REST API - a set of rules and recommendations for developing an endpoint (client-server) over the HTTP protocol, methods GET, POST, PUT, DELETE
  --------------------------------
  Remaining for this week:
  *Introduction to Spring Security
* Spring Security for REST API

2. Developed the Fitlio application
    - created an application in which there are two entities:
        - users(users):
            - User: id, name, email, password, role,
            - UserProfile: id(?), firstName, lastName, gender, dateOfBirth, weight, height, allowance
        - events, for example, amateur training and sports:
            - Fitlio: id, title, description, timeMinute, timeHour, date, calorie, distance, type: GENERAL, POWER, CARDIO, GAME, CALORIE, STAMINA
    - we implement such an application taking into account:
        - `Object Relational Mapping`/`ORM` - see the theory section;
        - all previously acquired knowledge on creating a project, principles and approaches of SOLID architecture, necessary annotations and rules for writing a REST API;
        - writing functional and integration tests.
        - **DTO layer**
            - UserDto - OK
            - NewUserDto - OK
            - FitlioDto - OK
            - NewFitlioDto - OK
        - **"connect" User and User~~Dto~~Profile** (relationship between tables) - OK
        - service layer
        - controllers
            - add an activity (fitlio)
            - get a list of available classes
-------------------------------------------------

## Plan for today's lesson:

1. Working with the application:
   - **make a file with requests**:
   - POST is to send training data (Fitlio type object) to the server
   - GET - get a list of workouts (List<Fitlio>)
   - test the API manually
   - make requests from Swagger
   - understanding validation and annotations for Swagger
2. Spring Security - see theory section
3. Trying to connect Spring Security


================================================================

# План занятия №21 12.02.2024:

## Что мы сделали на прошлом занятии:

1. **Повторили темы курса:**
*     Maven, pom.xml - конфигурация приложения
*     Введение в Spring - фреймворк, Dependency Injection (DI), Inversion of Control (отдаем управление приложением фреймворку)
*     Аннотации Spring (Lombok) - позволяют включать стандартные куски кода одним словом @...
*     Spring Boot - cовокупность библиотек для разработки и запуска приложения в сети Интернет (WEB-server Tomcat) и с СУБД
*     MVC - model-view-controller, шаблонизаторы Freemarker, Thymeleaf
*     Spring Data JPA - Java Persistence API библиотека для подключения к СУБД, предоствавлят интерфейс и его методы CRUD (create, read, update, delete)
*     REST API - свод правил и рекомендаций для разработки endpoint (клиент-сервер) по протоколу HTTP, методы GET, POST, PUT, DELETE
    --------------------------------
    Осталось на текущую неделю:
* Введение в Spring Security
* Spring Security для REST API

Популярные WEB-серверы:
- Apache
- Nginx

2. Разработали приложение Fitlio
    - создали приложение, в котором есть две сущности(entity):
      - users(пользователи):
        - User: id, name, email, password, role, 
        - UserProfile: id(?), firstName, lastName, gender, dateOfBirth, weight, height, allowance
      - events(события), например, любительские тренировки и занятия спортом:
        - Fitlio: id, title, description, timeMinute, timeHour, date, calorie, distance, type: GENERAL, POWER, CARDIO, GAME, CALORIE, STAMINA
    - делаем реализацию такого приложения с учетом:
        - `Object Relational Mapping`/`ORM` - см. раздел теория;
        - всех полученных ранее знаний по созданию проекта, принципов и подходов SOLID-архитектуры, необходимых аннотаций и правил написания REST API;
        - пишем функциональные и интеграционные тесты.
      - **слой DTO**
        - UserDto - OK
        - NewUserDto - OK
        - FitlioDto - OK
        - NewFitlioDto - OK 
      - **"соединить" User и User~~Dto~~Profile** (связь между таблицами) - OK
      - слой сервисов
      - контроллеры
        - добавить занятие (fitlio)
        - получить список имеющихся занятий
       -------------------------------------------------

## План на сегодняшнее занятие:

1. Работаем с приложением:
      - **сделать файл с запросами**:
        - POST - это отправить данные о тренировке (объект типа Fitlio) на сервер
        - GET - получить список тренировок (List<Fitlio>)
        - протестировать "вручную" работу api
      - делаем запросы из Swagger
      - разбираемся с validation и аннотациями для Swagger
   
2. **Spring Security** - см. раздел теория







    







