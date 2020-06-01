**[The Best Way To Clone Entities](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCloneEntity)**
 
**Description:** This application is an example of cloning entities. The best way to achieve this goal relies on copy-constructors. This way we can control what we copy. Here we use a bidirectional-lazy `@ManyToMany` association between `Author` and `Book`.

**Key points:**
- clone an `Author` (only the `genre`) and associate the corresponding books
- clone an `Author` (only the `genre`) and clone the books as well
