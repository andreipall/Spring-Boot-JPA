**[How To Fetch DTO Via `ResultTransformer` and JPQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoResultTransformerJpql)**
 
**Description:** Fetching more data than needed is prone to performance penalties. Using DTO allows us to extract only the needed data. In this application we rely on Hibernate, `ResultTransformer` and JPQL.

**Key points:**
- use `AliasToBeanConstructorResultTransformer` for DTO without setters, with constructor
- use `Transformers.aliasToBean()` for DTO with setters
- use `EntityManager.createQuery()` and `unwrap(org.hibernate.query.Query.class)`
- starting with Hibernate 5.2, `ResultTransformer` is deprecated, but until a replacement will be available (in Hibernate 6.0) it can be used ([read further](https://discourse.hibernate.org/t/hibernate-resulttransformer-is-deprecated-what-to-use-instead/232))
- for using Spring Data Projections check this [item](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaProjections)
