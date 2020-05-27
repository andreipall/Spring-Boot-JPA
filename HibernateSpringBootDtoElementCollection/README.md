**[How To DTO an `@ElementCollection`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoElementCollection)**

**Description:** This application is an example of fetching a DTO that includes attributes from an `@ElementCollection`.
 
**Key points:**
- by default, `@ElementCollection` is loaded lazy, keep it lazy
- use a Spring projection and `JOIN` in the repository 
