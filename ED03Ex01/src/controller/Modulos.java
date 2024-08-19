package controller;


public class Modulos 
{
	public Modulos() 
	{
		super();
	
	}
	
	public int retornaDigitos (int x,int qtd)
	{
	
		if(x<10)  //se o número for menor que 10 retorne a quantidade de dígitos do número ( obs já comecei com 1).
		{
			return qtd;
		}
		else
		{
			return retornaDigitos (x/10,qtd+1);
					
		}
		
	}

}
