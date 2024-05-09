package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class MaximaNota {
	static int[]notasValidas;
	static int[]notasNoValidas;
	@BeforeAll
	public static void inicializarDatos() {
		notasValidas= new int[]{1,2,3,4,5,6,7,8,9,10};
		notasNoValidas= new int[]{-1,11,-2,-9,20};
	}

	@Test
	public void testMaximaNota() {
	        assertEquals(10, MisArrays.MaximaNota(notasValidas), "La nota máxima debería ser 10");
	    }
	
	@Test
	public void testMaximaNovalidosNotaError() {
		assertThrows(IllegalArgumentException.class, () -> MisArrays.MaximaNota(notasNoValidas));
              
	    }
}
