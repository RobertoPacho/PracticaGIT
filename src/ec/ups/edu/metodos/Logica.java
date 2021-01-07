package ec.ups.edu.metodos;

public class Logica {
	private int id;
	private String nombre;
	private String apellido;
	
	
	public Logica() {

	}
	
	public Logica(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String metodIntegranteUno() {
		String mensaje="Este método a sido modificado por" + this.nombre+""+this.apellido;
		return mensaje;
	}
	public String metodIntegranteDos() {
		String mensaje= "este mensaje a sido modificado por :"+this.nombre +" "+this.apellido;
		return mensaje;
	}

}
