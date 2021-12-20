public class Persona {
	private boolean sana;
	private boolean sintomas;
	private boolean contacto;
	private boolean pasado_Covid;
	private boolean cartilla_vacunacion;
	
	
	public Persona (boolean sana, boolean sintomas, boolean contacto, boolean pasado_Covid, boolean cartilla_vacunacion) {
		super();
		this.sana = sana;
		this.sintomas = sintomas;
		this.contacto = contacto;
		this.pasado_Covid = pasado_Covid;
		this.cartilla_vacunacion = cartilla_vacunacion;
	}


	public boolean isSana() {
		return sana;
	}


	public void setSana(boolean sana) {
		this.sana = sana;
	}


	public boolean isSintomas() {
		return sintomas;
	}


	public void setSintomas(boolean sintomas) {
		this.sintomas = sintomas;
	}


	public boolean isContacto() {
		return contacto;
	}


	public void setContacto(boolean contacto) {
		this.contacto = contacto;
	}


	public boolean isPasado_Covid() {
		return pasado_Covid;
	}


	public void setPasado_Covid(boolean pasado_Covid) {
		this.pasado_Covid = pasado_Covid;
	}


	public boolean isCartilla_vacunacion() {
		return cartilla_vacunacion;
	}


	public void setCartilla_vacunacion(boolean cartilla_vacunacion) {
		this.cartilla_vacunacion = cartilla_vacunacion;
	}
}
