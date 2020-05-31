**[HTTP Long Conversation Via Versioned Optimistic Locking And Detached Entities In The HTTP Session](https://github.com/andreipall/Spring-Boot-JPA/tree/master/HibernateSpringBootHTTPLongConversationDetachedEntity)**

**Description:** This is a sample application that shows how to take advantage of versioned optimistic locking and detached entities in HTTP long conversations. The climax consists of storing the detached entities across multiple HTTP requests. Commonly, this can be accomplished via HTTP session. 

**Key points:**
- prepare the entity via `@Version`
- rely on `@SessionAttributes` for storing the detached entities
     
**Sample output (check the message caused by optimistic locking exception):**
![](https://github.com/andreipall/Spring-Boot-JPA/blob/master/HibernateSpringBootHTTPLongConversationDetachedEntity/http%20long%20conversations%20detached%20entity%20ole.png)
