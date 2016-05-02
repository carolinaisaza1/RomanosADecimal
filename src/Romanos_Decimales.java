
public class Romanos_Decimales {

	public Romanos_Decimales() {

	}

	Character[] numerosRomanos = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	Integer[] numerosDecimales = { 1, 5, 10, 50, 100, 500, 1000 };

	public int convertirNumero(String romano) {
		int decimal = 0;
		int numeroAnterior = 0;
		for (int i = romano.length() - 1; i >= 0; i--) {
			char romanoCaracter = romano.charAt(i);
			for (int j = 0; j < numerosRomanos.length; j++) {
				if (romanoCaracter == numerosRomanos[j]) {
					if (numeroAnterior <= numerosDecimales[j]) {
						decimal += numerosDecimales[j];
					} else {
						if (i != romano.length()) {
							decimal -= numerosDecimales[j];

						}
					}
					numeroAnterior = numerosDecimales[j];
				}
			}
		}
		return decimal;
	}
}
