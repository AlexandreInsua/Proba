package probas;
import javax.swing.JOptionPane;
public class Unicode {

	public static void lanzarMensaxe(){
		String unicode="\u0101";
		JOptionPane.showMessageDialog(null, unicode);
	}
	
	public static void main(String[] args) {
		
		lanzarMensaxe();
		
	}
}
