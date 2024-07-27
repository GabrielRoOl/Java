package entitiesProduct;

public class student {
	public String nome;
	
	public double nA, nB, nC;
	
	public int pNA() {
		if(nA > 30 || nA < 0) {
			System.out.println("Valor invalido.\nTente novamente");
			return 1;
		}
		return 0;
	}
	public int sNB() {
		if(nB > 35 || nB < 0) {
			System.out.println("Valor invalido.\nTente novamente");
			return 1;
		}
		return 0;
	}
	public int sNC() {
		if(nC > 35 || nC < 0) {
			System.out.println("Valor invalido.\nTente novamente");
			return 1;
		}
		return 0;
	}
	public double finalNota() {
		return nA + nB + nC;
	}
}
