package EmployeeWage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EmpWageBuilderTest {

    EmpWageBuilder builder;

    @BeforeAll
    static void beforeAll() {

        System.out.println("Starting Test Suite");
    }

    @BeforeEach
    void setup() {

        builder = new EmpWageBuilder();

        builder.addCompany("TCS",20,20,100);

        System.out.println("Setup complete");
    }

    @Test
    void testComputeWage() {

        builder.computeWage();

        int wage = builder.getTotalWage("TCS");

        assertTrue(wage >= 0);
    }

    @Test
    void testInvalidCompany() {

        builder.computeWage();

        int wage = builder.getTotalWage("Google");

        assertEquals(-1,wage);
    }

    @AfterEach
    void cleanup() {

        System.out.println("Test completed");
    }

    @AfterAll
    static void afterAll() {

        System.out.println("All tests done");
    }
}
