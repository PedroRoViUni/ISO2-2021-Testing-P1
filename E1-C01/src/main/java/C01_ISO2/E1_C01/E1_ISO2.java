package C01_ISO2.E1_C01;

public class E1_ISO2 {
	public static void main(String [] args) {
		Persona a1 = new Persona(true, false, false, true, true);
		Persona a2 = new Persona(true, true, true, true, true);
		Persona a3 = new Persona(true, false, false, true, false);
		Persona a4 = new Persona(true, false, false, false, true);
		Persona a5 = new Persona(false, false, false, true, true);
		
		realizarActividad(12, 12, "Nieve", a1);
		realizarActividad(17, 32, "Nieve", a2);
		realizarActividad(28, 30, "Granizo", a3);
		realizarActividad(35, 70, "Niebla", a4);
		realizarActividad(-14, 12, "Granizo", a5);
		
		realizarActividad(16, 20, "Nieve", a1);
		realizarActividad(-2, 12, "Granizo", a1);
		realizarActividad(32, 15, "Nieve", a1);
		realizarActividad(35, 15, "Granizo", a1);
		realizarActividad(-5, 14, "Lluvia", a1);
				
	}
	
	public static void realizarActividad(int temperatura, double humedad, String precipitacion, Persona p) {
		boolean aforo_estacion = false , aforo_ruta = false, aforo_confinamiento = false, aforo_bar = false, aforo_piscina = false, hacesAlgo = false;
		
		if (p.isSana() && !p.isSintomas() && !p.isContacto() && p.isPasado_Covid() && p.isCartilla_vacunacion()) {
			if (temperatura < 0 && humedad < 15.0 && precipitacion != "Lluvia" && precipitacion != "Nieve" && !aforo_estacion) {
				System.out.println("Se puede ir a esquiar");
				hacesAlgo = true;
			}
			
			if (temperatura > 0 && temperatura <= 15 && precipitacion != "Lluvia" && !aforo_ruta) {
				System.out.println("Es posible hacer senderismo");
				hacesAlgo = true;
			}
			
			if (temperatura > 15 && temperatura <= 25 && precipitacion != "Lluvia" && humedad < 60.0 && !aforo_confinamiento) {
				System.out.println("Se puede hacer turismo al aire libre");
				hacesAlgo = true;
			}
			
			if (temperatura > 25 && temperatura <= 35 && precipitacion != "Lluvia" && !aforo_bar) {
				System.out.println("Se puede ir de cañas");
				hacesAlgo = true;
			}
			
			if (temperatura > 30 && precipitacion != "Lluvia") {
				System.out.println("Se puede ir a la playa");
				hacesAlgo = true;
				if (!aforo_piscina) {
					System.out.println("Se puede ir a la piscina");
				}
			}
			
			if (temperatura < 0 && humedad < 15.0 && (precipitacion == "Lluvia" || precipitacion == "Nieve")) {
				System.out.println("Lo mejor es quedarse en casa");
				hacesAlgo = true;
				
			}
			
			if (!hacesAlgo) {
				System.out.println("No se recomienda hacer ninguna actividad");
			}
		} else {
			System.out.println("No puedes realizar ninguna actividad");
		}
	}
}

