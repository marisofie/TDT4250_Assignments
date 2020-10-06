# TDT4250_Assignments

Group: Sigrid Marita Kvamme & Mari Sofie Lerfaldet 

# Assignment 2
### Changes from Assignment 1
- Added tests 
  - ```tdt4250_Assignment1.tests```
    -```/src/studyprograms.tests```
      - ```/CourseTest.java```
        - Test for ```Label```
      - ```/StudyprogramsValidatorTest.java```
        - Tests for constraints: ```ValidateSemesterCredits``` and ```CourseSeasonMatchesSemester```
- Added some entities to enumerators for missing values (ex: ```M``` to ```CourseStatusType```). 
- Added more detailed information about where to find the different constraints etc. under Assignment 1. 

### Run Model Transformation 
This model is produced from model to text (M2T) with the use of Acceleo. The model is transformed from the file ```tdt4250.assignment2.html/src/tdt4250/assignment2/html/acceleo/SampleUniversity.university``` which contains instances of [Computer Science, 5 years (2016)](https://www.ntnu.no/studier/mtdt/oppbygning#year=2016&programmeCode=MTDT) and [Informatics, 3 years (2020)](https://www.ntnu.no/studier/bit/oppbygning#year=2020&programmeCode=BIT).

#### Steps to generate the HTML page with the modelled instances: 
- Clone repo from ```master``` branch 
- Run the file ```tdt4250.assignment2.html/src/tdt4250/assignment2/html/acceleo/university2TextGenerator.mtl``` as an Acceleo Application with the following run configurations: 
![Alt text](tdt4250.assignment2.html/RunConfigAcceleo.png?raw=true "Run Configurations Acceleo Application")

- Open the file ```tdt4250.assignment2.html/src/tdt4250/assignment2/html/acceleo/studyprograms.University.html``` in your Eclipse IDE or locally in a web browser. This is the result of the transformed model to text.  

#### Requirements and Dependencies for running the code
To be able to run the mtl file and transform the model to code, the following dependencies and required plug-ins need to be installed. The packages are imported from ```tdt4250_Assignment1/src/studyprograms```. 
![Alt text](tdt4250.assignment2.html/Requirements.png?raw=true "Run Configurations Acceleo Application")


# Assignment 1
## Repo structure & content
- ```tdt4250_Assignment1``` : 
  - ```/model```
     - Contains ecore model, genmodel and xmi structure with real world data
     - ```University.xmi``` contains a portion of the real world study programs it models, enough to show the usage of the model.
     - Validations, constraints and derived features in studyprograms.ecore:
        - OCL Validation: ```Semester``` -> ```ValidateSemesterCredits```
        - Constraint: ```CourseGroup``` -> ```courseSeasonMatchesSemester```, ```Semester``` -> ```ValidateSemesterCredits``` (part of OCL)
        - Derived feature: ```Course``` -> ```Label``` (manually written code for this can be found in ```/src/studyprograms/impl/CourseImpl.java```
  - ```/src/studyprograms```
     - Contains generated model code 
       - ```.impl/StudyprogramsFactoryImpl.java```
          - Contains manually-written code for handling the ```courseCode``` datatype 
       - ```.util/StudyprogramsValidator.java```
          - Contains manually-written code for handling the validation of season for ```course``` and ```semesterNumber```. (e.g. if semester is in the fall, the course is also lectured in the fall)
 
