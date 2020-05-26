**[Prefer `Set` Instead of `List` in `@ManyToMany` Associations](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootManyToManyBidirectionalListVsSet)**

**Description:** This is a Spring Boot example of removing rows in case of a bidirectional `@ManyToMany` using `List`, respectively `Set`. The conclusion is that `Set` is much better! This applies to unidirectional as well!

**Key points:**
- using `Set` is much more efficent than `List`
     
**Output example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootManyToManyBidirectionalListVsSet/manytomany%20use%20always%20set%20not%20list.png)
