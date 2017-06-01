package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.DataStructure;

public class DataStructureTest {

	@Test
	public void testGetName() {
		DataStructure data = new DataStructure("", 0);
		assertEquals("", data.getName());
	}
	
	@Test
	public void testGetValue() {
		DataStructure data = new DataStructure("", 0);
		assertEquals(1, data.getValue());
	}

}
