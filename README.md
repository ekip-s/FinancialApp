## `version-1.00`
 - разбить текущую логику на 2 сервиса; 
 - перейти на 17-ую версию java;
 - организовать централизовонный обработчик ошибок;
 - организовать базу данных и сервисы в соответствии с моделью; 
 - добавить фонфигурацию докера; 

### `version-1.01`
 - разделил сервисы; 
 - 17-ая java;
 - перешел на новую конфигурацию Spring Security; 
 - сделал ссылку из заголовка сайта и добавил ссылку на гит в подвал; 




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


