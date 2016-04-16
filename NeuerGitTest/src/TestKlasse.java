import javax.swing.JOptionPane;
public class TestKlasse {
	/*
	 * Dies ist ein Test
	 */
	public static void main (String[] args){
		
		String a = JOptionPane.showInputDialog("             ");
		switch(a){
		
		
		case "A"  : 
		JOptionPane.showMessageDialog(null, "Man erntet was man sät");
		break;
		case "B" : 
			System.out.println("Faulheit ist die Furcht vor bevorstehender Arbeit");
			break;
		case "C":{
			JOptionPane.showMessageDialog(null, "Hölle ist die Abwesenheit von Vernunft");
		};
		break;
			}
	}

}
