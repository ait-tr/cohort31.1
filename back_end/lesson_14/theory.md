# Theory

# Theory

## Criticism of MVC architecture
* Frontend and Backend development is carried out in one project - this violates their independence and does not allow parallel development, including testing.
* Frontend pages contain template engine tags that need to be studied further.
* If another type of client application appears (for example, a mobile application), then you will have to write other types of controllers, prepare “your own” pages for them, etc.
* Strategically, Frontend and Backend should be as independent as possible.
* As a result, the winning approach was one that allows the backend application to receive and send data via the HTTP protocol, BUT not be responsible for its appearance.


## Theses on the transition to REST API

* Transition from MVC architecture to API:
    - The HTTP protocol allows you not only not to forward HTML pages, but also to exchange messages in XML and JSON formats
    - modern approach - we send and receive JSON, and their processing occurs on the backend and frontend.


## DTO - data transfer object

* Data Transfer Object - object for transporting data between client and server
* An important layer of application architecture, which is a class that describes an object:
  *Which we receive from the client and transmit to the server
    * Send from the server to the client
* Its necessity is due to the fact that on the frontend and backend the data can have different forms - names of fields, data format
* In a simplified form, DTOs are those JSONs that are received and sent to the frontend
    * JSON (JavaScript Object Notation) format
        * Example:
          `{
          "name": "John Doe",
          "age": 30,
          "isStudent": false,
          "courses": ["Math", "History", "English"],
          "address": {
          "street": "123 Main St",
          "city": "Anytown"
          }
          }`

* Each DTO is specific to the request, for example, creating a new user requires 4 fields, and a user displayed in the list requires three or two, so we have `NewUserDto` when we receive and `UserDto` when we give the user.
* Each outgoing DTO must contain methods to convert from a single model and a list of models
* DTOs work at the level of controllers and services (i.e. service methods must accept and return DTOs)
* Since the conversion methods are static, they can simply be imported into the service layer and called only by name:
    * `import static de.ait.shop.dto.UserDto.from;`
    * `return from(user);`

* The DTO layer allows you to document the API - essentially describe:
    - what the end-point receives/transmits
    - who and what user roles have access to it


## Important notes as this development progresses

* We used lombok annotations:
    - @Getters
    - @Setters
    - AllArgsConstructor
    - NoArgsConstructor
    - @EqualsAndHashCode

* In the controller we left methods that use annotations:
  `@RequestBody` and `@ResponseBody`

* REST requests can and should be checked using Intellij IDEA
  (to do this you need to create a requests.http file).
  It is important that the Tomcat server is running.

* Frontend and testers need to understand which request is responsible for what and what requests there are in general, so as development progresses, we need to make documentation describing the endpoints - this is provided by Swagger.

**Important!**
* Since the frontend can be on any domain, you must allow the server to process requests from any domain; you must add the following to the main `ApiDemoApplication` file:

```
  @Bean
     public WebMvcConfigurer cors() {
         return new WebMvcConfigurer() {
             @Override
             public void addCorsMappings(CorsRegistry registry) {
                 registry.addMapping("/**").allowedOrigins("*");
             }
         };
     }
```

==========================================================

# Теория

## Критика MVC архитектуры
* Разработка Frontend и Backend выполняется в одном проекте - это нарушает их независимость, не позволяет вести параллельную разработку, в том числе, тестирование.
* Frontend-страницы содержат теги шаблонизаторов, которые нужно изучать дополнительно.
* Если появится другой тип клиентского приложения (например, мобильное приложение), то придется писать другие типы контроллеров, готовить для них "свои" страницы и т.д.
* Стратегически Frontend и Backend должны быть максимально независимыми.
* В итоге победил подход, который позволяет backend-приложению принимать и отправлять данные по HTTP-протоколу, НО не отвечать за их внешний вид.


## Тезисы по переходу на REST API

* Переход от MVC-архитектуры к API:
    - HTTP-протокол позволяет не только не пересылать html-страницы, но и обмениваться сообщениями в XML и JSON форматах
    - современный подход - отправляем и принимаем JSON, а их обработка происходит на стороне backend и frontend.


## DTO - data transfer object

* Data Transfer Object - объект для транспортировки данных между клиентом и сервером
* Важный слой архитектуры приложения, который представляет собой класс, описывающий объект:
    * Который мы принимаем от клиента и передаем на сервер
    * Отправляем с сервера клиенту
* Его необходимость обусловлена тем, что на фронтэнде и бэкенде данные могут иметь разный вид - наименование полей, формат данных
* В упрощенном виде DTO - это те JSON, которые принимают и отдают фронтенду
  * формат JSON (JavaScript Object Notation)
    * Пример:
`    {
      "name": "John Doe",
      "age": 30,
      "isStudent": false,
      "courses": ["Math", "History", "English"],
      "address": {
      "street": "123 Main St",
      "city": "Anytown"
      }
      }`

* Каждый DTO специфичен для запроса, например, для создания нового пользователя нужно 4 поля, а для пользователя отображаемого в списке нужно три или два, поэтому у нас есть `NewUserDto`, когда мы получаем и `UserDto`, когда отдаем пользователя.
* Каждый исходящий DTO должен содержать методы для конвертации из одной модели и списка моделей
* DTO-работают на уровне контроллеров и сервисов (т.е. методы сервисов должны принимать и отдавать DTO)
* Поскольку методы конвертации статические, то их можно просто импортировать в сервис слой и вызывать только по названию:
    * `import static de.ait.shop.dto.UserDto.from;`
    * `return from(user);`

* Слой DTO позволяет документировать API - по сути, описывать:
    - что получает/передает end-point
    - кто, какие роли пользователей имеют к нему доступ


## Важные замечания по ходу этой разработки

* Мы использовали аннотации lombok при создании классов:
    - @Getters
    - @Setters
    - AllArgsConstructor
    - NoArgsConstructor
    - @EqualsAndHashCode

* В контроллере мы оставили методы, которые используют аннотации:
    `@RequestBody` и `@ResponseBody`

* REST-запросы можно и нужно проверять через Intellij IDEA 
(для этого нужно создать requests.http-файл). 
При этом важно, чтобы сервер Tomcat был запущен.

* Frontend-у и тестировщикам нужно понимать, какой запрос за что отвечает и какие вообще запросы есть, поэтому по ходу разработки нам нужно делать документацию, описывающую endpoints - это обеспечивает **Swagger**.

**Важно!**
* Поскольку frontend может быть на любом домене, необходимо разрешить на сервере обработку запросов с любого домена, в главный файл `ApiDemoApplication` необходимо добавить:

```
 @Bean
    public WebMvcConfigurer cors() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
```

