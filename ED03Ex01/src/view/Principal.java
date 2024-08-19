package view;

import java.util.Scanner;

import controller.Modulos;

public class Principal 
{

	public static void main(String[] args) 
	{
		Modulos op = new Modulos();
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int res=op.retornaDigitos(n, 1);
		System.out.println("O número possui : " +res +" Digitos");

	}

}
