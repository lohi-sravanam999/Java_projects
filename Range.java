class Range 
{
	public static void main(String[] args) 
	{ 
		int count=0;
		for(int i=10;i<=30;i++){
			if(i%2==1){
				int k=i;
				while(k!=0){
				 int res=k%10;
				if(res==2){
					count++;
				}
				k=k/10;
				}
			
			}
		}
		

		System.out.println(count);
			
		
	}
}
