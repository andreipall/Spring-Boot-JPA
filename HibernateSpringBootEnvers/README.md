**[Hibernate Envers Auditing (`spring.jpa.hibernate.ddl-auto=create`)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootEnvers)**
 
**Description:** Auditing is useful for maintaining history records. This can later help us in tracking user activities. 
 
**Key points:**
- each entity that should be audited should be annotated with `@Audited`
- optionally, annotate entities with `@AuditTable` to rename the table used for auditing
- rely on `ValidityAuditStrategy` for fast database reads, but slower writes (slower than the default `DefaultAuditStrategy`)
