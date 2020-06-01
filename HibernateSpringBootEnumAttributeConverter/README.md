**[How To Map Java `enum` To Database Via `AttributeConverter`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootEnumAttributeConverter)**
 
**Description:** This application maps a Java `enum` via `AttributeConverter`. In other words, it maps the `enum` values `HORROR`, `ANTHOLOGY` and `HISTORY` to the integers `10`, `20` and `30` and viceversa. This allows us to set the column type as `TINYINT/SMALLINT` which is less space-consuming than `VARCHAR(9)` needed in this case.

**Key points:**
- define a custom `AttributeConverter`
- annotate with `@Converter` the corresponding entity field
