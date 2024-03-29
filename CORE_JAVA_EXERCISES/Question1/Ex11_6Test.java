package Question1;

public class Ex11_6Test {
	public static void main(String[] args)

	{
		
    //initializing objects 
	Ex11_6 instanceA = new Ex11_6();
	Ex11_6 instanceB = new Ex11_6();

	instanceA.a = 8;   
	instanceB.b = instanceA.x;
	instanceA.x++;
	instanceB.a = 10;
	instanceB.c = 90;
	instanceB.x++;
	
	System.out.println("Printing values of all the instances ");
	System.out.println("Value of a instanceOf A"+instanceA.a);
	System.out.println("Value of b instanceOf A"+instanceA.b);
	System.out.println("Value of a instanceOf B"+instanceB.a);
	System.out.println("Value of b instanceOf B"+instanceB.b);
	System.out.println("Value of x instanceOf A"+instanceA.x);
	System.out.println("Value of x instanceOf B"+instanceB.x);

	}

}
