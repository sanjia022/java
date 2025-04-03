package stringFunctions;

public class StringFunctions1 {

	public static void main(String[] args) {
		// chatAt function: Gives you the value or character of that indexing position
		
		String name = new String("Sanjia");
		//Or you can also write this way: String name = "sanjia"
       System.out.println( name.charAt(4));
       
       //Contains function check if your string contain certain sequence of character or not
       
       String country = "It is Bangladesh";
       System.out.println(country.contains("is"));
       
       //equalIgnorCase will ignore the case
       
       boolean value = name.equalsIgnoreCase("sanjia");
       System.out.println(value);
       
       //endWith will check if the string end with something specific
       
       System.out.println(country.endsWith("es"));
       
       // length function will give you the length of the string
       
       System.out.println((name.length()));
       System.out.println((country.length()));
       
       //indexCharOf() functions will give you index position of your given character
       
       
       //substring with one parameter will give you the all the characters from the index position you wants to from
       
       String name1 = name.substring(1);
       System.out.println(name1);
       
       //Substring with two parameter will give you character of the index position and end with the position you are given -1
       System.out.println(country.substring(0, 7));// it will start from 0 indexing and end at 6 indexing
       
       //TouppperCase and toLowerCase 
       
       System.out.println(country.toUpperCase());
       
       //isEmpty will check is your string is empty or have data or not 
       System.out.println(country.isEmpty());
       
	}

}
