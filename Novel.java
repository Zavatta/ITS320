public class Novel extends Book  
{   
	private int chapters;      
	public Novel(String title, int pages, int chapters)    
	{     
		super(title, pages);     
		this.chapters = chapters;   
	}    
	public void print()    
	{     
		super.print();     
		System.out.println("and " + chapters + " chapters");   
	} 
} 
