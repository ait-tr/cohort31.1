# Theory

## 01. REST API

* A set of rules and recommendations for designing the correct API for our applications
* `API` (Application Programming Interface) is a set of methods that allows you to interact in some way with a third-party program.

* `API` examples:
  * Public (accessible) methods of a class
  * A set of classes/interfaces/annotations from any library
  * All available HTTP handlers for any server

## 02. Rules and recommendations

* Using HTTP methods (`GET` to get, `POST` to add, `PUT` to update, `DELETE` to delete) instead of specifying the operation name in the URL
  * Not via REST `POST /users/delete`
  * By REST: `DELETE /users/3` - deleting a user with id = 3
* URLs are referred to as “resources”, “subfolders”:
  * If we want to get all the friends of a user with id = 3, then the request will be like this:
    * `GET /users/3/friends`
  * If we want to get all orders made in a company with id 5, then the request will be like this:
    * `GET /companies/5/orders`
      *Using response statuses
  * `200` - OK
  * `201` - Created (response to POST request)
  * `404` - Not found (response to some GET requests)
  * `400` - Bad Request (bad request, the client sent data that the server cannot process)

## 03. JDBC in Spring

* `JdbcTemplate` is a special class that allows you to conveniently work with databases:
  * Send requests
  * Get results
* `RowMapper` - a special interface that describes a “function” that converts the resulting row from the database into a java object
  * Can be implemented as a lambda expression

* Here we just described the lambda expression as a function with two parameters (the resulting string and its number in the overall result)
```
private static final RowMapper<User> USER_ROW_MAPPER = (row, rowNumber) -> {
         // logic for converting row into the desired Java object
};
```

## 04. Annotations

* `@GetMapping("/users/{user-id}")` - a method marked with such a construction will process all requests where something is specified after `users`
* He will place this something in a special variable marked `@PathVariable`
* `@RequestMapping` - can be sent to the controller so that the required prefix is added to all handlers
* `@RestController` is an annotation that allows you to omit the `ResponseBody`

## 05. Steps to write your own API

* Make all endpoints start with 'api' and the name of the entity you are working with, example: (`@RequestMapping("/api/users")`)
* Remove all unnecessary `ResponseBody`, and replace `@Controller` with `@RestController`
* Implement and document required methods

## 06. Good style

* When deleting, updating or adding, you must always return the entity with which you performed this operation
* This will allow the Frontend to reflect the latest information in the application

## 07. Testing endpoints

* `@SpringBootTest` - allows you to run a full-fledged application with all beans for tests
* `@AutoConfigureMockMvc` - allows you to configure the `MockMvc` component
* `MockMvc` - a class that is designed to send requests to your service
  * Simulates a client application (swagger, requests.http)
  * Allows you to analyze the response
* `@ActiveProfiles("test")` - we say that to configure the application you need to use `application-test.properties`

=========================================================================

# Теория

## 01. REST API

* Свод правил и рекомендации для оформления правильного API для наших приложений
* `API` (Application Programming Interface) - это набор методов, который позволяет каким-либо образом взаимодействовать со сторонней программой.

* Примеры `API`:
    * Публичные (доступные) методы какого-то класса
    * Набор классов/интерфейсов/аннотаций из какой-либо библиотеки
    * Все доступные HTTP-обработчики какого-либо сервера (погода, новости, расписание, биржевые курсы и т.д.)

## 02. Правила и рекомендации

* Использование HTTP-методов (`GET` для получения, `POST` для добавления, `PUT` для обновления, `DELETE` для удаления) вместо указания названия операции в URL
    * Не по REST: `POST /users/delete`
    * По REST: `DELETE /users/3` - удаление пользователя с id = 3
* URL именуем как "ресурсы", "вложенные папки":
    * Если хотим получить всех друзей пользователя с id = 3, то запрос будет такой:
        * `GET /users/3/friends`
    * Если хотим получить все заказы, сделанные в компании с id 5, то запрос будет такой:
        * `GET /companies/5/orders`
* Использование статусов ответа
    * `200` - OK
    * `201` - Created (ответ на POST-запрос)
    * `404` - Не найдено (ответ на некоторые GET-запросы)
    * `400` - Bad Request (плохой запрос, клиент отправил данные, которые сервер не может обработать)

## 03. Аннотации

* `@GetMapping("/users/{user-id}")` - метод, помеченный такой конструкцией, будет обрабатывать все запросы, где после `users` будет что-то указано
* Это что-то он поместит в специальную переменную, помеченную `@PathVariable`
* `@RequestMapping` - можно повестить на контроллер, чтобы ко всем обработчикам добавился нужный префикс
* `@RestController` - аннотация, которая позволяет не указывать `ResponseBody`

## 04. Шаги для написания своего API

* Сделать так, чтобы все endpoints начинались с 'api' и названия сущности, с которой вы работаете, пример: (`@RequestMapping("/api/users")`)
* Убрать все лишние `ResponseBody`, и заменить `@Controller` на `@RestController`
* Реализовать и задокументировать необходимые методы

## 05. Хороший стиль

* При удалении, обновлении и добавлении всегда нужно **возвращать** ту сущность, с которой вы произвели эту операцию
* Это позволит Frontend-у отразить актуальную информацию в приложении

## 06. Тестирование endpoints

* `@SpringBootTest` - позволяет запустить для тестов полноценное приложение со всеми бинами
* `@AutoConfigureMockMvc` - позволяет сконфигурировать компонент `MockMvc`
* `MockMvc` - класс, который предназначен для отправки запросов на ваш сервис
    * Имитирует клиентское приложение (swagger, requests.http)
    * Позволяет анализировать ответ
* `@ActiveProfiles("test")` - говорим, что для конфигурации приложения нужно использовать `application-test.properties`

## ORM
* `Object Relational Mapping`/`ORM` - подход, при котором объектно-ориентированный код автоматически отображается в реляционные отношения:
  * На основе класса создается SQL-таблица, в которой поля класса - это заголовки колонок в таблице базы данных.
* `Java Persistence API`/`JPA` - набор аннотаций, которые позволяют реализовать ORM в Java (`javax.persistence`):
    * `@Entity` - показывает, что на основе класса нужно создать таблицу.
    * `@Id` - показывает, что поле является первичным ключом в базе данных (идентификатором, `primary key`)
    * `@Column` - ставим над полем класса, которое станет столбцом в БД
      * `nullable = false` - задает атрибут `NOT NULL` для колонки
      * `length = 1000` - задает максимальную длину для колонки, которая хранит текст
    * Если мы не указываем `@Column` над полем, то он для строк дает значение по умолчанию 255, `NOT NULL` не ставится
    * `@GeneratedValue(strategy = GenerationType.IDENTITY)` - говорит, что значение столбца генерируется автоматически
    * `@Enumerated(value = EnumType.STRING)` - говорит, что enum будет храниться как строка, по умолчанию - как число:
      * `DRAFT` -> `0`
      * `PUBLISHED` -> `1`
* `Hibernate` - ORM-фреймворк, генерирует SQL-код на основе аннотаций JPA
* `JpaRepository` - интерфейс, часть фреймворка `Spring Data JPA`, содержит базовые операции над моделями
  * позволяет избежать написания большей части SQL-запросов к базе данных

---------------------------------------------------------------

## 01. Создание нового проекта

* выбираем New Project в IntelliJ IDEA
* выбираем Spring Initializr
  * Language: `Java`
  * Type : `Maven`
* Group, Artifact, Package Name
* Spring Boot: `3.2.2`
* Dependencies
  * Developer Tools
    * `Lombok`
  * Web
    * `Spring Web`
  * SQL
    * `Spring Data JPA`
    * `H2 Database`
* Удаляем папки `static` и `templates`

## 02. Настройка базы данных
* В `resources` в `application.properties` прописываем подключение к Postgres SQL

## 03. Прописываем архитектуру проекта с помощью пакетов

* `controller` - обработка HTTP-запросов
* `dto` - передача объектов 
* `model` - модели предметной области
* `repository` - классы для работы с хранилищем (базой данных)
* `service` - бизнес-логика

## 04. Определяемся с задачей и создаем модель предметной области

### Пример задачи
"Дневник занятий спортом":
- позволяет пользователю фиксировать различные виды физической активности;
- получать различные отчеты за выбранный период.

**"Дневник" позволит:**
* накапливать данные о проделанных тренировках и участии в любительских соревнованиях
* оценивать виды и объем физических нагрузок
* выполнять сортировку и предоставлять данные по различным параметрам
* накапливать статистику
* отслеживать динамику и развитие

### Формализованное ТЗ:
  * классы и их поля
  * методы
  * endpoints

### Создание моделей

* Создаем модель (классы с полями и методами)
* Помечаем всеми необходимыми аннотациями `lombok`
* Помечаем всеми необходимыми аннотациями `JPA` (для работы с БД, пакет `javax.persistence`)

## 05. Реализация endpoint-а

* Создаем контроллер
* Создаем соответствующий метод (в сервисе)
* Создаем репозиторий
* Вызываем соответствующий метод репозитория в сервисе
* Проверяем статус через `requests.http`
* Пишем тесты

```
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
```
