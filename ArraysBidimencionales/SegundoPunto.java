package ArraysBidimencionales;
import java.util.Scanner;
public class SegundoPunto {

	public static void main(String[] args) {
		int filas = 5;
		int columnas = 5;
			Scanner keyboard = new Scanner(System.in);  
			System.out.println("Bienvenido, selecciona la accion que deseas realizar\na)Sumar.\nb)Restar.\nc)Multiplicar.​");
			String seleccion = keyboard.nextLine();  
			
			int[][]matriz1;
			matriz1=new int[5][5];
		    int[][]matriz2;
		   	matriz2=new int[5][5];  
		   	int[][]matrizRes;
		   	matrizRes=new int[5][5];
		   	System.out.println("Datos de la Matriz 1:");
			for(int i=0;i<filas;i++){
			        for(int j=0;j<columnas;j++){
			        matriz1[i][j]=(int) (Math.random()*9+1);
			        System.out.println(matriz1[i][j]);
			        }
			}
			System.out.println("Datos de la Matriz 2:");
			for(int x=0;x<filas;x++){
			    	for(int y=0;y<columnas;y++){
			    	matriz2[x][y]=(int) (Math.random()*9+1);
			    	System.out.println(matriz2[x][y]);
			    	}
			}
		switch (seleccion) {
		case"a":
			System.out.println("Suma de las dos matrices:");
			for(int a=0;a<filas;a++){
			        for(int b=0;b<columnas;b++){
			                matrizRes[a][b]=matriz1[a][b]+matriz2[a][b];                            
			                System.out.print(matrizRes[a][b]+" ");
			        }
			        System.out.println();
			}
			break;
		case"b":
			System.out.println("Resta de las dos matrices:");
			for(int a=0;a<filas;a++){
			        for(int b=0;b<columnas;b++){
			                matrizRes[a][b]=matriz1[a][b]-matriz2[a][b];                            
			                System.out.print(matrizRes[a][b]+" ");
			        }
			        System.out.println();
			}
			break;
		case"c":
			System.out.println("Multiplicacion de las dos matrices:");
			for(int a=0;a<filas;a++){
			        for(int b=0;b<columnas;b++){
			                matrizRes[a][b]=matriz1[a][b]*matriz2[a][b];                            
			                System.out.print(matrizRes[a][b]+" ");
			        }
			        System.out.println();
			}
			break;
		default:System.out.println((""));
		}
}
}


