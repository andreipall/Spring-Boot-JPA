**[Why You Should Avoid Time-Consuming Tasks In Spring Boot Post-Commit Hooks](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootPostCommit)**

**Description:** This application is a proof of concept for using Spring post-commit hooks and how they may affect the persistence layer performance.

**Key points:**
- avoid time-consuming tasks in Spring post-commit hooks since the database connection will remain open until this code finshes
