**[Why And How To Avoid The `AUTO` Generator Type In Hibernate 5 And MySQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootAutoGeneratorType)**

<b><a href="https://persistencelayer.wixsite.com/springboot-hibernate/post/why-and-how-to-avoid-the-auto-generator-type-in-hibernate-5-6-and-mysql">If you prefer to read it as a blog-post containing the relevant snippets of code then check this post</a></b>

**Description:** In MySQL & Hibernate 5, the `GenerationType.AUTO` generator type will result in using the `TABLE` generator. This adds a significant performance penalty. Turning this behavior to `IDENTITY` generator can be obtained by using `GenerationType.IDENTITY` or the *native* generator.
 
**Key points:**
- use `GenerationType.IDENTITY` instead of `GenerationType.AUTO`
- use the *native* generator - exemplified in this application
    
**Output example:**\
<a href="#"><img src="https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootAutoGeneratorType/Hibernate%20Spring%20Boot%20Auto%20Generator%20Type.png" align="center" height="132" width="742" ></a>
