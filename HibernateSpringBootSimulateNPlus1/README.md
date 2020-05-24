**[How To Quickly Reproduce The N+1 Performance Issue](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSimulateNPlus1)**

**Description:** The N+1 is an issue of lazy fetching (but, eager is not exempt). This application reproduce the N+1 behavior.

**Key points:**
- define two entities, `Author` and `Book` in a lazy bidirectional `@OneToMany` association
- fetch all `Book` lazy, so without `Author` (results in 1 query)
- loop the fetched `Book` collection and for each entry fetch the corresponding `Author` (results N queries)
- or, fetch all `Author` lazy, so without `Book` (results in 1 query)
- loop the fetched `Author` collection and for each entry fetch the corresponding `Book` (results N queries)
     
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootSimulateNPlus1/simulate%20N%2B1.png)