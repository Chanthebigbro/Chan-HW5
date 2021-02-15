
public class Product 
{

	private int cost;
	private String manufacturer;
	private String type;
	private String productname;
	
	public Product(String productname, String type, String manufacturer, int cost) 
	{
		
		this.productname = productname;
		this.type = type;
		this.manufacturer = manufacturer;
		this.cost = cost;
		
	}
	
	
	void display()
	{
		System.out.format("The stationary name is %s %s and cost is $ %d. It made by %s company\n",this.productname, 
		this.type, this.cost, this.manufacturer);
		
	}
	
	void iswritingImplement()
	{
		if (this.type == "Pen")
		{
			System.out.println("Yes");
		}
		else if (this.type == "Pencil")
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
	
}
