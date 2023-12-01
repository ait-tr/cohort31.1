## Ссылки

- [Что такое **Docker**](https://ru.wikipedia.org/wiki/Docker)
- [базовые команды **Docker**](https://www.edureka.co/blog/docker-commands/)
- [Dockerfile](https://docs.docker.com/engine/reference/builder/) (1)
- [Dockerfile](https://docs.docker.com/develop/develop-images/dockerfile_best-practices/) (2)
- [Docker compose](https://www.simplilearn.com/tutorials/docker-tutorial/docker-compose)

## Базовая программная диагностика сервера

1. **Просмотр текущих подключений по `SSH`**
    - `w`
2. **Просмотр информации о дистрибутиве (сборке)**
    - `cat /etc/os-release`
3. **Просмотр загрузки ПЗУ (жесткие диски, SSD и т.д.)**
- `df -h`
    - `-h` human-readable
1. **Просмотр уровень загрузки сервера**
- `htop`
- `q` - для выхода
- **uptime (аптайм)** - время непрерывной работы
1. **Проверка сетевой подсистемы**
    - `ping google.de`
    - `CTRL + C` - прервать

## Масштабирование

1. Вертикальное (качественный показатель)
2. Горизонтальное (количественный показатель)

## Базовые компоненты любого проекта

- `DB` хранилище
- `FE` интерфейс
- `BE` бизнес-логика
- `Deployment` развертывание (напр., с помощью **Docker**)

## Что такое Docker

- прикладное ПО  (приложение) - появилось в 2013
- представляет собой платформу для контейнеризации приложений

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/80cf1e94-f9fb-44dc-b651-7b41cffa3398/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/d0eb580d-0716-4aaa-a48e-69f89da2185c/Untitled.png)

## Установка Docker

[Get Docker](https://docs.docker.com/get-docker/)

## Регистрация на Docker Hub

[Docker Hub Container Image Library | App Containerization](https://hub.docker.com/)

## Основные термины

- **Docker Hub** - самый распространенный реестр образов
    - позволяет делиться собственными образами и хранит базовые (стандартные) образы
- **Docker CLI** - командный интерфейс работы с Docker
- **Docker Desktop** - GUI-интерфейс работы с Docker
- **Образ (image)** - выполняемый пакет, который включает все необходимое для запуска приложения, включая код приложения, среду выполнения и зависимости
- **Контейнер (container)** - экземпляр образа (процесс), который выполняется в изолированной среде
    - обеспечивает уровень изоляции от других приложений и основной системы
- **`Dockerfile`** - текстовый файл, содержащий инструкции для построения **Docker-образа**
    - определяет код и зависимости (состав), которые должны быть включены в образ

## Основные команды

- `docker version` просмотр версии
- `docker login` авторизация на **Docker Hub** (и проверка)
- `docker run hello-world` запуск тестовый контейнер на основе стандартного образа
    - `docker run web-app` запуск на основе образа web-app
- `docker run -it ubuntu bash` запуск оболочки `bash` в режиме песочницы
    - `CTRL + C` прерывать выполнение
    - `docker run -p host_port:container_port image_name`
    - `docker run -p 5000:5000 web-app` с пробросом портов
        - `docker run -p 5000:5000 web-app:2.0` с пробросом портов
- `docker build -t web-app .` создать (создать) образ на основе **Dockerfile** из текущего каталога
    - `docker build -t web-app:1.0 .`
- `docker images --filter=reference=web-app` просмотр списка образов по конкретному приложению
- `docker tag image_name docker_hub_username/repo_name` привязка к **DockerHub**
    - `docker tag image_name:2.0 docker_hub_username/repo_name:2.0`
- `docker push docker_hub_username/repo_name` выгрузка на **DockerHub**
    - `docker push docker_hub_username/repo_name:2.0`

## Базовый порядок работы с Docker

1. Открыть имеющийся проект (или создать новый)
2. Создать `Dockerfile`
3. Создать образ (на основе `Dockerfile`)
4. Запуск контейнера на основе образа

## Механизм сетевых портов

- **сетевой порт** - сетевой идентификатор процесса (программы)

## Тестовый проект #1 (на Python)

```python
## файл app.py

from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello():
    return 'Hello, ANDREI!'

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0')
```

```docker
## Dockerfile

# Указываем базовый образ
FROM python:3.8-slim

# Устанавливаем зависимости
RUN pip install --no-cache-dir flask

# Копируем файлы в рабочую директорию контейнера
COPY . /app
WORKDIR /app

# Указываем команду, которая будет выполняться при запуске контейнера
CMD ["python", "app.py"]
```

## Тестовый проект #2 (на Java)

```docker
https://github.com/spring-projects/spring-petclinic.git
```

```docker
## Dockerfile

FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
```

**Запуск проекта #2**

`docker run -p 8080:8080 pclinic` запуск проекта (название `pclinic` необх. изменить на свое)

```docker
http://127.0.0.1:8080/
```