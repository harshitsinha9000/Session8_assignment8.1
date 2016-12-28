
//assignment 1 
class BankATMException extends Exception
{
	double balance;
	String s;
	public BankATMException(double d) {
		// TODO Auto-generated constructor stub
		balance = d;
		System.out.println("Balance amount is account can not be less than 10,000");
		}
	
	public String toString()
	{
		return null;
	}
	
}	
class bankAtm
{
	private int atmId;
	private String bankName;
	private String location;
	private double balance;
	
	
	public int getAtmId() {
		return atmId;
	}
	public void setAtmId(int atmId) {
		this.atmId = atmId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	void withdraw(double amt) throws BankATMException
	{
		if((this.balance-amt)<10000)
		{
			throw new BankATMException(this.balance-amt); 
		}
		else
		{
			this.balance=this.balance-amt;
		}
		
	}
	
	void deposit(double amt)
	{
		this.balance = this.balance + amt;
		System.out.println("updated amount is = "+this.balance);
	}
}


public class mainclass {

	public static void main(String[] args) throws BankATMException {
		// TODO Auto-generated method stub
		bankAtm ba1 = new bankAtm();
		bankAtm ba2 = new bankAtm();
		bankAtm ba3 = new bankAtm();
		
		ba1.setAtmId(1001);
		ba1.setBankName("SBI");
		ba1.setLocation("abc location");
		ba1.setBalance(100000);
		
		ba2.setAtmId(1002);
		ba2.setBankName("ICICI");
		ba2.setLocation("def location");
		ba2.setBalance(100000);
		
		ba3.setAtmId(1001);
		ba3.setBankName("CITIBANK");
		ba3.setLocation("ghi location");
		ba3.setBalance(100000);
		
		ba1.withdraw(90000);
		System.out.println("current balance ="+ba1.getBalance());
		
		ba1.deposit(60000);
		System.out.println("current balance ="+ba1.getBalance());
		
		ba1.withdraw(67000);
		System.out.println("current balance ="+ba1.getBalance());
	}

}
