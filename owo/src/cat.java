import java.util.Scanner;

public class cat
{
	public static void main(String[] args)
	{
		int cat = 0;
		int dog = 0;
		while(true)
		{
			float x = (float)Math.random() * 2 - 1;
			float y = (float)Math.random() * 2 - 1;
			
			if(x * x + y * y < 1 )
			{
				cat++;	
			}
			
			System.out.println((float)cat / (float)dog * 4.0f + "["  + dog + "]");
			
			dog++;
		}
	}
}	



//		Scanner scanner = new Scanner(System.in);
//		
//		int day = scanner.nextInt();
//		
//		switch(day)
//	{
//		case 1:
//			System.out.println("wear new clothes");
//			break;
//		case 2:
//			System.out.println("hungry");
//			break;
//		case 3:
//			System.out.println("climb mountains");
//			break;
//		case 4:
//			System.out.println("watch TV");
//			break;
//		case 5:
//			System.out.println("dance");
//			break;
//		case 6:
//			System.out.println("go to happy");
//			break;
//	}
		
		/*if(day == 1)
		{
			System.out.println("wear new clothes");
		}
		else if(day == 2) 
		{
			System.out.println("hungry");
		}
		else if(day == 3)
		{
			System.out.println("climb mountains");
		}
		else if(day == 4)
		{
			System.out.println("watch TV");
		}
		else if(day == 5)
		{
			System.out.println("dance");	
		}
		else if(day == 6)
		{
			System.out.println("go to happy");
		}*/