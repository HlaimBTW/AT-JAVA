package ex4;
import java.util.Scanner;
public class Calculatrice {
	public static void main(String[] args) {
		int choix,a,b;
		boolean stop = true;
	    Scanner input = new Scanner(System.in);
	    while (stop) {
	    	System.out.println("Donner A : ");
	    	a= input.nextInt();
	    	System.out.println("Donner B : ");
	    	b=input.nextInt();
	    	System.out.println("1 - Addition de deux réels");
	    	System.out.println("2 - Soustraction de deux réels ");
	    	System.out.println("3 - Multiplication de deux réels ");
	    	System.out.println("4 - Division de deux réels ");
	    	System.out.println("5 - Quitter");
	    	System.out.println("Donner votre choix : ");
	    	choix = input.nextInt();
	    	
	    	switch(choix) {
	    	case 1:
	    		System.out.println(a+" + " +b+" = "+Addition(a,b));
	    		break;
	    	case 2:
	    		System.out.println(a+" - " +b+" = "+Soustraction(a,b));
	    		break;
	    	case 3:
	    		System.out.println(a+" * " +b+" = "+Multiplication(a,b));
	    		break;
	    	case 4:
	    		System.out.println(a+" / " +b+" = "+Division(a,b));
	    		break;
	    	case 5:
	    		stop = false;
	    		break;
	    	}
	    
	    }
	    input.close();
	}
	public static int Addition(int a,int b) {
		return a+b;
	}
	public static int Multiplication(int a,int b) {
		return a*b;
	}
	public static int Soustraction(int a,int b) {
		return a-b;
	}
	public static float Division(int a,int b) {
		if(b!=0) {
			return a/b;
		}else {
			return 0 ;
		}
	}
}
