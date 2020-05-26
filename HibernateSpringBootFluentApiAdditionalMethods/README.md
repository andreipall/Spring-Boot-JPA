**[How To Provide a Fluent API Via Additional Methods For Building Entities](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootFluentApiAdditionalMethods)**

**Note**: If you want yo provide a Fluent API by altering setters then consider [this item](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootFluentApiOnSetters).

**Description:** This is a sample application that add in entities additional methods (e.g., for `setName`, we add `name`) methods in order to empower a Fluent API.

**Key points:**
- in entities, add for each setter an additional method that return `this` instead of `void`

**Fluent API example:**\
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootFluentApiAdditionalMethods/fluent%20api%20with%20additional%20methods.png)
