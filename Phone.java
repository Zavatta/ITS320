public class Phone extends Book  
{   
	private int yellowPages, whitePages; 
	public Phone(String title, int yellowPages, int whitePages)    
	{     
		super(title, pages);     
		this.yellowPages = yellowPages;   
		this.whitePages = whitePages;
		pages = whitePages + yellowPages;
	}    
	public void print()    
	{     
		super.print();     
		System.out.println("and " + yellowPages + " yellow pages" + whitePages + "white pages");   
	} 
} 
