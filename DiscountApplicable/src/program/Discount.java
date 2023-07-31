package program;
import java.util.Scanner;

	public class Discount {
	
    public static void main(String []args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter PurchaseAmount");
    double purcahseAmount=scan.nextDouble();
    checkDiscount(purcahseAmount);

	}
    public static void checkDiscount(double purchaseAmount)
    {
	if(purchaseAmount>100)
	{
	System.out.println("Discount Applicable");
	}
	else
    {
    System.out.println("Discount Not Applicable");

	}

	}
	}
