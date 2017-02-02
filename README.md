# redis-pub-sub
Два микросервиса для работы с Redis.

1. publish-service - публикует сообщения
Запуск $ mvn spring-boot:run
server.port=8091
2. subscribe-service - подписывается на них и логирует
Запуск $ mvn spring-boot:run
server.port=8092

