package edu.ucam.pojos;

public class MatrizVivosMuertos extends Matriz{

	public MatrizVivosMuertos(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}
	
	public int[][] rellenarMatrizVivosMuertos (int posX, int posY) {
		int [][] matriz = new int [posX][posX];
		for(int i=0; i<posX; i++) {
			for(int j=0; j<posX; j++) {
				int aux= (int) Math.floor(Math.random() * 4);
				if(aux==0) {
					matriz [i][j]=1;
				}	
			}
		}
		return matriz;
	}
}
