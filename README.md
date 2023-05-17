# PortableMQ Demo

Example of [PortableMQ](https://github.com/josh910830/portable-mq).

Set by `./env/docker-compose.yml`.  
Run as `SpringBootApplication`.  
Test with `http` in each package.

---

## Cases

### Spring

- [Success](./src/main/java/com/github/josh910830/portablemqdemo/spring/demo)
- [Deadletter (Consumer exception)](./src/main/java/com/github/josh910830/portablemqdemo/spring/deadletterdemo)

### Kafka

- [Success](./src/main/java/com/github/josh910830/portablemqdemo/kafka/demo)
- [Badletter (parse exception)](./src/main/java/com/github/josh910830/portablemqdemo/kafka/badletterdemo)
- [Deadletter (handle exception)](./src/main/java/com/github/josh910830/portablemqdemo/kafka/daedletterdemo)

---

## Implementations

### Postgres

- [DeadletterStore](./src/main/java/com/github/josh910830/portablemqdemo/adapter/postgres)

### Redis

- [ConsumptionLogStore](./src/main/java/com/github/josh910830/portablemqdemo/adapter/redis)

### Property

- RedriveTokenManager

### Log

- DeadletterNotifier
