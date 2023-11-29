package Interfaz;

import java.awt.event.KeyEvent;
import java.util.Random;


//	TRABAJO PRACTICO 1 - 2048 - LUCRECIA VERON - COM 01
public class Juego {
	static int tablero [][];
	static boolean tableroLleno;
	static boolean gano;
	static boolean perdio;
	static int puntos;
	
		
		//Constructor-----------------------------------------------------------------------------
		public Juego() {
			tableroLleno = false;
			gano = false;
			perdio = false;
			tablero = new int [4][4];
			puntos=0;
			crearTablero();
			ponerNumerosEnElTablero();
			ponerNumerosEnElTablero();
		}
		
		//Inicializar el tablero--------------------------------------------------------------------
		public static void crearTablero() {
			for (int fila=0; fila<4; fila++) {
				for (int columna=0; columna<4; columna++) {
					tablero[fila][columna]=0;
				}	
			}
		}
		
		//Generar Numeros----------------------------------------------------------------------------
		public static void ponerNumerosEnElTablero() {
				Random random = new Random();
				Random randomNum = new Random();
				Random random2 = new Random();
				boolean listo=false;
				while(!listo) {
					int eleccionDeNumero= randomNum.nextInt(8); //para elegir si se va a generar un 4 o un 2				
					int fila = random.nextInt(4);
					int columna =  random2.nextInt(4);
					if (!posicionOcupada(fila, columna)) {
						if(eleccionDeNumero>4) {
							tablero[fila][columna]=4;
							listo=true;
						}
						else {
							tablero[fila][columna]=2;
							listo=true;
						}
					}
				}
			}
		
		//--------------------------------------movimiento-----------------------------------------------------------
		public static void mover(KeyEvent l) 
		{ 
				if(l.getKeyCode() == KeyEvent.VK_UP) {
					if(!Gano() && !Perdio()) {
						sumarHaciaArriba();
						moverHaciaArriba();
						Gano();
						if(!tableroLleno() && !Gano()) {
							ponerNumerosEnElTablero();
						}
					}			
				}
				if(l.getKeyCode() == KeyEvent.VK_DOWN) {
					if(!Gano() && !Perdio()) {
						sumarHaciaAbajo();
						moverHaciaAbajo();
						Gano();
						if(!tableroLleno() && !Gano()) {
							ponerNumerosEnElTablero();
						}
						
					}
				}
					
					if(l.getKeyCode() == KeyEvent.VK_LEFT) {
						if(!Gano() && !Perdio()) {
							sumarHaciaIzquierda();
							moverHaciaIzquierda();
							Gano();
							if(!tableroLleno() && !Gano()) {
								ponerNumerosEnElTablero();
							}
						}
					}
					
					if(l.getKeyCode() == KeyEvent.VK_RIGHT) {
						if(!Gano() && !Perdio()) {
							sumarHaciaDerecha();
							moverHaciaDerecha();
							Gano();
							if(!tableroLleno() && !Gano()) {
								ponerNumerosEnElTablero();
							}
						}
					}	
					if(l.getKeyCode() == KeyEvent.VK_ENTER) {
						resetear();			
					}
					else {
						Perdio();
					}
				}
		//-------------------------------------------------------------------------------------------
		public static boolean posicionOcupada(int fila, int columna) {
			if (tablero[fila][columna]!=0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		//--------------------------------------------------------------------------------------------
		public static boolean tableroLleno() {
			tableroLleno=true;
				for (int fila=0; fila<=3; fila++) {
					for (int columna=0; columna<=3; columna++) {
						if(!posicionOcupada(fila, columna)) {
							tableroLleno=false;
						}
					}	
				}
			return tableroLleno;			
		}
		
		//verifica si ya no se pueden hacer movimientos--------------------------------------------------------------
		public static boolean Perdio() {
			if(tableroLleno()) {
				perdio = true;
				for (int fila=0; fila<4; fila++) {
					for (int columna=0; columna<3; columna++) {
						//si hay almenos un par de numeros que se puedan sumar va a dar falso
							if(tablero[fila][columna]==tablero[fila][columna+1]) {
								perdio = false;
							}
					}		
				}
				for (int columna = 0; columna<4; columna ++) {
					for (int fila=0; fila<3; fila++) {
						if(tablero[fila][columna]==tablero[fila+1][columna]) {
							perdio=false;
						}
					}				
				}
				return perdio;
			}		
			else {
				return perdio;
			}
		}
		
		//Gano----------------------------------------------------------------------------------------------
		private static boolean Gano()
		{
			for(int fila=0; fila<4; fila++)
			{
				for(int columna=0; columna<4; columna++)
				{
					if(tablero[fila][columna]==2048) {
						gano=true;
					}
				}
			}
			return gano;
		}

	//Resetear juego---------------------------------------------------------------------------------------------
		public static void resetear() {
			tableroLleno = false;
			gano = false;
			perdio = false;
			tablero = new int [4][4];
			puntos=0;
			crearTablero();
			ponerNumerosEnElTablero();
			ponerNumerosEnElTablero();
	}
		
		//------------------------------------MOVIMIENTO-----------------------------------------------------------
		public static void moverHaciaIzquierda() {
			for (int columna=0; columna<4; columna++) {
				for (int fila=0; fila<3; fila++) { 
					if(!posicionOcupada(fila, columna)) {
						boolean encontrado=false;
						int posicion=fila + 1;
						while(!encontrado) {
							if(0<tablero[posicion][columna]) {
								tablero[fila][columna] = tablero[posicion][columna];
								 tablero[posicion][columna]=0;
								encontrado = true;
							}
							if(posicion==3) {
								encontrado= true;
							}
							else {
								posicion++;
							}
						}
					}
				}
			}
			}		

		public static void moverHaciaDerecha() {
			for (int columna=0; columna<4; columna++) {
				for (int fila=3; fila>0; fila--) { 
					if(!posicionOcupada(fila, columna)) {
						boolean encontrado=false;
						int posicion=fila - 1;
						while(!encontrado ) {
							if(0<tablero[posicion][columna]) {
								tablero[fila][columna] =tablero[posicion][columna];
								 tablero[posicion][columna]=0;
								encontrado=true;
							}
							if(posicion==0) {
								encontrado=true;
							}
							else {
								posicion--;
							}					
						}
					}
				}
			}
		}
		
		public static void moverHaciaAbajo() {
			for (int fila=0; fila<4; fila++) {
				for (int columna=3; columna>0; columna--) {
					if(!posicionOcupada(fila, columna)) {
						boolean encontrado=false;
						int posicion=columna - 1;
						while(!encontrado) {
							if(0<tablero[fila][posicion]) {
								tablero[fila][columna] = tablero[fila][posicion];
								tablero[fila][posicion]=0;
								encontrado=true;;
							}
							if(posicion ==0) {
								encontrado=true;;
							}
							else {
								posicion--;
							}
						}
						}
				}
			}
			}
		
		public static void moverHaciaArriba() {
			for (int fila=0; fila<4; fila++) {
				for (int columna=0; columna<3; columna++) {
					if(!posicionOcupada(fila, columna)) {
					boolean encontrado=false;
					int posicion=columna + 1;
					while(!encontrado) {
						if(0<tablero[fila][posicion]) {
							tablero[fila][columna] = tablero[fila][posicion];
							 tablero[fila][posicion]=0;
							encontrado=true;
						}
						if( posicion == 3) {
							encontrado=true;
						}
						else {
							posicion++;
						}	
					}
					}
				}
			}
			}
		
		//-----------------------------------SUMAS--------------------------------------------------------------------

		public static void sumarHaciaDerecha() {
			for (int columna=0; columna<4; columna++) {
				for (int fila=3; fila>0; fila--) { 
					if(posicionOcupada(fila, columna)) {
						boolean encontrado=false;
						int posicion=fila - 1;
						while(!encontrado ) {
							if(tablero[fila][columna]== tablero[posicion][columna]) {
								tablero[fila][columna] = tablero[fila][columna]+ tablero[posicion][columna];
								 tablero[posicion][columna]=0;
								 puntos=puntos + tablero[fila][columna];
								encontrado=true;
							}
							if(0<tablero[posicion][columna] || posicion==0) {
								encontrado=true;
							}
							else {
								posicion--;
							}		
						}
					}
				}
			}
		}
		
		public static void sumarHaciaIzquierda() {
			for (int columna=0; columna<4; columna++) {
				for (int fila=0; fila<3; fila++) { 
					if(posicionOcupada(fila, columna)) {
						boolean encontrado=false;
						int posicion=fila + 1;
						while(!encontrado) {
							if(tablero[fila][columna]== tablero[posicion][columna]) {
								tablero[fila][columna] = tablero[fila][columna]+ tablero[posicion][columna];
								 tablero[posicion][columna]=0;
								 puntos=puntos + tablero[fila][columna];
								encontrado = true;
							}
							if(0<tablero[posicion][columna] || posicion==3) {
								encontrado= true;
							}
							else {
								posicion++;
							}
						}
					}
				}
			}
		}
		
		public static void sumarHaciaAbajo() {
			for (int fila=0; fila<4; fila++) {
				for (int columna=3; columna>0; columna--) {
					if(posicionOcupada(fila, columna)) {
						boolean encontrado=false;
						int posicion=columna - 1;
						while(!encontrado) {
							if(tablero[fila][columna]== tablero[fila][posicion]) {
								tablero[fila][columna] = tablero[fila][columna]+ tablero[fila][posicion];
								tablero[fila][posicion]=0;
								puntos=puntos + tablero[fila][columna];
								encontrado=true;;
							}
							if(0<tablero[fila][posicion] || posicion ==0) {
								encontrado=true;;
							}
							else {
								posicion--;
							}				
						}
						}
				}
			}
		}
		
		public static void sumarHaciaArriba() {
			for (int fila=0; fila<4; fila++) {
				for (int columna=0; columna<3; columna++) {
					if(posicionOcupada(fila, columna)) {
					boolean encontrado=false;
					int posicion=columna + 1;
					while(!encontrado) {
						if(tablero[fila][columna]== tablero[fila][posicion]) {
							tablero[fila][columna] = tablero[fila][columna]+ tablero[fila][posicion];
							 tablero[fila][posicion]=0;
							 puntos=puntos + tablero[fila][columna];
							encontrado=true;
						}
						if(0<tablero[fila][posicion] || posicion == 3) {
							encontrado=true;
						}
						else {
							posicion++;
						}
						
					}
					}
				}
			}
		}
	}