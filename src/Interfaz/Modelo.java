package Interfaz;

public class Modelo {
	private int r;
	private int g;
	private int b;
	
	public Modelo() {
		this.r = 0;
        this.g = 0;
        this.b = 0;
    
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public Color getColor() {
        return new Color(r, g, b);
    }
}


