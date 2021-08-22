package MaquinasDeCafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TresMaquinasTests {

	@Test
	public void test() {
		MaquinaDeCafe maquinaEco = new MaquinaEconomica();
		MaquinaDeCafe maquinaPre = new MaquinaPremium();
		MaquinaDeCafe maquinaEst = new MaquinaEstafadora();
		
		MaquinaDeCafe[] maquinas = new MaquinaDeCafe[3];
		maquinas[0] = maquinaEco;
		maquinas[1] = maquinaPre;
		maquinas[2] = maquinaEst;
		
		for (MaquinaDeCafe cadaUna : maquinas) {
			System.out.println(cadaUna.servirCafe());
			
		}
		for (MaquinaDeCafe cadaUna : maquinas) {
			System.out.println(cadaUna.servirCafe());
			
		}
		for (MaquinaDeCafe cadaUna : maquinas) {
			System.out.println(cadaUna.servirCafe());
			
		}
		for (MaquinaDeCafe cadaUna : maquinas) {
			System.out.println(cadaUna.servirCafe());
			
		}
	}
	

}
