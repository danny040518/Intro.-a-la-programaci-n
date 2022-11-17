package ProyectoFinal;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class JUANCAMILO { 
	public static int golesfrancia=0,golesbrasil=0,golesalemania=0,golesargentina=0,golesportugal=0,golesinglaterra=0,puntajefrancia=0,puntajebrasil=0,puntajealemania=0,puntajeargentina=0,puntajeportugal=0,puntajeinglaterra=0,
			jornada=1,partidosfrancia=0,partidosinglaterra=0,partidosbrasil=0,partidosalemania=0,partidosargentina=0,partidosportugal=0,
			ganadosfrancia=0,ganadosbrasil=0,ganadosalemania=0,ganadosargentina=0,ganadosportugal=0,ganadosinglaterra=0,
			empatadosfrancia=0,empatadosbrasil=0,empatadosalemania=0,empatadosargentina=0,empatadosportugal=0,empatadosinglaterra=0,
			perdidosfrancia=0,perdidosbrasil=0,perdidosalemania=0,perdidosargentina=0,perdidosportugal=0,perdidosinglaterra=0,
			golesafavorfrancia=0,golesafavorbrasil=0,golesafavoralemania=0,golesafavorargentina=0,golesafavorportugal=0,golesafavoringlaterra=0,
			golesencontrafrancia=0,golesencontrabrasil=0,golesencontraalemania=0,golesencontraargentina=0,golesencontraportugal=0,golesencontrainglaterra=0;
	static String [] Names = {"EQUIPO","PJ","G","E","P","Pts","GF","GC","DG"};
	static String[] Equipos = {"FRANCIA",
			"BRASIL",
			"ALEMANIA",
			"ARGENTINA",
			"PORTUGAL",
			"INGLATERRA"};
	static String alineacion [][]=new String [8][8];
	static String elegir = null;
	
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "                                                  ¡Bienvenido al torneo Futbol Azteca, Podrás formar parte del torneo mas importante!"
		+"\n Para poder jugar este campeonato, de manera sencilla y sin complicaciones deberas seguir las indicaciones que se te iran presentando conforme va corriendo el juego."
		+"\n     *Recuerda que en el momento en que selecciones CANCELAR en alguna de las pantallas emergentes, autometicamente el juego se cerrara."
		+"\n     *En el caso de que debas seleccionar numeros recuerda solo escoger uno que se encuentre dentro de las opciones.");
		menu();
	}
	public static void  menu() {
			int fut;
		fut=Integer.parseInt(JOptionPane.showInputDialog("          MENU PRINCIPAL:"
				+ "\n"
				+"\n 1. Administrar un equipo con el cual podras"
				+ "\n          a)Ver sus jugadores y sus posiciones"
				+ "\n          b)Cambiar de posición un jugador"
				+ "\n          c)Ingresar un nuevo jugador"
				+ "\n          d)Sustituir jugadores"
				+ "\n          e)Elegir un capitán"
				+ "\n          f)Cambiar estado"
				+ "\n 2. Iniciar Juego "
				+ "\n 3. Inciar campeonato y mostrar resultados por jornada "
				+ "\n 4. Mostrar Tabla de posiciones del Campeonato"
				+ "\n 5. Salir "));
		
	switch(fut) {
	 case(1):
		 AdministrarEquipo();
	     menu();
	 break;
	 case (2):
		 IniciarJuego();
	     menu();
		break;
	 case (3):
		 Jornadas();
	     menu();
			break;
	 case (4):
		 Jornadas();
	     crearTabla();
			break;
	 case (5):
			break;
	}	
}
    public static void  AdministrarEquipo() {
    	int cambio=0,  cambio1=0;
		String cambio2 = null;
    	String francia[]= new String[]{" Areola 23"," Upamecano 13"," Saliba 3"," Badiashile 18"," Pavard 2"," Tchouameni 8"," Camavinga 6"," Coman 21"," Griezmann 7"," Mbappé 10"," Benzema 19"};
		String suplefran[]= new String[]{" Lloris 1"," Varane 4"," Dembélé 11"," Clauss 15"," Fofana 19", " Nkunku 12"};
		String brasil[]= new String[]{" Alisson 1"," Danilo 2"," Marquinhos 4"," Silva 3"," Telles 6"," Casemiro 5"," Fred 8"," Raphinha 19"," Neymar 10"," Paqueta 7","Richarlison 29"};
		String suplebra[]= new String[]{" Ederson 23"," Fabinho 15"," Firmino 24"," Antony 18"," Militao 14"," Vinicius 20"};
		String alemania[]= new String[]{" Ter Stegen 22"," Kehrer 5"," Sule 15"," Schlotterbeck 23"," Raum 3"," Kimmich 6"," Gündogan 21"," Hofmann 18"," Musiala 14"," Sané 19"," Havertz 7"};
		String suplealema[]= new String[]{" Trapp 12"," Müller 13"," Gnabry 10"," Werner 9"," Henrichs 16"," Arnold 8"};
		String argentina[]= new String[]{" Martinez E 23"," Molina 21"," Romero 13"," Otamendi 19"," Acuña 8"," De paul 7"," Paredes 5"," Lo Celso 20"," Messi 10"," Martínez L 22"," Di María 11"};
		String suplearge[]= new String[]{" Armani 1"," Álvarez 15"," Correa A. 9"," Correa J 16"," Tagliafico 3"," Musso 12"};
		String portugal[]= new String[]{" Diogo Costa 22"," Cancelo 20"," Pereira 13"," Pepe 3"," Mendes 2"," Fernandes 11"," Moutinho 8"," Otavio 16"," Ronaldo 7"," Diogo Jota 19"," Silva 10"};
		String supleportu[]= new String[]{" Patricio 1"," Nunes 18"," Carvalho 14"," Joao Felix 23"," Guerreiro 5"," Vitinha 4"};
		String inglaterra[]= new String[]{" Pope 1"," Stones 4"," Dier 5"," Maguire 6"," James 2"," Bellingham 8"," Rice 7"," Shaw 3"," Foden 11"," Kane 9"," Sterling 10"};
		String supleingla[]= new String[]{" Henderson 14"," Trippier 12"," Walker 15"," Abraham 23"," Mount 19"," Saka 18"};
		do {
    	int h= Integer.parseInt(JOptionPane.showInputDialog("Selecciona un número para conocer a los jugadores del equipo."
				+ "\n 1. Francia"
				+ "\n 2. Brasil"
				+ "\n 3. Alemania"
				+ "\n 4. Argentina"
				+ "\n 5. Portugal"
				+ "\n 6. Inglaterra"));

	switch(h) {
	case (1):
    	System.out.print( "\t Titulares Francia \n\n"+ Arrays.toString(francia)+ "\n\t Suplentes Francia \n\n"+ Arrays.toString(suplefran)+"\n");	
		fran(francia, suplefran);
		elegir = JOptionPane.showInputDialog("Desea ser el DT este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			elegir = "Francia";
			franciacompleto(francia, suplefran , cambio, cambio1, cambio2);
			fran(francia, suplefran);
		}

		break;
		case (2):
			System.out.print( "\t Titulares Francia \n"+ Arrays.toString(brasil)+ "\n\n\t Suplentes Francia \n\n"+ Arrays.toString(suplebra)+"\n");
		bras(brasil, suplebra);
		elegir = JOptionPane.showInputDialog("Desea ser el DT este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			elegir = "Brasil";
			brasilcompleto(brasil, suplebra , cambio, cambio1,cambio2);
			bras(brasil, suplebra);
		}
		break;
		case (3):
			System.out.print( "\t Titulares Alemania \n"+ Arrays.toString(alemania)+ "\n\n\t Suplentes Alemania \n\n"+ Arrays.toString(suplealema)+"\n");
		alem(alemania, suplealema);
		elegir = JOptionPane.showInputDialog("Desea ser el DT este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			elegir = "Alemania";
			alemaniacompleto(brasil, suplebra , cambio, cambio1,cambio2);
			alem(brasil, suplebra);
		}
		break;
		case (4):
			System.out.print( "\t Titulares Argentina \n"+ Arrays.toString(argentina)+ "\n\n\t Suplentes Argentina \n\n"+ Arrays.toString(suplealema)+"\n");
		argent(argentina, suplearge);
		elegir = JOptionPane.showInputDialog("Desea ser el DT este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			elegir = "Argentina";
			argentinacompleto(brasil, suplearge , cambio, cambio1,cambio2);
			argent(brasil, suplebra);
		}
		break;
		case (5):
			System.out.print( "\t Titulares Portugal \n"+ Arrays.toString(portugal)+ "\n\n\t Suplentes Portugal  \n\n"+ Arrays.toString(suplealema)+"\n");
		port(portugal, supleportu);
		elegir = JOptionPane.showInputDialog("Desea ser el DT este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			elegir = "Portugal";
			portugalcompleto(portugal, supleportu , cambio, cambio1,cambio2);
			port(brasil, suplebra);
		}
		break;
		case (6):
			System.out.print( "\t Titulares Inglaterra \n"+ Arrays.toString(inglaterra)+ "\n\n\t Suplentes Inglaterra  \n\n"+ Arrays.toString(suplealema)+"\n");
		ingl(inglaterra, supleingla);
		elegir = JOptionPane.showInputDialog("Desea ser el DT este equipo Si/No");
		if (elegir.equals("SI")|| elegir.equals("S")||elegir.equals("Si")|| elegir.equals("s")|| elegir.equals("si")) {
			elegir = "Inglaterra";
			inglaterracompleto(brasil, supleingla , cambio, cambio1, cambio2);
			ingl(inglaterra, supleingla);
		}
		break;
		}
	 }while(elegir.equals("NO")|| elegir.equals("N")||elegir.equals("No")|| elegir.equals("n")|| elegir.equals("no"));
    }
    
	public static void  fran (String francia[], String suplefran []){	
		System.out.println();
		System.out.println("Matriz jugadores alineados.");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < francia.length)
					alineacion[3][0]=francia[0]+" POR";
				alineacion[2][2]=francia[1]+" DF";
				alineacion[4][2]=francia[2]+" DF";
				alineacion[5][3]=francia[3]+" LA";
				alineacion[1][3]=francia[4]+" LI";
				alineacion[2][3]=francia[5]+" MCD";
				alineacion[4][4]=francia[6]+" MI";
				alineacion[5][5]=francia[7]+" MD";
				alineacion[1][5]=francia[8]+" EI";
				alineacion[2][4]=francia[9]+" DC";
				alineacion[4][5]=francia[10]+" ED";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}
				else {
					System.out.print(alineacion[i][j] + " ");

				}
			}
			System.out.println();
		}
	}	
	public static void bras(String brasil[], String suplebra []) {
		System.out.println();
		System.out.println("Matriz jugadores alineados");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < brasil.length)
					alineacion[3][0]=brasil[0]+" POR";
				alineacion[1][2]=brasil[1]+" LI";
				alineacion[2][1]=brasil[2]+" DF";
				alineacion[4][1]=brasil[3]+" DF";
				alineacion[5][2]=brasil[4]+" LA";
				alineacion[3][1]=brasil[5]+" MCD";
				alineacion[2][4]=brasil[6]+" MI";
				alineacion[4][4]=brasil[7]+" MD";
				alineacion[0][7]=brasil[8]+" EI";
				alineacion[3][2]=brasil[9]+" DC";
				alineacion[6][7]=brasil[10]+" ED";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}

				else {	System.out.print(alineacion[i][j] + " ");
				}
			}
			System.out.println();
		}		
	}
	public static void alem (String alemania[],  String suplealem[]) {
		System.out.println();
		System.out.println("Matriz jugadores alineados");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < alemania.length)
					alineacion[3][0]=alemania[0]+" POR";
				alineacion[6][3]=alemania[1]+" LD";
				alineacion[2][3]=alemania[2]+" DF";
				alineacion[4][2]=alemania[3]+" DF";
				alineacion[0][3]=alemania[4]+" LI";
				alineacion[5][5]=alemania[5]+" MD";
				alineacion[1][5]=alemania[6]+" MI";
				alineacion[0][6]=alemania[7]+" EI";
				alineacion[3][3]=alemania[8]+" MCO";
				alineacion[6][6]=alemania[9]+" ED";
				alineacion[3][4]=alemania[10]+" DC";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}

				else {	System.out.print(alineacion[i][j] + " ");
				}
			}
			System.out.println();
		}		
	}
	public static void argent(String argentina[], String supleargen []) {
		System.out.println();
		System.out.println("Matriz jugadores alineados");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < argentina.length)
					alineacion[3][0]=argentina[0]+" POR";
				alineacion[6][3]=argentina[1]+"  LD";
				alineacion[2][3]=argentina[2]+"  DF";
				alineacion[4][3]=argentina[3]+"  DF";
				alineacion[0][3]=argentina[4]+"  LI";
				alineacion[1][6]=argentina[5]+"  MI";
				alineacion[3][2]=argentina[6]+"  MCD";
				alineacion[5][6]=argentina[7]+"  MD";
				alineacion[5][7]=argentina[8]+"  ED";
				alineacion[3][3]=argentina[9]+"  DC";
				alineacion[1][7]=argentina[10]+"  EI";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}

				else {	System.out.print(alineacion[i][j] + " ");
				}
			}
			System.out.println();
		}	
	}
	public static void port(String portugal[], String supleportu []) {
		System.out.println();
		System.out.println("Matriz jugadores alineados");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < portugal.length)
					alineacion[3][0]=portugal[0]+" POR";
				alineacion[6][4]=portugal[1]+"  LD";
				alineacion[2][3]=portugal[2]+" DF";
				alineacion[4][3]=portugal[3]+" DF";
				alineacion[0][4]=portugal[4]+" LI";
				alineacion[1][6]=portugal[5]+" MI";
				alineacion[3][1]=portugal[6]+" MCD";
				alineacion[5][6]=portugal[7]+" MD";
				alineacion[5][7]=portugal[8]+" ED";
				alineacion[3][2]=portugal[9]+" DC";
				alineacion[1][7]=portugal[10]+" EI";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}

				else {	System.out.print(alineacion[i][j] + " ");
				}
			}
			System.out.println();
		}	
	}
	public static void ingl(String inglaterra[], String supleingla []) { 
		System.out.println();
		System.out.println("Matriz jugadores alineados");
		System.out.println("Equipo Predeterminado\n");
		int vectorPos = 0;
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(vectorPos < inglaterra.length)
					alineacion[3][0]=inglaterra[0]+" POR";
				alineacion[5][3]=inglaterra[1]+" DFD";
				alineacion[3][1]=inglaterra[2]+" DFC";
				alineacion[1][3]=inglaterra[3]+" DFI";
				alineacion[0][6]=inglaterra[4]+" CAI";
				alineacion[2][6]=inglaterra[5]+" MD";
				alineacion[4][6]=inglaterra[6]+" MI";
				alineacion[6][6]=inglaterra[7]+" CAD";
				alineacion[5][6]=inglaterra[8]+" ED";
				alineacion[3][4]=inglaterra[9]+" DC";
				alineacion[1][6]=inglaterra[10]+" EI";
			}
		}
		for (int i = 0; i < alineacion.length; i++) {
			for (int j = 0; j < alineacion[i].length; j++) {
				if(alineacion[i][j]==null) {
					System.out.print("   ");
				}

				else {	System.out.print(alineacion[i][j] + " ");
				}
			}
			System.out.println();
		}	
	}

	public static void franciacompleto(String francia[], String suplefran [],int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<francia.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+francia[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<suplefran.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+suplefran[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			suplefran[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<francia.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+francia[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplefran.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplefran[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<francia.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+francia[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplefran.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplefran[k]+"\n");	
			}
		}
		break;
		}
		int contadorsuplencia=0;
		while(contadorsuplencia<=2){
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			francia[cambio-1]=suplefran[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<francia.length;k++) {
				System.out.print((k+1)+")"+francia[k]+"\n");			
			}
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		contadorsuplencia++;
	      }
		for(int k=0;k<francia.length;k++) {
			System.out.print((k+1)+")"+francia[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<suplefran.length;k++) {
			System.out.print((k+1)+")"+suplefran[k]+"\n");	
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<francia.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+francia[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		francia[capitan-1]=francia[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<francia.length;k++) {
			System.out.print((k+1)+")"+francia[k]+"\n");			
		}
	}
	public static void brasilcompleto(String brasil[], String suplebra [], int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<brasil.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+brasil[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<suplebra.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+suplebra[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			suplebra[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<brasil.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+brasil[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplebra.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplebra[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<brasil.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+brasil[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplebra.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplebra[k]+"\n");	
			}
		}
		break;
		}
		int contadorsuplencia=0;
		while(contadorsuplencia<=2){
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			brasil[cambio-1]=suplebra[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<brasil.length;k++) {
				System.out.print((k+1)+")"+brasil[k]+"\n");			
			}
			contadorsuplencia++;
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<brasil.length;k++) {
			System.out.print((k+1)+")"+brasil[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<suplebra.length;k++) {
			System.out.print((k+1)+")"+suplebra[k]+"\n");	
		}
		contadorsuplencia++;
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<brasil.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+brasil[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		brasil[capitan-1]=brasil[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<brasil.length;k++) {
			System.out.print((k+1)+")"+brasil[k]+"\n");			
		}
	}
	public static void alemaniacompleto(String alemania[], String suplealema [],int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<alemania.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+alemania[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<suplealema.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+suplealema[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			suplealema[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<alemania.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+alemania[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplealema.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplealema[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<alemania.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+alemania[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplealema.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplealema[k]+"\n");	
			}
		}
		break;
		}
		int contadorsuplencia=0;
		while(contadorsuplencia<=2){
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			alemania[cambio-1]=suplealema[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<alemania.length;k++) {
				System.out.print((k+1)+")"+alemania[k]+"\n");			
			}
			contadorsuplencia++;
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<alemania.length;k++) {
			System.out.print((k+1)+")"+alemania[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<suplealema.length;k++) {
			System.out.print((k+1)+")"+suplealema[k]+"\n");	
		}
		contadorsuplencia++;
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<alemania.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+alemania[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		alemania[capitan-1]=alemania[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<alemania.length;k++) {
			System.out.print((k+1)+")"+alemania[k]+"\n");			
		}
	}
	public static void argentinacompleto(String argentina[], String suplearge [],int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<argentina.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+argentina[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<suplearge.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+suplearge[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			suplearge[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<argentina.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+argentina[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplearge.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplearge[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<argentina.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+argentina[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<suplearge.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+suplearge[k]+"\n");	
			}
		}
		break;
		}
		int contadorsuplencia=0;
		while(contadorsuplencia<=3){
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			argentina[cambio-1]=suplearge[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<argentina.length;k++) {
				System.out.print((k+1)+")"+argentina[k]+"\n");			
			}
			contadorsuplencia++;
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<argentina.length;k++) {
			System.out.print((k+1)+")"+argentina[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<suplearge.length;k++) {
			System.out.print((k+1)+")"+suplearge[k]+"\n");	
		}
		contadorsuplencia++;
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<argentina.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+argentina[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		argentina[capitan-1]=argentina[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<argentina.length;k++) {
			System.out.print((k+1)+")"+argentina[k]+"\n");			
		}
	}
	public static void portugalcompleto(String portugal[], String supleportu [],int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<portugal.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+portugal[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<supleportu.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+supleportu[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			supleportu[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<portugal.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+portugal[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<supleportu.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+supleportu[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<portugal.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+portugal[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<supleportu.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+supleportu[k]+"\n");	
			}
		}
		break;
		}
		int contadorsuplencia=0;
		while(contadorsuplencia<=3){
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			portugal[cambio-1]=supleportu[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<portugal.length;k++) {
				System.out.print((k+1)+")"+portugal[k]+"\n");			
			}
			contadorsuplencia++;
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<portugal.length;k++) {
			System.out.print((k+1)+")"+portugal[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<supleportu.length;k++) {
			System.out.print((k+1)+")"+supleportu[k]+"\n");	
		}
		contadorsuplencia++;
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<portugal.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+portugal[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		portugal[capitan-1]=portugal[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<portugal.length;k++) {
			System.out.print((k+1)+")"+portugal[k]+"\n");			
		}
	}
	public static void inglaterracompleto(String inglaterra[], String supleingla[],int cambio, int cambio1, String cambio2) {
		System.out.println(" \n Si el jugador es true es porque es titular si es false esta en la banca\n");
		boolean acti=true;
		System.err.print("\n Alineacion \t\n");
		for(int i=0;i<inglaterra.length;i++) {
			System.out.print( acti+" "+((i+1)+")."+inglaterra[i]+"\n"));	
		}
		acti=false;
		System.out.println("\n Suplentes");
		for(int e=0;e<supleingla.length;e++) {
			System.out.print(acti+" "+(e+1)+")."+supleingla[e]+"\n");
		}
		String cambiosuplente=JOptionPane.showInputDialog("¿Desea realizar la transferencia de algun jugador? SI/NO");
		System.out.println("Recuerda que solo puedes vender a los suplentes.");
		switch(cambiosuplente) {
		case "Si":
		case "si":
		case "S":
		case "s":
		case "SI":{
			acti=true;
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que desea vender"));
			cambio2=JOptionPane.showInputDialog(" Ingrese el nombre y numero de dorsal del jugador que desea comprar");
			supleingla[cambio-1]=cambio2+"\t";
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<inglaterra.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+inglaterra[k]+"\n");
			}

			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<supleingla.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+supleingla[k]+"\n");	
			}
		}
		break;
		case "No":
		case "no":
		case "N":
		case "n":
		case "NO":{
			System.out.println();
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
			System.out.println("\nTitulares\n");
			for(int k=0;k<inglaterra.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+inglaterra[k]+"\n");
			}
			System.out.println();
			System.out.println("\nSuplentes\n");
			for(int k=0;k<supleingla.length;k++) {
				System.out.print(acti+" "+(k+1)+")"+supleingla[k]+"\n");	
			}
		}
		break;
		}
		int contadorsuplencia=0;
		while(contadorsuplencia<=3){
		String cambiosuplente1=JOptionPane.showInputDialog("¿Desea realizar algun cambio a la alineacion? SI/NO");
		if(cambiosuplente1.equals("SI")|| cambiosuplente1.equals("S")||cambiosuplente1.equals("Si")|| cambiosuplente1.equals("s")|| cambiosuplente1.equals("si")) {
			cambio=Integer.parseInt(JOptionPane.showInputDialog(" Marque el numero del que sale y del que va a reemplazarlo"));
			cambio1=Integer.parseInt(JOptionPane.showInputDialog("Marque el numero del va a entrar"));
			inglaterra[cambio-1]=supleingla[cambio1-1];
			System.out.println();
			System.out.println("Tu plantilla actualizada quedaria de la siguiente manera.");
			for(int k=0;k<inglaterra.length;k++) {
				System.out.print((k+1)+")"+inglaterra[k]+"\n");			
			}
			contadorsuplencia++;
		}
		else 
			System.out.println("\nTu plantilla  quedaria de la siguiente manera.\n");
		System.out.println("\nTitulares\n");
		for(int k=0;k<inglaterra.length;k++) {
			System.out.print((k+1)+")"+inglaterra[k]+"\n");	
		}
		System.out.println("\nSuplentes\n");
		for(int k=0;k<supleingla.length;k++) {
			System.out.print((k+1)+")"+supleingla[k]+"\n");	
		}
		contadorsuplencia++;
		}
		acti = true;
		System.out.println();
		System.out.println("\n Escoge un capitan para tu equipo.\n");
		System.out.println();
		for(int k=0;k<inglaterra.length;k++) {
			System.out.print(acti+" "+((k+1)+")"+inglaterra[k]+"\n"));			
		}
		int capitan=Integer.parseInt(JOptionPane.showInputDialog("¿Que jugador deseas que sea el capitan?"));
		System.out.println();
		inglaterra[capitan-1]=inglaterra[capitan-1]+".C";
		System.out.println();
		System.out.println("Tu plantilla quedaria asi.");
		System.out.println("Titulares del equipo Frances y con el capitan \n");
		for(int k=0;k<inglaterra.length;k++) {
			System.out.print((k+1)+")"+inglaterra[k]+"\n");			
		}
	}

	public static void IniciarJuego() {
		String otrojuego=null;
		String marcador=null;
		do {
		int jug1 =Integer.parseInt(JOptionPane.showInputDialog("          SELECCIONA EL EQUIPO QUE DESEAS QUE JUEGUE:"
				+ "\n"
				+"\n 1. Francia"
				+ "\n 2. Brasil"
				+ "\n 3. Alemania"
				+ "\n 4. Argentina"
				+ "\n 5. Potugal"
				+ "\n 6. Inglaterra"));
		switch(jug1) {
		 case(1):
			 int jug2vsfrancia=Integer.parseInt(JOptionPane.showInputDialog("          SELECCIONA EL EQUIPO CONTRINCANTE:"
						+ "\n"
						+ "\n 1. Brasil"
						+ "\n 2. Alemania"
						+ "\n 3. Argentina"
						+ "\n 4. Potugal"
						+ "\n 5. Inglaterra"));
		     switch(jug2vsfrancia) {
		     case(1):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		         if (golesfrancia==0 && golesbrasil==0) {
		    	 if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
		    		golesfrancia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo francia"));
		    		golesbrasil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Brasil"));
		    	 }else {
		    		 golesfrancia=(int)(Math.random()*7);
		 			golesbrasil=(int)(Math.random()*7);
		    	 }
		    	 partidosfrancia++;
					partidosbrasil++;
					golesafavorfrancia=(golesafavorfrancia+golesfrancia);
					golesafavorbrasil=(golesafavorbrasil+golesbrasil);
					golesencontrafrancia=(golesencontrafrancia+golesbrasil);
					golesencontrabrasil=(golesencontrabrasil+golesfrancia);
					if(golesfrancia>golesbrasil){
						puntajefrancia+=3;
						ganadosfrancia++;
						perdidosbrasil++;
					}else if(golesbrasil>golesfrancia) {
						puntajebrasil+=3;
						ganadosbrasil++;
						perdidosfrancia++;
					}else if(golesbrasil==golesfrancia) {
						puntajefrancia++;
						puntajebrasil++;
						empatadosfrancia++;
						empatadosbrasil++;
					}
					JOptionPane.showMessageDialog(null,"Francia  "+golesfrancia+" VS "+golesbrasil+" Brasil");
		         }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(2):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesfrancia==0 && golesalemania==0) {
	    	 if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		golesfrancia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Francia"));
	    		golesalemania=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Alemania"));
	    	 }else {
	    		golesfrancia=(int)(Math.random()*7);
	 			golesalemania=(int)(Math.random()*7);
	    	 }
	    	 partidosfrancia++;
				partidosalemania++;
				golesafavorfrancia=(golesafavorfrancia+golesfrancia);
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesencontrafrancia=(golesencontrafrancia+golesalemania);
				golesencontraalemania=(golesencontraalemania+golesfrancia);
				if(golesfrancia>golesalemania){
					puntajefrancia+=3;
					ganadosfrancia++;
					perdidosalemania++;
				}else if(golesalemania>golesfrancia) {
					puntajealemania+=3;
					ganadosalemania++;
					perdidosfrancia++;
				}else if(golesalemania==golesfrancia) {
					puntajefrancia++;
					puntajealemania++;
					empatadosfrancia++;
					empatadosalemania++;
				}
				JOptionPane.showMessageDialog(null,"Francia  "+golesfrancia+" VS "+golesalemania+" Alemania");
		     }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(3):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesfrancia==0 && golesargentina==0) {
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesfrancia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo francia"));
	    		 golesargentina=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Argentina"));
	    	 }else {
	    		 golesfrancia=(int)(Math.random()*7);
	 		     golesargentina=(int)(Math.random()*7);
	    	 }
	    	 partidosfrancia++;
				partidosargentina++;
				golesafavorfrancia=(golesafavorfrancia+golesfrancia);
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesencontrafrancia=(golesencontrafrancia+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesfrancia);
				if(golesfrancia>golesargentina){
					puntajefrancia+=3;
					ganadosfrancia++;
					perdidosargentina++;
				}else if(golesargentina>golesfrancia) {
					puntajeargentina+=3;
					ganadosargentina++;
					perdidosfrancia++;
				}else if(golesargentina==golesfrancia) {
					puntajefrancia++;
					puntajeargentina++;
					empatadosfrancia++;
					empatadosargentina++;
				}
				JOptionPane.showMessageDialog(null,"Francia  "+golesfrancia+" VS "+golesargentina+" Argentina");
		     }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(4):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesfrancia==0 && golesportugal==0) {
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesfrancia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo francia"));
	    		 golesportugal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Portugal"));
	    	 }else {
	    		 golesfrancia=(int)(Math.random()*7);
	 			 golesportugal=(int)(Math.random()*7);
	    	 }
	    	 partidosportugal++;
				partidosfrancia++;
				golesafavorfrancia=(golesafavorfrancia+golesfrancia);
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesencontrafrancia=(golesencontrafrancia+golesportugal);
				golesencontraportugal=(golesencontraportugal+golesfrancia);
				if(golesfrancia>golesportugal){
						puntajefrancia+=3;
						ganadosfrancia++;
						perdidosportugal++;
					}else if(golesportugal>golesfrancia) {
						puntajeportugal+=3;
						ganadosportugal++;
						perdidosfrancia++;
					}else if(golesportugal==golesfrancia) {
						puntajefrancia++;
						puntajeportugal++;
						empatadosfrancia++;
						empatadosportugal++;
						
					}
				JOptionPane.showMessageDialog(null,"Francia  "+golesfrancia+" VS "+golesportugal+" Portugal");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(5):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesfrancia==0 && golesinglaterra==0) {
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesfrancia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo francia"));
	    		 golesinglaterra=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Inglaterra"));
	    	 }else {
	    		 golesfrancia=(int)(Math.random()*7);
	 			 golesinglaterra=(int)(Math.random()*7);
	    	 }
	    	 partidosfrancia++;
				partidosinglaterra++;
				golesafavorfrancia=(golesafavorfrancia+golesfrancia);
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesencontrafrancia=(golesencontrafrancia+golesinglaterra);
				golesencontrainglaterra=(golesencontrainglaterra+golesfrancia);
				if(golesfrancia>golesinglaterra){
					puntajefrancia+=3;
					ganadosfrancia++;
					perdidosinglaterra++;
				}else if(golesinglaterra>golesfrancia) {
					puntajeinglaterra+=3;
					ganadosinglaterra++;
					perdidosfrancia++;
				}else if(golesinglaterra==golesfrancia) {
						puntajefrancia++;
						puntajeinglaterra++;
						empatadosfrancia++;
						empatadosinglaterra++;
						
				}
				JOptionPane.showMessageDialog(null,"Francia  "+golesfrancia+" VS "+golesinglaterra+" Inglaterra");
		     }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     }
			 break;
		 case(2):
			 int jug2vsbrasil =Integer.parseInt(JOptionPane.showInputDialog("          SELECCIONA EL PRIMER EQUIPO QUE DESEAS QUE JUEGUE:"
						+ "\n"
						+"\n 1. Francia"
						+ "\n 2. Alemania"
						+ "\n 3. Argentina"
						+ "\n 4. Potugal"
						+ "\n 5. Inglaterra"));
		      switch(jug2vsbrasil) {
		      case(1):
		    	  marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		      if (golesfrancia==0 && golesbrasil==0) { 
		      if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
		    		 golesfrancia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo francia"));
		    		 golesbrasil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Brasil"));
		    	 }else {
		    		 golesfrancia=(int)(Math.random()*7);
		 			 golesbrasil=(int)(Math.random()*7);
		    	 }
		    	 partidosfrancia++;
					partidosbrasil++;
					golesafavorfrancia=(golesafavorfrancia+golesfrancia);
					golesafavorbrasil=(golesafavorbrasil+golesbrasil);
					golesencontrafrancia=(golesencontrafrancia+golesbrasil);
					golesencontrabrasil=(golesencontrabrasil+golesfrancia);
					if(golesfrancia>golesbrasil){
						puntajefrancia+=3;
						ganadosfrancia++;
						perdidosbrasil++;
					}else if(golesbrasil>golesfrancia) {
						puntajebrasil+=3;
						ganadosbrasil++;
						perdidosfrancia++;
					}else if(golesbrasil==golesfrancia) {
						puntajefrancia++;
						puntajebrasil++;
						empatadosfrancia++;
						empatadosbrasil++;
						
					}
					JOptionPane.showMessageDialog(null,"Francia  "+golesfrancia+" VS "+golesbrasil+" Brasil");
		      }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
			    	 break;
			     case(2):
			    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
			     if (golesalemania==0 && golesbrasil==0) { 
			     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
		    		 golesalemania=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Alemania"));
		    		 golesbrasil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Brasil"));
		    	 }else {
		    		 golesalemania=(int)(Math.random()*7);
		 			 golesbrasil=(int)(Math.random()*7);
		    	 }
		    	 partidosalemania++;
					partidosbrasil++;
					golesafavorbrasil=(golesafavorbrasil+golesbrasil);
					golesafavoralemania=(golesafavoralemania+golesalemania);
					golesencontraalemania=(golesencontraalemania+golesbrasil);
					golesencontrabrasil=(golesencontrabrasil+golesalemania);
					if(golesalemania>golesbrasil){
						puntajealemania+=3;
						ganadosalemania++;
						perdidosbrasil++;
					}else if(golesbrasil>golesalemania) {
						puntajebrasil+=3;
						ganadosbrasil++;
						perdidosalemania++;
					}else if(golesbrasil==golesalemania) {
							puntajealemania++;
							puntajebrasil++;
							empatadosbrasil++;
							empatadosalemania++;
							
					}
					JOptionPane.showMessageDialog(null,"Alemania  "+golesalemania+" VS "+golesbrasil+" Brasil");
			     }else {
			        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
			        			+ "SELECCIONA OTRO"); 
			     }
			    	 break;
			     case(3):
			    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
			     if (golesargentina==0 && golesbrasil==0) { 
			     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
		    		 golesargentina=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Argentina"));
		    		 golesbrasil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Brasil"));
		    	 }else {
		    		 golesargentina=(int)(Math.random()*7);
		 			 golesbrasil=(int)(Math.random()*7);
		    	 }
		    	 partidosbrasil++;
					partidosargentina++;
					golesafavorbrasil=(golesafavorbrasil+golesbrasil);
					golesafavorargentina=(golesafavorargentina+golesargentina);
					golesencontraargentina=(golesencontraargentina+golesbrasil);
					golesencontrabrasil=(golesencontrabrasil+golesargentina);
					if(golesbrasil>golesargentina){
							puntajebrasil+=3;
							ganadosbrasil++;
							perdidosargentina++;
						}else if(golesargentina>golesbrasil) {
							puntajeargentina+=3;
							ganadosargentina++;
							perdidosbrasil++;
						}else if(golesargentina==golesbrasil) {
							puntajebrasil++;
							puntajeargentina++;
							empatadosbrasil++;
							empatadosargentina++;
							
					}
					JOptionPane.showMessageDialog(null,"Argentina  "+golesargentina+" VS "+golesbrasil+" Brasil");
			     }else {
			        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
			        			+ "SELECCIONA OTRO"); 
			     }
			    	 break;
			     case(4):marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
			     if (golesportugal==0 && golesbrasil==0) { 
			     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
		    		 golesportugal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Potugal"));
		    		 golesbrasil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Brasil"));
		    	 }else {
		    		 golesportugal=(int)(Math.random()*7);
		 			 golesbrasil=(int)(Math.random()*7);
		    	 }
		    	 partidosportugal++;
					partidosbrasil++;
					golesafavorbrasil=(golesafavorbrasil+golesbrasil);
					golesafavorportugal=(golesafavorportugal+golesportugal);
					golesencontraportugal=(golesencontraportugal+golesbrasil);
					golesencontrabrasil=(golesencontrabrasil+golesportugal);
					if(golesportugal>golesbrasil){
							puntajeportugal+=3;
							ganadosportugal++;
							perdidosbrasil++;
						}else if(golesbrasil>golesportugal) {
							puntajebrasil+=3;
							ganadosbrasil++;
							perdidosportugal++;
						}else if(golesbrasil==golesportugal) {
							puntajeportugal++;
							puntajebrasil++;
							empatadosportugal++;
							empatadosbrasil++;
							
					}
					JOptionPane.showMessageDialog(null,"Portugal  "+golesportugal+" VS "+golesbrasil+" Brasil");
			     }else {
			        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
			        			+ "SELECCIONA OTRO"); 
			     }
			    	 break;
			     case(5):
			    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
			     if (golesinglaterra==0 && golesbrasil==0) { 
			     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
		    		 golesinglaterra=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Inglaterra"));
		    		 golesbrasil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Brasil"));
		    	 }else {
		    		 golesinglaterra=(int)(Math.random()*7);
		 			 golesbrasil=(int)(Math.random()*7);
		    	 }
		    	 partidosinglaterra++;
					partidosbrasil++;
					golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
					golesafavorbrasil=(golesafavorbrasil+golesbrasil);
					golesencontrainglaterra=(golesencontrainglaterra+golesbrasil);
					golesencontrabrasil=(golesencontrabrasil+golesinglaterra);
					if(golesinglaterra>golesbrasil){
							puntajeinglaterra+=3;
							ganadosinglaterra++;
							perdidosbrasil++;
						}else if(golesbrasil>golesinglaterra) {
							puntajebrasil+=3;
							ganadosbrasil++;
							perdidosinglaterra++;
						}else if(golesbrasil==golesinglaterra) {
							puntajeinglaterra++;
							puntajebrasil++;
							empatadosinglaterra++;
							empatadosbrasil++;
							
					}
					JOptionPane.showMessageDialog(null,"Inglaterra  "+golesinglaterra+" VS "+golesbrasil+" Brasil");
			     }else {
			        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
			        			+ "SELECCIONA OTRO"); 
			     }
			    	 break;
	          }
			 break;
		 case(3):
			 int jug2vsalemania =Integer.parseInt(JOptionPane.showInputDialog("          SELECCIONA EL PRIMER EQUIPO QUE DESEAS QUE JUEGUE:"
						+ "\n"
						+"\n 1. Francia"
						+ "\n 2. Brasil"
						+ "\n 3. Argentina"
						+ "\n 4. Potugal"
						+ "\n 5. Inglaterra"));
		     switch(jug2vsalemania) {
		     case(1):marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesalemania==0 && golesfrancia==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesfrancia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo francia"));
	    		 golesalemania=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Alemania"));
	    	 }else {
	    		 golesfrancia=(int)(Math.random()*7);
	 			 golesalemania=(int)(Math.random()*7);
	    	 }
	    	 partidosfrancia++;
				partidosalemania++;
				golesafavorfrancia=(golesafavorfrancia+golesfrancia);
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesencontrafrancia=(golesencontrafrancia+golesalemania);
				golesencontraalemania=(golesencontraalemania+golesfrancia);
				if(golesfrancia>golesalemania){
					puntajefrancia+=3;
					ganadosfrancia++;
					perdidosalemania++;
				}else if(golesalemania>golesfrancia) {
					puntajealemania+=3;
					ganadosalemania++;
					perdidosfrancia++;
				}else if(golesalemania==golesfrancia) {
					puntajefrancia++;
					puntajealemania++;
					empatadosfrancia++;
					empatadosalemania++;
					
				}
				JOptionPane.showMessageDialog(null,"Alemania  "+golesalemania+" VS "+golesfrancia+" Francia");
		     }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(2):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesalemania==0 && golesbrasil==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesalemania=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Alemania"));
	    		 golesbrasil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Brasil"));
	    	 }else {
	    		 golesalemania=(int)(Math.random()*7);
	 			 golesbrasil=(int)(Math.random()*7);
	    	 }
	    	 partidosalemania++;
				partidosbrasil++;
				golesafavorbrasil=(golesafavorbrasil+golesbrasil);
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesencontraalemania=(golesencontraalemania+golesbrasil);
				golesencontrabrasil=(golesencontrabrasil+golesalemania);
				if(golesalemania>golesbrasil){
					puntajealemania+=3;
					ganadosalemania++;
					perdidosbrasil++;
				}else if(golesbrasil>golesalemania) {
					puntajebrasil+=3;
					ganadosbrasil++;
					perdidosalemania++;
				}else if(golesbrasil==golesalemania) {
						puntajealemania++;
						puntajebrasil++;
						empatadosbrasil++;
						empatadosalemania++;
						
				}
				JOptionPane.showMessageDialog(null,"Alemania  "+golesalemania+" VS "+golesbrasil+" Brasil");
		     }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(3):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesalemania==0 && golesargentina==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesalemania=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Alemania"));
	    		 golesargentina=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Argentina"));
	    	 }else {
	    		 golesalemania=(int)(Math.random()*7);
	 			 golesargentina=(int)(Math.random()*7);
	    	 }
	    	 partidosalemania++;
				partidosargentina++;
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesencontraalemania=(golesencontraalemania+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesalemania);
				if(golesalemania>golesargentina){
						puntajealemania+=3;
						ganadosalemania++;
						perdidosargentina++;
					}else if(golesargentina>golesalemania) {
						puntajeargentina+=3;
						ganadosargentina++;
						perdidosalemania++;
					}else if(golesargentina==golesalemania) {
						puntajealemania++;
						puntajeargentina++;
						empatadosalemania++;
						empatadosargentina++;
						
				}
				JOptionPane.showMessageDialog(null,"Alemania  "+golesalemania+" VS "+golesargentina+" Alemania");
		     }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(4):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesalemania==0 && golesportugal==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesalemania=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Alemania"));
	    		 golesportugal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Portugal"));
	    	 }else {
	    		 golesalemania=(int)(Math.random()*7);
	 			 golesportugal=(int)(Math.random()*7);
	    	 }
	    	 partidosportugal++;
				partidosalemania++;
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesencontraportugal=(golesencontraportugal+golesalemania);
				golesencontraalemania=(golesencontraalemania+golesportugal);
				if(golesportugal>golesalemania){
						puntajeportugal+=3;
						ganadosportugal++;
						perdidosalemania++;
					}else if(golesalemania>golesportugal) {
						puntajealemania+=3;
						ganadosalemania++;
						perdidosportugal++;
					}else if(golesalemania==golesportugal) {
						puntajeportugal++;
						puntajealemania++;
						empatadosportugal++;
						empatadosalemania++;
						
				}
				JOptionPane.showMessageDialog(null,"Alemania  "+golesalemania+" VS "+golesportugal+" Portugal");
	            }else {
	        	     JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
	        			+ "SELECCIONA OTRO"); 
	             }
		    	 break;
		     case(5):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesalemania==0 && golesinglaterra==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesalemania=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Alemania"));
	    		 golesinglaterra=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Inglaterra"));
	    	 }else {
	    		 golesalemania=(int)(Math.random()*7);
	 			 golesinglaterra=(int)(Math.random()*7);
	    	 }
	    	 partidosalemania++;
				partidosinglaterra++;
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesencontraalemania=(golesencontraalemania+golesinglaterra);
				golesencontrainglaterra=(golesencontrainglaterra+golesalemania);
				if(golesalemania>golesinglaterra){
						puntajealemania+=3;
						ganadosalemania++;
						perdidosinglaterra++;
					}else if(golesinglaterra>golesalemania) {
						puntajeinglaterra+=3;
						ganadosinglaterra++;
						perdidosalemania++;
					}else if(golesinglaterra==golesalemania) {
						puntajealemania++;
						puntajeinglaterra++;
						empatadosalemania++;
						empatadosinglaterra++;
						
				}
				JOptionPane.showMessageDialog(null,"Alemania  "+golesalemania+" VS "+golesinglaterra+" Inglaterra");
	         	}else {
        	        JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
        			+ "SELECCIONA OTRO"); 
                 }
		    	 break;
	         }
			 break;
		 case(4):
			 int jug2vsargentina =Integer.parseInt(JOptionPane.showInputDialog("          SELECCIONA EL PRIMER EQUIPO QUE DESEAS QUE JUEGUE:"
						+ "\n"
						+"\n 1. Francia"
						+ "\n 2. Brasil"
						+ "\n 3. Alemania"
						+ "\n 4. Potugal"
						+ "\n 5. Inglaterra"));
		     switch(jug2vsargentina) {
		     case(1):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesargentina==0 && golesfrancia==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesfrancia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo francia"));
	    		 golesargentina=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Argentina"));
	    	 }else {
	    		 golesfrancia=(int)(Math.random()*7);
	 			 golesargentina=(int)(Math.random()*7);
	    	 }
	    	 partidosfrancia++;
				partidosargentina++;
				golesafavorfrancia=(golesafavorfrancia+golesfrancia);
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesencontrafrancia=(golesencontrafrancia+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesfrancia);
				if(golesfrancia>golesargentina){
					puntajefrancia+=3;
					ganadosfrancia++;
					perdidosargentina++;
				}else if(golesargentina>golesfrancia) {
					puntajeargentina+=3;
					ganadosargentina++;
					perdidosfrancia++;
				}else if(golesargentina==golesfrancia) {
					puntajefrancia++;
					puntajeargentina++;
					empatadosfrancia++;
					empatadosargentina++;
					
				}
				JOptionPane.showMessageDialog(null,"Argentina  "+golesargentina+" VS "+golesfrancia+" Francia");
		     }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(2):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesargentina==0 && golesbrasil==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesargentina=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Argentina"));
	    		 golesbrasil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Brasil"));
	    	 }else {
	    		 golesargentina=(int)(Math.random()*7);
	 			 golesbrasil=(int)(Math.random()*7);
	    	 }
	    	 partidosbrasil++;
				partidosargentina++;
				golesafavorbrasil=(golesafavorbrasil+golesbrasil);
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesbrasil);
				golesencontrabrasil=(golesencontrabrasil+golesargentina);
				if(golesbrasil>golesargentina){
						puntajebrasil+=3;
						ganadosbrasil++;
						perdidosargentina++;
					}else if(golesargentina>golesbrasil) {
						puntajeargentina+=3;
						ganadosargentina++;
						perdidosbrasil++;
					}else if(golesargentina==golesbrasil) {
						puntajebrasil++;
						puntajeargentina++;
						empatadosbrasil++;
						empatadosargentina++;
						
				}
				JOptionPane.showMessageDialog(null,"Argentina  "+golesargentina+" VS "+golesbrasil+" Brasil");
                 }else {
	                   JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
                 			+ "SELECCIONA OTRO"); 
                   }
		    	 break;
		     case(3):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesargentina==0 && golesalemania==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesargentina=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Argentina"));
	    		 golesalemania=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Alemania"));
	    	 }else {
	    		 golesargentina=(int)(Math.random()*7);
	 			 golesalemania=(int)(Math.random()*7);
	    	 }
	    	 partidosalemania++;
				partidosargentina++;
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesencontraalemania=(golesencontraalemania+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesalemania);
				if(golesalemania>golesargentina){
						puntajealemania+=3;
						ganadosalemania++;
						perdidosargentina++;
					}else if(golesargentina>golesalemania) {
						puntajeargentina+=3;
						ganadosargentina++;
						perdidosalemania++;
					}else if(golesargentina==golesalemania) {
						puntajealemania++;
						puntajeargentina++;
						empatadosalemania++;
						empatadosargentina++;
						
				}
				JOptionPane.showMessageDialog(null,"Argentina  "+golesargentina+" VS "+golesalemania+" Alemania");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
				
		    	 break;
		     case(4):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesargentina==0 && golesportugal==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesargentina=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Argentina"));
	    		 golesportugal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Portugal"));
	    	 }else {
	    		 golesargentina=(int)(Math.random()*7);
	 			 golesportugal=(int)(Math.random()*7);
	    	 }
	    	 partidosportugal++;
				partidosargentina++;
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesencontraportugal=(golesencontraportugal+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesportugal);
				if(golesportugal>golesargentina){
					puntajeportugal+=3;
					ganadosportugal++;
					perdidosargentina++;
				}else if(golesargentina>golesportugal) {
					puntajeargentina+=3;
					ganadosargentina++;
					perdidosportugal++;
				}else if(golesargentina==golesportugal) {
						puntajeportugal++;
						puntajeargentina++;
						empatadosportugal++;
						empatadosargentina++;
						
				}		 
				JOptionPane.showMessageDialog(null,"Argentina  "+golesargentina+" VS "+golesportugal+" Portugal");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(5):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesargentina==0 && golesinglaterra==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesargentina=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Argentina"));
	    		 golesinglaterra=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Inglaterra"));
	    	 }else {
	    		 golesargentina=(int)(Math.random()*7);
	 			 golesinglaterra=(int)(Math.random()*7);
	    	 }
	    	 partidosinglaterra++;
				partidosargentina++;
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesencontrainglaterra=(golesencontrainglaterra+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesinglaterra);
				if(golesinglaterra>golesargentina){
						puntajeinglaterra+=3;
						ganadosinglaterra++;
						perdidosargentina++;
					}else if(golesargentina>golesinglaterra) {
						puntajeargentina+=3;
						ganadosargentina++;
						perdidosinglaterra++;
					}else if(golesargentina==golesinglaterra) {
						puntajeinglaterra++;
						puntajeargentina++;
						empatadosinglaterra++;
						empatadosargentina++;
						
				} 
				JOptionPane.showMessageDialog(null,"Argentina  "+golesargentina+" VS "+golesinglaterra+" Inglaterra");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
	         }
			 break;
		 case(5):
			 int jug2vsportugal =Integer.parseInt(JOptionPane.showInputDialog("          SELECCIONA EL PRIMER EQUIPO QUE DESEAS QUE JUEGUE:"
						+ "\n"
						+"\n 1. Francia"
						+ "\n 2. Brasil"
						+ "\n 3. Alemania"
						+ "\n 4. Argentina"
						+ "\n 5. Inglaterra"));
		     switch(jug2vsportugal) {
		     case(1):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesportugal==0 && golesfrancia==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesfrancia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Francia"));
	    		 golesportugal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Portugl"));
	    	 }else {
	    		 golesfrancia=(int)(Math.random()*7);
	 			 golesportugal=(int)(Math.random()*7);
	    	 }
	    	 partidosportugal++;
				partidosfrancia++;
				golesafavorfrancia=(golesafavorfrancia+golesfrancia);
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesencontrafrancia=(golesencontrafrancia+golesportugal);
				golesencontraportugal=(golesencontraportugal+golesfrancia);
				if(golesfrancia>golesportugal){
						puntajefrancia+=3;
						ganadosfrancia++;
						perdidosportugal++;
					}else if(golesportugal>golesfrancia) {
						puntajeportugal+=3;
						ganadosportugal++;
						perdidosfrancia++;
					}else if(golesportugal==golesfrancia) {
						puntajefrancia++;
						puntajeportugal++;
						empatadosfrancia++;
						empatadosportugal++;
						
					}	
				JOptionPane.showMessageDialog(null,"Portugal  "+golesportugal+" VS "+golesfrancia+" Francia");
				}else {
			        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
			        			+ "SELECCIONA OTRO"); 
			     }
		    	 break;
		     case(2):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesportugal==0 && golesbrasil==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesportugal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Portugal"));
	    		 golesbrasil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Brasil"));
	    	 }else {
	    		 golesportugal=(int)(Math.random()*7);
	 			 golesbrasil=(int)(Math.random()*7);
	    	 }
	    	 partidosportugal++;
				partidosbrasil++;
				golesafavorbrasil=(golesafavorbrasil+golesbrasil);
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesencontraportugal=(golesencontraportugal+golesbrasil);
				golesencontrabrasil=(golesencontrabrasil+golesportugal);
				if(golesportugal>golesbrasil){
						puntajeportugal+=3;
						ganadosportugal++;
						perdidosbrasil++;
					}else if(golesbrasil>golesportugal) {
						puntajebrasil+=3;
						ganadosbrasil++;
						perdidosportugal++;
					}else if(golesbrasil==golesportugal) {
						puntajeportugal++;
						puntajebrasil++;
						empatadosportugal++;
						empatadosbrasil++;
						
				}	
				JOptionPane.showMessageDialog(null,"Portugal  "+golesportugal+" VS "+golesbrasil+" Brasil");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(3):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesportugal==0 && golesalemania==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesportugal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Portugal"));
	    		 golesalemania=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Alemania"));
	    	 }else {
	    		 golesportugal=(int)(Math.random()*7);
	 			 golesalemania=(int)(Math.random()*7);
	    	 }
	    	 partidosportugal++;
				partidosalemania++;
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesencontraportugal=(golesencontraportugal+golesalemania);
				golesencontraalemania=(golesencontraalemania+golesportugal);
				if(golesportugal>golesalemania){
						puntajeportugal+=3;
						ganadosportugal++;
						perdidosalemania++;
					}else if(golesalemania>golesportugal) {
						puntajealemania+=3;
						ganadosalemania++;
						perdidosportugal++;
					}else if(golesalemania==golesportugal) {
						puntajeportugal++;
						puntajealemania++;
						empatadosportugal++;
						empatadosalemania++;
						
				}	
				JOptionPane.showMessageDialog(null,"Portugal  "+golesportugal+" VS "+golesalemania+" Alemania");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(4):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesportugal==0 && golesargentina==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesportugal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Portugal"));
	    		 golesargentina=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Argentina"));
	    	 }else {
	    		 golesportugal=(int)(Math.random()*7);
	 			 golesargentina=(int)(Math.random()*7);
	    	 }
	    	 partidosportugal++;
				partidosargentina++;
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesencontraportugal=(golesencontraportugal+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesportugal);
				if(golesportugal>golesargentina){
					puntajeportugal+=3;
					ganadosportugal++;
					perdidosargentina++;
				}else if(golesargentina>golesportugal) {
					puntajeargentina+=3;
					ganadosargentina++;
					perdidosportugal++;
				}else if(golesargentina==golesportugal) {
						puntajeportugal++;
						puntajeargentina++;
						empatadosportugal++;
						empatadosargentina++;
						
				}	
				JOptionPane.showMessageDialog(null,"Portugal  "+golesportugal+" VS "+golesargentina+" Argentina");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(5):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesportugal==0 && golesinglaterra==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesportugal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Portugal"));
	    		 golesinglaterra=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Inglaterra"));
	    	 }else {
	    		 golesportugal=(int)(Math.random()*7);
	 			 golesinglaterra=(int)(Math.random()*7);
	    	 }
	    	 partidosportugal++;
				partidosinglaterra++;
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesencontraportugal=(golesencontraportugal+golesinglaterra);
				golesencontrainglaterra=(golesencontrainglaterra+golesportugal);
				if(golesportugal>golesinglaterra){
					puntajeportugal+=3;
					ganadosportugal++;
					perdidosinglaterra++;
				}else if(golesinglaterra>golesportugal) {
					puntajeinglaterra+=3;
					ganadosinglaterra++;
					perdidosportugal++;
				}else if(golesinglaterra==golesportugal) {
						puntajeportugal++;
						puntajeinglaterra++;
						empatadosportugal++;
						empatadosinglaterra++;
						
				}
				JOptionPane.showMessageDialog(null,"Portugal  "+golesportugal+" VS "+golesinglaterra+" Inglaterra");
		     }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
	         }
			 break;
		 case(6):
			 int jug2vsinglaterra =Integer.parseInt(JOptionPane.showInputDialog("          SELECCIONA EL PRIMER EQUIPO QUE DESEAS QUE JUEGUE:"
						+ "\n"
						+"\n 1. Francia"
						+ "\n 2. Brasil"
						+ "\n 3. Alemania"
						+ "\n 4. Argentina"
						+ "\n 5. Potugal"));
		     switch(jug2vsinglaterra) {
		     case(1):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesinglaterra==0 && golesfrancia==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesfrancia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Francia"));
	    		 golesinglaterra=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Inglaterra"));
	    	 }else {
	    		 golesfrancia=(int)(Math.random()*7);
	 			 golesinglaterra=(int)(Math.random()*7);
	    	 }
	    	 partidosfrancia++;
				partidosinglaterra++;
				golesafavorfrancia=(golesafavorfrancia+golesfrancia);
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesencontrafrancia=(golesencontrafrancia+golesinglaterra);
				golesencontrainglaterra=(golesencontrainglaterra+golesfrancia);
				if(golesfrancia>golesinglaterra){
					puntajefrancia+=3;
					ganadosfrancia++;
					perdidosinglaterra++;
				}else if(golesinglaterra>golesfrancia) {
					puntajeinglaterra+=3;
					ganadosinglaterra++;
					perdidosfrancia++;
				}else if(golesinglaterra==golesfrancia) {
						puntajefrancia++;
						puntajeinglaterra++;
						empatadosfrancia++;
						empatadosinglaterra++;
						
				}
				JOptionPane.showMessageDialog(null,"Inglaterra  "+golesinglaterra+" VS "+golesfrancia+" Francia");
		     }else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(2):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesinglaterra==0 && golesbrasil==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesinglaterra=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Inglaterra"));
	    		 golesbrasil=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Brasil"));
	    	 }else {
	    		 golesinglaterra=(int)(Math.random()*7);
	 			 golesbrasil=(int)(Math.random()*7);
	    	 }
	    	 partidosinglaterra++;
				partidosbrasil++;
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesafavorbrasil=(golesafavorbrasil+golesbrasil);
				golesencontrainglaterra=(golesencontrainglaterra+golesbrasil);
				golesencontrabrasil=(golesencontrabrasil+golesinglaterra);
				if(golesinglaterra>golesbrasil){
						puntajeinglaterra+=3;
						ganadosinglaterra++;
						perdidosbrasil++;
					}else if(golesbrasil>golesinglaterra) {
						puntajebrasil+=3;
						ganadosbrasil++;
						perdidosinglaterra++;
					}else if(golesbrasil==golesinglaterra) {
						puntajeinglaterra++;
						puntajebrasil++;
						empatadosinglaterra++;
						empatadosbrasil++;
						
				}	
				JOptionPane.showMessageDialog(null,"Inglaterra  "+golesinglaterra+" VS "+golesbrasil+" Brasil");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(3):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesinglaterra==0 && golesalemania==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesinglaterra=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Inglaterra"));
	    		 golesalemania=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Alemania"));
	    	 }else {
	    		 golesinglaterra=(int)(Math.random()*7);
	 			 golesalemania=(int)(Math.random()*7);
	    	 }
	    	 partidosalemania++;
				partidosinglaterra++;
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesencontraalemania=(golesencontraalemania+golesinglaterra);
				golesencontrainglaterra=(golesencontrainglaterra+golesalemania);
				if(golesalemania>golesinglaterra){
						puntajealemania+=3;
						ganadosalemania++;
						perdidosinglaterra++;
					}else if(golesinglaterra>golesalemania) {
						puntajeinglaterra+=3;
						ganadosinglaterra++;
						perdidosalemania++;
					}else if(golesinglaterra==golesalemania) {
						puntajealemania++;
						puntajeinglaterra++;
						empatadosalemania++;
						empatadosinglaterra++;
						
				}	
				JOptionPane.showMessageDialog(null,"Inglaterra  "+golesinglaterra+" VS "+golesalemania+" Alemania");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(4):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesinglaterra==0 && golesargentina==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesinglaterra=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Inglaterra"));
	    		 golesargentina=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Argentina"));
	    	 }else {
	    		 golesinglaterra=(int)(Math.random()*7);
	 			 golesargentina=(int)(Math.random()*7);
	    	 }
	    	 partidosinglaterra++;
				partidosargentina++;
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesencontrainglaterra=(golesencontrainglaterra+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesinglaterra);
				if(golesinglaterra>golesargentina){
						puntajeinglaterra+=3;
						ganadosinglaterra++;
						perdidosargentina++;
					}else if(golesargentina>golesinglaterra) {
						puntajeargentina+=3;
						ganadosargentina++;
						perdidosinglaterra++;
					}else if(golesargentina==golesinglaterra) {
						puntajeinglaterra++;
						puntajeargentina++;
						empatadosinglaterra++;
						empatadosargentina++;
						
				}	
				JOptionPane.showMessageDialog(null,"Inglaterra  "+golesinglaterra+" VS "+golesargentina+" Argentina");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
		     case(5):
		    	 marcador=JOptionPane.showInputDialog("Deseas ingresar el marcador de este partido Si/No, en el caso de que escojas no el marcador sera generado automaticamente");
		     if (golesinglaterra==0 && golesportugal==0) { 
		     if(marcador.equals("SI")||marcador.equals("Si")||marcador.equals("sI")||marcador.equals("si")||marcador.equals("S")||marcador.equals("s")) {
	    		 golesinglaterra=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Inglaterra"));
	    		 golesportugal=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de goles que hizo Portugal"));
	    	 }else {
	    		 golesinglaterra=(int)(Math.random()*7);
	 			golesportugal=(int)(Math.random()*7);
	    	 }
	    	 partidosportugal++;
				partidosinglaterra++;
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesencontraportugal=(golesencontraportugal+golesinglaterra);
				golesencontrainglaterra=(golesencontrainglaterra+golesportugal);
				if(golesportugal>golesinglaterra){
					puntajeportugal+=3;
					ganadosportugal++;
					perdidosinglaterra++;
				}else if(golesinglaterra>golesportugal) {
					puntajeinglaterra+=3;
					ganadosinglaterra++;
					perdidosportugal++;
				}else if(golesinglaterra==golesportugal) {
						puntajeportugal++;
						puntajeinglaterra++;
						empatadosportugal++;
						empatadosinglaterra++;
						
				}	
				JOptionPane.showMessageDialog(null,"Inglaterra  "+golesinglaterra+" VS "+golesportugal+" Portugal");
				}else {
		        	JOptionPane.showMessageDialog(null, "ESTE PARTIDO YA SE JUGO. "
		        			+ "SELECCIONA OTRO"); 
		     }
		    	 break;
	         }
			 break;
		}
		otrojuego=JOptionPane.showInputDialog("Desea iniciar otro juego Si/No");
		}while(otrojuego.equals("SI")||otrojuego.equals("si")||otrojuego.equals("Si")||otrojuego.equals("sI")||otrojuego.equals("S")||otrojuego.equals("s"));
	}
	
	public static void Jornadas() {
		while(jornada<=5) {
		if(jornada==1) {
		 
			golesfrancia=(int)(Math.random()*7);
			golesbrasil=(int)(Math.random()*7);
			partidosfrancia++;
			partidosbrasil++;
			golesafavorfrancia=(golesafavorfrancia+golesfrancia);
			golesafavorbrasil=(golesafavorbrasil+golesbrasil);
			golesencontrafrancia=(golesencontrafrancia+golesbrasil);
			golesencontrabrasil=(golesencontrabrasil+golesfrancia);
			if(golesfrancia>golesbrasil){
				puntajefrancia+=3;
				ganadosfrancia++;
				perdidosbrasil++;
			}else if(golesbrasil>golesfrancia) {
				puntajebrasil+=3;
				ganadosbrasil++;
				perdidosfrancia++;
			}else if(golesbrasil==golesfrancia) {
				puntajefrancia++;
				puntajebrasil++;
				empatadosfrancia++;
				empatadosbrasil++;
			}
			
			 
			golesalemania=(int)(Math.random()*7);
			golesargentina=(int)(Math.random()*7);
			partidosalemania++;
			partidosargentina++;
			golesafavoralemania=(golesafavoralemania+golesalemania);
			golesafavorargentina=(golesafavorargentina+golesargentina);
			golesencontraalemania=(golesencontraalemania+golesargentina);
			golesencontraargentina=(golesencontraargentina+golesalemania);
			if(golesalemania>golesargentina){
					puntajealemania+=3;
					ganadosalemania++;
					perdidosargentina++;
				}else if(golesargentina>golesalemania) {
					puntajeargentina+=3;
					ganadosargentina++;
					perdidosalemania++;
				}else if(golesargentina==golesalemania) {
					puntajealemania++;
					puntajeargentina++;
					empatadosalemania++;
					empatadosargentina++;
			}
			
			 
			golesportugal=(int)(Math.random()*7);
			golesinglaterra=(int)(Math.random()*7);
			partidosportugal++;
			partidosinglaterra++;
			golesafavorportugal=(golesafavorportugal+golesportugal);
			golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
			golesencontraportugal=(golesencontraportugal+golesinglaterra);
			golesencontrainglaterra=(golesencontrainglaterra+golesportugal);
			if(golesportugal>golesinglaterra){
				puntajeportugal+=3;
				ganadosportugal++;
				perdidosinglaterra++;
			}else if(golesinglaterra>golesportugal) {
				puntajeinglaterra+=3;
				ganadosinglaterra++;
				perdidosportugal++;
			}else if(golesinglaterra==golesportugal) {
					puntajeportugal++;
					puntajeinglaterra++;
					empatadosportugal++;
					empatadosinglaterra++;
			}
			
			System.out.println("RESULTADO JORNADA 1");
			System.out.println("Francia  "+golesfrancia+" VS "+golesbrasil+" Brasil");
			System.out.println("Alemania "+golesalemania+" VS "+golesargentina+" Argentina");
			System.out.println("Portugal "+golesportugal+" VS "+golesinglaterra+" Inglaterra");
			System.out.println("-----------------------------------");
		}else if (jornada==2){
			
			
			golesfrancia=(int)(Math.random()*7);
			golesinglaterra=(int)(Math.random()*7);
			partidosfrancia++;
			partidosinglaterra++;
			golesafavorfrancia=(golesafavorfrancia+golesfrancia);
			golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
			golesencontrafrancia=(golesencontrafrancia+golesinglaterra);
			golesencontrainglaterra=(golesencontrainglaterra+golesfrancia);
			if(golesfrancia>golesinglaterra){
				puntajefrancia+=3;
				ganadosfrancia++;
				perdidosinglaterra++;
			}else if(golesinglaterra>golesfrancia) {
				puntajeinglaterra+=3;
				ganadosinglaterra++;
				perdidosfrancia++;
			}else if(golesinglaterra==golesfrancia) {
					puntajefrancia++;
					puntajeinglaterra++;
					empatadosfrancia++;
					empatadosinglaterra++;
			}
			
			 
			golesalemania=(int)(Math.random()*7);
			golesbrasil=(int)(Math.random()*7);
			partidosalemania++;
			partidosbrasil++;
			golesafavorbrasil=(golesafavorbrasil+golesbrasil);
			golesafavoralemania=(golesafavoralemania+golesalemania);
			golesencontraalemania=(golesencontraalemania+golesbrasil);
			golesencontrabrasil=(golesencontrabrasil+golesalemania);
			if(golesalemania>golesbrasil){
				puntajealemania+=3;
				ganadosalemania++;
				perdidosbrasil++;
			}else if(golesbrasil>golesalemania) {
				puntajebrasil+=3;
				ganadosbrasil++;
				perdidosalemania++;
			}else if(golesbrasil==golesalemania) {
					puntajealemania++;
					puntajebrasil++;
					empatadosbrasil++;
					empatadosalemania++;
			}
            
			 
			golesportugal=(int)(Math.random()*7);
			golesargentina=(int)(Math.random()*7);
			partidosportugal++;
			partidosargentina++;
			golesafavorargentina=(golesafavorargentina+golesargentina);
			golesafavorportugal=(golesafavorportugal+golesportugal);
			golesencontraportugal=(golesencontraportugal+golesargentina);
			golesencontraargentina=(golesencontraargentina+golesportugal);
			if(golesportugal>golesargentina){
				puntajeportugal+=3;
				ganadosportugal++;
				perdidosargentina++;
			}else if(golesargentina>golesportugal) {
				puntajeargentina+=3;
				ganadosargentina++;
				perdidosportugal++;
			}else if(golesargentina==golesportugal) {
					puntajeportugal++;
					puntajeargentina++;
					empatadosportugal++;
					empatadosargentina++;
			}
				
				System.out.println("RESULTADO JORNADA 2");
				System.out.println("Francia  "+golesfrancia+" VS "+golesinglaterra+" Inglaterra");
				System.out.println("Alemania "+golesalemania+" VS "+golesbrasil+" Brasil");
				System.out.println("Portugal "+golesportugal+" VS "+golesargentina+" Argentina");
				System.out.println("-----------------------------------");
		}else if (jornada==3) {
			
			
			golesfrancia=(int)(Math.random()*7);
			golesportugal=(int)(Math.random()*7);
			partidosportugal++;
			partidosfrancia++;
			golesafavorfrancia=(golesafavorfrancia+golesfrancia);
			golesafavorportugal=(golesafavorportugal+golesportugal);
			golesencontrafrancia=(golesencontrafrancia+golesportugal);
			golesencontraportugal=(golesencontraportugal+golesfrancia);
			if(golesfrancia>golesportugal){
					puntajefrancia+=3;
					ganadosfrancia++;
					perdidosportugal++;
				}else if(golesportugal>golesfrancia) {
					puntajeportugal+=3;
					ganadosportugal++;
					perdidosfrancia++;
				}else if(golesportugal==golesfrancia) {
					puntajefrancia++;
					puntajeportugal++;
					empatadosfrancia++;
					empatadosportugal++;
				}
				
			 
				golesbrasil=(int)(Math.random()*7);
				golesargentina=(int)(Math.random()*7);
				partidosbrasil++;
				partidosargentina++;
				golesafavorbrasil=(golesafavorbrasil+golesbrasil);
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesbrasil);
				golesencontrabrasil=(golesencontrabrasil+golesargentina);
				if(golesbrasil>golesargentina){
						puntajebrasil+=3;
						ganadosbrasil++;
						perdidosargentina++;
					}else if(golesargentina>golesbrasil) {
						puntajeargentina+=3;
						ganadosargentina++;
						perdidosbrasil++;
					}else if(golesargentina==golesbrasil) {
						puntajebrasil++;
						puntajeargentina++;
						empatadosbrasil++;
						empatadosargentina++;
				}
                
				 
				golesalemania=(int)(Math.random()*7);
				golesinglaterra=(int)(Math.random()*7);
				partidosalemania++;
				partidosinglaterra++;
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesencontraalemania=(golesencontraalemania+golesinglaterra);
				golesencontrainglaterra=(golesencontrainglaterra+golesalemania);
				if(golesalemania>golesinglaterra){
						puntajealemania+=3;
						ganadosalemania++;
						perdidosinglaterra++;
					}else if(golesinglaterra>golesalemania) {
						puntajeinglaterra+=3;
						ganadosinglaterra++;
						perdidosalemania++;
					}else if(golesinglaterra==golesalemania) {
						puntajealemania++;
						puntajeinglaterra++;
						empatadosalemania++;
						empatadosinglaterra++;
				}
				
				System.out.println("RESULTADO JORNADA 3");
				System.out.println("Francia  "+golesfrancia+" VS "+golesportugal+" Portugal");
				System.out.println("Brasil   "+golesbrasil+" VS "+golesargentina+" Argentina");
				System.out.println("Portugal "+golesportugal+" VS "+golesalemania+" Alemania");
				System.out.println("-----------------------------------");
		}else if(jornada==4) {
			    
			
				golesfrancia=(int)(Math.random()*7);
				golesalemania=(int)(Math.random()*7);
				partidosfrancia++;
				partidosalemania++;
				golesafavorfrancia=(golesafavorfrancia+golesfrancia);
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesencontrafrancia=(golesencontrafrancia+golesalemania);
				golesencontraalemania=(golesencontraalemania+golesfrancia);
				if(golesfrancia>golesalemania){
					puntajefrancia+=3;
					ganadosfrancia++;
					perdidosalemania++;
				}else if(golesalemania>golesfrancia) {
					puntajealemania+=3;
					ganadosalemania++;
					perdidosfrancia++;
				}else if(golesalemania==golesfrancia) {
					puntajefrancia++;
					puntajealemania++;
					empatadosfrancia++;
					empatadosalemania++;
				}
                
				 
				golesinglaterra=(int)(Math.random()*7);
				golesargentina=(int)(Math.random()*7);
				partidosinglaterra++;
				partidosargentina++;
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesencontrainglaterra=(golesencontrainglaterra+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesinglaterra);
				if(golesinglaterra>golesargentina){
						puntajeinglaterra+=3;
						ganadosinglaterra++;
						perdidosargentina++;
					}else if(golesargentina>golesinglaterra) {
						puntajeargentina+=3;
						ganadosargentina++;
						perdidosinglaterra++;
					}else if(golesargentina==golesinglaterra) {
						puntajeinglaterra++;
						puntajeargentina++;
						empatadosinglaterra++;
						empatadosargentina++;
				}
                
				
				golesportugal=(int)(Math.random()*7);
				golesbrasil=(int)(Math.random()*7);
				partidosportugal++;
				partidosbrasil++;
				golesafavorbrasil=(golesafavorbrasil+golesbrasil);
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesencontraportugal=(golesencontraportugal+golesbrasil);
				golesencontrabrasil=(golesencontrabrasil+golesportugal);
				if(golesportugal>golesbrasil){
						puntajeportugal+=3;
						ganadosportugal++;
						perdidosbrasil++;
					}else if(golesbrasil>golesportugal) {
						puntajebrasil+=3;
						ganadosbrasil++;
						perdidosportugal++;
					}else if(golesbrasil==golesportugal) {
						puntajeportugal++;
						puntajebrasil++;
						empatadosportugal++;
						empatadosbrasil++;
				}
				
				System.out.println("RESULTADO JORNADA 4");
				System.out.println("Francia    "+golesfrancia+" VS "+golesalemania+" Alemania");
				System.out.println("Inglaterra "+golesinglaterra+" VS "+golesargentina+" Argentina");
				System.out.println("Portugal   "+golesportugal+" VS "+golesbrasil+" Brasil");
				System.out.println("-----------------------------------");
			}else if(jornada==5) {
				
				 
				golesfrancia=(int)(Math.random()*7);
				golesargentina=(int)(Math.random()*7);
				partidosfrancia++;
				partidosargentina++;
				golesafavorfrancia=(golesafavorfrancia+golesfrancia);
				golesafavorargentina=(golesafavorargentina+golesargentina);
				golesencontrafrancia=(golesencontrafrancia+golesargentina);
				golesencontraargentina=(golesencontraargentina+golesfrancia);
				if(golesfrancia>golesargentina){
					puntajefrancia+=3;
					ganadosfrancia++;
					perdidosargentina++;
				}else if(golesargentina>golesfrancia) {
					puntajeargentina+=3;
					ganadosargentina++;
					perdidosfrancia++;
				}else if(golesargentina==golesfrancia) {
					puntajefrancia++;
					puntajeargentina++;
					empatadosfrancia++;
					empatadosargentina++;
				}
                
				
				golesinglaterra=(int)(Math.random()*7);
				golesbrasil=(int)(Math.random()*7);
				partidosinglaterra++;
				partidosbrasil++;
				golesafavoringlaterra=(golesafavoringlaterra+golesinglaterra);
				golesafavorbrasil=(golesafavorbrasil+golesbrasil);
				golesencontrainglaterra=(golesencontrainglaterra+golesbrasil);
				golesencontrabrasil=(golesencontrabrasil+golesinglaterra);
				if(golesinglaterra>golesbrasil){
						puntajeinglaterra+=3;
						ganadosinglaterra++;
						perdidosbrasil++;
					}else if(golesbrasil>golesinglaterra) {
						puntajebrasil+=3;
						ganadosbrasil++;
						perdidosinglaterra++;
					}else if(golesbrasil==golesinglaterra) {
						puntajeinglaterra++;
						puntajebrasil++;
						empatadosinglaterra++;
						empatadosbrasil++;
				}

				 
				golesportugal=(int)(Math.random()*7);
				golesalemania=(int)(Math.random()*7);
				partidosportugal++;
				partidosalemania++;
				golesafavoralemania=(golesafavoralemania+golesalemania);
				golesafavorportugal=(golesafavorportugal+golesportugal);
				golesencontraportugal=(golesencontraportugal+golesalemania);
				golesencontraalemania=(golesencontraalemania+golesportugal);
				if(golesportugal>golesalemania){
						puntajeportugal+=3;
						ganadosportugal++;
						perdidosalemania++;
					}else if(golesalemania>golesportugal) {
						puntajealemania+=3;
						ganadosalemania++;
						perdidosportugal++;
					}else if(golesalemania==golesportugal) {
						puntajeportugal++;
						puntajealemania++;
						empatadosportugal++;
						empatadosalemania++;
				}
				
				System.out.println("RESULTADO JORNADA 5");
				System.out.println("Francia  "+golesfrancia+" VS "+golesargentina+" Argentina");
				System.out.println("Alemania "+golesalemania+" VS "+golesportugal+" Portugal");
				System.out.println("Brasil   "+golesbrasil+" VS "+golesinglaterra+" Inglaterra");
				System.out.println("-----------------------------------");
			}
			jornada++;
		}
		
	}
	
	public static void crearTabla() {
		
		int DGfrancia=(golesafavorfrancia-golesencontrafrancia),DGbrasil=(golesafavorbrasil-golesencontrabrasil),DGalemania=(golesafavoralemania-golesencontraalemania),
				DGargentina=(golesafavorargentina-golesencontraargentina),DGportugal=(golesafavorportugal-golesencontraportugal),DGinglaterra=(golesafavoringlaterra-golesencontrainglaterra);
		
System.out.print("  TABLA DE POSICIONES CAMPEONATO  "+"\n");
for(int i=0;i<Names.length;i++){
    System.out.print(Names[i]+"  ");
}
		
		int[][] datos = {
	            {partidosfrancia,ganadosfrancia,empatadosfrancia,perdidosfrancia,puntajefrancia,golesafavorfrancia,golesencontrafrancia,DGfrancia},
	            {partidosbrasil,ganadosbrasil,empatadosbrasil,perdidosbrasil,puntajebrasil,golesafavorbrasil,golesencontrabrasil,DGbrasil},
	            {partidosalemania,ganadosalemania,empatadosalemania,perdidosalemania,puntajealemania,golesafavoralemania,golesencontraalemania,DGalemania},
	            {partidosargentina,ganadosargentina,empatadosargentina,perdidosargentina,puntajeargentina,golesafavorargentina,golesencontraargentina,DGargentina},
	            {partidosportugal,ganadosportugal,empatadosportugal,perdidosportugal,puntajeportugal,golesafavorportugal,golesencontraportugal,DGportugal},
	            {partidosinglaterra,ganadosinglaterra,empatadosinglaterra,perdidosinglaterra,puntajeinglaterra,golesafavoringlaterra,golesencontrainglaterra,DGinglaterra}
	            };
		
		/*
		for (int i=0; i<5;i++) {
			for (int j=0; j<5;j++) {
			if(datos[j][5]>datos[j+1][5]) {
					int[] filatemp= datos [j];
	                datos[j]=datos[j+1];
	                datos[j+1]=filatemp;
	                for(int h=0;h<=6;h++) {
                String Equipostemp = Equipos[j];
                Equipos[j]=Equipos[j+1];
                Equipos[j+1]=Equipostemp;
                
                System.out.print(datos);
	                }
	                
			}
				}
			}
		*/
		for(int i=0;i<Equipos.length;i++){
            System.out.print("\n"+Equipos[i]);
            for(int j=0; j<datos[i].length;j++) {
        		System.out.print(" "+datos[i][j]+"  ");
        	}
        } 

		}
	}

	






