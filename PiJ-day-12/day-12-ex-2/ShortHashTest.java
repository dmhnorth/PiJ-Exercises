import org.junit.*;
import static org.junit.Assert.*;

public class ShortHashTest {
	@Test
	public void testShortHash1() {
		System.out.println("The first hashTest has started");
		int x = HashUtilities.shortHash(23);
		assertTrue(x >= 0 && x <= 1000 );

	}

}
