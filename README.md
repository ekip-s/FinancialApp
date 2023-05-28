## Создание и доработки проекта:
### `version-1.03`
 - формирование schema.sql; - done
 - формирование моделей; - done
 - сделать сервисы и контроллеры на бэке; - in progress
 - сделать обработку ошибок; - in progress
 - добавить Swagger; - in progress
***
### `version-1.02` - done
 - добавил Dockerfile + docker-compose.yml; 
 - отладил запуск и сборку; 
 - релиз текущей версии на сервер;
***
### `version-1.01` - done
- разделил сервисы;
- 17-а я java;
- перешел на новую конфигурацию Spring Security;
- сделал ссылку из заголовка сайта и добавил ссылку на гит в подвал;
***
### `version-1.00` - done
- разработка базовой логики;
- настройка Spring Security;
- загрузка проекта на сервер;
- настрока логики Nginx;



***
## Описание файлов properties:
### Для фронта: 
```
server.port=
server.backend.address= //здесь url на бэк сервис;
```
### Для бэка: 
```
server.port=122

spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=none
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQL10Dialect
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.sql.init.mode=always

spring.jpa.open-in-view=false
```
### `docker-compose.yml`
* здесь структура файла. Удалил: назнания имеджей, названия контейнеров, порты и переменные. При желании повторить - заполните своими данными. Если нужна помощь - напишите на email: ekip-s@yandex.ru; 
```
version: '3.0'
services:
  website_frontend:
    build: ./website_frontend
    image: 
    restart: always
    container_name: 
    depends_on:
      - backend_master_service
    ports:
      - ":"

  backend_master_service:
    build: ./backend_master_service
    image: 
    restart: always
    container_name: 
    depends_on:
      - ewm-db
    ports:
      - ":"
    environment:
      - SPRING_DATASOURCE_URL=
      - POSTGRES_DB=
      - POSTGRES_USER=
      - POSTGRES_PASSWORD=

  ewm-db:
    image: postgres:15.2
    container_name: 
    restart: always
    ports:
      - "6541:5432"
    environment:
      - POSTGRES_DB=
      - POSTGRES_USER=
      - POSTGRES_PASSWORD=
```


