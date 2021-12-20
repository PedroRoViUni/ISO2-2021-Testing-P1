public class E1_ISO2 {
	public static void main(String [] args) {
		Persona a1 = new Persona(true, false, false, true, true);
		
		realizarActividad(30, 10, "LLuvia", a1);
	}
	
	public static void realizarActividad(int temperatura, double humedad, String precipitacion, Persona p) {
		boolean aforo_estacion = false , aforo_ruta = false, aforo_confinamiento = false, aforo_bar = false, aforo_piscina = false;
		
		if (p.isSana() && !p.isSintomas() && !p.isContacto() && p.isPasado_Covid() && p.isCartilla_vacunacion()) {
			if (temperatura < 0 && humedad < 15.0 && precipitacion != "LLuvia" && precipitacion != "Nieve" && !aforo_estacion) {
				System.out.println("Se puede ir a esquiar");
			}
			
			if (temperatura > 0 && temperatura <= 15 && precipitacion != "LLuvia" && !aforo_ruta) {
				System.out.println("Es posible hacer senderismo");
			}
			
			if (temperatura > 15 && temperatura <= 25 && precipitacion != "Lluvia" && humedad < 60.0 && !aforo_confinamiento) {
				System.out.println("Se puede hacer turismo al aire libre");
			}
			
			if (temperatura > 25 && temperatura <= 35 && precipitacion != "Lluvia" && !aforo_bar) {
				System.out.println("Se puede ir de cañas");
			}
			
			if (temperatura > 30 && precipitacion != "Lluvia") {
				System.out.println("Se puede ir a la playa");
				if (!aforo_piscina) {
					System.out.println("Se puede ir a la piscina");
				}
			}
			if (temperatura < 0 && humedad < 15.0 && (precipitacion == "Lluvia" || precipitacion == "Nieve")) {
				System.out.println("Lo mejor es quedarse en casa");
			}
		} else {
			System.out.println("No puedes realizar ninguna actividad");
		}
	}
}
