
public class Driver {

	public static void main (String [] args) 
	{
		
		//product means stationary products.
		Product p1 = new Product ("LovingHome", "Pen", "MONAMI", 3);
		Product p2 = new Product ("SARASA", "Pen", "Zebra",5);
		Product p3 = new Product ("OFFICE PENCIL", "Pencil", "DONG-A",1);
		Product p4 = new Product ("OFFICE ERASER", "Eraser", "DONG-A",2);
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		
		p1.iswritingImplement();
		p4.iswritingImplement();
	
		
	}
	
}
