import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ucam.pojos.MatrizEdad;
import edu.ucam.pojos.MatrizVivosMuertos;

public class TestJUnit {

	//Variables para los tests
	//Matriz vivos o muertos
	MatrizVivosMuertos objetoMatrizVivosMuertos = new MatrizVivosMuertos(6, 6);
	int matriz[][] = objetoMatrizVivosMuertos.rellenarMatrizVivosMuertos(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY());
	
	//Matriz edad
	MatrizEdad objetoMatrizEdad = new MatrizEdad(6, 6);
	int matrizEdad[][] = objetoMatrizEdad.rellenarMatrizEdad(objetoMatrizEdad.getPosX(), objetoMatrizEdad.getPosY());

	@Test
	public void testAsertoEquals() {
		assertEquals(113, objetoMatrizVivosMuertos.imprimirMatrizVivosMuertos2(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY(), matriz).toString().length());
	}
	
	@Test
	public void testAsertoEquals2() {
		assertEquals(objetoMatrizEdad.getPosX(), objetoMatrizEdad.getPosY());
	}
	
	@Test
	public void testAsertoEquals3() {
		assertEquals(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY());
	}

	@Test
	public void testAsertoTrue() {
		assertTrue(matriz == matrizEdad);
	}

	@Test
	public void testAsertoFalse() {
		assertFalse(matriz == matrizEdad);
	}

	@Test
	public void testAsertoNotNull() {
		assertNotNull(matriz);
	}

	@Test
	public void testAsertoNull() {
		assertNull(matriz);
	}
	
	@Test
	public void testAsertoNotNull2() {
		assertNotNull(matrizEdad);
	}

	@Test
	public void testAsertoNull2() {
		assertNull(matrizEdad);
	}

	@Test
	public void testAsertoIgual() {
		assertSame(matriz, matrizEdad);
	}

	@Test
	public void testAsertoNoIgual() {
		assertNotSame(matriz, matrizEdad);
	}

	@Test
	public void testAsertoArrayIgual() {
		assertArrayEquals(new int[] { 1, objetoMatrizVivosMuertos.imprimirMatrizVivosMuertos2(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY(), matriz).toString().length() }, new int[] { 1, 113 });
	}

	@BeforeClass
	public static void startMachine() {
		System.out.println("�����������������");
		System.out.println("���������Iniciando Test������������\n�����������");
	}

}
