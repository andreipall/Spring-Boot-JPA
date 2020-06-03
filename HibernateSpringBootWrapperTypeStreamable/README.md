**[How To Return Custom `Streamable` Wrapper Types](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootWrapperTypeStreamable)**
 
**Description:** A common practice consists of exposing dedicated wrappers types for collections resulted after mapping a query result set. This way, on a single query execution, the API can return multiple results. After we call a query-method that return a collection, we can pass it to a wrapper class by manually instantiation of that wrapper-class. But, we can avoid the manually instantiation if the code respects the following key points.

**Key points:**
- the type implements `Streamable`
- the type exposes a constructor (used in this example) or a `static` factory method named `of(…)` or `valueOf(…)` taking `Streamable` as argument
