

public class Start {
	public static void main (String [] args)
	{

		
	Mobile mobile1= new Mobile("Fahad Ahmed","01312172324",230,"Apple SE 2020",false);
	mobile1.showDetails();
	mobile1.recharge(100) ;
	mobile1.adjustAfterCall(5f,1.2f);
	
	Mobile mobile2= new Mobile("Karim","0177777777",70,"Apple 11",true);
	mobile2.showDetails();
	mobile2.recharge(50) ;
	mobile2.adjustAfterCall(4f,0.89f);
	
	Mobile mobile3= new Mobile("Rahim","0199999999",130,"Xiomi note 9",false);
	mobile3.recharge(75) ;
	mobile3.adjustAfterCall(1f,0.22f);
	
	
	}	
}
