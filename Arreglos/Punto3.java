package Arreglos;

public class Punto3 {

	public static void main(String[] args) {
		int contador=0;
		int[] pos = new int [19];
		for(int i = 0;i<19;i++) {
			pos[i] = (int)(Math.random()*2);
			System.out.println(pos[i]);	
		if (pos[i]==0) {
		contador++;
		}
		}
		System.out.println("Hay:"+contador+" ceros en este arreglo");
	}
}

