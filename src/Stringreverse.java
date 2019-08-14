//Write a program to reverse a String with recursive algorithm?


public class Stringreverse
{ public static String reverseString(String str){
	   
    if(str.isEmpty()){
       return str;
    } else {
       return reverseString(str.substring(1))+str.charAt(0);
    }}

	public static void main(String[] args)
	{

		String str = "Rupsa"; 
		
        Stringreverse obj= new Stringreverse(); 
        obj.reverseString(str); 
    }     
	}


