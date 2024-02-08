# Lesson plan No.20 02/08/2024

1. What we did in the last lesson:
    - created an application in which there are two entities:
        - users(users):
          -User
            - UserProfile
        - events, for example, amateur training and sports:
            - Fitlio
    - we implement such an application taking into account:
        - `Object Relational Mapping`/`ORM` - see the theory section;
        - all previously acquired knowledge on creating a project, principles and approaches of SOLID architecture, necessary annotations and rules for writing a REST API;
        - writing functional and integration tests.

2. Plan for today's lesson:
   - DTO layer
   - UserDto
   - NewUserDto
   - FitlioDto
   - NewFitlioDto
   - "connect" User and UserDto
   - service layer
   - controllers
   - add fitlio
   - get a list of available fitlios
   - make a file with requests:
   - ...
   - ...
   - test the API manually


================================================================

## План занятия №20 08.02.2024:

1. Что мы сделали на прошлом занятии:
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
      
**"Дневник" позволит:**
* накапливать данные о проделанных тренировках и участии в любительских соревнованиях
* оценивать виды и объем физических нагрузок
* выполнять сортировку и предоставлять данные по различным параметрам
* накапливать статистику
* отслеживать динамику и развитие

2. План на занятие:

      - **слой DTO**
        - UserDto - OK
        - NewUserDto - OK
        - FitlioDto - OK
        - NewFitlioDto - OK 
      - **"соединить" User и UserDto** (связь между таблицами) - OK
   ------------------------------------------------------------

Продолжаем с этого места:

      - слой сервисов
   
      - контроллеры
        - добавить занятие (fitlio)
        - получить список имеющихся занятий
        
      - **сделать файл с запросами**:
        - POST - это отправить данные о тренировке (объект типа Fitlio) на сервер
        - GET - получить список тренировок (List<Fitlio>)
        - протестировать "вручную" работу api


**Обязательные темы курса:**
* Maven, pom.xml - конфигурация приложения
* Введение в Spring - фреймворк, Dependency Injection (DI), Inversion of Control (отдаем управление приложением фреймворку)
* Аннотации Spring (Lombok) - позволяют включать стандартные куски кода одним словом @...
* Spring Boot - cовокупность библиотек для разработки и запуска приложения в сети Интернет и с СУБ  
* MVC - model-view-controller, шаблонизаторы Freemarker, Thymeleaf
* Spring Data JPA - Java Persistence API библиотека для подключения к СУБД, предоствавлят интерфейс и его методы CRUD (create, read, update, delete)
* REST API - свод правил и рекомендаций для разработки endpoint (клиент-сервер) по протоколу HTTP, методы GET, POST, PUT, DELETE
--------------------------------

Осталось на следующую неделю:

* Введение в Spring Security
* Spring Security для REST API


    







