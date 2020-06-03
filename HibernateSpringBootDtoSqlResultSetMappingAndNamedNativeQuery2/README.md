**[How To Fetch DTO Via `SqlResultSetMapping` And `NamedNativeQuery` Using `{EntityName}.{RepositoryMethodName}` Naming Convention](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoSqlResultSetMappingAndNamedNativeQuery2)**
 
**Description:** Fetching more data than needed is prone to performance penalities. Using DTO allows us to extract only the needed data. In this application we rely on `SqlResultSetMapping`, `NamedNativeQuery` and the `{EntityName}.{RepositoryMethodName}` naming convention. This convention allows us to create in the repository interface methods with the same name as of native named query.
 
**Key points:**
- use `SqlResultSetMapping`, `NamedNativeQuery`
- for using Spring Data Projections check this [item](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaProjections)
