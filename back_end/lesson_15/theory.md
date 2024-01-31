# Theory and action plan

## 01. Database connection

Delete the old repository:
1. Delete users.txt
2. Delete `users.file-name` in application.properties
3. In repositories, delete `UsersRepositoryFileImpl`

## 02.H2 database

* H2 is a minimal DBMS, usually used only for testing
* Analogue of MySQL, PostgreSQL, OracleDB
  *Data can be stored by:
  * in RAM
  * in file

## 03. Connecting a database in a Spring Boot application

* Include dependencies in `pom.xml`:

```xml

<dependency>
     <groupId>com.h2database</groupId>
     <artifactId>h2</artifactId>
     <version>2.2.222</version>
     <scope>runtime</scope>
</dependency>

<dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

* It is enough to specify the settings in `application.properties`
* Spring Boot can connect to the database using these settings
* If we want to store data in RAM (i.e. the database will be cleared after the application is restarted), then we specify in the properties:

```
spring.datasource.url=jdbc:h2:mem:test_db
```

* `jdbc` - protocol for connecting to databases in Java
* `h2` - database type
* `mem` - indicates that the database will be located in RAM
* `shop_db` - database name

* If we want to store data in a file, then we need to specify the URL like this:

```
jdbc:h2:file:~/databases/test_db;AUTO_SERVER=TRUE
```

* `file` - store data in a file
* `~/databases` - the name of the folder where we store the data (in the user's folder in the `databases` subfolder)
* `test_db` - database name
* `AUTO_SERVER=TRUE` - so that you can connect from other applications

## 04. Additional classes and interfaces

* `DataSource` - an object that contains a connection to the database described in `application.properties`
* 'JdbcTemplate' is a class that provides a convenient way to interact with a database using JDBC (Java Database Connectivity). JDBC is a standard interface for interacting with relational databases from Java applications.

## 05. Work plan

* Instead of working with a regular file, we will connect the H2 DBMS, which can store data in memory and in a file.

* Action Plan for H2:
  * Add dependencies on `h2` and `spring-boot-data-jpa` to pom.xml
  * Fill in the `application.properties` file
  * Create a folder `databases` in which the database will be located
  * After launching the application, check that our database appears in the `databases` folder
  * Connect to database via IDEA
  * Launch the database console and send SQL queries through it
  * View table contents
  * If some updates are not visible, you need to click on the two round arrows (re-read the contents, update)

* The following tasks:
  - rewrite the UserRepository repository to work with the database
  - rewrite the UserController controller to work with all the necessary endpoints
  - implement the necessary methods:
    - creating (adding) a user
    - getting one specific and all users
    - user update
    - deleting a user


___________________________________________________________________

# Теория и план действий

## 01. Подключение базы данных

Удаляем старый репозиторий:
1. Удаляем users.txt 
2. Удаляем в application.properties `users.file-name`
3. В repositories удаляем `UsersRepositoryFileImpl`

## 02.H2 база данных

* H2 - это минимальная СУБД, как правило, используется только для тестирования
* Аналог MySQL, PostgreSQL, OracleDB
* Данные может хранить:
  * в оперативной памяти
  * в файле

## 03. Подключение базы данных в Spring Boot приложении

* Подключить зависимости в `pom.xml`:

```xml

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>2.2.222</version>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

* Достаточно указать настройки в `application.properties`
* Spring Boot умеет сам подключаться по этим настройкам к базе
* Если мы хотим хранить данные в оперативной памяти (т.е. база будет очищаться после перезапуска приложения), то указываем в свойствах:

```
spring.datasource.url=jdbc:h2:mem:test_db
```

* `jdbc` - протокол подключения к базам данных в Java
* `h2` - тип базы данных
* `mem` - показывает, что база будет размещаться в оперативной памяти
* `shop_db` - название базы данных

* Если мы хотим хранить данные в файле, то нужно указать URL таким образом:

```
jdbc:h2:file:~/databases/test_db;AUTO_SERVER=TRUE
```

* `file` - храним данные в файле
* `~/databases` - название папки, где мы храним данные (в папке пользователя в подпапке `databases`)
* `test_db` - название базы
* `AUTO_SERVER=TRUE` - чтобы можно было подключаться из других приложений

## 04. Дополнительные классы и интерфейсы

* `DataSource` - объект, который содержит подключение к базе данных, описанной в `application.properties`
* 'JdbcTemplate' - класс, который предоставляет удобный способ взаимодействия с базой данных с использованием JDBC (Java Database Connectivity). JDBC является стандартным интерфейсом для взаимодействия с реляционными базами данных из Java-приложений.

## 05. План работы

* Вместо работы с обычным файлом, мы подключим СУБД H2, которая умеет хранить данные в памяти и в файле.

* План действий по H2:
    * Добавить зависимости на `h2` и `spring-boot-data-jpa` в pom.xml
    * Заполнить файл `application.properties`
    * Создать папку `databases`, в которой будет лежать база данных
    * После запуска приложения, проверить, что наша БД появилась в папке `databases`
    * Подключиться к базе данных через IDEA
    * Запустить консоль базы и отправлять через нее SQL-запросы
    * Просматривать содержимое таблиц
    * Если какие-то обновления не видны, необходимо нажать на две круглые стрелочки (перечитать содержимое, обновить)
  
* Следующие задачи:
    - переписать репозиторий UserRepository для работы с БД
    - переписать контроллер UserController для работы со всеми необходимыми endpoints
    - реализовать необходимые методы:
      - создание(добавление) пользователя
      - получение одного конкретного и всех пользователей
      - обновление пользователя
      - удаление пользователя
