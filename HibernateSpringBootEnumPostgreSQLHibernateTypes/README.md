**[How To Map Java `enum` To PostgreSQL `enum` Type Via Hibernate Types Library](https://github.com/AnghelLeonard/Hibernate-SpringBoot/tree/master/HibernateSpringBootEnumPostgreSQLHibernateTypes)**
 
**Description:** This application maps a Java `enum` type to PostgreSQL `enum` type via [Hibernate Types](https://github.com/vladmihalcea/hibernate-types) library.

**Key points:**
- install Hibernate Types library via `pom.xml`
- use `@TypeDef` to specify the needed type class
- annotate the corresponding entity field with `@Type`
