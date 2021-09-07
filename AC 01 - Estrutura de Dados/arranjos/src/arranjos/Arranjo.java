package arranjos;



public class Arranjo {

	private int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};




	public int menor() {

		int auxVar = 0;
		
		for (int i = 1; i < a.length;i++)
			if (a[i] < a[0]) {
				auxVar = a[i];
				a[i] = a[0];
				a[0] = auxVar;
			}
		
		return a[0];

	}
	
	
	public int maior() {
		int auxVar = 0;
		
		for (int i = 1; i < a.length;i++) {
			if (a[i] > a[0])
				auxVar = a[i];
				a[i] = a[0];
				a[0] = auxVar;
		}
	
		
		return a[0];
		
	}
	
	
	public int soma() {
		
		int soma = 0;
		
		for (int i = 0; i < a.length - 1; i++)
			
			soma += a[i];
		
		
		
		return soma;
		
		
	}
	
	public int repeticoes(int elemento) {
		
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == elemento) {
				count++;
			}
			
		}
		return count;
	}
}
