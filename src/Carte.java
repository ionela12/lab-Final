import java.util.ArrayList;

public class Carte {
	String titlu;
	String autor;
	private ArrayList<Element> cont =new  ArrayList<Element>();
	Carte(){}
	Carte(String titlu,  String autor){
		this.titlu=titlu;
		this.autor=autor;
	}
	
	public void setTitlu(String titlu){
		this.titlu=titlu;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitlu() {
		return titlu;
	}
	public void addCapitol (Element elem) {
		this.cont.add(elem);
		
	}
	
	public void print () {
		System.out.println(titlu);
		 for(int i=0; i< cont.size(); i++)
		   {
			   cont.get(i).print();
			
		   }
	}
	public void accept (Visitor v) {
		for (Element s :  cont) {
			s.acceptVisitor(v);
		}

}
	public void acceptVisitor(StaticVisitor visitor) {
		// TODO Auto-generated method stub
		
	}
}
