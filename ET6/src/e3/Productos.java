package e3;

public class Productos {
	protected String nombre = " ";
	protected double precio;

	public Productos(String nombre, double precio) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public String toString() {
		String cadena = "";
		cadena += "Producto: " + this.nombre + " Precio: " + this.precio;
		return cadena;
	}

	public double Calcular(double cantidad) {
		return this.precio * cantidad;
	}

}

class Perecedero extends Productos {
	private int dias;

	public Perecedero(String nombre, double precio, int dias) {
		super(nombre, precio);
		if (dias > 0) {
			this.dias = dias;
		}
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		if (dias > 0) {
			this.dias = dias;
		}
	}

	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += " Perece: " + this.dias;
		return cadena;
	}

	@Override
	public double Calcular(double cantidad) {
		double preciof = super.Calcular(cantidad);
		switch (dias) {
		case 1:
			preciof = preciof / 4;
		case 2:
			preciof = preciof / 3;
		case 3:
			preciof = preciof / 2;
		}
		return preciof;
	}
}

class NoPerecedero extends Productos {
	private String tipo = " ";

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += " Tipo: " + this.tipo;
		return cadena;
	}

	@Override
	public double Calcular(double cantidad) {
		return super.Calcular(cantidad);
	}
}
