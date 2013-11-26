import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void testsNormalName() {
		System.out.println("The first test has started");
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		System.out.println("The output: " + output);	//to test
		String expected = "DRY";
		assertEquals(output, expected);
		}
	
		

	@Test
	public void testsNormalNameWithTwoSpaces() {
		System.out.println("The second test has started");
		Person p = new Person();
		String input = "Dereck  Robert Yssirt";
		String output = p.getInitials(input);
		System.out.println("The output: " + output);	//to test
		String expected = "DRY";
		assertEquals(output, expected);
		}
	}
	
