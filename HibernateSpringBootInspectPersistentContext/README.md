**[Inspect Persistent Context](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootInspectPersistentContext)**

**Description:** This application is a sample of inspecting the Persistent Context content via `org.hibernate.engine.spi.PersistenceContext`.

**Key points:**
- get the current Persistent Context via Hibernate `SharedSessionContractImplementor`
- rely on `PersistenceContext` [API](https://docs.jboss.org/hibernate/orm/5.4/javadocs/org/hibernate/engine/spi/PersistenceContext.html)
