# DesignPatterns 

This repository contains most famous desing patterns implemented in java inside an android project 

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
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173240403-fdb86958-24b8-4b8d-8e68-77f2d4c32ee0.png)
#### DrawBacks
• Requires keeping factory methods in sync with
domain classes<br /> 
• No way to change an implementing class
without recompiling<br />  

### Abstract Factory Design Pattern 
#### Uses 
• Is often used when there is a need to use
different sets of objects and where those
objects could be added or changed some
time during the lifetime of an application
#### Examples 
javax.xml.parsers.DocumentBuilderFactory
and javax.xml.xpath.XPathFactory
#### UML 
![image](https://user-images.githubusercontent.com/60134186/173241112-ab173c10-66c3-48b9-b38b-655a0842ef84.png)
#### DrawBacks
the possibility of unnecessary complexity and
extra work during the initial implementation

### Builder Pattern 
#### Uses 
• Is often used when you want to hide the
actual creation process from clients
• The construction process should allow different
representations of the resulting object
#### Examples 
java.lang.StringBuilder#append and
java.lang.StringBuffer#append
#### UML 
 ![image](https://user-images.githubusercontent.com/60134186/173241689-d78191b3-9887-4548-981d-9a5b69de9efd.png)
#### DrawBacks
• “It does create more code (and could
introduce more complexity) in the DTO than if
you had for example contructor arguments
and/or setters/getters.”1

















