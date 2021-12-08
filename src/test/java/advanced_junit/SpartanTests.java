package advanced_junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class SpartanTests {
    private Spartan spartan;
    private Spartan wrongSpartan;

    //Only one assertion per test

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @BeforeEach
    void setup(TestInfo testInfo){
        spartan = new Spartan(1, "Melvin", "Java", LocalDate.of(2021, 11, 13));
        //All acceptable invalid data passed to show that the class is poorly defined
        wrongSpartan = new Spartan(-9, "1331", "000", LocalDate.of(2022, 12, 13));
        System.out.println(testInfo.getDisplayName() + " is being tested");
    }

   /* @RepeatedTest(value = 5, name = "{displayName} :: repetition {currentRepetition} of {totalRepetitions}")
    @DisplayName("This is my test")
    void thisIsMyTest() {

    }*/
    @Test
    @DisplayName("Spartan name test")
    void spartanNameTest(){
        //test initial name
        assumeTrue(spartan.getName().equals("Melvin"));
        //test wrong name
        assumeFalse(wrongSpartan.getName().equals("Thomas"));
        //test invalid name which is a number - outputs true due to no validation
        assumeTrue(wrongSpartan.getName().equals("1331"));
        //change name to check if changes work
        spartan.setName("Thomas");
        assumeTrue(spartan.getName().equals("Thomas"));
    }

    @Test
    @DisplayName("Spartan Id Test")
    void spartanIdTest(){
        //test initial id
        assumeTrue(spartan.getId() == 1);
        //test wrong id
        assumeFalse(wrongSpartan.getId() == 1);
        //test invalid id which is negative - but still outputs true - no validation
        assumeTrue(wrongSpartan.getId() == -9);
        //change id to check if changes work
        spartan.setId(13);
        assumeTrue(spartan.getId() == 13);
    }

    @Test
    @DisplayName("Spartan course Test")
    void spartanCourseTest(){
        //test initial id
        assumeTrue(spartan.getCourse().equals("Java"));
        //test wrong id
        assumeFalse(wrongSpartan.getCourse().equals("Java"));
        //test invalid id which is negative - but still outputs true - no validation
        assumeTrue(wrongSpartan.getCourse().equals("000"));
        //change id to check if changes work
        spartan.setCourse("SDET");
        assumeTrue(spartan.getCourse().equals("SDET"));
    }

    @Test
    @DisplayName("Spartan localDate Test")
    void spartanLocalDateTest(){
        //check date is set before today's date
        assumeTrue(spartan.getStartDate().isBefore(LocalDate.now()));
        //check wrong date for a person - not validated
        assumeFalse(wrongSpartan.getStartDate().isBefore(LocalDate.now()));
        //set new start date and check that it works
        spartan.setStartDate(LocalDate.of(2018, 6,1));
        assumeTrue(spartan.getStartDate().equals(LocalDate.of(2018, 6,1)));
        //use for date validation - users are not from the future
        //LocalDate.now();
    }

    @Test
    @DisplayName("Spartan toString Test")
    void spartanToStringTest(){
        //test whether the toString method prints out string shown
        assumeTrue(spartan.toString().equals("Spartan{id=1, name='Melvin', course='Java', startDate=2021-11-13}"));
        //test false data
        assumeFalse(wrongSpartan.toString().equals("Spartan{id=1, name='Melvin', course='Java', startDate=2021-11-13}"));
    }


    @AfterEach
    void tearDown(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + " has finished testing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + " are completed");
    }

}
