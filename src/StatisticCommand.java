
public class StatisticCommand implements Command{

	public  void execute() {
		// TODO Auto-generated method stub
		
		Element book=DocumentManager.getInstance().getBook();
		/*DpcumentStatic visitor=new DocumentStatic();
		  book.accept(Visitor);
		  Visitor.printStatic();
		 */
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
