package MaquinasDeCafe;

public class MaquinaEstafadora extends MaquinaPremium {
	private boolean yaEstafe = false;

	@Override
	public VasoDeCafe servirCafe() {
		this.yaEstafe = !this.yaEstafe;
		if (this.yaEstafe) {
			return super.servirCafe();
		}
		return new VasoDeCafe(false);
	}

}
