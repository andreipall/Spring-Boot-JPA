**[JPA Inheritance - `TABLE_PER_CLASS`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootTablePerClassInheritance)**

**Description:** This application is a sample of JPA Table-per-class inheritance strategy (`TABLE_PER_CLASS`)

**Key points:**
- this inheritance strategy doesn't allow the usage of the `IDENTITY` generator
- this inheritance strategy can be employed via `@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)`
- all the classes in an inheritance hierarchy (a.k.a., subclasses) are represented via individual tables
- each subclass-table stores the columns inherited from the superclass-table (*base class*)
