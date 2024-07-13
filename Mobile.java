public class Mobile{
	private String mobileOwnerName;
	private String mobileNumber;
	private double mobileBalance ;
	private String mobileOSName;
	private boolean lock ;



	public Mobile(){
		
	}
	
	public Mobile(String mobileOwnerName,String mobileNumber,double mobileBalance,
					String mobileOSName,boolean lock ){
						
					setMobileOwnerName(mobileOwnerName);
					setMobileNumber(mobileNumber);
					setMobileBalance(mobileBalance);
					setMobileOSName(mobileOSName);
					setLock(lock);
					}
					
						
	public void setMobileOwnerName(String mobileOwnerName){
		
				this.mobileOwnerName=mobileOwnerName;
				}
	public String getMobileOwnerName(){
				return mobileOwnerName;
				}



	public void setMobileNumber(String mobileNumber){
				this.mobileNumber=mobileNumber;
				}
	public String getMobileNumber(){
				return mobileNumber;
				}					
		

	public void setMobileBalance(double mobileBalance)
				{
				this.mobileBalance=mobileBalance;
				}
	public double getMobileBalance(){
				return mobileBalance;
				}

	
	public void setMobileOSName(String mobileOSName){
				this.mobileOSName=mobileOSName;			
				}
	public String getMobileOSName()
				{
				return mobileOSName;
				}

	public void setLock(boolean lock)
				{
				this.lock=lock;
				}
	public boolean Lock()
				{
				return lock;
				}
	
	
	
	
	public void showDetails()
		{
			System.out.println("Owner Name 	:"+mobileOwnerName);
			System.out.println("Phone Number    :"+mobileNumber);
			System.out.println("Currient balance:"+mobileBalance);
			System.out.println("Mobile Brand    :"+mobileOSName);
			System.out.println("Lock Status     :"+(lock? "Loked":"Unloked"));
			
			
		}
	
	
	public void recharge(int amount)  {
	
        this.mobileBalance += amount;
		
		System.out.println("New Balance	:" + mobileBalance);
		
    }
	
	//Took some idea about logic from some website
	
	 public float adjustAfterCall(float timeDuration, float costPerMinute) {
        if(!lock)
		{
			float callCost = timeDuration * costPerMinute;
        mobileBalance -= callCost;
        System.out.println("Call Cost	: " + callCost);
        System.out.println("Adjusted Balance after Call: " + mobileBalance);
        return callCost;
		}
    
	else {
				System.out.println("Unlock the phone");
				return 0.0f;
			
			}

	 }
	 
	 }
    
		          
	             
              
                  
                  