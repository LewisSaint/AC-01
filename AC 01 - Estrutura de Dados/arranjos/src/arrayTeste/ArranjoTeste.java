package arrayTeste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arranjos.Arranjo;

class ArranjoTeste {
	
	Arranjo a = new Arranjo();

	@Test
	void test() {
		assertEquals(440, a.menor(), "O menor deve ser 440");
		assertEquals(940, a.maior(), "O maior é 940");
		assertEquals(7040, a.soma(), "A soma é 7040");
		assertEquals(0, a.repeticoes(3), "3 aparece 2 vezes");
		assertEquals(1, a.repeticoes(790), "790 aparece 1 vez");
		assertEquals(2, a.repeticoes(940), "940 aparece 2 vezes");
	}

}
