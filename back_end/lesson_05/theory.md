# Theory

## Maven

* Apache Maven is a tool for managing and building software within projects in the Java programming language, although it can also be used to manage projects in other languages.

Maven's main features include:

* Project Build: Maven automates the project build process, including source code compilation, testing, executable creation, and dependency management.

* Dependency management: Maven allows you to easily manage project dependencies by pulling the necessary libraries from the central Maven repository or other remote repositories.

* Project Structure: Maven provides a standard project structure that makes it easy to organize code and resources.

* Lifecycles and Tasks: Maven defines various stages of a project's lifecycle (eg compile, test, package, install) and provides the ability to perform various tasks at each stage.

Central Repository: Maven uses a central repository where many popular libraries and plugins are stored and available for automatic download.

To use Maven, you need to define a pom.xml (Project Object Model) file that specifies project settings, dependencies, plugins, and other parameters. Maven uses this file to configure the project's build.

Benefits of Maven include standardizing the build process, managing dependencies, and improving project maintainability.



## Project testing

* To test the **repository**, which is responsible for working with data:
  * You cannot use the “combat” database (file) that is used in the main project for testing.
  * It is necessary to create a temporary file (temporary database) before each test, which we will immediately delete after each test.
  * This approach allows us not to damage or in any way change the data that is important to us in the main project.

* To test the **service**, you must:
  * Create a temporary stub, `mock` implementation for a specific test.
  * For this implementation, we will explicitly describe what values a particular method should return.
  * This approach is called mock testing and is used in Unit/Unit tests.
  * In tests, we check ONLY our class (service), regardless of how other classes (layers) and their methods work, in order to accurately understand the cause of the error in the service class/method.
  * Mock testing allows you to “surround” a service with “stubs” so that the service does not “tear” the repository, but works in isolation during the test.

* Annotations used:
  * `@BeforeEach` - a JUnit annotation with which we can mark a method that is run automatically before each test
  * `@AfterEach` - a JUnit annotation that we can use to mark a method that is run after each test
  * `@Nested` - an annotation that can be used to mark nested classes with tests
    * We use nested classes to group tests; each nested class can contain tests for a specific method

## Notes

* `Arrays.asList(T ... a)` - creates an `ArrayList` based on a set of objects.
* `Mockito` - library for Mock testing.
* `.class` - getting a description of the type of a class, used when Java needs to check whether an object belongs to a class.
* `stubbing` - a process when we explicitly specify the implementation of a stub
* `verify` - suitable when you need to check whether a void method was called

## Dictionary

* `before each` - before each
* `after each` - after each
* `temp` - temporary
* `exists` - exists (contained)
* `nested` - internal
* `expected` - expected (the result that we expect)
* `actual` - actual (the result that we actually received)
* `replace underscores` - replace underscores


==========================================================
# Теория

## Maven

* Apache Maven — это инструмент для управления проектами и сборки программного обеспечения в рамках проектов на языке программирования Java, хотя он также может быть использован для управления проектами на других языках.

Основные функции Maven включают в себя:

* Сборка проекта: Maven автоматизирует процесс сборки проекта, включая компиляцию исходного кода, тестирование, создание исполняемых файлов и управление зависимостями.

* Управление зависимостями: Maven позволяет легко управлять зависимостями проекта, подтягивая нужные библиотеки из центрального репозитория Maven или других удаленных репозиториев.

* Структура проекта: Maven предоставляет стандартную структуру проекта, что упрощает организацию кода и ресурсов.

* Жизненные циклы и задачи: Maven определяет различные этапы жизненного цикла проекта (например, compile, test, package, install) и предоставляет возможность выполнять различные задачи на каждом этапе.

Центральный репозиторий: Maven использует центральный репозиторий, где хранятся многие популярные библиотеки и плагины, доступные для автоматической загрузки.

Для использования Maven, вам нужно определить файл pom.xml (Project Object Model), в котором указываются настройки проекта, зависимости, плагины и другие параметры. Maven использует этот файл для настройки сборки проекта.

Преимущества Maven включают в себя стандартизацию процесса сборки, управление зависимостями и улучшение поддерживаемости проектов.

## Тестирование проекта

* Чтобы протестировать **репозиторий**, который отвечает за работу с данными:
    * Нельзя использовать для тестирования "боевую" базу данных (файл), которая используется в основном проекте.
    * Необходимо сделать временный файл (временную базу данных) перед каждым тестом, которую будем сразу удалять его после каждого теста.
    * Такой подход позволяет не повредить или как-либо изменить те данные, которые нам важны в основном проекте.

* Чтобы протестировать **сервис**, необходимо:
    * Создать временную заглушку, `mock`-реализацию для конкретного теста.
    * Для этой реализации мы явно опишем какие значения должен возвращать тот или иной метод.
    * Такой подход называется mock-тестированием и используется в Unit/Модульных тестах.
    * В тестах мы проверяем ТОЛЬКО наш класс (сервис), независимо от того, как работают другие классы(слои) и их методы, чтобы точно понять причину ошибки в классе/методе сервиса.
    * Mock-тестирование позволяет "обложить" сервис "заглушками", чтобы сервис "не дергал" репозиторий, а работал изолированно во время теста.

* Используемые аннотации:
  * `@BeforeEach` - аннотация JUnit, которой мы можем пометить метод, запускаемый перед каждым тестом автоматически
  * `@AfterEach` - аннотация JUnit, которой мы можем пометить метод, запускаемый после каждого теста
  * `@Nested` - аннотация, которой можно помечать вложенные классы с тестами
      * Вложенные классы используем для группировки тестов, каждый вложенный класс может содержать тесты для конкретного метода

## Заметки

* `Arrays.asList(T ... a)` - создает `ArrayList` на основе набора объектов.
* `Mockito` - библиотека для Mock-тестирования.
* `.class` - получение описания типа какого-либо класса, используется, когда Java нужно проверить, принадлежит ли какой-либо объект какому-то классу.
* `stubbing` - процесс, когда мы явно прописываем реализацию какой-либо заглушки
* `verify` - подходит, когда нужно проверить, был ли вызван void-метод

## Словарик

* `before each` - перед каждым
* `after each` - после каждого
* `temp` - временный
* `exists` - существует (содержится)
* `nested` - внутренний
* `expected` - ожидаемый (тот результат, который мы ожидаем)
* `actual` - актуальный (тот результат, который нам пришел по факту)
* `replace underscores` - заменить нижние подчеркивания
