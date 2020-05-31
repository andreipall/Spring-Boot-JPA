**[How To Declare Immutable Entities And Store Them In Second Level Cache (e.g., `EhCache`)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootImmutableEntity)**

**Description:** This application is a sample of declaring an immutable entity. Moreover, the immutable entity will be stored in Second Level Cache via `EhCache` implementation.

**Key points of declaring an immutable entity:**
- annotate the entity with `@Immutable (org.hibernate.annotations.Immutable)`
- avoid any kind of associations
- set `hibernate.cache.use_reference_entries configuration` to `true`
