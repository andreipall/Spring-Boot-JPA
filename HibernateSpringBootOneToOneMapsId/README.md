**[How To Use `@MapsId` For Sharing Identifier In `@OneToOne` Relationships](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootOneToOneMapsId)**

**Description:** Instead of *regular* unidirectional/bidirectional `@OneToOne` better rely on an unidirectional `@OneToOne` and `@MapsId`. This application is a proof of concept. 

**Key points:**
- use `@MapsId` on child side
- use `@JoinColumn` to customize the name of the primary key column
- mainly, for `@OneToOne` associations, `@MapsId` will share the primary key with the parent table (`id` property acts as both primary key and foreign key)    
     
**Note:**
- `@MapsId` can be used for `@ManyToOne` as well
