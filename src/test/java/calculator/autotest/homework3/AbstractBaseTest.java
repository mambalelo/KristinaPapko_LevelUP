package calculator.autotest.homework3;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import com.epam.tat.module4.Calculator;

public class AbstractBaseTest {
    Calculator calculator;

    public AbstractBaseTest() {
    }

    @BeforeSuite
    public void setUpSuite() {
        System.out.println("----Before Suite----");
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("----Before Class----");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("----Before Method----");
        this.calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        this.calculator = null;
        System.out.println("---After Method-----");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("----After Class-----");
    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println("----After Suite----");
    }
}


