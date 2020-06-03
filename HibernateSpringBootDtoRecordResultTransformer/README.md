**[How To Fetch DTO Via JDK14 Records And A Custom `ResultTransformer`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoRecordResultTransformer)**
  
**Description:** Fetching more *read-only* data than needed is prone to performance penalties. Using DTO allows us to extract only the needed data. Sometimes, we need to fetch a DTO made of a subset of properties (columns) from a parent-child association. For such cases, we can use SQL `JOIN` that can pick up the desired columns from the involved tables. But, `JOIN` returns an `List<Object[]>` and most probably you will need to represent it as a `List<ParentDto>`, where a `ParentDto` instance has a `List<ChildDto>`. For such cases, we can rely on a custom Hibernate `ResultTransformer`. This application is a sample of writing a custom `ResultTransformer`.

As DTO, we rely on JDK 14 Records. From Openjdk JEP359:

*Records provide a compact syntax for declaring classes which are transparent holders for shallowly immutable data.*

**Key points:**
- define the Java Records as `AuthorDto` and `BookDto`
- implement the `ResultTransformer` interface
