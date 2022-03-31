package stringEx;
public class Stringex {
public static void main(String[] args) {
	      //  0123456789
	String s="hddfgdrtre";
	String s1=new String("abcdefdghd");
	String s2="hcdef";
	System.out.println("length is "+s.length());
	System.out.println("fetch a desired character at a location "+s.charAt(4));
	System.out.println("fetch index of the character "+s.indexOf('d'));
	System.out.println("fetch last index of the character "+s.lastIndexOf('d'));
	System.out.println("convet to uppercase "+s.toUpperCase());//lowercase
	System.out.println("substring model 1 is "+s.substring(3));
	System.out.println("substring model 2 is "+s.substring(3,8));
	System.out.println("equals "+s.equals(s1));
	System.out.println(s.hashCode()+"  "+s1.hashCode()+" "+(s==s1));
	//s<s1->-ve  s>s1->+ve value s==s1 0
	System.out.println("comparision of strings "+s.compareTo(s2));
	System.out.println("concatenation "+s.concat(s1));//s+s1
	
	String s3="abcd-efg-fij";
	System.out.println("splitting");
	String l[]=s3.split("-");
	for(String f:l) {
		System.out.println(f);
	}
	
	String s4=" abcdef  ";
	System.out.println("trimming is -"+s4.trim());
	
	
	//Conversions
	int a=1;
	String c=a+"";
	String c1=String.valueOf(a);
	String c2=Integer.toString(a);
	
	
}
}




