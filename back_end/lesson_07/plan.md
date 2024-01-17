# Lesson plan No. 7 01/17/2024

1. What did we do yesterday?
- testing the service layer of the application:
    - UserRepositoryFileImplTest.java
        - creating a temporary test file
        - deleting temporary test file
        - checking the correctness of the formation of a line in a file
        - check for receiving a list of users from a file

    - UserServiceImplTest.java
        - reaction to incorrect email
        - reaction to incorrect password
        - reaction to an attempt to create an existing user
        - checking user creation

    - implementation of the void updateUser() method
        - add a command call to Main -> call the service
        - add a method to the UserService service -> call the repository
        - add the method to the repository -> update the file

2. Homework was:
    * Write tests for the repository and service (similar to what was done in class)
    * Implement updateEvent() method

What questions, difficulties?

3. Action plan for the current lesson:
    - add a validation layer for email and password
        - interface EmailValidator
        - interface PasswordValidator
          -impl
            - EmailNotEmptyValidatorImpl
            - EmailValidatorRegexImpl
            - PasswordNotEmptyValidatorImpl
            - PasswordValidatorRegexImpl
    - implement validators in UserService
    - update Main, build a class and dependency diagram
    - we understand that even with one User entity there are already, to put it mildly, many classes and their connections, and there can be a lot of entities
    - implement Spring Context (Spring container):
        - add dependency on spring-context to pom.xml
        - create a new AppConfig class with @Bean annotations, thereby transferring to Spring control of the objects that will work in the application - this is called **Inversion of Control (IoC)**
        - study theory, see section Theory
        - make Main 2, into which we implement Spring Context and all created beans
        - make sure that the application is running Spring


----------------------------------------------------------

## План занятия №7 17.01.2024:

1. Что мы сделали вчера?
- тестирование сервисного слоя приложения:
    - UserRepositoryFileImplTest.java
        - создание временного тестового файла
        - удаление временного тестового файла
      -------------------------------------------------------
        - проверка корректности формирования строки в файле save(user)
        - проверка получения списка пользователей из файла findAll()

    - UserServiceImplTest.java - тестируем бизнес-логику
        - реакция на некорректный (пустой) email
        - реакция на некорректный (пустой) password
        - реакция на попытку создать уже существующего пользователя
        - проверка создания пользователя

    - реализация метода void updateUser()
        - добавляем вызов команды в Main -> вызываем сервис
        - добавляем метод в сервис UserService -> вызываем репозиторий
        - добавляем метод в репозиторий -> обновляем файл

2. Домашнее задание было:
   * Написать тесты на репозиторий и сервис (аналогично, как делалось на занятии)
   * Реализовать метод updateEvent()

Какие вопросы, трудности?

3. План действий на текущее занятие:
    - добавляем слой validation для email и password
      - interface EmailValidator
      - interface PasswordValidator
        - impl
          - EmailNotEmptyValidatorImpl
          - EmailValidatorRegexImpl
          - PasswordNotEmptyValidatorImpl
          - PasswordValidatorRegexImpl
    - внедряем валидаторы в UserService
    - обновляем Main, строим диаграмму классов и зависимостей
    - **понимаем**, что даже с одной сущностью User уже, мягко говоря, много классов и их связей, а сущностей может быть очень много 
    - внедряем Spring Context (Spring-контейнер):
      - добавляем в pom.xml зависимость на spring-context
      - создаем новый класс AppConfig с аннотациями @Bean, тем самым передаем в Spring управление объектами, которые будут работать в приложении - это называется **Inversion of Control (IoC)**
      - изучаем теорию, см. раздел Теория
      - делаем Main 2, в который внедряем Spring Context и все созданные бины
      - убеждаемся, что приложение работает под управлением Spring


   









