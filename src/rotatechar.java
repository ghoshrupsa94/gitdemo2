
public class rotatechar 
{
	public static String reverseString(String str)
	{
		return reverseString(str.substring(1))+str.charAt(0);
		
	}
	public static void main(String[] args)
	{
		
String str="Rupsa";
rotatechar rc = new rotatechar();
rc.reverseString(str); 





	}

}
