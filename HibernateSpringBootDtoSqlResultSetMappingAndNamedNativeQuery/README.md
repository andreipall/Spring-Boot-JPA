**[How To Fetch DTO Via `SqlResultSetMapping` And `NamedNativeQuery`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoSqlResultSetMappingAndNamedNativeQuery)**

**Note:** If you want to rely on the `{EntityName}.{RepositoryMethodName}` naming convention for simply creating in the repository interface methods with the same name as of native named query then skip this application and [check this one](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoSqlResultSetMappingAndNamedNativeQuery2).

**Description:** Fetching more data than needed is prone to performance penalities. Using DTO allows us to extract only the needed data. In this application we rely on `SqlResultSetMapping`, `NamedNativeQuery`.
 
**Key points:**
- use `SqlResultSetMapping`, `NamedNativeQuery`
- for using Spring Data Projections check this [item](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaProjections)
