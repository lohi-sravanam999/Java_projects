class Special 
{
	public static void main(String[] args) 
	{
		char ch='$';
		if(ch>='0'&&ch<='9'){
			System.out.println("it is not a special character"+  ch);
		}
		else {
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='z')){
		        System.out.println("it is not a special character"+  ch);
			}
			else{
				System.out.println("it is special character"+  ch);
			}
		}
	}
}
