public class Imagine extends AbstractElement {
	
	private String numeImg;
	
	public Imagine(String numeImg){
		this.numeImg=numeImg;
	}
	

	public String getNumeImg() {
		return numeImg;
	}


	public void setFileName(String numeImg) {
		this.numeImg = numeImg;
	}
	
	public void print() {
		 System.out.println(numeImg);
		
	}
	public String toString()
    {
        return numeImg;
    }
	
}
