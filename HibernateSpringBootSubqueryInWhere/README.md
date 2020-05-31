**[How To Use Subqeries in JPQL `WHERE`/`HAVING` Clause](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootSubqueryInWhere)**
 
**Description:** This application is an example of using subqueries in JPQL `WHERE` clause (you can easily use it in `HAVING` clause as well).

**Key points:**\
Keep in mind that subqueries and joins queries may or may not be semantically equivalent (joins may returns duplicates that can be removed via `DISTINCT`). 

Even if the Execution Plan is specific to the database, historically speaking joins are faster than subqueries among different databases, but this is not a rule (e.g., the amount of data may significantly influence the results). Of course, do not conclude that subqueries are just a replacement for joins that doesn't deserve attention. Tuning subqueries can increases their performance as well, but this is an SQL wide topic. So, benchmark! Benchmark! Benchmark!

**As a rule of thumb, prefer subqueries only if you cannot use joins, or if you can prove that they are faster than the alternative joins.**
