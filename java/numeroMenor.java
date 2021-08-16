package primeiros_passos.java;

import java.util.ArrayList;

import java.util.Scanner;


public class numeroMenor {
	
	public static void main(String[]args ) {
		
		int menor = 0, posMenor = 0;
		int qtdnum;
		int arrayVal [];
	
	    Scanner ler = new Scanner(System.in);
	    
	    System.out.println("Informe quantos numeros ira digitar:");
	    qtdnum = ler.nextInt();
	    	    
	    arrayVal = new int [qtdnum];
	   
	    
	
	    for (int i = 0; i < qtdnum ; i++) {
	    System.out.println("Informe o"+ (i+1) +"° numero:");
	    arrayVal[i]=ler.nextInt();
	    
	    menor = arrayVal[i]; 
	    posMenor = arrayVal[i];
		  
	  }
	    
	    for (int i = 0; i < qtdnum ; i++) {
	    	
	    	if(arrayVal[i]<menor) {
	    		menor = arrayVal[i];
	    	}
	    	if(arrayVal[i]==menor) {
	    		posMenor = arrayVal[i]-1;
	    		
	    	}
	    	
	    }
	    System.out.println("O pos menor é"+posMenor);
	    	
	}
	
	

	}


