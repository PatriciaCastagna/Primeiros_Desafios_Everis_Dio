package primeiros_passos.java;

import java.util.Scanner;

public class numeroDiv {

	public static void main(String[] args) {
		
		
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero:");
	    int N = leitor.nextInt();
	    
	    for (int k = 1; k <= N ; k++) {
	    	if(N%k==0){
	    		System.out.println(k);;
	    	}
	    	
	    }
		

	}

}
