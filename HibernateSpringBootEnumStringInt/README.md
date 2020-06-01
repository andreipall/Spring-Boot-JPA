**[Quickest Mapping Of Java Enums](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootEnumStringInt)**
  
**Description:** This application uses `EnumType.ORDINAL` and `EnumType.STRING` for mapping Java `enum` type to database. As a rule of thumb, strive to keep the data types as small as possible (e.g., for `EnumType.ORDINAL` use `TINYINT/SMALLINT`, while for `EnumType.STRING` use `VARCHAR(max_needed_bytes)`). Relying on `EnumType.ORDINAL` should be more efficient but is less expressive than `EnumType.STRING`.

**Key points:**
- strive for smallest data types (e.g., for `EnumType.ORDINAL` set `@Column(columnDefinition = "TINYINT")`)
