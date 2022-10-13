package TallerCiclos;

import java.util.Scanner;

public class SextoPunto {

	public static void main(String[] args) {
	//a
Scanner numero= new Scanner(System.in);
  int n;
  System.out.println("¡Piramide de Números!");
  System.out.println("Ingrese un número");
  n = numero.nextInt();
    for(int num = n;num > 0; num--) {
	 System.out.println("");
	  for (int r=0;r<num;r++) {
		System.out.print(num);
    	}
      }
    }
  }
	//b
	/*	
Scanner sc = new Scanner(System.in);
	System.out.println("¡Fila de números entre 1 y 2!");
	System.out.println("Ingresa un numero");			
	int p = sc.nextInt();
		for(int i = 0 ; i <= p-1; i++) {
			for(int j = 0; j <=i; j++) {
				if(i % 2 == 1) {
					System.out.print("2");
				}else {
					System.out.print("1");
				}
			}
			System.out.println(" ");
		}
	}
}
*/
	  //c
		/*
Scanner sc = new Scanner(System.in);
   System.out.println("Ingresa un numero de filas para su piramide de 1 y 2");			
   int p = sc.nextInt();
    for(int i = 0 ; i <= p-1; i++) {
     for(int j = 0; j <=i; j++) {
      if(i % 2 == 1) {
       System.out.print("2");
      }else {
     System.out.print("1");
    }
   }
   System.out.println(" ");
  }
 }
}
*/
		
