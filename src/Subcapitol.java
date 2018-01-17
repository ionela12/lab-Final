import java.util.Vector;

public class Subcapitol {
	Vector<Imagine> imagini;
	Vector<Paragraf> paragrafe;
	Vector<Tabel> tabele;
	Subcapitol() { }
	
	Subcapitol(Vector<Imagine> imagini, Vector<Paragraf> paragrafe, Vector<Tabel> tabele) {
		this.imagini = imagini;
		this.paragrafe = paragrafe;
		this.tabele = tabele;
	}
	
	public Vector<Imagine> getImagini() {
		return imagini;
	}
	public void setImagini(Vector<Imagine> imagini) {
		this.imagini = imagini;
	}
	public Vector<Paragraf> getParagrafe() {
		return paragrafe;
	}
	public void setParagrafe(Vector<Paragraf> paragrafe) {
		this.paragrafe = paragrafe;
	}
	public Vector<Tabel> getTabele() {
		return tabele;
	}
	public void setTabele(Vector<Tabel> tabele) {
		this.tabele = tabele;
	}
	
}
