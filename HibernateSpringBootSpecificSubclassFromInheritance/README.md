**[How To Fetch Certain Subclass From An `SINGLE_TABLE` Inheritance Hierarchy](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSpecificSubclassFromInheritance)**

**Description:** This application is a sample of fetching a certain subclass from a `SINGLE_TABLE` inheritance hierarchy. This is useful when the dedicated repository of the subclass doesn't automatically add in the `WHERE` clause a `dtype` based condition for fetching only the needed subclass.

**Key points:**
- explicitly add in the `WHERE` clause a `TYPE` check 
