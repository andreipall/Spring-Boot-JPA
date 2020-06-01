
**[How To Define An Association That Reference `@NaturalId`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootReferenceNaturalId)**

**Description:** This is a SpringBoot application that defines a `@ManyToOne` relationship that doesn't reference a primary key column. It references a Hibernate `@NaturalId` column.

**Key points:**
- rely on `@JoinColumn(referencedColumnName = "natural_id_column")`
