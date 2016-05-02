import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Romanos_DecimalesTest {
	Romanos_Decimales romanoaDecimal;
	int numeroDecimal;

	@Before
	public void setup() {
		romanoaDecimal = new Romanos_Decimales();
		numeroDecimal = 0;
	}

	@Test
	public void ConvertirIaDecimaltest() {
		numeroDecimal = romanoaDecimal.convertirNumero("I");
		assertEquals(1, numeroDecimal);
	}

	@Test
	public void ConvertirIIIaDecimalTest() {
		numeroDecimal = romanoaDecimal.convertirNumero("III");
		assertEquals(3, numeroDecimal);
	}

	@Test
	public void ConvertirXIaDecimal() {
		numeroDecimal = romanoaDecimal.convertirNumero("XI");
		assertEquals(11, numeroDecimal);
	}

	@Test
	public void ConvertirIXaDecimal() {
		numeroDecimal = romanoaDecimal.convertirNumero("IX");
		assertEquals(9, numeroDecimal);
	}

	@Test
	public void ConvertiraDecimal() {
		numeroDecimal = romanoaDecimal.convertirNumero("MXD");
		assertEquals(1490, numeroDecimal);
	}

}
