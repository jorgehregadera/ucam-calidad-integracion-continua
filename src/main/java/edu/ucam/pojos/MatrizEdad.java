package edu.ucam.pojos;

public class MatrizEdad extends Matriz{

	public MatrizEdad(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}

	public int[][] rellenarMatrizEdad (int posX, int posY) {
		int [][] matrizEdad = new int [posX][posY];
		for(int i=0; i<posX; i++) {
			for(int j=0; j<posX; j++) {
					matrizEdad[i][j]=0;
			}
		}
		return matrizEdad;
	}
}
