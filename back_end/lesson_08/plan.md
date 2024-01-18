# Lesson plan No. 8 01/18/2024

1. What we did in the last lesson:
    - added a validation layer for email and password
        - interface EmailValidator
        - interface PasswordValidator
          -impl
            - EmailNotEmptyValidatorImpl
            - EmailValidatorRegexImpl
            - PasswordNotEmptyValidatorImpl
            - PasswordValidatorRegexImpl
    - implemented validators in UserService
    - updated Main, building a class and dependency diagram
    -------------------------------------------------- ----------------------
2. Action plan for the current lesson:
    - **we understand** that even with one User entity there are already, to put it mildly, many classes and their connections, and there can be a lot of entities
    - implement Spring Context (Spring container):
        - add dependency on spring-context to pom.xml
        - create a new AppConfig class with @Bean annotations, thereby transferring to Spring control of the objects that will work in the application - this is called **Inversion of Control (IoC)**
        - study theory, see section Theory
        - make Main 2, into which we implement Spring Context and all created beans
        - make sure that the application is running Spring


----------------------------------------------------------

## План занятия №8 18.01.2024:


1. Что мы сделали на прошлом занятии:
    - добавили слой validation для email и password
      - interface EmailValidator
      - interface PasswordValidator
        - impl
          - EmailNotEmptyValidatorImpl
          - EmailValidatorRegexImpl
          - PasswordNotEmptyValidatorImpl
          - PasswordValidatorRegexImpl
    - внедрили валидаторы в UserService
    - обновили Main, строим диаграмму классов и зависимостей
   ------------------------------------------------------------------------
2. План действий на текущее занятие:
    - **понимаем**, что даже с одной сущностью User уже, мягко говоря, много классов и их связей, а сущностей может быть очень много 
    - внедряем Spring Context (Spring-контейнер):
      - добавляем в pom.xml зависимость на spring-context
      - создаем новый класс AppConfig с аннотациями @Bean, тем самым передаем в Spring управление объектами, которые будут работать в приложении - это называется **Inversion of Control (IoC)**
      - изучаем теорию, см. раздел Теория
      - делаем Main 2, в который внедряем Spring Context и все созданные бины
      - убеждаемся, что приложение работает под управлением Spring


   









