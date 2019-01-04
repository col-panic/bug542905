package at.descher.bug542905.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import at.descher.bug542905.Bug542905;

public class Bug542905Test {

	@Test
	public void test() throws Exception {
		assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><xmlElement label=\"myLabel\"/>", Bug542905.run());
	}
}
