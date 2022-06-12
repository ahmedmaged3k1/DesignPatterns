## Creational Desing Patterns 

### Factory Design Pattern 
#### Uses 
• When a class can't anticipate which kind of
class of object it should create <br />
• When the classes to be created are derived
from the same superclass/interface  <br />
• When you want to insulate the client from the
actual type that is being instantiated <br /> 
#### Examples 
java.util.Calendar,
java.util.ResourceBundle and
java.text.NumberFormat
#### DrawBacks
• Requires keeping factory methods in sync with
domain classes<br /> 
• No way to change an implementing class
without recompiling<br /> 
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173240403-fdb86958-24b8-4b8d-8e68-77f2d4c32ee0.png)
 <hr/>

### Abstract Factory Design Pattern 
#### Uses 
• Is often used when there is a need to use
different sets of objects and where those
objects could be added or changed some
time during the lifetime of an application
#### Examples 
javax.xml.parsers.DocumentBuilderFactory
and javax.xml.xpath.XPathFactory
#### DrawBacks
the possibility of unnecessary complexity and
extra work during the initial implementation
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173241112-ab173c10-66c3-48b9-b38b-655a0842ef84.png)
 <hr/>

### Builder Pattern 
#### Uses 
• Is often used when you want to hide the
actual creation process from clients
• The construction process should allow different
representations of the resulting object
#### Examples 
java.lang.StringBuilder#append and
java.lang.StringBuffer#append
#### DrawBacks
• “It does create more code (and could
introduce more complexity) in the DTO than if
you had for example contructor arguments
and/or setters/getters.”1
#### UML 
 ![image](https://user-images.githubusercontent.com/60134186/173241689-d78191b3-9887-4548-981d-9a5b69de9efd.png)
 <hr/>

### Prototype Pattern 
#### Uses 
• When a system needs to be independent of
how the objects are created
• Adding and removing objects at runtime
• Specifying new objects by changing an
existing structure
#### Examples 
• There are no real implementation of the
Prototype Pattern in JDK, but Object.clone()
is a good candidate which follows the design
#### DrawBacks
• Each subclass of Prototype must implement
the Clone operation
• Could be difficult with existing classes which
have some internal objects with circular
references, or which do not support copying
#### UML 
 ![image](https://user-images.githubusercontent.com/60134186/173245655-969a71ef-c52c-4772-aa18-02466b643173.png)
 <hr/>


### Singelton Pattern 
#### Uses 
• When only one instance or a specific number
of instances of a class are permitted
#### Examples 
java.lang.Runtime#getRuntime()and
java.awt.Desktop#getDesktop()
#### DrawBacks
• Are generally used as a global instances à Try
to avoid having global variables
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173246908-93eb8fdc-6cf4-4579-9023-e427722a9cc0.png)
 <hr/>
 
 













