package edu.ucam.pojos;

public class MatrizVivosMuertos extends Matriz{

	public MatrizVivosMuertos(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
	}

	public int[][] rellenarMatrizVivosMuertos (int posX, int posY) {
		int [][] matriz = new int [posX][posY];
		for(int i=0; i<posX; i++) {
			for(int j=0; j<posY; j++) {
				int aux= (int) Math.floor(Math.random() * 4);
				if(aux==0) {
					matriz [i][j]=1;
				}
			}
		}
		return matriz;
	}

	public void imprimirMatrizVivosMuertos (int posX, int posY, int matriz[][]) {
		for(int i=0; i<posX; i++) {
			for(int j=0; j<posY; j++) {
				System.out.print(" "+matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}

	public String imprimirMatrizVivosMuertos2 (int posX, int posY, int matriz[][]) {
		String matrizCadena = "";
		for(int i=0; i<posX; i++) {
			for(int j=0; j<posY; j++) {
				matrizCadena += " "+matriz[i][j]+" ";
			}
			if (i != posX-1){
				matrizCadena += "\n";
			}
		}
		return matrizCadena;
	}
}
