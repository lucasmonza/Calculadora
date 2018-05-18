package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.classes.Calculadora;

public class CalculadoraTest {

	private Calculadora calculadora = new Calculadora();

	@Before
	public void init() {

		calculadora.setValor1(1d);
		calculadora.setValor2(23d);
		Assert.assertTrue(1 == calculadora.getValor1());
		Assert.assertTrue(23 == calculadora.getValor2());
	}

	@Test
	public void somarTeste() {

		Assert.assertTrue(24 == calculadora.somar());
	}

	@Test
	public void subtratirTeste() {

		Assert.assertTrue(-22 == calculadora.subtrair());
	}
	
	@Test
	public void multiplicarTeste() {

		Assert.assertTrue(23 == calculadora.multiplicar());
	}
	@Test
	public void dividirTeste() {
		Assert.assertTrue(0.043478260869565216d == calculadora.dividir());
		
	}
	@Test
	public void zerarTest() {
		calculadora.zerar();
		Assert.assertTrue(0 == calculadora.getValor1());
		Assert.assertTrue(0 == calculadora.getValor2());
	}
}