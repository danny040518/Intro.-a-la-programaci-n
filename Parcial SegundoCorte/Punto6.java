package SegundoCorte;
import java.util.Scanner;
public class Punto6 {
	public static void main(String[] args) {
		String repeticion;
		int parcelas[];
		parcelas=new int[20];
		boolean[] sembrado;
		sembrado=new boolean[20];
		do {
		System.out.println("Hola Jaime,ya sabes que tienes tus semillas etiwuetadas de la siguiente forma\nSemilla1:Maiz\nSemilla2:Papa\nSemilla3:Yuca");
		for (int semillas=0;semillas<parcelas.length;semillas++) {
			parcelas[semillas]=(int)Math.floor(Math.random()*3+1);
			sembrado[semillas]=true;
			    Scanner keyboard = new Scanner(System.in);  
				System.out.println("\nEscoje cual es la accion que deseas realizar hoy\na) Ver cuantas y cuales parcelas se sembraron con Maíz.\nb) Ver cuantas y cuales parcelas se sembraron con Papa.\nc) Ver cuantas y cuales parcelas se sembraron con Yuca.​\nd)Volver a sembrar una parcela\ne)Cosechar una parcela.​");
				String seleccion = keyboard.nextLine();  			
	     switch (seleccion) {
			case"a":
				for(int j=0;j==parcelas.length;j++) {
					if(parcelas[j-1]==1) {
					System.out.println("Hay"+ j +"parcelas donde se sembro de maiz");
					}
					}	
				break;
			case"b":
				for(int j=0;j==parcelas.length;j++) {
					if(parcelas[j-1]==2) {
					System.out.println("Hay"+ j +"parcelas donde se sembro de papa");
				}
				}
				break;
			case"c":
				for(int j=0;j==parcelas.length;j++) {
					if(parcelas[j-1]==3) {
					System.out.println("Hay"+ j +"parcelas donde se sembro de yuca");
				}
				}
				break;
			case"d":
				Scanner keyboard1 = new Scanner(System.in);
				System.out.println("Que parcela desea volver a sembrar de nuevo: ");
				int sembrar = keyboard1.nextInt();
				if(sembrado[sembrar+1]!=true) {
					parcelas[sembrar+1]=(int) Math.floor(Math.random()*3+1);
					for(int s=1;s<=parcelas.length;s++) {
						System.out.println(s+":"+parcelas[s-1]);
					}
				}
				else {
					System.out.print("Ya sembraste esta parcela, recuerda que primero debes cosechar antes de sembrar");
				}
				break;
			case"e":
				Scanner keyboard2 = new Scanner(System.in);
				System.out.println("Que parcela desea cosechar: ");
				int cosechar = keyboard2.nextInt();
				if(sembrado[cosechar+1]!=true) {
					sembrado[cosechar+1]=false;
					for(int c=1;c<=parcelas.length;c++) {
						System.out.println(c+":"+parcelas[c-1]);
					}
				}
				else {
					System.out.print("Ya cosechaste esta parcela, recuerda que primero debes sembrar antes de cosechare");
				}
				break;
			default:System.out.println(" ");
		}
	     System.out.print("\nGracias vuelve pronto");
	}
		Scanner keyboard = new Scanner(System.in);  
		System.out.println("\nDesea volver a ver el menu Si/No.​");
		String repeticion=keyboard.nextLine();
	}while(repeticion.equals("S")||repeticion.equals("SI")||repeticion.equals("si")||repeticion.equals("Si")||repeticion.equals("s"));
	}
}


