
public class StaticVisitor implements Visitor {
	
	private int nrTabele = 0;
    private int nrParagrafe = 0;
    private int nrImagini = 0;
    private int nrSectiuni = 0;
    

	
	  public int getNumarTabele()
	    {
	        return nrTabele;
	    }
	    
	    public int getNumarParagrafe()
	    {
	        return nrParagrafe;
	    }
	    
	    public int getNumarImagini()
	    {
	        return nrImagini;
	    }
	    
	    public int getNumarSectiuni()
	    {
	        return nrSectiuni;
	    }

	@Override
	public void visitimagineProxy(ImageProxy img) {
		System.out.println(img);
		 nrImagini++;
		
	}

	@Override
	public void visitImagine(Imagine img) {
		System.out.println(img);
		 nrImagini++;
		
	}

	@Override
	public void visitParagraf(Paragraf parag) {
		System.out.println(parag);
		nrParagrafe++;
		
	}

	@Override
	public void visitTabel(Tabel tabl) {
		System.out.println(tabl);
		nrTabele++;
		
	}

	@Override
	public void visitSectiune(Sectiune sect) {
		System.out.println(sect);
		 nrSectiuni++;
		
	}

	public void printStatistics() {
		// TODO Auto-generated method stub
		
	}
	
	

}
