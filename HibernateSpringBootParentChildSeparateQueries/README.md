**[The Best Way To Fetch Parent And Children In Different Queries](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootParentChildSeparateQueries)** 

**Note:** Fetching *read-only* data should be done via DTO, not managed entities. But, there is no tragedy to fetch read-only entities in a context as follows:

- we need all attributes of the entity (so, a DTO just mirrors an entity)
- we manipulate a small number of entities (e.g., an author with several books)
- we use `@Transactional(readOnly = true)`

Under these circumstances, let's tackle a common case that I saw quite a lot. There is even an SO answer about it (don't do this):

![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootParentChildSeparateQueries/Fetch%20Parent%20And%20Children%20In%20Different%20Queries.png)

**Description:** Let's assume that `Author` and `Book` are involved in a bidirectional-lazy `@OneToMany` association. Imagine an user that loads a certain `Author` (without the associated `Book`). The user may be interested  or not in the `Book`, therefore, we don't load them with the `Author`. If the user is interested in the `Book` then he will click a button of type, *View books*. Now, we have to return the `List<Book>` associated to this `Author`.

So, at first request (query), we fetch an `Author`. The `Author` is detached. At second request (query), we want to load the `Book` associated to this `Author`. But, we don't want to load the `Author` again (for example, we don't care about *lost updates* of `Author`), we just want to load the associated `Book` in a single `SELECT`. A common (not recommended) approach is to load the `Author` again (e.g., via `findById(author.getId())`) and call the `author.getBooks()`. But, this end up in two `SELECT` statements. One `SELECT` for loading the `Author`, and another `SELECT` after we *force* the collection initialization. We *force* collection initialization because it will not be initialize if we simply return it. In order to trigger the collection initialization the developer call `books.size()` or he rely on `Hibernate.initialize(books);`. 

But, we can avoid such solution by relying on an explicit JPQL or Query Builder property expressions. This way, there will be a single `SELECT` and no need to call `size()` or `Hibernate.initialize();`

**Key points:**
- use an explicit JPQL
- use Query Builder propery expressions
