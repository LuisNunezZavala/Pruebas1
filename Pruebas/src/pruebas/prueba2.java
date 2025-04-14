package pruebas;


import java.util.Date ;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class prueba2 {
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		GregorianCalendar fecha_nacimiento;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		boolean error = true;
		
		do {
			System.out.println("Introduce una fecha de nacimiento");
			try {
				LocalDate fecha = LocalDate.parse(ent.nextLine(), df);
				
				System.out.println(fecha);
				
				fecha_nacimiento = convertirLocalDateAGregorian(fecha);
				
				System.out.println("Fecha en GregorianCalendar: " + 
			            fecha_nacimiento.get(GregorianCalendar.DAY_OF_MONTH) + "/" +
			            (fecha_nacimiento.get(GregorianCalendar.MONTH) + 1) + "/" +
			            fecha_nacimiento.get(GregorianCalendar.YEAR));
				
				error = false;
			}catch(DateTimeParseException ex){
				System.out.println("Error en la fecha");
			}
		}while(error);	
		
	}
	
	public static GregorianCalendar convertirLocalDateAGregorian(LocalDate fecha) {
        // Convertir LocalDate a Date
        Date date = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Crear GregorianCalendar a partir de Date
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setTime(date);

        return calendario;
    }

}
