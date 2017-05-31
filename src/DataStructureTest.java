import static org.junit.Assert.*;

import org.junit.Test;

public class DataStructureTest {

	@Test
	public void testGetValue() {
		DataStructure data = new DataStructure("", 0);
		assertEquals("", data.getName());
	}

}
