import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitQuickcheck.class)
public class MonkeySimTest {
	/**
	 * TODO: Remove this method in your submission. Only for demonstration purposes.
	 * Tests string concatenation by checking the invariant that the length of the
	 * concatenated string is the sum of the lengths of the two strings.
	 * 
	 * @param s1 First string
	 * @param s2 Second string
	 */
	@Property
	public void testConcat(String s1, String s2) {
		System.out.println("Testing s1=" + s1 + ", s2=" + s2);
		assertEquals(s1.length() + s2.length(), (s1 + s2).length());
	}
	/**
	 * TODO: For Extra Credit, write a property-based test method testMonkeySim.
	 * Invokes runSimulation with s being the starting monkey with the banana. The
	 * invariant that you should check is that runSimulation does not throw an
	 * InfiniteLoopException. As of now, runSimulation throws no exception of the
	 * kind and just falls into the infinite loop, given the defect triggering
	 * sequence. So, MonkeySim will also have to be modified to throw that exception
	 * for this to work.
	 * 
	 * @param s The starting monkey with the banana. Use the @InRange annotation to
	 *          make sure the generated random number for s is greater than or equal
	 *          to 1.
	 */
}
