# Theory

## 01. Security for WEB applications

* Authentication is a process in which the application requests a login and password and verifies their correctness
  * user data authentication
* Authorization is the process by which the application verifies the user's rights to perform any operations
  * for example, checking whether the user can receive all courses at `/courses`
* An HTTP session is an object (an entity with fields) that is stored on the server with which a specific user can be associated.

## 02. Session-based authentication process

* The client sends a POST request to the server at `api/login`;
* In the body of the request, the client transmits authentication data, at least email and password;
* The server checks the correctness of this data (finds the user in the database, calculates the hash of the entered password, compares it with the one in the database);
* If the login data is correct, then the server creates a session object in RAM:
  * associates user data with this object;
  * assigns an identifier to an object;
  * sends this identifier to the client, which is stored on the client in browser cookies.

The end of this process: the user has been verified and you can continue to “work” with him.

## 03. Session-based authorization process

* The client sends its request along with a cookie that contains the session identifier;
* The server uses this identifier to find the session in the storage and receive its attributes (in our case, this is the user);
* Having received the user, the server checks his role and access to a specific endpoint based on rules (we will describe further);
* Either the requested resource or a 403 status (Forbidden) is returned to the client.

### Good to know:

1. When used for REST APIs, in practice, an approach based on JWT tokens is more often used - special markers that allow you to distinguish on a friend-or-foe basis.
2. During the interview, they may ask, where is the session ultimately stored? Correct answer: on the server and on the client we store only its identifier.
3. Session attributes should not store the current user for security reasons.
4. If the application is restarted, the session is reset and all users need to log in again.
5. If the user logs out, then in this case the session is also reset.
6. The “lifetime” of an idle Spring Boot session depends on the application settings; the default is 30 minutes.
7. Why are sessions convenient? On the frontend there is no need to control the saving of the session identifier and its sending.
8. The session problem is not a universal mechanism; they are not used for other types of clients (for example, mobile applications).
9. If you need to make sure that when the server is rebooted, sessions are not cleared and all users do not have to log in again - you need to store sessions in a database (usually REDIS is used).

## 04. Configuring Spring Boot security with Spring Security

* When connecting Spring Boot Starter Security the following appears:
  * Login page;
  * Protection of all endpoints;
  * Login `user;
  * Password is generated in the console;
* But we want people to log in with their own usernames and passwords.

### Steps to configure Spring Security

1. Create a class implementation of the `UserDetails` interface
  * This class is needed to adapt the user to Spring Security security
  * Essentially, this is an adapter of our `User` class for `Spring Security`
  * In our case this is the `AuthenticatedUser` class
2. Create a class implementation of the `UserDetailsService` interface
  * This class is needed to show Spring Security where to get the user for verification
  * In our case this is the class `UserDetailsServiceImpl`
3. Configuring Spring Security (see comments in the code)
4. Check the operation of endpoints

-------------------------------------------------------

# Теория

## 01. Безопасность для WEB-приложений

* Аутентификация - процесс, при котором приложение запрашивает логин и пароль и проверяет их корректность
  * проверка подлинности данных пользователя
* Авторизация - процесс, при котором приложение проверяет права пользователя на выполнение каких-либо операций
  * например, проверка на возможность получения пользователем всех курсов по адресу `/courses`
* HTTP-сессия - это объект (сущность с полями), который хранится на сервере, с которым может быть ассоциирован конкретный пользователь.

## 02. Процесс аутентификации на основе сессии

* Клиент отправляет POST-запрос на сервер по адресу `api/login`;
* В теле запроса клиент передает данные для аутентификации, как минимум, email и пароль;
* Сервер проверяет корректность этих данных (находит пользователя в базе, вычисляет хеш введенного пароля, сравнивает его с тем, который есть в базе);
* Если данные для входа корректные, то сервер в оперативной памяти создает объект сессии:
  * ассоциирует с этим объектом данные пользователя;
  * назначает объекту идентификатор;
  * отправляет клиенту этот идентификатор, который на клиенте сохраняется в "куках" браузера.

Финал этого процесса: пользователь проверен, с ним можно дальше "работать".

## 03. Процесс авторизации на основе сессии

* Клиент посылает свой запрос вместе с кукой, которая содержит идентификатор сессии;
* Сервер по этому идентификатору находит сессию в хранилище и получает ее атрибуты (в нашем случае это пользователь);
* Получив пользователя, сервер проверяет его роль и доступ к определенному endpoint на основе правил (опишем далее);
* Клиенту возвращается либо запрошенный ресурс, либо 403-статус (Запрещено).

### Полезно знать:

1. При использовании для REST API на практике чаще применяется подход, основанный на JWT-токенах - специальных маркерах, которые позволяют отличать по принципу свой-чужой.
2. На собеседовании могут спросить, а где в итоге хранится сессия? Правильный ответ: на сервере, на клиенте мы храним только ее идентификатор.
3. В атрибутах сессии не должен хранится текущий пользователь из соображений безопасности.
4. Если приложение перезапустить, то сессия сбрасывается и всем пользователям нужно заново войти в него.
5. Если пользователь сделает logout, то в этом случае сессия тоже сбрасывается.
6. Время "жизни" в простое сессии Spring Boot зависит от настроек приложения, по умолчанию - 30 минут.
7. Почему сессии - это удобно? На frontend не нужно контролировать сохранение идентификатора сессии и его отправку. 
8. Проблема сессий - это не универсальный механизм, для других типов клиентов (например, мобильных приложений) они не используются. 
9. Если необходимо сделать так, чтобы при перезагрузке сервера сессии не очищались и всем пользователям не приходилось заново логиниться - нужно хранить сессии в БД (обычно используют REDIS).

## 04. Настройка безопасности Spring Boot с Spring Security

* При подключении Spring Boot Starter Security появляется:
  * Страница входа;
  * Защита всех endpoints;
  * Логин `user;
  * Пароль генерируется в консоли;
* Но мы хотим, чтобы люди заходили под своими логинами и паролями.

### Шаги по настройке Spring Security

1. Создать класс-реализацию интерфейса `UserDetails`
  * Данный класс нужен для того, чтобы адаптировать пользователя под безопасность Spring Security
  * По сути, это адаптер нашего класса `User` для `Spring Security`
  * В нашем случае это класс `AuthenticatedUser`
2. Создать класс-реализацию интерфейса `UserDetailsService`
  * Данный класс нужен для того, чтобы показать Spring Security откуда брать пользователя для проверки
  * В нашем случае это класс `UserDetailsServiceImpl`
3. Настройка конфигурации Spring Security (см. комментарии в коде)
4. Проверить работу endpoints