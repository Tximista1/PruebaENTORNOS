package Prueba;

public class Prueba {


			private String dni;
			private String nombre;
			private String apellidos;
			private String grupo;
			
			
			public String getDni() {
				return dni;
			}
			public void setDni(String dni) {
				this.dni = dni;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getApellidos() {
				return apellidos;
			}
			public void setApellidos(String apellidos) {
				this.apellidos = apellidos;
			}
			public String getGrupo() {
				return grupo;
			}
			public void setGrupo(String grupo) {
				this.grupo = grupo;
			}
			
			
			
			@Override
			public String toString() {
				return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", grupo=" + grupo + "]";
			}
	}
