import java.util.*;

class Small_calculator{
	
	public static void main(String[] args){
			
			Scanner input  = new Scanner(System.in);
			
			System.out.print("Enter a First Number : ");
			double num1 = input.nextDouble();
			
			System.out.print("Enter Operator (+, -, *, /): ");
			char operator = input.next().charAt(0);
			
			System.out.print("Enter a Second Number : ");
			double num2 = input.nextDouble();
			
			double result;
			
			switch(operator){
					case '+':
						result = num1 + num2;
						System.out.println("Result : "+ result);
						break;
						
					case '-':
						result = num1 - num2;
						System.out.println("Result : "+ result);
						break;
						
					case '*':
						result = num1 * num2;
						System.out.println("Result : "+ result);
						break;
						
						
					case '/':
						if(num2 == 0){
								System.out.println("Error: Cannot divide by Zero!");
								break;
						}else{
								result = num1 / num2;
								System.out.println("Result : "+ result);
								
						}
						break;
					
					default:
						System.out.println("Invalid Operator! Try again....");
			}
			
		input.close();
	}
		
		
	
}
