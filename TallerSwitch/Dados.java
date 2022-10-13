package TallerSwitch;

import javax.swing.JOptionPane;

public class Dados {

	public static void main(String[] args) {
		
	int juegodados = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la accion que desea hacer: \n 1.Arrojar dados \n 2.Ver Puntaje \n 3.Borrar puntaje"));	
		
	switch (juegodados) {
	case 1:
		int dado1 = (int)(Math.random()*6+1);
		int dado2 = (int)(Math.random()*6+1);
		int suma = dado1 + dado2;
		int contadormaquina = 0;
		int contadorhumano =0;		
		
		if (dado1==dado2) {
			
			
		}
		else if (suma % 2 == 0 && suma > 5){
			contador++;
		}
		else if (suma % 2 == 0 && suma <= 5 ) {
			
		}
		else if (suma % 2 != 0 && suma < 5) {
			
		}
		else if (suma % 2 != 0 && suma >= 5) {  
		
	    }
		else {
		}
	    break;
	
	case 2:
		
	case 3:	
		
	}
	String i =JOptionPane.showInputDialog("¿Desea continuar jugando? S / N ");
    while (i == "S" ) {
    	
    	int juegodados1 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la accion que desea hacer: \n 1.Arrojar dados \n 2.Ver Puntaje \n 3.Borrar puntaje"));	
		
    	switch (juegodados1) {
    	case 1:
    		int dado1 = (int)(Math.random()*6+1);
    		int dado2 = (int)(Math.random()*6+1);
    		int suma = dado1 + dado2;
    		int contadormaquina = 0;
    		int contadorhumano =0;		
    		
    		if (dado1==dado2) {
    			
    			
    		}
    		else if (suma % 2 == 0 && suma > 5){
    			contador++;
    		}
    		else if (suma % 2 == 0 && suma <= 5 ) {
    			
    		}
    		else if (suma % 2 != 0 && suma < 5) {
    			
    		}
    		else if (suma % 2 != 0 && suma >= 5) {  
    		
    	    }
    		else {
    		}
    	    break;
    	
    	case 2:
    		
    	case 3:	
    		
    	}
    	
    }
    do {
    	
    }
	}
}
}

    	
    
    


