**[Get Transaction Id In MySQL](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootTransactionId)**
  
 **Description:** This application is an example of getting the current database transaction id in MySQL. Only read-write database transactions gets an id in MySQL. Every database has a specific query for getting the transaction id. [Here](https://vladmihalcea.com/current-database-transaction-id/) it is a list of these queries.

**Key points:**
- rely on the following query, `SELECT tx.trx_id FROM information_schema.innodb_trx tx WHERE tx.trx_mysql_thread_id = connection_id()`
