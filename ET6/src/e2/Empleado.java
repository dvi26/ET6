package e2;

public class Empleado {
	private String nombre = " ";

	public Empleado(String nombre) {
		if (nombre != null && !nombre.equals("") ) {
			this.nombre = nombre;
		}

	}

	public Empleado() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (!nombre.equals("") && nombre != null) {
			this.nombre = nombre;
		}
	}

	public String toString() {
		String cadena = "";
		cadena += "Empleado " + this.nombre;
		return cadena;
	}

}

class Operario extends Empleado {

	public Operario() {
		super();
	}

	public Operario(String nombre) {
		super(nombre);

	}

	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += " -> Operario";
		return cadena;
	}

}

class Directivo extends Empleado {

	public Directivo() {
		super();

	}

	public Directivo(String nombre) {
		super(nombre);

	}

	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += " -> Directivo";
		return cadena;
	}

}

class Oficial extends Operario {

	public Oficial() {
		super();

	}

	public Oficial(String nombre) {
		super(nombre);

	}
	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += " -> Oficial";
		return cadena;
	}
}

class Tecnico extends Operario {

	public Tecnico() {
		super();

	}

	public Tecnico(String nombre) {
		super(nombre);

	}
	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += " -> Tecnico";
		return cadena;
	}

}
