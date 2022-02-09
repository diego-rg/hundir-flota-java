/**
 * Juego de hundir la flota
 */
package hundirlaflota;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Diego
 * 
 */
public class HundirLaFlota {
	//Constantes para indicar tipo de casilla
	final static char AGUA_NO_TOCADO = '.';
	final static char AGUA = 'A';
	final static char TOCADO = 'X';

	//TAMAÑO DEL TABLERO
	final static int TAMANO = 10;

	private static Scanner sc;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Permiten input del teclado
		sc = new Scanner(System.in);

		//Creación de mapas
		char[][] mapaUsuario = new char[TAMANO][TAMANO];
		char[][] mapaOrdenador = new char[TAMANO][TAMANO];

		//Mapa para ver las tiradas del pc
		char[][] mapaOrdenadorParaUsuario = new char[TAMANO][TAMANO];

		// Puntuación inicial, fin de partida en el primero a 0		
		int puntosUsuario = 24;
		int puntosOrdenador = 24;

		//Controla fin de partida cuando el primero llega a 0
		boolean juegoTerminado = false;

		//Si la tirada es correcta inicia otra
		boolean tiroCorrecto = false;

		//Posiciones de la tirada
		int[] tiro = new int[2];

		//Inicializamos los mapas generando los barcos
		inicializacion(mapaUsuario, mapaOrdenador);
		
		//Inicializamos el mapa de tiradas al pc
		inicializaMapaRegistro(mapaOrdenadorParaUsuario);

	}

}
