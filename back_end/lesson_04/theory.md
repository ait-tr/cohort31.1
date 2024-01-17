# WEB application architecture

## Required solution components
- Internet, TCP/IP protocol, routers
- IP addresses, DNS service
- client-server architecture
  - client: browsers, applications
  - server: server software
- HTTP - protocol ensures data exchange (see below)

## WEB application architecture
We will use a `monolithic three-layer architecture:
* Client
* Logic
* Data

* In our case it looks like this:
  * Client:
    * Layer (controllers package) of “controllers” - responsible for the final interaction with the client (in our case - Processing HTTP requests)
  * Logic:
    * Layer (services package) of “services” - responsible for the business logic of the application
  * Data:
    * Layer of models (models package) (models of the subject area, entities that will be stored in the repository)
    * The “repositories” layer (repositories package) - is responsible for interacting with the data storage


## Tasks for backend developer
* The task of the Backend developer is to write Endpoints - that is, methods that Frontend can call from Backend.
* What other tasks does a backend developer have?
  * Application architecture development
  * Writing API documentation
  * Implementation of authentication/authorization
  * Sending queries to the database
  * Validation of incoming data (the field cannot be empty, the password is too light, etc.)
  * Error handling (attempt to get a user with an ID that is not on the server)
  * Writing unit/integration tests

## HTTP protocol

HTTP is a widely used data transfer protocol, originally intended for the transfer of hypertext documents (that is, documents that may contain links that allow navigation to other documents).

The abbreviation HTTP stands for HyperText Transfer Protocol.
The HTTP protocol involves the use of a client-server data transfer structure. The client application generates a request and sends it to the server, after which the server software processes the request, generates a response and sends it back to the client.

The task that is traditionally solved using the HTTP protocol is the exchange of data between a user application that accesses web resources (usually a web browser) and a web server. At the moment, it is thanks to the HTTP protocol that the World Wide Web operates.

To send an HTTP request, you need to use a URL - this is a "uniform resource locator" (or Uniform Resource Locator). It tells the browser to use the HTTP protocol and then get the file back from that address. Typically, URLs begin with http:// or https:// (depending on the protocol version).

For users, a URL is a set of understandable words: Skillbox, Yandex, Google. But for a computer, these words that we understand are a set of incomprehensible symbols. Therefore, the browser sends the entered words to the DNS, a URL-to-IP address resolver. DNS stands for Domain Name System and can be thought of as a huge table with all the registered names for websites and their IP addresses.

A method in the context of the HTTP protocol is an action that the client expects from the server. For example, send him an HTML site page or receive a document. The HTTP protocol does not limit the number of different methods, but programmers have agreed among themselves to use three main ones:

* **GET** - to get data from the server. For example, a video from YouTube or a meme from Reddit.
* **PUT/POST** - to send data to the server. For example, a message on Telegram or a new track on SoundCloud.
* **HEAD** - to get only metadata about the site's HTML page. This is the data that is in the <head> tag of the HTML file.

The response status contains the version of the HTTP protocol that the client specified in the HTTP request. And after it comes the response status code, for example - 200, which means successful receipt of data.

There are 40 statuses in the HTTP 1.1 specification.
Here are the most popular ones:

* 200 OK - data received successfully;
* 201 Created - means that the request was successful and the data was created. It is used to confirm the success of PUT or POST requests;
* 300 Moved Permanently - indicates that the URL has been changed permanently;
* 400 Bad Request - means an incorrectly formed request. This usually happens in conjunction with POST and PUT requests, when the data is not validated or is not in the correct format;
* 401 Unauthorized - authentication must be performed before requesting access to the resource;
* 404 Not Found - means that the requested resource could not be found;
* 405 Forbidden - says that the specified HTTP method is not supported for the requested resource;
* 409 Conflict - a conflict has occurred. For example, when a client wants to create data twice using a PUT request;
* 500 Internal Server Error - means an error on the server side.


=================================================================================

# Архитектура WEB-приложения

## Необходимые компоненты решения
- Интернет, протокол TCP/IP, маршрутизаторы
- IP-адреса, служба DNS
- клиент-серверная архитектура
  - клиент: браузеры, приложения
  - сервер: серверное ПО 
- HTTP - протокол обеспечивает обмен данными (см. ниже)

## Архитектура WEB-приложения
Мы будем использовать `монолитную трехслойную архитектуру:
  * Клиент
  * Логика
  * Данные

* В нашем случае это выглядит так:
  * Клиент: 
    * Слой (пакет controllers) "контроллеров" - отвечают за конечное взаимодействие с клиентом (в нашем случае - Обработка HTTP-запросов)
  * Логика:
    * Слой (пакет services) "сервисов" - отвечает за бизнес-логику приложения
  * Данные:
      * Слой моделей (пакет models) (модели предметной области, сущности, которые будем сохранять в хранилище)
      * Слой "репозиториев" (пакет repositories) - отвечает за взаимодействие с хранилищем данных


## Задачи для backend-разработчика
* Задача Backend-разработчика написать **Endpoints** - то есть методы, которые может вызывать Frontend у Backend.
* Какие еще задачи у Backend-разработчика?
      * Разработка архитектуры приложения
      * Написание API документации
      * Реализация аутентификации/авторизации
      * Отправка запросов в базу данных
      * Валидация входящих данных (поле не может быть пустым, пароль слишком легкий и т.д.)
      * Обработка ошибок (попытка получить пользователя с ID, которого нет на сервере)
      * Написание модульных/интеграционных тестов

## HTTP - протокол

HTTP — широко распространённый протокол передачи данных, изначально предназначенный для передачи гипертекстовых документов (то есть документов, которые могут содержать ссылки, позволяющие организовать переход к другим документам).

Аббревиатура HTTP расшифровывается как HyperText Transfer Protocol, «протокол передачи гипертекста».
Протокол HTTP предполагает использование клиент-серверной структуры передачи данных. Клиентское приложение формирует запрос и отправляет его на сервер, после чего серверное программное обеспечение обрабатывает данный запрос, формирует ответ и передаёт его обратно клиенту.

Задача, которая традиционно решается с помощью протокола HTTP — обмен данными между пользовательским приложением, осуществляющим доступ к веб-ресурсам (обычно это веб-браузер) и веб-сервером. На данный момент именно благодаря протоколу HTTP обеспечивается работа Всемирной паутины.

Чтобы отправить HTTP-запрос, нужно использовать URL-адрес — это «унифицированный указатель ресурса» (или Uniform Resource Locator). Он указывает браузеру, что нужно использовать HTTP-протокол, а затем получить файл с этого адреса обратно. Обычно URL-адреса начинаются с http:// или https:// (зависит от версии протокола).

Для пользователей URL-адрес — это набор понятных слов: Skillbox, Yandex, Google. Но для компьютера эти понятные нам слова — набор непонятных символов. Поэтому браузер отправляет введённые слова в DNS, преобразователь URL-адресов в IP-адреса. DNS расшифровывается как «доменная система имён» (Domain Name System), и его можно представить как огромную таблицу со всеми зарегистрированными именами для сайтов и их IP-адресами.

Метод в контексте HTTP-протокола — это действие, которое клиент ждёт от сервера. Например, отправить ему HTML-страницу сайта или получить документ. Протокол HTTP не ограничивает количество разных методов, но программисты договорились между собой использовать три основных:

* **GET** — чтобы получить данные с сервера. Например, видео с YouTube или мем с Reddit.
* **PUT/POST** — чтобы отправить данные на сервер. Например, сообщение в Telegram или новый трек в SoundCloud.
* **HEAD** — чтобы получить только метаданные об HTML-странице сайта. Это те данные, которые находятся в <head>-теге HTML-файла.

Статус ответа содержит версию HTTP-протокола, который клиент указал в HTTP-запросе. А после неё идёт код статуса ответа, например, — 200, что означает успешное получение данных.

Всего статусов в спецификации HTTP 1.1 — 40. 
Вот самые популярные из них:

* 200 OK — данные успешно получены;
* 201 Created — значит, что запрос успешный, а данные созданы. Его используют, чтобы подтверждать успех запросов PUT или POST;
* 300 Moved Permanently — указывает, что URL-адрес изменили навсегда;
* 400 Bad Request — означает неверно сформированный запрос. Обычно это случается в связке с запросами POST и PUT, когда данные не прошли проверку или представлены в неправильном формате;
* 401 Unauthorized — нужно выполнить аутентификацию перед тем, как запрашивать доступ к ресурсу;
* 404 Not Found — значит, что не удалось найти запрашиваемый ресурс;
* 405 Forbidden — говорит, что указанный метод HTTP не поддерживается для запрашиваемого ресурса;
* 409 Conflict — произошёл конфликт. Например, когда клиент хочет создать дважды данные с помощью запроса PUT;
* 500 Internal Server Error — означает ошибку со стороны сервера.

