package Quiz1;
import javax.swing.JOptionPane;
public class Quiz29SEP {
	public static void main(String[] args) {
		int contador=0;
		int valoringre;
		int[] aleatorio=new int[20];
		for (int num=0;num<aleatorio.length;num++) {
			aleatorio[num]=(int)Math.floor(Math.random()*40+1);
			System.out.print(aleatorio[num]+" ");
		}
		do {
			valoringre = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero para buscarlo en el arreglo anterior"));
			for(int i=0;i<aleatorio.length;i++) {
				if (valoringre == aleatorio[i]) {
					JOptionPane.showMessageDialog(null, "Su numero esta dentro del arreglo");
					contador++;
				}	
			}
			}while(contador<1);
}
}
