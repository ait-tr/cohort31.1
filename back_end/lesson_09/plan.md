# Lesson plan No. 9 01/22/2024

1. What we did in the last lesson:
    - started using and learning **framework Spring**:
        - added dependency on spring-context to pom.xml
        - created a config package, and in it a new AppConfig class with @Bean annotations, thereby transferring to Spring control of the objects that will work in the application - this is called **Inversion of Control (IoC)**
        - studied theory, see section Theory (this is IMPORTANT!)
        - made Main 2, into which we implemented Spring Context and pulled out all the created beans from it
        - make sure that the application is running Spring
        - run tests

2. Plan for today's lesson:

### Spring - more details

**Task 1** - testing and understanding how and what Spring does:
    - create a Maven project based on the webapp archetype (another step towards a web application)
      - add spring dependencies to it:
      -spring-core
      -spring-beans
      - spring-context
      - create a configuration xml file to understand the mechanism for embedding beans
      - let's create a spring-test application, it contains two classes:
      - MessageBin
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
    mvc-demo:
    - new project using Spring Initializr
      - Lombook
      - Spring Web
      - Apache Freemarker
      - create the home.html page
      - create a form on it for registering users with 4 fields
      - Name
      - surname
      - email
      - password
      - model.User
      -repository
      - CrudRepository
      - UserRepository
      impl:
      - UserRepositoryFileImpl
      - service
      - UserService
      impl
      -UserServiceImpl
      - controller
      - UserController
      - @PostMapping
      - @GetMapping

================================================================

## План занятия №9 22.01.2024:

1. Что мы сделали на прошлом занятии: 
    - начали пользоваться, изучать **framework Spring**:
      - добавили в pom.xml зависимость на spring-context
      - создали пакет config, а в нем новый класс AppConfig с аннотациями @Bean, тем самым передаем в Spring управление объектами, которые будут работать в приложении - это называется **Inversion of Control (IoC)**
      - изучали теорию, см. раздел Теория (это ВАЖНО!)
      - сделали Main 2, в который внедрили Spring Context и вытянули из него все созданные бины
      - убеждаемся, что приложение работает под управлением Spring
      - прогоняем тесты 

2. План на сегодняшнее занятие:

### Spring - подробнее

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
    - создаем на ней форму для регистрации пользователей на 4 поля
        - имя
        - фамилия
        - email
        - пароль
    - model.User
    - repository
        - CrudRepository
        - UserRepository
        impl:
            - UserRepositoryFileImpl
    - service
        - UserService
            impl
            - UserServiceImpl
    - controller
        - UserController
            - @PostMapping
            - @GetMapping
   









