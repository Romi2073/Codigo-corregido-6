package com.CodigoOtros;

import java.util.Scanner;

//El código genera un arreglo de 20 números aleatorios entre 20 y 400, y luego permite al usuario elegir si desea resaltar los múltiplos de 5 o de 7 en ese arreglo. 

public class Codigo6 {

	public static void main(String[] args) { // Agregamos el metodo Main

		int[] n = new int[20]; // Añadimos new

		// Revisamos y corregimos el bucle for, la correción fue: i+ por: i++.
		for (int i = 0; i < 20; i++) {
			n[i] = (int) (Math.random() * 381) + 20;
			System.out.print(n[i] + " ");
		}

		// Corrección de 'System.out.printl' a 'System.out.println
		System.out.println("\n¿Qué números quiere resaltar? ");
		System.out.println("(1. los múltiplos de 5, 2.los múltiplos de 7): ");

		// cambiamos la expresión: int opcion =
		// Integer.parseInt(System.console().readLine()) y usamos Scanner para leer la
		// entrada del usuario
		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();

		// Cambiamos ':' a '?' para el caso verdadero y '?' a ':' para el caso falso.
		int multiplo = (opcion == 1) ? 5 : 7;

		// Usamos for en lugar de forEach para iterar sobre el array 'n' y cambiamos
		// char por int
		for (int e : n) {
			if (e % multiplo == 0) {
				System.out.print("[" + e + "] ");
			} else {
				System.out.print(e + " ");
			}

		}

		scanner.close();

	}

}
