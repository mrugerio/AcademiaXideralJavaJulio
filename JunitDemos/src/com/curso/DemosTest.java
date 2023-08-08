package com.curso;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.TestInfo;

class DemosTest {
	
//	@BeforeEach
//	void antesEach(TestInfo prueba) {
//		System.out.println("Inicializando datos: " + prueba.getDisplayName());
//	}
//	
//	@AfterEach
//	void despuesEach(TestInfo info) {
//		System.out.println("Cerrando los datos " + info.getDisplayName());
//	}
	
	@BeforeAll
	static void antesEach(TestInfo prueba) {
		System.out.println("Inicializando datos: " + prueba.getDisplayName());
	}
	
	@AfterAll
	static void despuesEach(TestInfo info) {
		System.out.println("Cerrando los datos " + info.getDisplayName());
	}
	

	@Test
	@DisplayName("Length Basic")
	void length_basic() {
		int actualLength = "ABCDC".length();
		int expectedLength = 5;
		assertEquals(actualLength, expectedLength);
	}
	
	@Test
	void length_greater_than_zero() {
		assertTrue("ABCD".length() > 0);
		assertTrue("ABC".length() > 0);
		assertTrue("AB".length() > 1);
		assertTrue("DEF".length() > 0);
	}
	
	@ParameterizedTest
	@DisplayName("Varios")
	@ValueSource(strings = { "ABCD", "ABC", "AZX", "DEF" })
	void length_greater_than_zero(String str) {
		assertTrue(str.length() > 2);
	}
	
	@ParameterizedTest(name = "{0} a Mayúsculas es {1}")
	@CsvSource(value = {    "abcd, ABCD", 
							"abc, ABC", 
							"'',''", 
							"abcdef, ABCDEF" })
	void uppercase(String word, String capitalizedWord) {
		assertEquals(word.toUpperCase(), capitalizedWord );
	}
	
	@ParameterizedTest(name = "{0} tamaño es {1}")
	@CsvSource(value = { "abcd, 4", "abc, 3", "'',0", "abcdefg, 7" })
	void length(String word, int expectedLength) {
		assertEquals(expectedLength, word.length());
	}
	
	@Test
	@DisplayName("When length is null, throw an exception")
	void length_exception() {
		String str = null;
		assertThrows(NullPointerException.class, () -> str.length());
	}
	
	@Test
	@Disabled
	void performanceTest() {
		assertTimeout(Duration.ofSeconds(3), () -> {
			for (int i = 0; i <= 100_000; i++) {
				int j = i;
				System.out.println(j);
			}
		});
	}
	
	@Test
	void testNull() {
		String str = "abcd";
		String result = null;
		assertNotNull(str);
		assertNull(result);
	}
	
	@Test
	@RepeatedTest(5)
	void contains_basic() {
		assertFalse("abcdefgh".contains("ijk"));
	}

	@Test
	void split_basic() {
		String str = "abc def ghi";
		String[] actualResult = str.split(" ");
		String[] expectedResult = new String[] { "abc", "def", "ghi" };
		assertArrayEquals(expectedResult, actualResult);
	}
	
	
}
