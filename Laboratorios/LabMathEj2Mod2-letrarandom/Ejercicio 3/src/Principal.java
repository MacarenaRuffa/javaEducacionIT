import java.util.Scanner;
//Ingresar por consola una palabra y generar un numero aleatorio entre 97 y 122. Mostrar que letra representa y ver si esta en la palabra ingresada.
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra;
		char letra;
		int ascii;
		System.out.print("Indique una palabra: ");
		palabra = teclado.next();

		ascii = (int) ((Math.random() * 25) + 97);

		letra = (char) ascii;
		
		
		System.out.println("El numero aleatorio es " + ascii + " y representa la letra " + letra);
		System.out.println(
				"La letra " + letra + " se encuentra en " + palabra + "? " + palabra.contains(String.valueOf(letra)));

		teclado.close();

	}

}
