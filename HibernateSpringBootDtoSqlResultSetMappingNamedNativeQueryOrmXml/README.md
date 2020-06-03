**[How To Dto Via Named Native Query And Result Set Mapping Via `orm.xml`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoSqlResultSetMappingNamedNativeQueryOrmXml)**
 
**Description:** Fetching more data than needed is prone to performance penalities. Using DTO allows us to extract only the needed data. In this application we rely on named native queries and result set mapping via `orm.xml` and the `{EntityName}.{RepositoryMethodName}` naming convention. This convention allows us to create in the repository interface methods with the same name as of native named query.
 
**Key points:**
- use `<named-native-query/>` and `<sql-result-set-mapping/>` to map the native query to `AuthorDto` class
