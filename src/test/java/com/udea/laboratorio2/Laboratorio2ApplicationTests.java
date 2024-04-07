package com.udea.laboratorio2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Laboratorio2ApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health() {
		assertEquals("APLICACIÓN FUNCIONANDO, ¡OK!", dataController.healthCheck());
	}

	@Test
	void version() {
		assertEquals("La versión actual es 1.0.0", dataController.version());
	}

	@Test
	void nationsLength() {
		Integer nationsLength = dataController.getRandomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void currenciesLength() {
		Integer currenciesLength = dataController.getRandomCurrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	void airplanesLength() {
		Integer airplanesLength = dataController.getRandomAirplanes().size();
		assertEquals(20, airplanesLength);
	}
}
