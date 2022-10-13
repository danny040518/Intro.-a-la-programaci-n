package TallerIF;

import javax.swing.JOptionPane;

public class Casino {

	public static void main(String[] args) {
	
		int n1 = (int)(Math.random()*6+ 1);
		int n2 = (int)(Math.random()*6+ 1);
		int n3 = (int)(Math.random()*6+ 1);
		
		if (n1==6 && n2==6 && n3==6) {
			JOptionPane.showMessageDialog(null, n1+", "+n2+" y "+n3+" EXCELENTE");
			}
		  else if(n1==6 && n2==6){
			  JOptionPane.showMessageDialog(null, n1+", "+n2+" y "+n3+" MUY BIEN");
			  }
		  else if(n1==6 && n3==6){
			  JOptionPane.showMessageDialog(null, n1+", "+n2+" y "+n3+" MUY BIEN");
			  }
		  else if(n2==6 && n3==6){
			  JOptionPane.showMessageDialog(null, n1+", "+n2+" y "+n3+" MUY BIEN");
			  }
		  else if(n1==6){
			  JOptionPane.showMessageDialog(null, n1+", "+n2+" y "+n3+" REGULAR");
			  }
		  else if(n2==6){
			  JOptionPane.showMessageDialog(null, n1+", "+n2+" y "+n3+" REGULAR");
			  }
		  else if(n3==6){
			  JOptionPane.showMessageDialog(null, n1+", "+n2+" y "+n3+" REGULAR");
			  }
		  else {
			  JOptionPane.showMessageDialog(null, n1+", "+n2+" y "+n3+" PESIMO");
			  }

	}

}
