**[How To Prevent A MySQL Database View From Updating/Inserting Rows That Are Not Visible Through It Via `WITH CHECK OPTION`](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootDatabaseViewWithCheckOption)**

**Description:** This application is an example of preventing inserts/updates of a MySQL view that are not visible through this view via `WITH CHECK OPTION`. In other words, whenever you insert or update a row of the base tables through a view, MySQL ensures that the this operation is conformed with the definition of the view.

**Key points:**
- add `WITH CHECK OPTION` to the view
- this application will throw an exception of type `java.sql.SQLException: CHECK OPTION failed 'bookstoredb.author_anthology_view`
