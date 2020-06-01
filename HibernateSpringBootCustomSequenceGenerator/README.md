**[How To Generate Custom Sequence IDs](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootCustomSequenceGenerator)**

**Description:** This is a Spring Boot example of using the `hi/lo` algorithm and a custom implementation of `SequenceStyleGenerator` for generating custom sequence IDs (e.g, `A-0000000001`, `A-0000000002`, ...).

**Key points:**
- extend `SequenceStyleGenerator` and override the `configure()` and `generate()` methods
- set this generator in entities
