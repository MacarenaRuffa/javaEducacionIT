
public class Principal {
//Si variableA, variableB y variableC son de tipo l�gicas, qu� valores deben poseer para obtener los resultados
	public static void main(String[] args) {

		// declaramos las variables
		boolean variableA = true;
		boolean variableB = false;
		boolean variableC = true;
		// operamos
		System.out.println("La variableA debe ser " + variableA);
		System.out.println("La variableB debe ser " + variableB);
		System.out.println("La variableC debe ser " + variableC);
		System.out.println("Resultado: ");

		/*
		 Resultado paso a paso (variableA && variableB) || (variableA && variableC)
		 (t && f) || (t && t)          
		     f    ||    t              
		           t     
		*/
		System.out.println("(variableA && variableB) || (variableA && variableC) = " + ((variableA && variableB) || (variableA && variableC)));
				/*	   
		  Resultado paso a paso !(variableA || variableB) && variableC
		   !(t || f) && t
		       !t    && t
		        f    && t
		             f                 
		 */
				System.out.println("!(variableA || variableB) && variableC = " + (!(variableA || variableB) && variableC));
	}

}
