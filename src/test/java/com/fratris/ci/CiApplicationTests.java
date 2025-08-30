package com.fratris.ci;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiApplicationTests {

	@Test
	@DisplayName("Contexto da aplicação deve iniciar sem erros")
	void contextLoads() {
		assertDoesNotThrow(() -> CiApplication.main(new String[]{}));
	}

	@Nested
	@DisplayName("sum method tests")

	@ParameterizedTest
	@CsvSource({
			"1.0, 1.0, 2.0",
			"-5.5, 5.5, 0.0",
			"10.0, 0.0, 10.0",
			"0.0, 0.0, 0.0"
	})
	void sum_validNumbers_returnsCorrectResult(Double a, Double b, Double expected) {
		assertEquals(expected, CiApplication.sum(a, b));
	}

}
