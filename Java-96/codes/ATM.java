import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("which bank's card is this?[1.SBI | 2.ICICI]: ");
		int cardType = sc.nextInt();

		Bank bank = null;

		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.err.println("Card Read Error ... Try Again");
				return;
		}

		System.out.println("\n============== WELCOME TO "+ bank.getClass().getName().toUpperCase()+" ==============\n");

		bank.deposit(1000);
		bank.withdraw(500);
	}
}
