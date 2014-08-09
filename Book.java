public class Book  
{   
	private String title;     
	public int pages;    
	public Book(String title, int pages)    
	{     
		this.title = new String(title);      
		setPages(pages);   
	}    
	public void setPages(int pages)    
	{     
		this.pages = pages;   
	}    
	public int getPages()    
	{      
		return pages;    
	}    
	public void print()    
	{     
	System.out.println(title + " has " + pages + " pages");   
	} 
} 
