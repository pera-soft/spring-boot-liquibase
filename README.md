# Spring Boot & Liquibase

```
It is an open source library used to track, manage and implement database changes.
```

### Liquibase Benefits
* Open source
* The database is independent
* Flexible (changes can be applied now or later)
* Easy to read, easy to follow
* Can be loaded into the versioning system
* All database changes can be viewed in one place
* Changes from multiple developers can be combined
* Automatically detects entity changes and generates change-log file
* Change log file supports multiple formats (yaml, json, xml, sql)
* Differences between two databases can be taken
* Undo changes (rollback)
* Liquibase keeps track of history (databasechangelog table)

### Generate Diff Change log
```
mvn clean compile liquibase:diff -Dliquibase.url=jdbc:postgresql://localhost:5432/spring-boot-liquibase -Dliquibase.referenceUrl=hibernate:spring:io.perasoft?dialect=org.hibernate.dialect.PostgreSQLDialect&hibernate.physical_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy&hibernate.implicit_naming_strategy=org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy
```

### Update
```
mvn clean compile liquibase:update -Dliquibase.url=jdbc:postgresql://localhost:5432/spring-boot-liquibase
```

### Rollback
```
mvn clean compile liquibase:rollback -Dliquibase.url=jdbc:postgresql://localhost:5432/spring-boot-liquibase -Dliquibase.rollbackCount=1
```

#### NOTE: rollback command does not work for sql files


### Other helpful commands
* To find out what the instruction set does
```
mvn liquibase:help
```

* To see the history record (databasechangelog table)
```
mvn liquibase:history
```

* To see if there is a lock on the databasechangeloglock table
```
mvn liquibase:listLocks
```

* Release locks on databasechangeloglock table
```
mvn liquibase:releaseLocks
```