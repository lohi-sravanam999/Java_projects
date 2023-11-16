class Largeseven 
{
	public static void main(String[] args) 
	{
		int a=20,b=15,c=35,d=20,e=17,f=60,g=80;
		String res=((a>b&&a>c&&a>d&&a>e&&a>f&&a>g)?"a is largest":((b>c&&b>d&&b>e&&b>f&&b>g)?"b is largest":((c>d&&c>e&&c>f&&c>g)?"c is largest":((d>e&&d>f&&d>g)?"d is largest":((e>f&&e>g)?"f is largest":((f>g)? " f is largest":"g is largest"))))));
		System.out.println(res);
	}
}