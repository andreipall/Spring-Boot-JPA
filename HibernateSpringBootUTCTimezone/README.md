
**[UTC Timezone And MySQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootUTCTimezone)**
 
**Description:** This application is a sample of how to store date, time, and timestamps in UTC time zone. The second setting, `useLegacyDatetimeCode` is needed only for MySQL. Otherwise, set only `hibernate.jdbc.time_zone`.

**Key points:**
- `spring.jpa.properties.hibernate.jdbc.time_zone=UTC`
- `spring.datasource.url=jdbc:mysql://localhost:3306/screenshotdb?useLegacyDatetimeCode=false`
