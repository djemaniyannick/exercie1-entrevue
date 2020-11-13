package higherNumber;

import java.util.Scanner;

public class HigherNumber {

	public static void main(String[] args) {
		
		
//demander a l'utilisation d'enter un nombre 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("entrer a number :");
		int number=sc.nextInt();
		
/*		converrtir le nombre en String puis en StringBuilder puis dans une boucle for comparer le dernier a l'avant dernier
		si il est plus eleve permuter a la fin retransformer le nobre en int*/
		
		
		String numberToString=Integer.toString(number);
		StringBuilder sb=new StringBuilder(numberToString);
		int nextHigherNumber;
		int len=numberToString.length();
		char temp;
		
		for(int i=0 ; i<len-1;i++) {
			if(sb.charAt(len-1-i)> sb.charAt(len-2-i)) {
				temp=sb.charAt(len-1-i);
				  sb.setCharAt(len-1-i,sb.charAt(len-2-i));
			      sb.setCharAt(len-2-i,temp);
			      break;
			}
			
		}
		nextHigherNumber=Integer.parseInt(sb.toString());
		System.out.println(" le nombre superieur  a "+number+" en utilisant le meme nombre est : "+nextHigherNumber);


	}
	
	

}
