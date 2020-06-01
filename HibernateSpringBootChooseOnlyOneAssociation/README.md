**[How To Ensure/Validate That Only One Association Is Non-Null](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootChooseOnlyOneAssociation)**
 
 **Description:** Consider an entity named `Review`. This entity defines three `@ManyToOne` relationships to `Book`, `Article` and `Magazine`. A review can be associated with either a book, a magazine or an article. To validate this constraint, we can rely on  [Bean Validation](https://beanvalidation.org/) as in this application.

**Key points:**
- rely on Bean Validation to validate that only one association is non-`null`
- expose the constraint via a custom annotation (`@JustOneOfMany`) added at class-level to the `Review` entity
- for preventing native query to break our constraint add the validation at database level as well (e.g., in MySQL add a `TRIGGER`)
