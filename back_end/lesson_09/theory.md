# Theory

## Frontend and Backend - the difference

* **Backend** - server application with business logic and working with a database. PROCESSES HTTP requests.
* Written in Java, C#, Golang, Ruby, etc.

* **Frontend** - client application, runs in the browser, SENDS HTTP requests and receives responses
* Frontend - HTML, CSS, JS + framework (React, Vue, Angular)

* From a code point of view, they can be stored in one project, developed on one developer’s computer with access through local addresses (ports), for example, localhost:8080.

## Spring Boot

## How to connect?

* The parent dependency must be specified on `spring-boot-starter-parent` in pom.xml
* This dependency contains links to other dependencies that a Spring Boot application needs
* So, to ensure you have the necessary tools, you need to specify this dependency as a parent

```
<parent>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-parent</artifactId>
         <version>2.7.15</version>
         <relativePath/> <!-- lookup parent from repository -->
</parent>
```

## What is the difference between Spring and Spring Boot?

* Spring - IoC/DI, creating beans and linking them together (`@Component`, `@Autowired`, `@Bean`, `@Configuration`, `@Qualifier`)

* Spring Boot provides opportunities for auto-configuring a web application, namely:
  * Web environments (in particular, the Tomcat server) are a separate application that is not very easy to configure and run
  * Connect to databases
  * Authorization and authentication, working with user profiles
  * Working with `application.properties`
  * etc.

### Spring Boot Application Structure

* `main` - folder with main source code
  * `java` - source code in Java
  * `resources` - folder with resources
    * `application.properties` - file with application settings
    * `static` - folder for placing static content (html, css, js)
    * `templates` - folder for placing templates (for example, Freemarker)

## Spring Web

* Spring Web is part of the Spring framework, which contains a huge number of libraries and classes for simple implementation of Web applications.
* If you use Spring Web in conjunction with Spring Boot, then everything works out of the box and you don’t need to configure anything.
* Controllers are special Spring (Web) beans that handle HTTP requests.
* Controllers are marked with the `@Controller` annotation, which works the same as `@Component`, but for a web application.

### Annotations for the Web Application

* `@PostMapping` - mark with this annotation the method that will process an HTTP request of the `POST` type
* `@RequestParam` - an annotation that allows you to extract an HTTP request parameter with a specific name
  * This parameter can be passed as part of the URL, or as part of the request body
    * `google.com/search?q=hello` - `@RequestParam("q") String query`

### Dynamic HTML pages

* There are pages that cannot be static, their content and content are constantly changing
* For example, "list of users". This page is subject to change throughout the life of the program, depending on users.

* What solution to the problem is there in our case?
* Various template engines are used (Freemarker, JSP, JSF)
* YOU describe a template with special template engine tags, and then this template engine generates a new version of the HTML page in real time

### MVC

* Model, View, Controller - an approach to developing web applications, which implies the presence of three important components:
  * Model - data (in our case, this is `usersList`)
  * View - view (in our case, this is `users_page`)
  * Controller - a request handler whose task is to connect data and presentation
* Classic approach implemented in many programming languages and frameworks.
* Although the approach is considered obsolete, it is well suited for implementing small applications
* Including a huge number of large systems written in this style.

==========================================================
# Теория

## Frontend и Backend - разница

* **Backend** - серверное приложение с бизнес-логикой и работой с базой данных. ОБРАБАТЫВАЕТ HTTP-запросы.
* Пишется на Java, C#, Golang, Ruby и т.д.

* **Frontend** - клиентское приложение, работает в браузере, ОТПРАВЛЯЕТ HTTP-запросы и получает ответы
* Frontend - HTML, CSS, JS + фреймворк (React, Vue, Angular)

* С точки зрения кода могут храниться в одном проекте, разрабатываются на одном компьютере разработчика с доступом через локальные адреса(порты), например, localhost:8080.

## Spring Boot

## Как подключить?

* Необходимо указать родительскую зависимость на `spring-boot-starter-parent` в pom.xml
* Данная зависимость содержит ссылки на другие зависимости, которые нужны Spring Boot приложению
* Таким образом, чтобы у вас были необходимые инструменты, нужно указать эту зависимость как родительскую

```
<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.15</version>
        <relativePath/> <!-- lookup parent from repository -->
</parent>
```

## В чем разница, между Spring и Spring Boot?

* Spring - IoC/DI, создание бинов и их связывание между собой (`@Component`, `@Autowired`, `@Bean`, `@Configuration`, `@Qualifier`)

* Spring Boot - это возможности для автоконфигурации web-приложения, а именно:
  * Web-окружения (в частности, сервер Tomcat) - отдельное приложение, которое не очень просто настраивать и запускать
  * Подключение к базам данных
  * Авторизация и аутентификация, работа с профилями пользователей
  * Работа с `application.properties`
  * и т.д.

### Структура приложения Spring Boot

* `main` - папка с главным исходным кодом
  * `java` - исходный код на Java
  * `resources` - папка с ресурсами
    * `application.properties` - файл с настройками приложения
    * `static` - папка для размещения статики (html, css, js)
    * `templates` - папка для размещения шаблонов (например, Freemarker)

## Spring Web

* Spring Web - часть фреймворка Spring, которая содержит огромное количество библиотек и классов для простой реализации Web-приложений.
* Если используется Spring Web в связке со Spring Boot - то все работает из коробки и настраивать ничего не надо.
* Контроллеры (Controllers) - особые бины Spring (Web), которые занимаются обработкой HTTP-запросов.
* Контроллеры помечаются аннотацией `@Controller`, которая работает также, как `@Component`, но для веб-приложения.

### Аннотации для Web-приложения

* `@PostMapping` - помечаем данной аннотацией метод, который будет обрабатывать HTTP-запрос типа `POST`
* `@RequestParam` - аннотация, которая позволяет вытащить параметр HTTP-запроса с определенным названием
  * Данный параметр, может быть передан как часть URL, или как часть тела запроса
    * `google.com/search?q=hello` - `@RequestParam("q") String query`

### Динамические HTML-страницы

* Есть страницы, которые не могут быть статическими, их содержимое и контент постоянно меняются
* Например "список пользователей". Для данной страницы характерно изменения на протяжении всей жизни программы, в зависимости от пользователей.

* Какой вариант решения проблемы есть в нашем случае?
* Используются различные шаблонизаторы (Freemarker, JSP, JSF)
* ВЫ описываете некоторый шаблон со специальными тегами шаблонизатора, а затем этот шаблонизатор генерирует в реальном времени новую версию HTML-страницы

### MVC

* Model, View, Controller - подход при разработке веб-приложений, который подразумевает, наличие трех важных компонентов:
  * Model - данные (в нашем случае, это `usersList`)
  * View - представление (в нашем случае, это `users_page`)
  * Controller - обработчик запросов, задача которого связать между собой данные и представление
* Классический подход, реализованный во многих языках программирования и фреймворках.
* Несмотря на то, что подход считается устаревшим, он хорошо подходит для реализации небольших приложений
* В том числе, огромное количество больших систем написано в этом стиле.
