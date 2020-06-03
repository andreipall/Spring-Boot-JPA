**[How To Handle Entities Inheritance With Spring Data Repositories](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootMappedSuperclassRepository)**

**Description:** The `@MappedSuperclass` is an entity-level annotation useful for shaping an inheritance model similar with table-per-class strategy but with a base class that is not an entity - is not materialized in a database table. Consider the following entity hierarchy (`Book` is annotated with `@MappedSuperclass`):

![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootSingleTableRepositoryInheritance/Single%20table%20inheritance.png)
    
For these two entities, `Paperback` and `Ebook`, we have the corresponding repositories, `PaperbackRepository` and `EbookRepository`. But, if we write a query-method as `findByTitle()` we should duplicate it in both of these repositories in order to call `PaperbackRepository#findByTitle()` and `EBookRepository#findByTitle()`. But, we know that `Paperback` and `Ebook` are actually subclasses of `Book`, therefore they inherit the `Book` class. It will be useful to do the same thing for our repositories. It will be better to write the `findByTitle()` query-method only once and use it in our repositories instead of duplicating it in each repository. This application shows you how to do it.

**Key points:**
- define the `findByTitle()` in a `@NoRepositoryBean` class (let's name this class, `BookBaseRepository`)
- next, `PaperbackRepository` and `EbookRepository` extends `BookBaseRepository`
- for queries express via `@Query` use `#{#entityName}` and Spring will replace it with the proper entity name
