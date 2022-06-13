## S.O.L.I.D Principles 
### SOLID Principles are:
• Single Responsibility<br /> 
• Open for Extension, Closed for Modification<br /> 
• Liskov Substitution<br /> 
• Interface Segregation<br /> 
• Dependency Inversion<br /> 


### Single Responibility Principle 
#### Defination  
• States that a class should have ONLY ONE
RESPONSIBILITY/FUNCTIONALITY<br /> 
• Furthermore, it should only have one reason
to change<br /> 
#### Benifits 
• Testing: A class with one responsibility is easier
to test and will have a fewer test cases<br />
• Lower coupling: Less functionality in a single
class will have fewer dependencies<br />
• Organization: Smaller, well-organized classes
are easier to search and maintain than
monolithic ones<br />
 <hr/>
 
 
 ### Open for Extension, Closed for Modification
#### Defination  
• States that CLASSES SHOULD BE OPEN FOR
EXTENSION BUT CLOSED FOR MODIFICATION<br /> 
• In doing so, we stop ourselves from modifying
existing code and causing potential new bugs<br /> 
• Of course, the one exception to the rule is when
fixing bugs in existing code<br /> 
#### Benifits 
• Prevent  some unforeseen errors might
occur in our application when manipulating the class <br />
 <hr/>



 ### Liskov Substitution
#### Defination  
• States that IF CLASS A IS A SUBTYPE OF CLASS
B, WE SHOULD BE ABLE TO REPLACE B WITH A
WITHOUT DISRUPTING THE BEHAVIOR OF OUR
PROGRAM<br /> 
• “It ensures that a derived class does not
affect the behavior of the parent class, in
other words,, that a derived class must be
substitutable for its base class.” <br /> 
#### Benifits 
• Code that adheres to LSP is loosely dependent to each other and encourages code reusability.  <br />
 <hr/>


 ### Interface Segregation
#### Defination  
• States that LARGER INTERFACES SHOULD BE
SPLIT INTO SMALLER ONES <br /> 
• BY DOING SO, WE CAN ENSURE THAT
IMPLEMENTING CLASSES ONLY NEED TO BE
CONCERNED ABOUT THE METHODS THAT ARE
OF INTEREST TO THEM <br /> 
#### Benifits 
• Increasing  the readability and maintainability of our code. We are reducing our class implementation only to required actions without any additional or unnecessary code  <br />
 <hr/>



 ### Dependency Inversion
#### Defination  
• States that WE SHOULD DEPEND ON
ABSTRACTIONS (INTERFACES AND ABSTRACT
CLASSES) INSTEAD OF CONCRETE
IMPLEMENTATIONS (CLASSES) <br /> 
• THE ABSTRACTIONS SHOULD NOT DEPEND ON
DETAILS; INSTEAD, THE DETAILS SHOULD
DEPEND ON ABSTRACTIONS <br /> 
#### Benifits 
• Dependency inversion well applied gives flexibility and stability at the level of the entire architecture of your application. It will allow your application to evolve more securely and stable  <br />
 <hr/>











