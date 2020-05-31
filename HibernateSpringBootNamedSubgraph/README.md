
**[How To Use Entity Sub-graphs In Spring Boot](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootNamedSubgraph)**

**Note:** In a nutshell, *entity graphs* (aka, *fetch plans*) is a feature introduced in JPA 2.1 that help us to improve the performance of loading entities. Mainly, we specify the entity’s related associations and basic fields that should be loaded in a single `SELECT` statement. We can define multiple *entity graphs* for the same entity and *chain* any number of entities and even use *sub-graphs* to create complex *fetch plans*. To override the current `FetchType` semantics there are properties that can be set:

*Fetch Graph* (default), `javax.persistence.fetchgraph`\
The attributes present in `attributeNodes` are treated as `FetchType.EAGER`. The remaining attributes are treated as `FetchType.LAZY` regardless of the default/explicit `FetchType`.

*Load Graph*, `javax.persistence.loadgraph`\
The attributes present in `attributeNodes` are treated as `FetchType.EAGER`. The remaining attributes are treated according to their specified or default `FetchType`.

**Nevertheless, the JPA specs doesn't apply in Hibernate for the basic (`@Basic`) attributes.**. More details [here](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootNamedEntityGraphBasicAttrs).

**Description:** This is a sample application of using *entity sub-graphs* in Spring Boot. There is one example based on `@NamedSubgraph` and one based on the dot notation (.) in an ad-hoc *entity graph*.

**Key points:**
- define three entities, `Author`, `Book` and `Publisher` (`Author` and `Book` are involved in a lazy bidirectional `@OneToMany` relationship, `Book` and `Publisher` are also involved in a lazy bidirectional `@OneToMany` relationship; between `Author` and `Publisher` there is no relationship)
     
**Using `@NamedSubgraph`**
- in `Author` entity define an *entity graph* via  `@NamedEntityGraph`; load the authors and the associatated books and use `@NamedSubgraph` to define a *sub-graph* for loading the publishers associated with these books
- in `AuthorRepository` rely on Spring `@EntityGraph` annotation to indicate the *entity graph* defined at the previous step
     
**Using the dot notation (.)**
- in `PublisherRepository` define an ad-hoc *entity graph* that fetches all publishers with associated books, and further, the authors associated with these books (e.g., `@EntityGraph(attributePaths = {"books.author"})`.
