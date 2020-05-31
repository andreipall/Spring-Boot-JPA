**[How To Calculate Non-Persistent Property via Hibernate `@Formula`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCalculatePropertyFormula)**
 
<b><a href="https://persistencelayer.wixsite.com/springboot-hibernate/post/how-to-calculate-non-persistent-property-via-hibernate-formula">If you prefer to read it as a blog-post containing the relevant snippets of code then check this post</a></b>
 
**Description:** This application is an example of calculating a non-persistent property of an entity based on the persistent entity attributes. In this case, we will use Hibernate, `@Formula`.

**Key points:**
- annotate the non-persistent property with `@Transient`
- annotate the non-persistent field with `@Formula`
- as the value of `@Formula` add the SQL query expression that calculates this non-persistent property based on the persistent entity attributes
