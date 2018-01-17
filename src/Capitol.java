import java.util.ArrayList;

	public class Capitol implements Element {
		String titluCapitol;
	
		public ArrayList<Subcapitol>subcapitole=new  ArrayList<Subcapitol>();
	
		public Capitol(String titluCapitol) {
			this.titluCapitol=titluCapitol;
		}

	@Override
	public void add(Element e) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element e) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Element getElement(int index) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void print() {
		System.out.println(titluCapitol);
		
	}

	@Override
	public void acceptVisitor(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addElement(Paragraf paragraf) {
		// TODO Auto-generated method stub
		
	}
}
