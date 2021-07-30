package examples;

interface Calculator{
	 /* 1. no arg method
	  void switchOn();*/
	  
	 /* 2. with arg.
	  void sum(int input);*/
	
	 // 3.with return Type
	  int substract(int i1,int i2);
}

/* Traditional method:
 * 
   public class CalculatorImpl implements Calculator{

	@Override
	public void switchOn() {
		 System.out.println("Switch-On");		
	}
	
	public static void main(String[] args) {
		
	    CalculatorImpl cal = new CalculatorImpl();
	                   cal.switchOn();	
    }
}
*/
public class CalculatorImpl {
	
	public static void main(String[] args) {
		
/*	1.LambdaExpression 
        Calculator calculator = () -> 
                                System.out.println("Switch-On Chandana");
		           calculator.switchOn();
*/
/*  2.LambdaExpression
		Calculator calculator = (input) ->
			                    System.out.println("Sum :"+ input);
		            calculator.sum(238);
*/	
//  3.LambdaExpression
	   Calculator calculator = (i1,i2)->
			                     i2-i1;
        //Calculator calculator = (i1,i2)-> { return (i2-i1); };
		                                  
		          System.out.println(calculator.substract(12, 21));
		          }
}


