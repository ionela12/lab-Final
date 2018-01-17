
public class Test {
	
	public static void main(String []args) throws Exception 
		{
			/*
			Paragraf p2= new Paragraf("");
			Sectiune s =new Sectiune(null);
			s.addElement(p2);
			s.print();
			
		/*	Builder= build=new.JSONBuilder("book.json);
		 * builder.build();
		 * Element book=builder.getResult();
		 * book.print();
			
			Command OpenCommand= new OpenCommand();
			Command StatisticaCommand= new StatisticCommand();
			StatisticCommand.execute();*/
			
		Command com=new NextCommand();
		com.execute();
		Element book= DocumentManager.getInstance().getBook();
		book.print();
		Command delC=new DeleteCommand();
		delC.execute();
		book.print();
		
		Command undo= new UndoCommand();
		undo.execute();
		Element book1=DocumentManager.getInstance().getBook();
		book1.print();
		
		}
	 
	
	
	

}