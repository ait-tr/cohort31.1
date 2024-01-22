# Lesson plan No. 9 01/22/2024



## План занятия №8 22.01.2024:

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
     - MessageBin
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
mvc-demo:
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
   









