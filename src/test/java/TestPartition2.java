import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ucam.pojos.MatrizEdad;

public class TestPartition2 {

		//Variables para los tests
		//Matriz edad
		MatrizEdad objetoMatrizEdad = new MatrizEdad(6, 6);
		int matrizEdad[][] = objetoMatrizEdad.rellenarMatrizEdad(objetoMatrizEdad.getPosX(), objetoMatrizEdad.getPosY());
		
		@Test
		public void testAsertoEquals() {
			assertEquals(objetoMatrizEdad.getPosX(), objetoMatrizEdad.getPosY());
		}
		
		@Test
		public void testAsertoNotNull() {
			assertNotNull(matrizEdad);
		}

		@Test
		public void testAsertoNull() {
			assertNull(matrizEdad);
		}

		@BeforeClass
		public static void startMachine() {
			System.out.println("�����������������");
			System.out.println("���������Iniciando Test 2������������\n�����������");
		}

}
