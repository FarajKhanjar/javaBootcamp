package bootcamp.oop.basic.library;


public class Readable_Book extends Book  
{
	// field	
	

	//constructor	
		public Readable_Book(int bookTypeIndex, String title, int quantity, String authorName, String gender)
		{			
			super(bookTypeIndex, title, quantity, authorName, gender);
		}
		
		public void pringMsg()
		{
			String msg = ("");
		    System.out.print(msg+toString());
		}

		@Override
		public String toString() 
		{
			String msgStr = reading_toString();	
			return msgStr;
		}
		
		public void setQuantity()
		{
			this.quantity-=1;
		}
		
		public void approach()
		{
			super.reading_toString();
		}

}
