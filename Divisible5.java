class Divisible5 
{
	public static void main(String[] args) 
	{
		int m=1,n=20,sum=0;
		for(int i=m;i<=n;i++){
			if(i%5==0){
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
	}
}
