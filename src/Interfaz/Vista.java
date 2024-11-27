package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Vista extends JFrame implements Observer {
    private JButton btnCuadrado = new JButton("Cuadrado");
    private JButton btnCirculo = new JButton("Circulo");
    
	private JTextField r = new JTextField();
    private JTextField g = new JTextField();
    private JTextField b = new JTextField(); 
    
    public JTextField getR() {
		return r;
	}

	public void setR(JTextField r) {
		this.r = r;
	}

	public JTextField getG() {
		return g;
	}

	public void setG(JTextField g) {
		this.g = g;
	}

	public JTextField getB() {
		return b;
	}

	public void setB(JTextField b) {
		this.b = b;
	}
    
    private JPanel panelFigura = new JPanel() {
        private Color colorFigura = Color.BLACK;
        private Shape figura = null;
        
        
        
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        if (figura != null) {
        	g2d.setColor(colorFigura);
            g2d.fill(figura);
        }
        }
        
    public void Figura(Shape figura, Color colorFigura) {
    	this.figura = figura;
        this.colorFigura = colorFigura;
        repaint();
        }
    };
        
    public void Cuadro() {
        this.setTitle("Parcial de Sofia Alcalá");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLayout(new BorderLayout());
        JPanel panelIzquierdo = new JPanel(new GridLayout(4, 2, 5, 5));
        panelIzquierdo.add(btnCuadrado);
        panelIzquierdo.add(btnCirculo);
        panelIzquierdo.add(new JLabel("R:"));
        panelIzquierdo.add(r);
        panelIzquierdo.add(new JLabel("G:"));
        panelIzquierdo.add(g);
        panelIzquierdo.add(new JLabel("B:"));
        panelIzquierdo.add(b);
        add(panelIzquierdo, BorderLayout.WEST);
        add(panelFigura, BorderLayout.CENTER);
        
        setVisible(true);
       
    
    

}

	
	public void addCuadrado(ActionListener listener) {
        btnCuadrado.addActionListener(listener);
    }

    public void addCirculo(ActionListener listener) {
        btnCirculo.addActionListener(listener);
    }

    public void dibujarFigura(Shape figura, Color color) {
    	panelFigura.Figura(figura, color);
    }

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
