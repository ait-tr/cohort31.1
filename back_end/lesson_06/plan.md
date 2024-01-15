# Lesson plan No. 6 01/16/2024

1. What did we do yesterday?
- created a new project App1-1 based on the Maven builder
- transferred the code of the App1-1 project with users to it
- made a repository implementation on the file UserRepositoryFileImpl.java with methods:
    - void save(User user)
    - List<User> findAll()
    - User findByEmail(String email)
- used Dependency Injection (DI) when connecting the repository to Main
- added dependencies for junit-engine and junit-api to pom.xml
- started writing tests for the service layer of the application

2. Homework was:
- do it in the Events project **Events (holiday calendar)**
  implementation of a repository on a file.

What questions, difficulties?

3. Action plan for the lesson:
    - testing the service layer of the application:
        - UserRepositoryFileImplTest.java
            - creating a temporary test file
            - deleting temporary test file
          -------------------------------------------------- -
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


----------------------------------------------------------

## План занятия №6 16.01.2024:

1. Что мы сделали вчера?
 - завели новый проект App1-1 на основе сборщика Maven
 - перенесли в него код проекта App1-1 с пользователями 
 - сделали реализацию репозитория на файле UserRepositoryFileImpl.java c методами:
   - void save(User user)
   - List<User> findAll()
   - User findByEmail(String email)
 - использовали Dependency Injection (DI) при подключении репозитория в Main
 - добавили в pom.xml зависимости на junit-engine и junit-api
 - начали писать тесты для сервисного слоя приложения

2. Домашнее задание было:
- сделать в проекте Events **События (календарь праздников)**
реализацию репозитория на файле.

Какие вопросы, трудности?

3. План действий на занятие:
    - тестирование сервисного слоя приложения:
      - UserRepositoryFileImplTest.java
        - создание временного тестового файла
        - удаление временного тестового файла
        ---------------------------------------------------
        - проверка корректности формирования строки в файле
        - проверка получения списка пользователей из файла
        
      - UserServiceImplTest.java
        - реакция на некорректный email
        - реакция на некорректный password
        - реакция на попытку создать уже существующего пользователя
        - проверка создания пользователя
      
    - реализация метода void updateUser()
      - добавляем вызов команды в Main -> вызываем сервис
      - добавляем метод в сервис UserService -> вызываем репозиторий
      - добавляем метод в репозиторий -> обновляем файл









