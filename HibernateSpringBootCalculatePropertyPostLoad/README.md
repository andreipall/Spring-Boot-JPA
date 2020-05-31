**[How To Calculate Non-Persistent Property via JPA `@PostLoad`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCalculatePropertyPostLoad)**
 
**Description:** This application is an example of calculating a non-persistent property of an entity based on the persistent entity attributes. In this case, we will use JPA, `@PostLoad`.

**Key points:**
- annotate the non-persistent field and property with `@Transient`
- define a method annotated with `@PostLoad` that calculates this non-persistent property based on the persistent entity attributes
