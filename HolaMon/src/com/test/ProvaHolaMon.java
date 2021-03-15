package com.test;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

public class ProvaHolaMon extends TestCase{
	public ProvaHolaMon(String name) {
		super(name);
	}

	@Test
	public void test() {
		HolaMon salutacio = new HolaMon();
		assertEquals("Hola mon!", salutacio.saluda());
	}

}
