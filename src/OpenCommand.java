
public class OpenCommand implements Command{
	public  void execute() {
		// TODO Auto-generated method stub
		JSONBuilder("book.json");
		Builder.buildPart();
		Element book=Builder.getResult();
		DocumentManager.getInstance().getBook();
		
		
	}
	

	private static void JSONBuilder(String string) {
		// TODO Auto-generated method stub
		
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
