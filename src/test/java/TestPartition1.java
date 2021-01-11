import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ucam.pojos.MatrizVivosMuertos;

public class TestPartition1 {

		//Variables para los tests
		//Matriz vivos o muertos
		MatrizVivosMuertos objetoMatrizVivosMuertos = new MatrizVivosMuertos(6, 6);
		int matriz[][] = objetoMatrizVivosMuertos.rellenarMatrizVivosMuertos(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY());

		@Test
		public void testAsertoEquals() {
			assertEquals(113, objetoMatrizVivosMuertos.imprimirMatrizVivosMuertos2(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY(), matriz).toString().length());
		}
		
		@Test
		public void testAsertoEquals2() {
			assertEquals(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY());
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
		public void testAsertoArrayIgual() {
			assertArrayEquals(new int[] { 1, objetoMatrizVivosMuertos.imprimirMatrizVivosMuertos2(objetoMatrizVivosMuertos.getPosX(), objetoMatrizVivosMuertos.getPosY(), matriz).toString().length() }, new int[] { 1, 113 });
		}

		@BeforeClass
		public static void startMachine() {
			System.out.println("�����������������");
			System.out.println("���������Iniciando Test 1������������\n�����������");
		}
}
