

public class A {

	public String solution(String s)
	{
		char c=s.charAt(0);
		
		if ((int)c >= 65 && (int)c <=90) 
			return "upper";
		else if ((int)c >= 97 && (int)c <=122) 
			return "lower";
		else if((int)c >= 48 && (int)c <=57) 
			return "digit";
		else
			return "Not Valid";
				
				
	}
	public static void main(String[] st)
	{
		A ob=new A();
		System.out.println(ob.solution("@hgkj"));
				
	   
	}
	
}
