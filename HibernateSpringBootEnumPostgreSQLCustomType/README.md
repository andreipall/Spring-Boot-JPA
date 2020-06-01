**[How To Map Java `enum` To PostgreSQL `enum` Type](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootEnumPostgreSQLCustomType)**
 
**Description:** This application maps a Java `enum` type to PostgreSQL `enum` type.

**Key points:**
- define a custom Hibernate `EnumType`
- register this custom `EnumType` via `package-info.java`
- annotate the corresponding entity field `@Type`
