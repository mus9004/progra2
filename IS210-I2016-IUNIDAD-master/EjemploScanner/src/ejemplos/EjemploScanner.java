package ejemplos;

import java.util.Scanner;

public class EjemploScanner {
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		String nombre = null;
		String apellido = null;
		int a;
		int b;
		int suma;
		System.out.print("Ingrese un numero: ");
		a = entrada.nextInt();
		System.out.print("Ingrese otro numero: ");
		b = entrada.nextInt();
		suma = a + b;
		
		
		System.out.print("Hola " + nombre +" "+ apellido + ", la suma de los numeros que ingreso es: " + suma);		
		
		entrada.close();		
	}
}