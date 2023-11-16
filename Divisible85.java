class Divisible85 
{
	public static void main(String[] args) 
	{
		int divisor=5,dividend=85,quotient=0;
		while(dividend>=divisor){
	    dividend=dividend-divisor;
			quotient++;
		}	
		System.out.println(quotient);
		
	}
}
