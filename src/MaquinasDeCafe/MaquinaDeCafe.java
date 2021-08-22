package MaquinasDeCafe;

public abstract class MaquinaDeCafe {
	private static final int CANTIDAD_INICIAL_DE_CAFE = 1000;
	private static final int GRAMOS_POR_CAFE = 10;
	private int gramosDeCafe;

	public MaquinaDeCafe() {
		this.gramosDeCafe = CANTIDAD_INICIAL_DE_CAFE;
	}

	public int getGramosDeCafe() {
		return gramosDeCafe;
	}

	public VasoDeCafe servirCafe() {
		if (this.puedeServir()) {
			this.restarCafe();
			return new VasoDeCafe(true);
		}
		return new VasoDeCafe(false);
	}

	protected boolean puedeServir() {
		return gramosDeCafe >= GRAMOS_POR_CAFE;
	}

	protected void restarCafe() {
		this.gramosDeCafe -= GRAMOS_POR_CAFE;
	}

}
