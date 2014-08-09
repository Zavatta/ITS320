public class PolyMain  
{   
	public static void main(String [] args)    
	{     
		Book [] library = new Book [5];      
		library[0] = new Novel("Jaws", 300, 15);     
		library[1] = new Almanac("New World ", 100, 50);     
		library[2] = new Novel("Animal Farm", 250, 9); 
		library[3] = new Phone("Dex", 500, 100);
		listBooks(library);    
	}     
	static void listBooks(Book [] library)    
	{     
		for (int i = 0; i < library.length && library[i] != null; i++)       
		library[i].print();    
	}     
} 
