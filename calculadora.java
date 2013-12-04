public class CalculadoraBasica{
	// Atributs per representar els dos operands, // el resultat i l’operaci ́o a realitzar
	private int oper1, oper2, operacio, resultat;
	
	demanarOperands(){
		try{
            BufferedReader llegir = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Primer operand ?");
            oper1 = Integer.parseInt(llegir.readLine());
            System.out.println("Segon operand ?");
            oper2 = Integer.parseInt(llegir.readLine());
        }catch(Exception e){}
	}
	
	demanarOperacio(){
		try{
            BufferedReader llegir = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Operació ?");
            operacio = llegir.readLine().charAt(0);
        }catch(Exception e){}
	}
	
	public void calcular(){
	
	}
	
	public void suma(){}
	
	public void resta(){}
	
	