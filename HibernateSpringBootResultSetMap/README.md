**[How To Return A Map Result From A Spring Data Query Method](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootResultSetMap)**
 
**Description:** Sometimes, we need to write in repositories certain query-methods that return a `Map` instead of a `List` or a `Set`. For example, when we need a `Map<Id, Entity>` or we use `GROUP BY` and we need a `Map<Group, Count>`. This application shows you how to do it via `default` methods directly in repository.

**Key points:**
- rely on `default` methods and `Collectors.toMap()`
