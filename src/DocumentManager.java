
public class DocumentManager {
	private static DocumentManager instance;
	private Element book;
	private DocumentManager(){}
	
	public static DocumentManager getInstance() {
		if(instance == null)
		{
			instance =new DocumentManager();
		}
		return instance;
	}
	public static void setInstance(DocumentManager instance) {
		DocumentManager.instance = instance;
	}
	public Element getBook() {
		return book;
	}
	public void setBook(Element book) {
		this.book = book;
	}
	

}
