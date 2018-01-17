
public class NextCommand implements Command{
	public void execute() {
		
		System.out.println("Start");
		// TODO Auto-generated method stub
		Element book=new Sectiune("book");
		book.addElement(new Paragraf("par 1"));
		book.addElement(new Paragraf("par 2"));
		book.print();
		
		DocumentManager.getInstance().setBook(book);
	
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
	
	

}
