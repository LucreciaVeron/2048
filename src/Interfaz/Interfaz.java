package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

//TRABAJO PRACTICO 1 - 2048 - LUCRECIA VERON - COM 01
public class Interfaz {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField txtPuntaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Juego juego= new Juego();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 428, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setFocusable(true);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField.setBounds(10, 51, 91, 63);
		frame.getContentPane().add(textField);
		textField.setText(""+Juego.tablero[0][0]);
		textField.setColumns(10);
		textField.setBackground(colorDeCelda(0,0));
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 124, 91, 63);
		frame.getContentPane().add(textField_1);
		textField_1.setText(""+Juego.tablero[0][1]);
		textField_1.setBackground(colorDeCelda(0,1));
		
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		textField_2.setBounds(10, 197, 91, 63);
		textField_2.setText(""+Juego.tablero[0][2]);
		textField_2.setBackground(colorDeCelda(0,2));
		
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_3.setColumns(10);
		textField_3.setBackground(colorDeCelda(0,3));
		frame.getContentPane().add(textField_3);
		textField_3.setBounds(10, 270, 91, 63);
		textField_3.setText(""+Juego.tablero[0][3]);
		
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_4.setColumns(10);
		textField_4.setBackground(colorDeCelda(1,0));
		frame.getContentPane().add(textField_4);
		textField_4.setBounds(111, 51, 91, 63);
		textField_4.setText(""+Juego.tablero[1][0]);
		
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		textField_5.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_5.setColumns(10);
		textField_5.setBackground(colorDeCelda(1,1));
		frame.getContentPane().add(textField_5);
		textField_5.setBounds(110, 124, 91, 63);
		textField_5.setText(""+Juego.tablero[1][1]);
		
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setEditable(false);
		textField_6.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_6.setColumns(10);
		textField_6.setBackground(colorDeCelda(1,2));
		frame.getContentPane().add(textField_6);
		textField_6.setBounds(111, 197, 91, 63);
		textField_6.setText(""+Juego.tablero[1][2]);
		
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setEditable(false);
		textField_7.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_7.setColumns(10);
		textField_7.setBackground(colorDeCelda(1,3));
		frame.getContentPane().add(textField_7);
		textField_7.setBounds(111, 270, 91, 63);
		textField_7.setText(""+Juego.tablero[1][3]);
		
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setEditable(false);
		textField_8.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_8.setColumns(10);
		textField_8.setBackground(colorDeCelda(2,0));
		frame.getContentPane().add(textField_8);
		textField_8.setBounds(211, 51, 91, 63);
		textField_8.setText(""+Juego.tablero[2][0]);
		
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setEditable(false);
		textField_9.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_9.setColumns(10);
		textField_9.setBackground(colorDeCelda(2,1));
		frame.getContentPane().add(textField_9);
		textField_9.setBounds(211, 124, 91, 63);
		textField_9.setText(""+Juego.tablero[2][1]);
		
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setEditable(false);
		textField_10.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_10.setColumns(10);
		textField_10.setBackground(colorDeCelda(2,2));
		frame.getContentPane().add(textField_10);
		textField_10.setBounds(211, 197, 91, 63);
		textField_10.setText(""+Juego.tablero[2][2]);
		
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setEditable(false);
		textField_11.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_11.setColumns(10);
		textField_11.setBackground(colorDeCelda(2,3));
		frame.getContentPane().add(textField_11);
		textField_11.setBounds(212, 270, 91, 63);
		textField_11.setText(""+Juego.tablero[2][3]);
		
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setEditable(false);
		textField_12.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_12.setColumns(10);
		textField_12.setBackground(colorDeCelda(3,0));
		frame.getContentPane().add(textField_12);
		textField_12.setBounds(312, 51, 91, 63);
		textField_12.setText(""+Juego.tablero[3][0]);
		
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setEditable(false);
		textField_13.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_13.setColumns(10);
		textField_13.setBackground(colorDeCelda(3,1));
		frame.getContentPane().add(textField_13);
		textField_13.setBounds(312, 124, 91, 63);
		textField_13.setText(""+Juego.tablero[3][1]);
		
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setEditable(false);
		textField_14.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_14.setColumns(10);
		textField_14.setBackground(colorDeCelda(3,2));
		frame.getContentPane().add(textField_14);
		textField_14.setBounds(312, 197, 91, 63);
		textField_14.setText(""+Juego.tablero[3][2]);
		
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setEditable(false);
		textField_15.setFont(new Font("IncisedBlack", Font.PLAIN, 37));
		textField_15.setColumns(10);
		textField_15.setBackground(colorDeCelda(3,3));
		frame.getContentPane().add(textField_15);
		textField_15.setBounds(313, 270, 91, 63);
		textField_15.setText(""+Juego.tablero[3][3]);
		
		txtPuntaje = new JTextField();
		txtPuntaje.setForeground(Color.WHITE);
		txtPuntaje.setBackground(Color.BLACK);
		txtPuntaje.setEditable(false);
		txtPuntaje.setFont(new Font("IncisedBlack", Font.PLAIN, 19));
		txtPuntaje.setHorizontalAlignment(SwingConstants.CENTER);
		txtPuntaje.setText("Puntaje: " + Juego.puntos);
		txtPuntaje.setBounds(0, 12, 414, 29);
		frame.getContentPane().add(txtPuntaje);
		txtPuntaje.setColumns(10);
		
		JTextPane txtpnPresioneEnterPara = new JTextPane();
		txtpnPresioneEnterPara.setText("Presione enter para reiniciar");
		txtpnPresioneEnterPara.setFont(new Font("IncisedBlack", Font.PLAIN, 27));
		txtpnPresioneEnterPara.setBackground(Color.BLACK);
		txtpnPresioneEnterPara.setForeground(Color.WHITE);
		txtpnPresioneEnterPara.setEditable(false);
		txtpnPresioneEnterPara.setBounds(49, 343, 333, 39);
		frame.getContentPane().add(txtpnPresioneEnterPara);
		
		JTextPane txtpnGanaste = new JTextPane();
		txtpnGanaste.setForeground(Color.WHITE);
		txtpnGanaste.setFont(new Font("IncisedBlack", Font.PLAIN, 27));
		txtpnGanaste.setEditable(false);
		txtpnGanaste.setBackground(Color.BLACK);
		txtpnGanaste.setBounds(150, 382, 101, 39);
		frame.getContentPane().add(txtpnGanaste);
		
		frame.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				Juego.mover(e);
				if(!Juego.perdio) {
					actualizarEstadoDelTablero();
					txtpnGanaste.setText("");
				}
				if(Juego.gano) {
					txtpnGanaste.setText("Ganaste");
				}
				if(Juego.perdio) {
					txtpnGanaste.setText("Perdiste");
					actualizarEstadoDelTablero();
				}
			}
		});
	}

	private void actualizarEstadoDelTablero() {
		textField.setText(""+Juego.tablero[0][0]);
		textField.setBackground(colorDeCelda(0,0));
		textField_1.setText(""+Juego.tablero[0][1]);
		textField_1.setBackground(colorDeCelda(0,1));
		textField_2.setText(""+Juego.tablero[0][2]);
		textField_2.setBackground(colorDeCelda(0,2));
		textField_3.setText(""+Juego.tablero[0][3]);
		textField_3.setBackground(colorDeCelda(0,3));
		
		textField_4.setText(""+Juego.tablero[1][0]);
		textField_4.setBackground(colorDeCelda(1,0));
		textField_5.setText(""+Juego.tablero[1][1]);
		textField_5.setBackground(colorDeCelda(1,1));
		textField_6.setText(""+Juego.tablero[1][2]);
		textField_6.setBackground(colorDeCelda(1,2));
		textField_7.setText(""+Juego.tablero[1][3]);
		textField_7.setBackground(colorDeCelda(1,3));
		
		textField_8.setText(""+Juego.tablero[2][0]);
		textField_8.setBackground(colorDeCelda(2,0));
		textField_9.setText(""+Juego.tablero[2][1]);
		textField_9.setBackground(colorDeCelda(2,1));
		textField_10.setText(""+Juego.tablero[2][2]);
		textField_10.setBackground(colorDeCelda(2,2));
		textField_11.setText(""+Juego.tablero[2][3]);
		textField_11.setBackground(colorDeCelda(2,3));

		textField_12.setText(""+Juego.tablero[3][0]);
		textField_12.setBackground(colorDeCelda(3,0));
		textField_13.setText(""+Juego.tablero[3][1]);
		textField_13.setBackground(colorDeCelda(3,1));
		textField_14.setText(""+Juego.tablero[3][2]);
		textField_14.setBackground(colorDeCelda(3,2));
		textField_15.setText(""+Juego.tablero[3][3]);
		textField_15.setBackground(colorDeCelda(3,3));
		txtPuntaje.setText("Puntaje: " + Juego.puntos);
		
	}
	
	public Color colorDeCelda(int fila, int columna) {
		if (Juego.tablero[fila][columna]==2) {
			return new Color(0xffa79d);		
	}
		if (Juego.tablero[fila][columna]==4) {
			return new Color(0xe899ff);
		}
		if (Juego.tablero[fila][columna]==8) {
			return new Color(0xff7a6b);
		}
		if (Juego.tablero[fila][columna]==16) {
			return new Color(0xff5a47);
		}
		if (Juego.tablero[fila][columna]==32) {
			return new Color(0xffad62);
		}
		if (Juego.tablero[fila][columna]==64) {
			return new Color(0xff9433);
		}
		if (Juego.tablero[fila][columna]==128) {
			return new Color(0xf901b4);
		}
		if (Juego.tablero[fila][columna]==256) {
			return new Color(0xfe48a2);
		}
		if (Juego.tablero[fila][columna]==512) {
			return new Color(0xfe017e);
		}
		if (Juego.tablero[fila][columna]==1024) {
			return new Color(0xfe5a7f);
		}
		if (Juego.tablero[fila][columna]==2048) {
			return new Color(0xfe164a);
		}
		return new Color(0xffe6e3 );
}
}
