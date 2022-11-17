# Currency Rate Service

Сервис-посредник для получения курсов валют 
в Json-формате с кэшированием (время жизни кэша настраивается).

### Запуск сервиса локально
Для запуска сервиса необходимо:
* Установленная Java SDK не ниже 11 версии.

Порядок действий:

Очистить старые версии и сгенерировать код по спецификации 
[api-doc.yml](src/main/resources/static/api-doc.yml) и скомпилировать

```mvn clean compile```

Собрать и запустить сервис

```mvn spring-boot:run```

Сервис будет доступен на порту 8081

После запуска сервиса документацию API доступна 
по ссылке http://localhost:8081/swagger-ui.html

Так же документация API доступна в yaml-формате 
[api-doc.yml](src/main/resources/static/api-doc.yml)

Ctrl + C завершение работы.

### Запуск сервиса в docker-контейнерах (docker-compose)

Для запуска в контейнерах на компьютере должны быть установлены 
docker и docker-compose.

Создать необходимые образы, создать и запустить контейнеры

```docker-compose up```

В результате будут созданы docker-образ currency-rate-service,
создан и запущен контейнер currency-rate-service.

Ctrl + C завершение работы.

Повторный запуск контейнера 

```docker start currency-rate-service```

Остановка контейнеров (из другого командного окна) 

```docker stop currency-rate-service```

Если в выводе логов на экран нет потребности, 
то для старта достаточно из папки проекта выполнить 

```docker-compose start```

и для остановки

```docker-compose stop```

### Используемые технологии
* Java 11
* Spring Boot
* Maven
* OpenFeign
* Caffeine
* OpenAPI
