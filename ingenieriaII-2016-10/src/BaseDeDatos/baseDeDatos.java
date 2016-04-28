package BaseDeDatos;

import javax.swing.JFrame;

public class baseDeDatos extends JFrame{
	
	public baseDeDatos(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		setTitle("Creado por Francisco");
	}
	
	public static void main(String[] args) {
		baseDeDatos miVentana = new baseDeDatos();
		miVentana.setVisible(true);
	}

}

