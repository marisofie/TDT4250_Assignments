# TDT4250_Assignments

Group: Sigrid Marita Kvamme & Mari Sofie Lerfaldet 

## Repo structure & content
- tdt4250_Assignment1 : 
  - /model
     - Contains ecore model, genmodel and xmi structure with real world data
     - University.xmi contains a portion of the real world study programs it models, enough to show the usage of the model.
     
     #TODO: insert screen shot of tree structure
  - /src/studyprograms
     - Contains generated model code 
       - .impl/StudyprogramsFactoryImpl.java
          - Contains manually-written code for handling courseCode datatype 
       - .util/StudyprogramsValidator.java
          - Contains manually-written code for handling validation of seson for course and semesterNumber. (e.g.if semester is in the fall, the course is also      lectured in fall)
 
