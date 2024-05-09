package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class mediaNotas {
	static float[]notasValidas;
	static float[]notasNoValidas;
	@BeforeAll
	public static void inicializarDatos() {
		notasValidas= new float[]{1,2,3,4,5,6,7,8,9,10};
		notasNoValidas= new float[]{-1,11,-2,-9,20};
	}

		@Test
		public void testMediaNota() {	        
		        assertEquals(1, MisArrays.mediaNotas(notasValidas), "La nota media");
		    }
		
		@Test
		public void testMediaNovalidosNota() {
		        assertEquals(10, MisArrays.mediaNotas(notasNoValidas), "Error de notas");
		    }
		@Test
		public void testMediaNovalidosNotaError() {
			assertThrows(IllegalArgumentException.class, () -> MisArrays.mediaNotas(notasNoValidas));
	              
		    }

}
