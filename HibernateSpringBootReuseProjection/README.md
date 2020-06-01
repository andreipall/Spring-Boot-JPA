**[Reusing Spring projection](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootReuseProjection)**
 
**Description:** This application is a sample of reusing an interface-based Spring projection. This is useful to avoid defining multiple interface-based Spring projections in order to cover a range of queries that fetches different subsets of fields.

**Key points:**
- define an interface-based Spring projection containing getters for the wider case 
- rely on class-level `@JsonInclude(JsonInclude.Include.NON_DEFAULT)` annotation to avoid serialization of default fields (e.g., fields that are not available in the current projection and are `null` - these fields haven't been fetched in the current query)
- this is useful to Jackson that will not serialize in the resulted JSON the missing fields (e.g., `null` fields)
