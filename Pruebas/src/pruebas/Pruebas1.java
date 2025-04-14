package pruebas;

public class Pruebas1 {

	public static void main(String[] args) {
		
		String uno = "ABCDE";
		String dos = "";
		
		String[] letras = uno.split("");
		
		for (String string : letras) {
			System.out.println(string);
		}
		letras[0] = "1";
		
		
		
		System.out.println("----");
		
		for (String string : letras) {
			System.out.println(string);
			dos += string;
		}
		
		System.out.println(uno);
		System.out.println(dos);
		
		System.out.println(22325540%23);
		System.out.println(21770166%23);
	}
}
