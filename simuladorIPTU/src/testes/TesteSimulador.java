package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import calculo.Simulador;

public class TesteSimulador {
	
	private Simulador simulador;
	
	@Before
	public void setUp(){
		this.simulador = new Simulador();
	}

	
	@Test
	public void testeIPTU1() {
		double res = this.simulador.calcularIPTU("1", 180000, 0);
		double valorEsperado = 1164.55;
		assertEquals(valorEsperado, res, 0); //assertEqual para double coloca um  3º parametro como amrgem de erro
		
	}
	
	@Test
	public void testeIPTU2() {
		double res = this.simulador.calcularIPTU("1", 95450, 0);
		double valorEsperado = 572.70;
		assertEquals(valorEsperado, res, 0); //assertEqual para double coloca um  3º parametro como amrgem de erro
		
	}
	
	@Test
	public void testeIPTU3() {
		double res = this.simulador.calcularIPTU("1", 70000, 0);
		double valorEsperado = 420;
		assertEquals(valorEsperado, res, 0); //assertEqual para double coloca um  3º parametro como amrgem de erro
		
	}
	
	@Test
	public void testeIPTU4() {
		double res = this.simulador.calcularIPTU("2", 35793, 0);
		double valorEsperado = 429.5;
		assertEquals(valorEsperado, res, 0); //assertEqual para double coloca um  3º parametro como amrgem de erro
		
	}
	
	@Test
	public void testeIPTU5() {
		double res = this.simulador.calcularIPTU("3",430000, 0);
		double valorEsperado = 6881.90;
		assertEquals(valorEsperado, res, 0); //assertEqual para double coloca um  3º parametro como amrgem de erro
		
	}
	
}
