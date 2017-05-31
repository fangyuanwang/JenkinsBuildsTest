import static org.junit.Assert.*;

import org.junit.Test;

public class DataStructureTest {

	@Test
	public void testGetName() {
		DataStructure data = new DataStructure("", 0);
		assertEquals("1", data.getName());
	}

}
