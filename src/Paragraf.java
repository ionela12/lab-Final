
public class Paragraf extends AbstractElement implements AlignStrategy {
	String textP;
	
	Paragraf() { }
	Paragraf(String textP) {
		this.textP = textP;
		
	}
	public String getTextP() {
		return textP;
	}

	public void setTextP(String textP) {
		this.textP = textP;
	}
	
	public void setAlignStrategy(RightAlign rightAlign) {
		
	}
	
	public void setAlignStrategy(CenterAlign centerAlign){}
	
	@Override
	public void print(String textP) {
		// TODO Auto-generated method stub
		
	}
	
}
