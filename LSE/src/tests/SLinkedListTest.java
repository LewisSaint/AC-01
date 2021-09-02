package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import listaSimplesmenteEncadeada.SLinkedList;

class SLinkedListTest {
	@Test
	void testAdddHead() {
		SLinkedList s = new SLinkedList();

		assertEquals("[]", s.toString(), "Deve imprimir []");
		s.addHead("BOS");
		assertEquals("[BOS]", s.toString(), "Deve imprimir [BOS]");
		s.addHead("ATL");
		assertEquals("[ATL, BOS]", s.toString(), "Deve imprimir [ATL, BOS]");
		s.addHead("MSP");
		assertEquals("[MSP, ATL, BOS]", s.toString(), "Deve imprimir [MSP, ATL, BOS]");
		s.addHead("LAX");
		assertEquals("[LAX, MSP, ATL, BOS]", s.toString(), "Deve imprimir [LAX, MSP, ATL, BOS]");
		
		System.out.print(s.toString());
	}
}
