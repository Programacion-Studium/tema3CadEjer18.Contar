package es.studium.tema3CadEjer18;

import java.util.Scanner;

public class Contar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto;
		int contadorLetras=0;
		int contadorNumeros=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("indique la cadena a contar");
		texto=teclado.nextLine();
		teclado.close();
		texto=texto.replace(" ","");
		for (int i=0;i<texto.length();i++)
		{
			if((int)texto.charAt(i)>= 48 && texto.charAt(i)<=57)
					{
				contadorNumeros++;
					}
			else if (((int)texto.charAt(i)>= 65 && texto.charAt(i)<=90)||((int)texto.charAt(i)>= 97 && texto.charAt(i)<=122))
			{
				contadorLetras++;
			}
		}
		System.out.println("Los numeros son: "+contadorNumeros);
		System.out.println("Las letras son: "+contadorLetras);
	}

}
