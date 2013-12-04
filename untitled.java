public class ColaCircular {
	
	public static class ClaseColaCircular { // Declaracion de la clase de la Cola Circular.
	    //Atributos de la cola: tamaño máximo, declaración del array, inicio y fin. 
	    
	    ClaseColaCircular() { //Constructor que inicializa el frente y el final de la Cola Circular.
	    }
	    
	    public static void Mostrar() {
	    }
	    
	    public static void Insertar(int dato) {
	   }
	   
	   public static void Eliminar() {
	   }
	   
	}
    
    static ClaseColaCircular ColaCircular = new ClaseColaCircular(); // Declaracion del objeto ColaCircular.
    
    public static void main(String args[]) throws IOException {
    }
    
    public static void Altas() throws IOException {
    }
    
    public static String getString() throws IOException { // Funcion para capturar una cadena desde el teclado.
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        String s = br.readLine();
        return s;
    }
           
    public static int getInt() throws IOException { // Funcion para capturar un entero desde el teclado.
        String s = getString();
        return integer.ParseInt (s); 
    }
    
}