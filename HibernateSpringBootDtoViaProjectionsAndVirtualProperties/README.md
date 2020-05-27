**[How To Enrich DTO With Virtual Properties Via Spring Projections](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaProjectionsAndVirtualProperties)**

**Note:** You may also like to read the recipe, ["How To Create DTO Via Spring Data Projections"](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDtoViaProjections)

**Description:** This is an application sample that fetches only the needed columns from the database via Spring Data Projections (DTO) and enrich the result via virtual properties.

**Key points:**
- we fetch from the database only the author `name` and `age`
- in the projection interface, `AuthorNameAge`, use the `@Value` and Spring SpEL to point to a backing property from the domain model (in this case, the domain model property `age` is exposed via the virtual property `years`)
- in the projection interface, `AuthorNameAge`, use the `@Value` and Spring SpEL to enrich the result with two virtual properties that don't have a match in the domain model (in this case, `rank` and `books`)

**Output example:**\
<a href="#"><img src="https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootDtoViaProjectionsAndVirtualProperties/dto%20spring%20projection%20and%20virtual%20properties.png" align="center" height="220" width="444" ></a>
