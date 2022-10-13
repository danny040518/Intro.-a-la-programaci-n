package Taller2;

import javax.swing.JOptionPane;

public class DiferentesVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, s1, d1, p1;
		double n, m, s2, s3, d2, p2, c1, r1, c2, c3, r2, r3, st, pt, dx, dy, dn, dm;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("digite numero1 entero"));
		y = Integer.parseInt(JOptionPane.showInputDialog("digite numero2 entero"));
		n = Double.parseDouble(JOptionPane.showInputDialog("digite numero1 decimal"));
		m = Double.parseDouble(JOptionPane.showInputDialog("digite numero2 decimal"));
		
		s1=x+y; 
		s2=n+m; 
		s3=x+n; 
		st=s1+s2;
		d1=x-y; 
		d2=n-m;
		p1=x*y; 
		p2=n*m; 
		pt=p1*p2;
		c1=x/y; 
		c2=n/m; 
		c3=y/m;
		r1=x%y; 
		r2=n%m; 
		r3=y%m;
		dx=x*2; 
		dy=y*2; 
		dn=n*2; 
		dm=m*2;
		
	    System.out.print("Las sumas:\n"+x+"+"+y+"="+s1+"\n"+n+"+"+m+"="+s2+"\n"+x+"+"+n+"="+s3+"\n"
	        +x+"+"+y+"+"+n+"+"+m+"="+st+"\nLas restas: \n"+x+"-"+y+"="+d1+"\n"+n+"-"+m+"="+d2+
	        "\nLos productos: \n"+x+"*"+y+"="+p1+"\n"+n+"*"+m+"="+p2+"\nLos cocientes: \n"
	        +x+"/"+y+"="+c1+"\n"+n+"/"+m+"="+c2+"\n"+y+"/"+m+"="+c3+"\nLos residuos: \n"
	        +x+"%"+y+"="+r1+"\n"+n+"%"+m+"="+r2+"\n"+y+"%"+m+"="+r3+"\n el doble de "+x+" es "+dx+
	        "\n el doble de "+y+" es "+dy+"\n el doble de "+n+" es "+dn+"\n el doble de "+m+" es "+dm+
	        "\nEl producto de todos es: "+x+"*"+y+"*"+n+"*"+m+"="+pt);
		
	}

}
