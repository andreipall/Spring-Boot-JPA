**[Avoid Spring Redundant `save()` Call](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootRedundantSave)**
 
**Description:** This application is an example when calling `save()` for an entity is redundant (not necessary).

**Key points:**
- at flush time, Hibernate relies on *dirty checking* mechanism to determine the potential modifications in entities 
- for each modification, Hibernate automatically triggers the corresponding `UPDATE` statement without the need to explicitly call the `save()` method
- behind the scene, this redundancy (calling `save()` when is not necessarily) doesn't affect the number of triggered queries, but it implies a performance penalty in the underlying Hibernate processes
