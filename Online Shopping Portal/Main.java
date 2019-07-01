

public class Main{
	public static void main(String[] args) {
		//write the logic for the main function
		
		Customers C_Obj1 = new Customers(1001,"Saakshi",9000000000L,"Bangalore","16-Jul-1990","F","Laxme Kajal,Salwar");
		Customers C_Obj2 = new Customers(1008,"Rahul",9000000001L,"Chennai","27-Jan-1992","M","T-Shirt,Jeans");
		Suppliers S_Obj1 = new Suppliers(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75);
        Suppliers S_Obj2 = new Suppliers(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35);
        C_Obj1.displayDetails();
        C_Obj2.displayDetails();
        S_Obj1.displayDetails();
        S_Obj2.displayDetails();
        C_Obj1.editAddress("Coimbatore");
        S_Obj1.editAddress("Delhi");
       C_Obj1.placeOrder();
       S_Obj1.addStocks(5);
       
       S_Obj2.addStocks(10);
       
	}	
}

class Users {
	int id ;
	String name; 
	long mobileNumber;
	public void displayDetails()
	{
		System.out.println(this.name+", "+ this.mobileNumber);
	}
	//write the logic for the class Users	      
}

class Customers extends Users{
	String ShippingAddress ;
	String date_of_birth;
	String gender ;
	String order_history;
	
	public Customers(int id , String name,long mobileNumber,String ShippingAddress,String date_of_birth, String gender ,String order_history)
	{
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.ShippingAddress = ShippingAddress ;
		this.date_of_birth=date_of_birth;
		this.gender = gender ;
		this.order_history=order_history;
		
		
	}
	public void editAddress(String newAddress)
	{
	   System.out.println(this.name+", "+this.ShippingAddress);	
	   this.ShippingAddress = newAddress;
	   System.out.println(this.name+", "+this.ShippingAddress);	
	   
	}
	public void placeOrder()
	{
		System.out.println("Order placed successfully!");
		
	}
	
		//write the logic for the class Customers	
}

class Suppliers extends Users {
	String BillingAddress ;
	int Stocks;
	String paymentStatus ;
	double feedback;
	
	public Suppliers(int id , String name,long mobileNumber,String BillingAddress,int Stocks, String paymentStatus ,double feedback)
	{
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.BillingAddress = BillingAddress ;
		this.Stocks=Stocks;
		this.paymentStatus = paymentStatus ;
		this.feedback=feedback;
		
		
	}
	public void editAddress(String newAddress)
	{
	   System.out.println(this.name+", "+this.BillingAddress);	
	   this.BillingAddress = newAddress;
	   System.out.println(this.name+", "+this.BillingAddress);	
	   
	}
	public void addStocks(int Stocks)
	{
		this.Stocks = this.Stocks+Stocks;
		System.out.println(this.name +", "+this.Stocks);
		
	}
}