**[How To Handle Entities Inheritance With Spring Data Repositories](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSingleTableRepositoryInheritance)**

**Description:** Consider the JPA Single Table inheritance strategy (`SINGLE_TABLE`). It can be any other JPA inheritance (e.g., `JOINED`), but let's use this one here. And, the following entity hierarchy:

![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootSingleTableRepositoryInheritance/Single%20table%20inheritance.png)
    
For these three entities, `Book`, `Paperback` and `Ebook`, we have the corresponding repositories, `BookRepository`, `PaperbackRepository` and `EbookRepository`. But, if we write a query-method as `findByTitle()` we should duplicate it in each of these repositories in order to call `BookRepository#findByTitle()`, `PaperbackRepository#findByTitle()` and `EBookRepository#findByTitle()`. But, we know that `Paperback` and `Ebook` are actually subclasses of `Book`, therefore they inherit the `Book` class. It will be useful to do the same thing for our repositories. It will be better to write the `findByTitle()` query-method only once and use it in all these repositories instead of duplicating it in each repository. This application shows you how to do it.

**Key points:**
- define the `findByTitle()` in a `@NoRepositoryBean` class (let's name this class, `BookBaseRepository`)
- next, `BookRepository`, `PaperbackRepository` and `EbookRepository` extends `BookBaseRepository`
- for queries express via `@Query` use `#{#entityName}` and Spring will replace it with the proper entity name
