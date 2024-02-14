# Lesson plan No.23 02/14/2024

## What we did in the last lesson:

###Followed the steps to configure Spring Security

1. Create a class implementation of the `UserDetails` interface
* This class is needed to adapt the user to Spring Security security
* Essentially, this is an adapter of our `User` class for `Spring Security`
* In our case this is the `AuthenticatedUser` class
2. Create a class implementation of the `UserDetailsService` interface
* This class is needed to show Spring Security where to get the user for verification
* In our case this is the class `UserDetailsServiceImpl`
3. Configuring Spring Security (see comments in the code)
4. Check the operation of endpoints


## Plan for today's lesson:

1. Refactoring controllers
2. Relationship between User and UserProfile
3. Setting default values in the database for UserProfile fields
4. Checking the operation of end-points

================================================================

# План занятия №23 14.02.2024:

## Что мы сделали на прошлом занятии:

### Выполнили шаги по настройке Spring Security

1. Создать класс-реализацию интерфейса `UserDetails`
* Данный класс нужен для того, чтобы адаптировать пользователя под безопасность Spring Security
* По сути, это адаптер нашего класса `User` для `Spring Security`
* В нашем случае это класс `AuthenticatedUser`
2. Создать класс-реализацию интерфейса `UserDetailsService`
* Данный класс нужен для того, чтобы показать Spring Security откуда брать пользователя для проверки
* В нашем случае это класс `UserDetailsServiceImpl`
3. Настройка конфигурации Spring Security (см. комментарии в коде)
4. Проверить работу endpoints


## План на сегодняшнее занятие:

1. Рефакторинг контроллеров 
2. Связь User и UserProfile
3. Установка значений в БД по умолчанию для полей UserProfile
4. Проверка работы end-points








    







