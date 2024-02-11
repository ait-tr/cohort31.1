# Lesson plan No.20 02/08/2024




================================================================

# План занятия №21 12.02.2024:

## Что мы сделали на прошлом занятии:

1. **Повторили темы курса:**
*     Maven, pom.xml - конфигурация приложения
*     Введение в Spring - фреймворк, Dependency Injection (DI), Inversion of Control (отдаем управление приложением фреймворку)
*     Аннотации Spring (Lombok) - позволяют включать стандартные куски кода одним словом @...
*     Spring Boot - cовокупность библиотек для разработки и запуска приложения в сети Интернет и с СУБ
*     MVC - model-view-controller, шаблонизаторы Freemarker, Thymeleaf
*     Spring Data JPA - Java Persistence API библиотека для подключения к СУБД, предоствавлят интерфейс и его методы CRUD (create, read, update, delete)
*     REST API - свод правил и рекомендаций для разработки endpoint (клиент-сервер) по протоколу HTTP, методы GET, POST, PUT, DELETE
    --------------------------------
    Осталось на текущую неделю:
* Введение в Spring Security
* Spring Security для REST API

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
2. Spring Security - см. раздел теория
3. Пробуем подключить Spring Security 






    







