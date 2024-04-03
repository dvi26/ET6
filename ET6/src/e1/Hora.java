package e1;

public class Hora {
	protected int hora;
	protected int minuto;

	public Hora(int hora, int minuto) {
		if (hora < 24 && hora >= 0) {
			this.hora = hora;
		}
		if (minuto < 61 && minuto >= 0) {
			this.minuto = minuto;
		}
	}

	void inc() {
		if (this.minuto != 59) {
			this.minuto++;
		} else if (this.hora != 23) {
			this.hora++;
			this.minuto = 0;
		} else {
			this.hora = 0;
			this.minuto = 0;
		}
	}

	boolean setMinutos(int valor) {
		boolean res = false;
		if (valor >= 0 && valor <= 59) {
			res = true;
			this.minuto = valor;
		}
		return res;
	}

	boolean setHora(int valor) {
		boolean res = false;
		if (valor >= 0 && valor <= 23) {
			res = true;
			this.hora = valor;
		}
		return res;
	}

	public String toString() {
		String cadena = "";

		cadena += this.hora + ":";
		if (this.minuto < 10) {
			cadena += "0" + this.minuto;
		} else {
			cadena += this.minuto;
		}

		return cadena;
	}

}

class HoraExacta extends Hora {
	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (segundo < 61 && segundo > 0) {
			this.segundo = segundo;
		}
	}

	boolean setSegundo(int valor) {
		boolean res = false;
		if (valor >= 0 && valor <= 59) {
			res = true;
			this.segundo = valor;
		}
		return res;
	}

	@Override
	void inc() {
		if (segundo != 59) {
			this.segundo++;

		} else {
			super.inc();
			this.segundo = 0;
		}

	}

	@Override
	public String toString() {
		String cadena = super.toString();
		if (segundo >= 10) {
			cadena += ":" + this.segundo;
		} else {
			cadena += ":" + "0" + this.segundo;
		}
		return cadena;
	}
}
