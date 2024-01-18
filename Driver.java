import java.util.ArrayList;
import java.util.Scanner;

interface Regi//interface//abstraction
{
	void login();
}
class Registration implements Regi
{
	String username="admin";
	String password="admin";
	public void login()//polymorphism
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your username ");
		String un=sc.next();
		System.out.println("Enter your password ");
		String pw=sc.next();
		
		if(un.equals(this.username) && pw.equals(this.password))
		{
			System.out.println("you are successfully logged in ");
			
			System.out.println("**********************************");
		}
		
		else
		{
			System.out.println("Not Successfully ");
			System.out.println("//////////////////////");
			login();
		}
		
	}
}
class BankDetails
{
	String Branch;
	String IFSC;
	
	
	BankDetails(String Branch,String IFSC)
	{
		this.IFSC=IFSC;
		this.Branch=Branch;
	}
	@Override
	public String toString()//toString()
	{
		System.out.println("IFSC :"+IFSC);
		System.out.println("Branch :"+Branch);
		return " " ;
	}
}
class Bank 

{
	String Fname;
	String Lname;
	long contact;
	int Date;
	private long accNo;//abstraction
	
	int f;
	String name;
	int amt;
	
   static//static block
   {
	   System.out.println();
	   System.out.println("********************WELCOME TO SBIBANK********************");
	   System.out.println();
	   System.out.println("   ================How may I help you===============  ");
	   System.out.println();
    
   }
  
   
   public void contact()
	{
		try{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the  contact number");
		contact=obj.nextLong();
		if(contact>999999999l && contact<10000000000L)
		{
			this.contact=contact;
		}
		else
		{
			System.out.println("Enter the 10 digit contact number");
			contact();
		}
		}
		catch(Exception a)
		{
			System.out.println("Something went wrong ");
		}
	}
	public long getAccNo()
	{
		return accNo;
	}
	public void accNo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Account Number ");
		accNo=sc.nextLong();
		if(accNo>999999999l && accNo<10000000000L)
		{
			this.accNo=accNo;
		}
		else
		{
			System.out.println("Enter the valid Account Number ");
			System.out.println();
			accNo();
		}
	}
	public void ATMPIN()
	{
		Scanner sc5=new Scanner(System.in);
		int ATMPIN=sc5.nextInt();
		if(ATMPIN>999 && ATMPIN<10000)
		{
			System.out.println("Inserted  pin number is verified.. ");
			System.out.println("****************************************************");
			
					
		}
		else
		{
			System.out.println("Inserted ATM pin is not valid  ");
			System.out.println("/////////////////////////////////");
			System.out.println("Please enter the valid ATM Pin ");
			System.out.println();
			ATMPIN();
		}
	}
	//public static void 
   
	
   public static void mainBank()
    {
		
        System.out.println("Choose from below... ");
		System.out.println();
		System.out.println("Press 1 to CREATE ACCOUNT ....");
		System.out.println("====================================");
		System.out.println("Press 2 to WITHDRAW MONEY....");
		System.out.println("====================================");
		System.out.println("Press 3 to DEPOSIT MONEY ..");
		System.out.println("====================================");
		System.out.println("Press 4 for BANK DETAILS ..");
		System.out.println("====================================");
		
		System.out.println("Press 5 to EXIT ");
		System.out.println("====================================");
		CreateAcc c=new CreateAcc();
		Withdraw w=new Withdraw ();
		Deposit de=new Deposit ();
		Regi r=new Registration();//upcasting
		BankDetails bd=new BankDetails("SBIN0017611","Mulund East");
		Scanner sc=new Scanner(System.in);
		int i;
		i=sc.nextInt();
		switch(i)
		{
			case 1:System.out.println("YOU ARE SELECTED FOR CREATING ACCOUNT ");
			System.out.println("=======================================================================================");
			System.out.println("Are you sure ? ");
			System.out.println();
			System.out.println("If YES then press 1 ");
			System.out.println("If NO then press any number ");
			
			Scanner sc1=new Scanner(System.in);
			
			int n;
			n=sc1.nextInt();
			switch(n)
			{
				case 1:System.out.println("Selected for creating account ");
				System.out.println("========================================");
				System.out.println("which type of account you want to open ");
				System.out.println("-------------------------------------------");
				System.out.println("enter 1 for saving account ");
				System.out.println("===========================");
				System.out.println("enter 2 for current account ");
				System.out.println("===========================");
				System.out.println("enter 3 for salary account ");
				System.out.println("===========================");
				System.out.println("enter 4 for NRI account ");
				System.out.println("===========================");
				System.out.println("enter 5 to go back ");
				System.out.println("===========================");
				System.out.println("enter 6 to Exit");
				
				Scanner scan=new Scanner(System.in);
				int inp=scan.nextInt();
				switch(inp)
				{
					case 1:System.out.println("You have opted for savings account");
					System.out.println("***************************************");
					System.out.println("Are you sure ? ");
					System.out.println();
					System.out.println("If YES then press 1 ");
					System.out.println("If NO then press any number ");
					
					Scanner sc12=new Scanner(System.in);
					
					int n1;
					n1=sc1.nextInt();
					if(n1==1)
					{
						c.AccKholo();
						System.out.println();
						System.out.println("Please submit below documents ");
						System.out.println();
						System.out.println("1 :Copy of PAN Card");
						System.out.println("2 :Aadhaar card");
						System.out.println();
						System.out.println("THANK YOU !!!!!");
						
						System.out.println("YOUR ACCOUNT HAS BEEN CREATED SUCCESSFULLY ....");
						System.out.println("************************************************");
						System.out.println("Your username is [admin] and password is [admin] ");
						System.out.println();
						System.out.println("Do you want to continue ");
						System.out.println(".........................");
						System.out.println("Enter 1 to continue ");
						System.out.println("Enter any key to stop ");
						try{
						Scanner scanner=new Scanner(System.in);
						int inpu=scanner.nextInt();
						if(inpu==1)
						{
							System.out.println();
							mainBank();
						}
						else{
							
						}
						}catch(Exception exp)
						{
							System.out.println("Something went wrong.....");
						}
					}
					else{
						mainBank();
					}
					break;
					case 2:System.out.println("You have opted for current account");
					System.out.println("***************************************");
					System.out.println("Are you sure ? ");
					System.out.println();
					System.out.println("If YES then press 1 ");
					System.out.println("If NO then press any number ");
						
					Scanner sc13=new Scanner(System.in);
					
					int n2;
					n2=sc1.nextInt();
					if(n2==1)
					{
						c.AccKholo();
						System.out.println("Please submit below documents ");
						System.out.println();
						System.out.println("1 :Copy of PAN Card");
						System.out.println("2 :Passport");
						System.out.println("3 :Driving License");
						System.out.println("4 :Voter ID card ");
						System.out.println("5 :Aadhaar card");
						System.out.println("6 :GST certificate AND License of Registration under any specific Statute");
						System.out.println();
						System.out.println("THANK YOU !!!!!");
						System.out.println("YOUR ACCOUNT HAS BEEN CREATED SUCCESSFULLY ....");
						System.out.println("************************************************");
						System.out.println("Your username is [admin] and password is [admin] ");
						System.out.println();
						System.out.println("Do you want to continue ");
						System.out.println(".........................");
						System.out.println("Enter 1 to continue ");
						System.out.println("Enter any key to stop ");
						Scanner scann=new Scanner(System.in);
						int co=scann.nextInt();
						if(co==1)
						{
							System.out.println();
							mainBank();
						}
						else
						{}
					}
					else
					{
						mainBank();
					}
					break;
					case 3:System.out.println("You have opted for Salary account");
					System.out.println("***************************************");
					System.out.println("Are you sure ? ");
					System.out.println();
					System.out.println("If YES then press 1 ");
					System.out.println("If NO then press any number ");
					
					Scanner sc14=new Scanner(System.in);
					
					int n4;
					n4=sc1.nextInt();
					if(n4==1)
					{
						c.AccKholo();
						System.out.println("Please submit below Documents : ");
						System.out.println();
						System.out.println("1 :Copy of PAN Card");
						System.out.println("2 :OfferLetter");
						System.out.println("3 :Proof of Employment / Service Certificater");
						System.out.println("4 :Latest Salary slip");
						System.out.println();
						System.out.println("THANK YOU !!!!!");
						System.out.println("YOUR ACCOUNT HAS BEEN CREATED SUCCESSFULLY ....");
						System.out.println("************************************************");
						System.out.println("Your username is [admin] and password is [admin] ");
						System.out.println();
						System.out.println("Do you want to continue ");
						System.out.println(".........................");
						System.out.println("Enter 1 to continue ");
						System.out.println("Enter any key to stop ");
						Scanner ss=new Scanner(System.in);
						int st=ss.nextInt();
						if(st==1)
						{
							System.out.println();
							mainBank();
						}
						else{}
					}
					else{
						mainBank();
					}
					break;
						
						case 4:System.out.println("You have opted for NRI account");
						System.out.println("***************************************");
						System.out.println("Are you sure ? ");
						System.out.println();
						System.out.println("If YES then press 1 ");
						System.out.println("If NO then press any number ");
							
						Scanner sc15=new Scanner(System.in);
						
						int n5;
						n5=sc15.nextInt();
						if(n5==1)
						{
							c.AccKholo();
							System.out.println("Please submit below Documents : ");
							System.out.println();
							System.out.println("1 :Passport");
							System.out.println("2 :PAN Card ");
							System.out.println("3 :VISA ");
							System.out.println();
							System.out.println("THANK YOU !!!!!");
							System.out.println("YOUR ACCOUNT HAS BEEN CREATED SUCCESSFULLY ....");
							System.out.println("************************************************");
							System.out.println("Your username is [admin] and password is [admin] ");
							System.out.println();
							System.out.println("Do you want to continue ");
							System.out.println(".........................");
							System.out.println("Enter 1 to continue ");
							System.out.println("Enter any key to stop ");
							Scanner scanne=new Scanner(System.in);
							int ch=scanne.nextInt();
							if(ch==1)
							{
								System.out.println();
								mainBank();//recursion
							}
							else{}
						}
						else
						{
							mainBank();
						}
					break;
					case 5:mainBank();
					break;
					case 6:System.exit(0);
					break;
					default:System.out.println("Please enter valid input ");
					System.out.println();
					mainBank();
					break;
				}
				
				break;
				default:System.out.println();
				System.out.println("Ok !! Now you can select again ");
				System.out.println("///////////////////////////////////");
				mainBank();
				break;
			}
			break;
			
			case 2:System.out.println("YOU  HAVE OPTED FOR WITHDRAW MONEY ");
			System.out.println("=============================================");
			System.out.println("Are you sure ? ");
			System.out.println();
			System.out.println("If YES then press 1 ");
			System.out.println("If NO then press any number ");
			
			Scanner sc2=new Scanner(System.in);
			
			int m;
			m=sc2.nextInt();
			switch(m)
			{
				case 1:System.out.println("Selected for Withdraw Money ");
						System.out.println("==============================");
						System.out.println("Select your Account Type.... ");
						System.out.println("------------------------------");
						System.out.println("Enter 1 for Saving Account ");
						System.out.println("===========================");
						System.out.println("Enter 2 for Current Account ");
						System.out.println("===========================");
						System.out.println("Enter 3 for Salary Account ");
						System.out.println("===========================");
						System.out.println("Enter 4 for NRI Account ");
						System.out.println("===========================");
						System.out.println("Enter 5 to Exit ");
						System.out.println("===========================");
						
						Scanner scan =new Scanner(System.in);
						int input=scan.nextInt();
						if(input==1 )
						{
							System.out.println("Are you sure ? ");
							System.out.println();
							System.out.println("If YES then press 1 ");
							System.out.println("If NO then press any number ");
								
							Scanner sc13=new Scanner(System.in);
							
							int n2;
							n2=sc13.nextInt();
							if(n2==1)
							{
								r.login();
								System.out.println();
								w.WithdrawAmount();
								System.out.println("THANK YOU!!!!!!!!!!!! ");
							}
							else
							{
								mainBank();
							}
							
						}
						else if(input==2)
						{
							System.out.println("Are you sure ? ");
							System.out.println();
							System.out.println("If YES then press 1 ");
							System.out.println("If NO then press any number ");
							Scanner sc12=new Scanner(System.in);
							int n3;
							n3=sc12.nextInt();
							if(n3==1)
							{
								r.login();
								System.out.println();
								w.WithdrawAmount();
								System.out.println("THANK YOU!!!!!!!!!!!! ");
							}
							else
							{
								mainBank();
							}
						}
						else if(input==3)
						{
							System.out.println("Are you sure ? ");
							System.out.println();
							System.out.println("If YES then press 1 ");
							System.out.println("If NO then press any number ");
								
							Scanner sc14=new Scanner(System.in);
							
							int n4;
							n4=sc14.nextInt();
							if(n4==1)
							{
								r.login();
								System.out.println();
								w.WithdrawAmount();
								System.out.println("THANK YOU!!!!!!!!!!!! ");
							}
							else
							{
								mainBank();
							}
						}
						else if(input==4)
						{
							System.out.println("Are you sure ? ");
							System.out.println();
							System.out.println("If YES then press 1 ");
							System.out.println("If NO then press any number ");
								
							Scanner sc15=new Scanner(System.in);
							
							int n5;
							n5=sc15.nextInt();
							if(n5==1)
							{
								r.login();
								System.out.println("****************************************************");
								w.WithdrawAmount();
								System.out.println("THANK YOU!!!!!!!!!!!! ");
							}
							else
							{
								mainBank();
							}
						}
						else if(input==5)
						{
							System.out.println("Are you sure ? ");
							System.out.println();
							System.out.println("If YES then press 1 ");
							System.out.println("If NO then press any number ");
								
							Scanner sc11=new Scanner(System.in);
							
							int n1;
							n1=sc11.nextInt();
							if(n1==1)
							{
								System.exit(0);
								System.out.println("THANK YOU!!!!!!!!!!!! ");
							}
							else
							{
								mainBank();
							}
						}
						else{
							System.out.println("Please enter valid input ");
							System.out.println("////////////////////////////////");
							mainBank();
						}
				break;
				default:System.out.println("Ok !! Now you can select again ");
				System.out.println("/////////////////////////////////////////");
				mainBank();
				break;
			}
			break;
			
			case 3:System.out.println("You have opted for DEPOSIT MONEY ");
			System.out.println("=========================================");
			System.out.println("Are you sure ? ");
			System.out.println();
			System.out.println("If YES then press 1 ");
			System.out.println("If NO then press any Key ");
			
			Scanner sc9=new Scanner(System.in);
			
			int o=sc9.nextInt();
			switch(o)
			{
				case 1:System.out.println("You have opted for DEPOSIT MONEY ");
						System.out.println("====================================");
						System.out.println("Select your Account Type.... ");
						System.out.println("------------------------------");
						System.out.println("Enter 1 for Saving Account ");
						System.out.println("===========================");
						System.out.println("Enter 2 for Current Account ");
						System.out.println("===========================");
						System.out.println("Enter 3 for Salary Account ");
						System.out.println("===========================");
						System.out.println("Enter 4 for NRI Account ");
						System.out.println("===========================");
						System.out.println(" Enter 5 to Exit ");
						System.out.println("===========================");
						
						Scanner scan =new Scanner(System.in);
						int input=scan.nextInt();
						if(input==1 )
						{
							r.login();
							System.out.println();
							de.depo();
							System.out.println("THANK YOU!!!!!!!!!!!! ");
						}
						else if(input==2)
						{
							r.login();
							System.out.println();
							de.depo();
							System.out.println("THANK YOU!!!!!!!!!!!! ");
						}
						else if(input==3)
						{
							r.login();
							System.out.println();
							de.depo();
							System.out.println("THANK YOU!!!!!!!!!!!! ");
						}
						else if(input==4)
						{
							r.login();
							System.out.println();
							de.depo();
							System.out.println("THANK YOU!!!!!!!!!!!! ");
						}
						else if(input==5)
						{
							System.exit(0);
						}
						else{
							System.out.println("Please enter valid input ");
							System.out.println("///////////////////////////////");
							mainBank();
						}
						
						
				break;
				default:System.out.println("Ok !! Now you can select again ");
				System.out.println("////////////////////////////////////////");
				mainBank();
				break;
			}
			
			break;
			case 4:System.out.println("You have selected the option BANK DETAILS");
			System.out.println("==================================================");
			Bank ban=new Bank();
			System.out.println("Are you sure ? ");
			System.out.println();
			System.out.println("If YES then press 1 ");
			System.out.println("If NO then press any Key ");
			
			Scanner sco=new Scanner(System.in);
			int INT=sco.nextInt();
			if(INT==1)
			{
				r.login();
				ban.accNo();
				System.out.println("Account number is verified ");
				System.out.println("****************************************************");
				System.out.println();
				System.out.println("Here is your Bank details");
				System.out.println("...................................");
				System.out.println("...................................");
				bd.toString();
				ArrayList ar=new ArrayList();
				ar.add("Account Holder Name:"+"Chandani");
				
				ar.add("Account Phone No.:"+"1112223334");
				ar.add("Account Balance:"+"Chandani");
				System.out.println(ar);
				System.out.println();
				System.out.println("THANK YOU!!!!!!!!!!!! ");
				System.out.println();
				System.out.println("Do you want to continue ");
				System.out.println(".........................");
				System.out.println("Enter 1 to continue ");
				System.out.println("Enter any key to stop ");
				try{
				Scanner scanne=new Scanner(System.in);
				int ch=scanne.nextInt();
				if(ch==1)
				{
					System.out.println();
					mainBank();//recursion
				}
				else{}
				}catch(Exception exp)
				{
					System.out.println("Something went wrong ....");
					
				}
				
			}
			else
			break;
			case 5:System.exit(0);
			break;
			default:System.out.println("Please enter valid input ");
			System.out.println("////////////////////////////////////");
			mainBank();
			break;	 
		}
    } 
}

class  CreateAcc extends Bank
{
		
		String Age;
		String emailId;
		String Add;
		String nominee;
		
	public void AccKholo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Fname");
		Fname=sc.next();
		System.out.println("Enter the Lname");
		Lname=sc.next();
		System.out.println("Enter the Age");
		Age=sc.next();
		contact();
		System.out.println("Enter your emainId ");
		emailId=sc.next();
		System.out.println("Enter your Address ");
		Add=sc.next();
		System.out.println("Enter your Nominee Name ");
		nominee=sc.next();
		
    }
	
}
class Withdraw extends Bank
{
	long amt;
	int ATMPIN;
	private long Bal=5000;
	public long getBal()
	{
        return Bal;
    }
	public void setBal()
	{
		this.Bal=Bal;
	}
	public void WithdrawAmount()
	{
		System.out.println("How do you want to withdraw money ?");
		System.out.println("--------------------------------------");
		System.out.println("Press 1 to use an ATM ");
		System.out.println("========================================");
		System.out.println("Press 2 to Write a Cheque for Cash ");
		System.out.println("========================================");
		System.out.println("Press 3 to use Withdrawal Slip ");
		System.out.println("========================================");
		System.out.println("Press 4 to go back ");
		System.out.println("========================================");
		System.out.println("Press 5 to Exit");
		System.out.println("========================================");
		Scanner sc4=new Scanner(System.in);
		int j= sc4.nextInt();
		switch(j)
		{
			case 1:System.out.println("You have selected the option ATM ");
			System.out.println("========================================");
				System.out.println("Are you sure ? ");
				System.out.println();
				System.out.println("If YES then press 1 ");
				System.out.println("If NO then press any number ");
						
				Scanner sc7=new Scanner(System.in);
				int k;
				k=sc7.nextInt();
				switch(k)
				{
					case 1:System.out.println("Selected for using ATM ");
					System.out.println("========================================");
					System.out.println("Insert your ATM CARD ");
					System.out.println("........................");
					System.out.println("Insert your 4 digit ATM Pin ");
					ATMPIN();
					System.out.println();
					validAmount();
					System.out.println("Do you want to continue ");
					System.out.println();
					System.out.println("Enter 1 to continue ");
					System.out.println("Enter any key to stop ");
					System.out.println();
					Scanner wi=new Scanner(System.in);
					int wit=wi.nextInt();
					if(wit==1)
					{
						WithdrawAmount();//recursion
					}
					else
					break;
					default:System.out.println("Ok !! Now you can select again ");
					System.out.println();
					WithdrawAmount();
					break;
				}
			break;
			case 2:System.out.println("you are selected for using Cheque for Cash ");
				System.out.println("======================================================");
				System.out.println("Are you sure ? ");
				System.out.println();
				System.out.println("If YES then press 1 ");
				System.out.println("If NO then press any number ");
					
				Scanner sc8=new Scanner(System.in);
				int b;
				b=sc8.nextInt();
				switch(b)
				{
				case 1:System.out.println("Selected for using Cheque ");
					System.out.println("==================================");
					System.out.println("Do you have Cheque ");
					System.out.println("...........................");
					System.out.println("If YES then press 1 ");
					System.out.println("If NO then press any number ");
						
					Scanner sc=new Scanner(System.in);
					int z;
					z=sc.nextInt();
					switch(z)
					{
						case 1:System.out.println("It means you have cheque ");
							System.out.println();
							ABC();
							System.out.println("Do you want to continue ");
							System.out.println();
							System.out.println("Enter 1 to continue ");
							System.out.println("Enter any key to stop ");
							System.out.println();
							Scanner wi=new Scanner(System.in);
							int wit=wi.nextInt();
							if(wit==1)
							{
								WithdrawAmount();//recursion
							}
							else
						break;
						default:System.out.println("SORRY!!! You are not able to withdraw money by using cheque ...");
								System.out.println("/////////////////////////////////////////////////////////////////");
								WithdrawAmount();
						break;
					}
				break;
				default:System.out.println("Ok !! Now you can select again ");
				System.out.println("///////////////////////////////////////////////////");
				WithdrawAmount();
				break;
				}
			break;	 
			case 3:System.out.println("you are selected for using Withdrawal Slip ");
			System.out.println("======================================================");
				
				System.out.println("Here is your Withdrawal Slip ");
				System.out.println();
				System.out.println("Please enter necessary information ");
				System.out.println();
				ABC();
				System.out.println("Do you want to continue ");
				System.out.println();
				System.out.println("Enter 1 to continue ");
				System.out.println("Enter any key to stop ");
				System.out.println();
				Scanner wi=new Scanner(System.in);
				int wit=wi.nextInt();
				if(wit==1)
				{
					WithdrawAmount();//recursion
				}
				else
			break;
			case 4:mainBank();
			break;
			case 5:System.exit(0);
			break;
			default:System.out.println("Please enter valid input ");
				System.out.println();
				WithdrawAmount();
			break;	 
		}
	}
	
	public void ABC()
	{
		accNo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Fname ");
		Fname=sc.next();
		System.out.println("Enter the  Lname ");
		Lname=sc.next();
		System.out.println("Date ");
		Date=sc.nextInt();
			
		validAmount();
				
	}
	
	public void validAmount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the amount to be withdraw: ");
		amt=sc.nextInt();
		
        if(Bal < amt)
        {
            System.out.println("Insufficient Balance");
			System.out.println("//////////////////////");
        }
		else
		{
            Bal = (Bal - amt);
			System.out.println();
            System.out.println("Please Collect your " + amt +" Rupees");
            System.out.println();
            System.out.println("Available Balance: " +getBal());
            System.out.println("...................................");
    	}
		
	}	
}

class Deposit extends Bank
{
	private long Bal =5000;
	public long getBal()
	{
        return Bal;
    }
	public void setBal()
	{
		this.Bal=Bal;
	}
	Bank bank=new Bank();
	public void depo()
	{
		System.out.println("Select how  do you want to deposit money ");
		System.out.println("=========================================");
		System.out.println("Press 1 to choose Deposit slip  ");
		System.out.println("=========================================");
		System.out.println("Press 2 to use CASH DEPOSITE MACHINE(CDA) ");
		System.out.println("=========================================");
		System.out.println("Press 3 to go back ");
		System.out.println("=========================================");
		System.out.println("Press 4 to Exit ");
		System.out.println("=========================================");
		
		
		Scanner ab=new Scanner(System.in);
		f=ab.nextInt();
		if (f==1)
		{
			System.out.println("You have selected to use DEPOSIT SLIP  ");
			System.out.println("=========================================");
			
			System.out.println("Are you sure ? ");
			System.out.println();
			System.out.println("If YES then press 1 ");
			System.out.println("If NO then press any key");
			Scanner aw=new Scanner(System.in);
			int v=aw.nextInt();
			if(v==1)
			{
				System.out.println("you are using Deposit Slip ");
				System.out.println("=========================================");
				System.out.println("Here is your Deposit Slip  ");
				System.out.println();
				System.out.println("Please enter necessary information ");
				System.out.println();
				accNo();
				System.out.println("Enter your name ");
				name=ab.next();
				System.out.println("Date ");
				Date=ab.nextInt();
				Data();
				System.out.println("Do you want to continue ");
				System.out.println();
				System.out.println("Enter 1 to continue ");
				System.out.println("Enter any key to stop ");
				System.out.println();
				Scanner Di=new Scanner(System.in);
				int Dip=Di.nextInt();
				if(Dip==1)
				{
					depo();//recursion
				}
				else{
				}
			}
			else
			{
				System.out.println("Ok !! Now you can select again ");
				System.out.println("//////////////////////");
				depo();
			}
		}

		else if(f==2)
		{
			System.out.println("You have selected to use CASH DEPOSITE MACHINE(CDM)");
			System.out.println("====================================================");
			System.out.println("Press 1 to Deposit Cash in CDM with Card  ");
			System.out.println("=========================================");
			System.out.println("Press 2 to Deposit Cash in CDM without Card ");
			System.out.println("=========================================");
			System.out.println("Press 3 to go back" );
			System.out.println("=========================================");
			System.out.println("Press 4 to Exit ");
			System.out.println("=========================================");
			Scanner sca=new Scanner(System.in);
			int a=sca.nextInt();
			switch(a)
			{
				case 1:System.out.println("Deposit Cash in CDM with Card  ");
				System.out.println("=========================================");
				System.out.println("Are you sure ? ");
				System.out.println();
				System.out.println("If YES then press 1 ");
				System.out.println("If NO then press any key");
				Scanner aw=new Scanner(System.in);
				int v=aw.nextInt();
				if(v==1)
				{
					System.out.println("Insert your Debit Card ");
					System.out.println();
					System.out.println("Insert your 4 digit ATM Pin ");
					ATMPIN();
					System.out.println();
					System.out.println("Insert the cash into machine's designated slot");
					System.out.println();
					Data();	
					System.out.println("Do you want to continue ");
					System.out.println();
					System.out.println("Enter 1 to continue ");
					System.out.println("Enter any key to stop ");
					System.out.println();
					Scanner Di=new Scanner(System.in);
					int Dip=Di.nextInt();
					if(Dip==1)
					{
						depo();//recursion
					}
					else{
					}
				}
				else
				{
					depo();
				}
				break;
				case 2:System.out.println("Deposit Cash in CDM without Card ");
					System.out.println("=========================================");
					System.out.println("Are you sure ? ");
					System.out.println();
					System.out.println("If YES then press 1 ");
					System.out.println("If NO then press any key");
					Scanner ad=new Scanner(System.in);
					int d=ad.nextInt();
					if(d==1)
					{
						accNo();
						contact();
						System.out.println("Insert the cash into machine's designated slot");
						System.out.println();
						Data();
						System.out.println("Do you want to continue ");
						System.out.println();
						System.out.println("Enter 1 to continue ");
						System.out.println("Enter any key to stop ");
						System.out.println();
						Scanner Di=new Scanner(System.in);
						int Dip=Di.nextInt();
						if(Dip==1)
						{
							depo();//recursion
						}
						else{
						}
					}
					else{
						depo();
					}
				break;
				case 3:bank.mainBank();
				break;
				case 4:System.exit(0);
				break;
				default:System.out.println("Please enter the valid input");
						System.out.println("//////////////////////");
						depo();
				break;
				
			}
		}
		else if(f==3)
		{
			bank.mainBank();
		}
		else if(f==4)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Please enter valid input ");
			System.out.println("/////////////////////////////");
			depo();
		}
	}
	
	public void Data()
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to be deposited: ");
        amt = sc.nextInt();
		
        if(amt<=0)
        {
            System.out.println("Invalid Deposit Amount");
			System.out.println("//////////////////////");
            Data();
           
        }
		else
		{   
			
			Bal = Bal + amt;
			System.out.println("The machine will count and verify the cash");
			System.out.println("-------------------------------------------");
			System.out.println("Amount deposited Successfully");
			System.out.println("*********************************************");
			System.out.println("Total Balance: " +getBal());
			//System.out.println("THANK YOU!!!!!!!!!!!! ");
        }
        	
	}
	
}
class Driver
{	
    public static void main(String args[])
	{
		Bank b=new Bank();
		System.out.println("See you soon");
		{//non static block
			System.out.println("  ...Following are the services which is provided here... ");
		}
		System.out.println("...........................................................		");
		
		b.mainBank();
	

    }
}
