import javax.swing.JFrame;


public class Ventana extends JFrame {
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
	}
	
	public static void main(String[] args) {
		Ventana miVentana = new Ventana();
		miVentana.setVisible(true);
	}

}
