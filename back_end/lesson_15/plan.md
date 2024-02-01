# Lesson plan No.15 01/31/2024

1. What we did in the last lesson:

- created a DTO layer
- wrote new REST controllers for endpoint /users
- learned to make GET and POST/PUT requests from IntelliJ IDEA (file request1.http)
- added Swagger tool, opens via link
  http://localhost:8080/swagger-ui/index.html#/Authentication/post_api_login
- API documentation using annotations:
  - @Schema (name = "Name", example = "Leonid")
  - @Operation(summary = "Get all users", description = "For admin only ")

2. Plan for today's lesson:
- see file theory.md

================================================================

## План занятия №15 31.01.2024:

1. Что мы сделали на прошлом занятии:

- создали слой DTO - он помогает(обеспечивает) передачу данных между клиентом и сервером(бек и фронтом)

- написали новые контроллеры на REST для endpoint /users
  - @GetMapping - забирает данные с сервера, Mapping - это сопоставление
  - @PostMapping - отправляет данные на сервер

- научились делать GET  и POST/PUT запросы из IDE IntelliJ IDEA (файл request1.http)

- добавили инструмент Swagger (вставили необходимую зависимость в pom.xml), открывается по ссылке
http://localhost:8080/swagger-ui/index.html#/Authentication/post_api_login
очень нужен тестировщикам(!!!)
- документирование API с помощью аннотаций:
  - @Schema (name = "Name", example = "Leonid")
  - @Operation(summary = "Get all users", description = "For admin only ")

2. План на сегодняшнее занятие:
- см. файл теория theory.md 




