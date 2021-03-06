package edu.ucam.main;

import edu.ucam.pojos.MatrizEdad;
import edu.ucam.pojos.MatrizVivosMuertos;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//Matriz vivos o muertos
		int matriz[][];
		MatrizVivosMuertos objetoMatrizVivosMuertos = new MatrizVivosMuertos(6, 6);
		matriz = objetoMatrizVivosMuertos.rellenarMatrizVivosMuertos(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY());

		//Matriz edad
		int matrizEdad[][];
		MatrizEdad objetoMatrizEdad = new MatrizEdad(6, 6);
		matrizEdad = objetoMatrizEdad.rellenarMatrizEdad(objetoMatrizEdad.getPosX(), objetoMatrizEdad.getPosY());


		//Empezamos la ejecucion
		while (true) {
			System.out.println(" -----MATRIZ------ ");
			//Imprimimos la matriz
			objetoMatrizVivosMuertos.imprimirMatrizVivosMuertos(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY(), matriz);
			//System.out.println(objetoMatrizVivosMuertos.imprimirMatrizVivosMuertos2(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY(), matriz));
			System.out.println(" ------------- ");

			//empezamos a recorrer para la logica del ejercicio
			for(int i=0; i<6; i++) {
				for(int j=0; j<6; j++) {
					try {

						//Le sumamos 1 a la edad
						if(matriz [i][j]==1) {
							matrizEdad [i][j]++;
						}

						int contador=0;
						if(j<5) {
							if(matriz[i][j+1]==1 ) {
								contador++;
							}
						}else {
							if(matriz[i][0]==1 ) {
								contador++;
							}
						}

						if(j>0) {
							if(matriz[i][j-1]==1) {
								contador++;
							}
						}else {
							if(matriz[i][5]==1 ) {
								contador++;
							}
						}

						if(i<5) {
							if(matriz[i+1][j]==1) {
								contador++;
							}
						}else {
							if(matriz[0][j]==1 ) {
								contador++;
							}
						}

						if(i>0) {
							if(matriz[i-1][j]==1) {
								contador++;
							}
						}else {
							if(matriz[5][j]==1 ) {
								contador++;
							}
						}

						if(i>0 && j>0) {
							if(matriz[i-1][j-1]==1 ) {
								contador++;
							}
						}else if(i==0 && j==0) {
							if(matriz[5][5]==1 ) {
								contador++;
							}
						}else if(i==5 && j==0) {
							if(matriz[i-1][5]==1 ) {
								contador++;
							}
						}else if(i==0 && j==5) {
							if(matriz[5][j-1]==1 ) {
								contador++;
							}
						}

						if(j>0 && i<5) {
							if(matriz[i+1][j-1]==1) {
								contador++;
							}
						}else if(i==5 && j==0) {
							if(matriz[0][5]==1 ) {
								contador++;
							}
						}else if(i==0 && j==0) {
							if(matriz[i+1][5]==1 ) {
								contador++;
							}
						}else if(i==0 && j==5) {
							if(matriz[i+1][j-1]==1 ) {
								contador++;
							}
						}else if(i==5 && j==5) {
							if(matriz[0][j-1]==1 ) {
								contador++;
							}
						}


						if(j<5 && i<5) {
							if(matriz[i+1][j+1]==1) {
								contador++;
							}
						}else if(i==5 && j==5) {
							if(matriz[0][0]==1 ) {
								contador++;
							}
						}else if(i==5 && j==0) {//diagonales que se saltaria por ejemplo en [5][0]
							if(matriz[0][j+1]==1 ) {
								contador++;
							}
						}else if(i==0 && j==5) {
							if(matriz[i+1][0]==1 ) {
								contador++;
							}
						}

						if(i>0 && j<5) {
							if(matriz[i-1][j+1]==1) {
								contador++;
							}
						}else if(i==0 && j==5) {
							if(matriz[5][0]==1 ) {
								contador++;
							}
						}else if(i==0 && j==0) {
							if(matriz[5][j+1]==1 ) {
								contador++;
							}
						}else if(i==5 && j==0) {
							if(matriz[i-1][j+1]==1 ) {
								contador++;
							}
						}else if(i==5 && j==5) {
							if(matriz[i-1][0]==1 ) {
								contador++;
							}
						}

						//esto es para calcular la posicion actual
						int posicion=6*i+j+1;
						System.out.println("La posicion "+posicion+" tiene este numero de vecinos:"+contador+" y su edad es "+matrizEdad [i][j]);

						//Para comprobar que si muere por soledad o sobrepoblacion
						if(contador<2 || contador>4) {
							matriz[i][j]=0;
							matrizEdad [i][j]=0;
						}else if(contador==3) { //o nace al tener 3 vecinos
							matriz[i][j]=1;
						}

						//Puede que revivia o muera (10%)
						int aux= (int) Math.floor(Math.random() * 10);
						if(aux==0) {
							if(matriz [i][j]==1) {
								matriz [i][j]=0;
								matrizEdad [i][j]=0;
							}else {
								matriz [i][j]=1;
							}
						}


					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Error en "+(i+1)*(j+1));
					}
				}
			}

			//Esto es para que tarde 2 segundos entre cada ejecucion
			System.out.println(" --------------- ");
			Thread.sleep(2000);
		}
	}
}
