**[Hibernate Envers Auditing (`schema-mysql.sql`)](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootEnversSchemaSql)**
 
**Description:** Auditing is useful for maintaining history records. This can later help us in tracking user activities. 
 
**Key points:**
- each entity that should be audited should be annotated with `@Audited`
- optionally, annotate entities with `@AuditTable` to rename the table used for auditing
- rely on `ValidityAuditStrategy` for fast database reads, but slower writes (slower than the default `DefaultAuditStrategy`)
- remove (disable) `spring.jpa.hibernate.ddl-auto` or set it to `validate` for avoiding schema generated from JPA annotations
- create `schema-mysql.sql` and provide the SQL statements needed by Hibernate Envers
- if the schema is not automatically found, then point it via `spring.jpa.properties.org.hibernate.envers.default_catalog` for MySQL or `spring.jpa.properties.org.hibernate.envers.default_schema` for the rest
