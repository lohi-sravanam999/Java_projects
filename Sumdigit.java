class Sumdigit
  
{
	public static void main(String[] args) 
	{
		int n=129,sum=0,count=0;
		while(count!=1){
			sum=0;
			count=0;
		while(n!=0){
			int r=n%10;
			sum=sum+r;
			n/=10;
			count++;
		}
		n=sum;
		}


		System.out.println(sum);
	}
}
