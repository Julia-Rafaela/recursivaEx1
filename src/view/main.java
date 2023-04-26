package view;

import java.util.Scanner;

import controller.ex1;

public class main {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
        ex1 controllerNaturais = new ex1();
	    int n;
	    System.out.println("digite um número: ");
	    n=leia.nextInt();
	    int resultado = ex1.somatorioNaturais(n);
	    System.out.println("O somatório dos " + n + " primeiros números naturais é " + resultado);
	  }
 
}
