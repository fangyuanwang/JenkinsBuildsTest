import static org.junit.Assert.*;

import org.junit.Test;

public class DataStructureTest {

	@Test
	public void testGetName() {
		DataStructure data = new DataStructure("", 0);
		assertEquals("", data.getName());
	}
	
	@Test
	public void testGetValue() {
		DataStructure data = new DataStructure("", 0);
		assertEquals(0, data.getValue());
	}

}
