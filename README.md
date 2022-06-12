## Behavioral Design Patterns 

### Chain of Responsibility Design Pattern 
#### Uses 
• When more than one object may handle a
request, and the handler isn’t known <br /> 
• When the set of objects that can handle a
request should be specified dynamically<br /> 
#### Examples 
java.util.logging.Logger#log()
#### DrawBacks
• No guarantee the request will be handled
unless the chain is configured properly
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173256099-858d671b-93de-4eca-a416-ac0187312fcb.png)
 <hr/>

### Iterator Design Pattern 
#### Uses 
• You want to access the elements of a
collection object sequentially<br />
• Java's collections like ArrayList and
HashMap implements the iterator pattern<br />
#### Examples 
• All implementations of java.util.Iterator
and java.util.Enumeration)
#### DrawBacks
• Not thread safe unless it’s a robust iterator that
allows insertions and deletions during traversal
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173256145-045371bb-8070-4a0b-a997-d0891080717c.png)
 <hr/>












