# TDT4250_Assignments

Group: Sigrid Marita Kvamme & Mari Sofie Lerfaldet 

# Assignment 2
### Changes from Assignment 1
- Added tests 
  - tdt4250_Assignment1.tests
    -/src/studyprograms.tests
      - /CourseTest.java
        - Test for Label
      - /StudyprogramsValidatorTest.java
        - Tets for constraints: ValidateSemesterCredits and CourseSeasonMatchesSemester
- Added som entities to enumerator for missing values (ex: M to CourseStatusType). 
- Added more detailed information about where to find the different constraints etc under Assignment 1. 

### Run Model Transformation 
This model is produced from model to text with the use of Acceleo. The model is transformed from the file tdt4250.assignment2.html/src/tdt4250/assignment2/html/acceleo/SampleUniversity.university. 

Steps to run the html page with the modelled instances: 
- Clone repo from master branch 
- Run the file tdt4250.assignment2.html/src/tdt4250/assignment2/html/acceleo/university2TextGenerator.mtl as an Acceleo Application with the following run configurations: 
![Alt text](tdt4250.assignment2.html/RunConfigAcceleo.png?raw=true "Run Configurations Acceleo Application")

- Open the file tdt4250.assignment2.html/src/tdt4250/assignment2/html/acceleo/studyprograms.University.html in your Eclipse IDE. This is the result of the transformed model to text.  

# Assignment 1
## Repo structure & content
- tdt4250_Assignment1 : 
  - /model
     - Contains ecore model, genmodel and xmi structure with real world data
     - University.xmi contains a portion of the real world study programs it models, enough to show the usage of the model.
     - Validations, constraints and derived features in studyprograms.ecore:
        - OCL Validation: Semester -> ValidateSemesterCredits
        - Constraint: CourseGroup -> courseSeasonMatchesSemester, Semester -> ValidateSemesterCredits (part of OCL)
        - Derived feature: Course -> Label (manually written code for this can be found in /src/studyprograms/impl/CourseImpl.java
  - /src/studyprograms
     - Contains generated model code 
       - .impl/StudyprogramsFactoryImpl.java
          - Contains manually-written code for handling courseCode datatype 
       - .util/StudyprogramsValidator.java
          - Contains manually-written code for handling validation of season for course and semesterNumber. (e.g.if semester is in the fall, the course is also      lectured in fall)
 
