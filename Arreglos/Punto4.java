package Arreglos;

public class Punto4 {

	public static void main(String[] args) {
		int[] pos = new int [19];
		for(int i = 0;i<19;i++) {
			pos[i] = (int)(Math.random()*9+1);
			System.out.println(pos[i]);	
	}
		for (int i = 0; i < pos.length; i++) {
			for (int j = 0; j < pos.length; j++) {
				if (pos[i] < pos[j]) {
					int temp = pos[i];
					pos[i] = pos[j];
					pos[j] = temp;
				}
			}
		}
		System.out.println("\nNumero aleatorios de menor a mayor...");
		for (int i : pos) {
			System.out.print(i+" ");
		}
	}
}