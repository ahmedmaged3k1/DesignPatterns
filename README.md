## Structural  Desing Patterns 
“In software engineering, structural design
patterns are design patterns that ease the
design by identifying a simple way to realize
relationships between entities.”

### Adapter Pattern Design Pattern 
#### Uses 
• You want to use an existing class, and its
interface does not match the one you need
<br/>
• When you want to increase transparency of
classes<br/>
#### Examples 
java.util.Arrays#asList()and
java.io.InputStreamReader(InputStream)
#### DrawBacks
• It involves multiple inheritance à In java this
can only be achieved via interfaces
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173247508-f5d4e5ad-f0c1-4aba-9299-c2e0cb812fa4.png)
 <hr/>


### Bridge Pattern Design Pattern 
#### Uses 
• You want to separate the abstract structure
and its concrete implementation<br/>
• You want to reuse existing resources in an
'easy to extend' fashion<br/>
• Prevent the changes from impacting clients<br/>
#### Examples 
javax.sql.PooledConnection and
javax.sql.RowSet
#### DrawBacks
• Double indirection à has impact on
performance
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173251686-c319009c-e5e0-49bd-a8fb-1d25dc69b2e1.png)
 <hr/>
 
 ### Decorator Pattern Design Pattern 
#### Uses 
• When you want to add features/
functionalities to individual objects
dynamically and transparently, without<br/>
affecting the original object or other objects
• When extension by static subclassing is
impractical<br/>
#### Examples 
java.util.Collection#checkedXYZ(),
java.util.Collection#synchronizedXYZ
() and
java.util.Collection#unmodifiableXYZ()
#### DrawBacks
• The component interface must be kept simple<br/>
• The performance overhead associated with a
long chain of decorators
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173253394-fc4dcab8-9961-47e6-8c14-a0e29f04945a.png)
 <hr/>
 
 
  ### Composite Pattern Design Pattern 
#### Uses 
• You want to represent a part-whole
relationship in a tree structure
• You want clients to be able to ignore the
differences between compositions of objects
and individual objects<br/>
#### Examples 
• Composite pattern is NOT used that much in
JDK
• Sample classes are
java.awt.Container#add(Component)
#### DrawBacks
• You can add any kind of components to the
hierarchy à makes your system overly general
• You might find it hard to restrict certain classes
where this would normally be desirable
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173255633-27f24fda-0ba9-4e7b-af56-6b9e8a3997c1.png)
 <hr/>


