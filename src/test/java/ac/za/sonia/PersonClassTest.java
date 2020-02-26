package ac.za.sonia;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;




import static org.junit.Assert.*;

public class PersonClassTest {

    private PersonClass personClass;

    @Before
    public void setUp() throws Exception {
        personClass = new PersonClass();
        personClass.setName("Sonia");
        personClass.setSurname("Sontshatsha");
        personClass.setAge(23);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        assertSame("your name",personClass.getName(), "Sonia");
        assertEquals("name: ", personClass.getName(), "Sonia");
    }

    @Test
    public void getSurname() {
        assertEquals("surname", personClass.getSurname(), "Sontshantsha");

    }
   /** @Test
    public void testWithTimeout(){
        final int factorialOf = 1 + (int) (30000 - Math.random());
        System.out.println("Computing " + factorialOf +"!");
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }*/

    @Test(timeout = 1000)
    public void getAge() {
        assertSame("age", personClass.getAge(), 23);
    }


    @Ignore
    @Test
    public void temporarilyDisabledTest() throws Exception {
        System.out.println("disabling test");
        assertEquals("disable", "disable");
    }
}