
public class ImageProxy extends AbstractElement {

	private String numeImg;
	private Imagine realImage = null;
	
	public ImageProxy(String numeImg) {
		this.numeImg = numeImg;
	}
	
	public void print() {	
		Imagine realImage= new Imagine(numeImg);
		System.out.println(realImage);
		
	}

	public Imagine getRealImage() {
		return realImage;
	}

	public void setRealImage(Imagine realImage) {
		this.realImage = realImage;
	}
	
}