package MaquinasDeCafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaquinaEstafadoraTest {

	MaquinaDeCafe maquina;
	@Before
	public void setUp(){
		maquina = new MaquinaEstafadora();
	}

	@Test
	public void queDevuelvaUnVasoAlServir() {
		VasoDeCafe vaso = maquina.servirCafe();
		assertNotNull(vaso);
	}
	
	@Test 
	public void quePuedeServirUnCafe() {
		assertTrue(maquina.puedeServir());
	}
	
	@Test 
	public void queElPrimeroEstaLlenoYElSiguienteVacio() {
		assertTrue(maquina.servirCafe().estaLleno());
		assertFalse(maquina.servirCafe().estaLleno());
		assertTrue(maquina.servirCafe().estaLleno());
		assertFalse(maquina.servirCafe().estaLleno());
	}
	
	@Test 
	public void queSeAgotaElCafe() {
		for(int i=0; i < 200; i++)
			maquina.servirCafe();
		VasoDeCafe vaso = maquina.servirCafe();
		assertFalse(vaso.estaLleno());
	}
	
	@Test 
	public void queNoSeAgotaElCafe() {
		VasoDeCafe vaso = null;
		for(int i=0; i < 199; i++)
			vaso = maquina.servirCafe();
		assertTrue(vaso.estaLleno());
	}

}
