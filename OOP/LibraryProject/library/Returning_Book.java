package bootcamp.oop.basic.library;


public class Returning_Book extends Book
{
	//constructor	
		public Returning_Book(int bookTypeIndex, String title, int quantity, String authorName, String gender)
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
			String msgStr = super.reading_toString();
			msgStr += String.format("Thanks for return the book back! \n\n");	
			return msgStr;
		}
		
		public void setQuantity()
		{
			this.quantity+=1;
		}
		
		public void approach()
		{
			setQuantity();
		}

}
