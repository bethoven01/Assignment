# QA Task

Review the user story and prepare a list of questions/ assumptions.
- Does string contain alpha numeric characters and numbers, special characters?
- What would be the expected result if no argument is passed?
- What is the upper limit on length of an individual string?
- What is the upper limit on length of a string array?
- If length of string array > 4, which 4 strings should be added?
- Does localization need to be handled?

Review the code and provide feedback/ improvements. 
- While user story mentions to add up to 4 strings, program throws an error if number of arguments are >= 4, Should be > 4 only.
- There is no code which concatenates string
- No comments were added explaining fuction's behaviour
- Variables, declared in Main method, should be declared globally

Extend the program to return the number of consonants for each string array passed.
-   Please check code "Assignment/agile_qa_test/agile_qa_interview_exercise_1ca32ca/src/main/java/com/exercise/VowelCount.java"

Use BDD/ Cucumber to add test cases to test the program for both vowels and consonants.
-   Please check feature file "Assignment/agile_qa_test/agile_qa_interview_exercise_1ca32ca/src/test/java/VowelConsonantsCount.feature"
-   Please check step definition file "Assignment/agile_qa_test/agile_qa_interview_exercise_1ca32ca/src/main/java/stepDefs/VowelStepDef.java"

Report any bugs you find. Include as much information as necessary and add the feedback as a file to the repo along with the Cucumber Test Report.
-  Error message is displayed if 4 arguments are passed to main method
    -   As per user story, User should be able to add up to 4 strings at once. But when 4 strings are passed as an arguments, error message is displayed : "Extra arguments passed."
-   Strings cannot be concatenated even if less than 4 strings are passed as an arguments
    -   As per user story, User should be able to add up to 4 strings. But there is no method provided in the developer's code.

How to run tests:
-   Open feature file "Assignment/agile_qa_test/agile_qa_interview_exercise_1ca32ca/src/test/java/VowelConsonantsCount.feature".
-   Right click on feature file and Select option : Run As -> Cucumber feature.

All test cases are written in feature file which refers step definitions file to call method which performs actions/operations from another java classes.
On execution, two tests are going to failed as there is a defect when more than 4 arguments are passed.
