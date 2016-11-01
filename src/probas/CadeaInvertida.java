package probas;

public class CadeaInvertida {
	
	public static void main (String[]args){
		
		String cadea="Alexandre Insua Moreira";
		String cadeaInvertida="";
	
	for (int i=cadea.length()-1;i>=0;i--){
		cadeaInvertida=cadeaInvertida+cadea.charAt(i);
	}
	System.out.print(cadeaInvertida);
	}
	

}

