# Lesson plan No.10 01/23/2024

1. What we did in the last lesson:
   Completed 3 tasks:
   **Task 1** - testing and understanding how and what Spring does:
    - create a Maven project based on the webapp archetype (another step towards a web application)
    - add spring dependencies to it:
      -spring-core
      -spring-beans
        - spring-context
    - create a configuration xml file to understand the mechanism for embedding beans
    - let's create a spring-test application, it contains two classes:
        - MessageBean
        - TestSpring
          task:
        - pull the bean out of the application context
        - create an object based on it
        - get the result of the method of this object (some kind of message)
        - display it on the screen

**Task 2** - let’s look at the classic MusicPlayer example:
- add classes:
- Music interface
- its implementation ClassicalMusic, RockMusic
- add beans for the player to the xml configuration file:
- musicBean
- musicPlayer, in which musicBean is embedded
- create MusicPlayerSpringAppl, in which:
- create an application context
- extract bins from it

**Task 3** - creating the 1st web project using Spring + Spring Boot
**mvc-demo**:
- new project using Spring Initializr
- Lombook
- Spring Web
- Apache Freemarker
- create the home.html page


2. Plan for today's lesson:

**Task:**
get user data from the registration form, write the user to the repository, display a list of registered users on a separate page.

Implementation plan:
- create a form on the registration page for registering users with 3 fields
  (we do it without ID for now, the database will be responsible for this)
  - name (nickname)
  - email
  - password
    - model.User - update
      -repository
        - CrudRepository - 5 standard methods:
          -
        - UserRepository - inherits from ..., add method ...
          impl:
            - UserRepositoryFileImpl - we implement the main (most necessary at the 1st stage) methods:
                - ...
                - ...
    - service
        - UserService - connect to it..., implement methods...
          do impl
          -UserServiceImpl
    - controller
        - UserController
            - @PostMapping
            - @GetMapping

================================================================

## План занятия №10 23.01.2024:

1. Что мы сделали на прошлом занятии:

## Выполнили 3 задания:

**Задание 1** - тестируем и понимаем, как и что делает Spring:
   - создадим Maven-проект на базе архетипа webapp (еще один шаг к web-приложению)
   - добавим в него зависимости на spring:
     - spring-core
     - spring-beans
     - spring-context
   - создадим конфигурационный xml-файл, чтобы понять механизм встраивания бинов
   - сделаем приложение spring-test, в нем два класса:
     - MessageBean
     - TestSpring
     задача: 
     - вытащить бин из контекста приложения
     - создать на его базе объект
     - получить результат работы метода этого объекта (какой-то message)
     - вывести его на экран

**Задание 2** - разбираем класcический пример MusicPlayer:
   - добавляем классы:
     - интерфейс Music
     - его имплементации ClassicalMusic, RockMusic
   - добавляем бины для плеера в конфигурационный xml-файл:
     - musicBean
     - musicPlayer, в который внедрен musicBean
   - создаем MusicPlayerSpringAppl, в котором:
     - создаем контекст приложения
     - извлекаем из него бины

**Задание 3** - создаем 1-й web-проект на Spring + Spring Boot 
**mvc-demo**:
    - новый проект с помощью Spring Initializr
        - Lombook
        - Spring Web
        - Apache Freemarker
    - создаем страницу home.html


2. План на сегодняшнее занятие:

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
- создаем необходимые html-страницы
- указываем файл для хранения пользователей в application.properties
- проверяем решение








