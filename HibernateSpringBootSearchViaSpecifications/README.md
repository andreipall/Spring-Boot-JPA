**[How To Implement Advanced Search Via `Specification`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSearchViaSpecifications)**
 
**Description:** This application is an example of implementing an advanced search via `Specification` API. Mainly, you can give the search filters to a generic `Specification` and fetch the result set. Pagination is supported as well. You can chain expressions via logical `AND` and `OR` to create compound filters. Nevertheless, there is room for extensions to add brackets support (e.g., `(x AND y) OR (x AND z)`), more operations, conditions parser and so on and forth.

**Key points:**
- write a generic `Specification`     
