package stringFunctions;

public class StringFunction2 {

	public static void main(String[] args) {
		//Trim function remove the extra space from string and ending of the string. Not from the middle of the string
   String a = "My name is Ishita      ";
   String b = "    my Name is ishita   ";
  
  
   System.out.println( a.trim());
   System.out.println( b.trim());
   
   //equalIgnoreCase function is use to compare two strings disprite of the case 
   
   String name = "sanjia";
   String name1 = "Sanjia";
   
   if(name.equalsIgnoreCase(name1)) {
	   System.out.println("They are same.");
	   
   }
   else {
	   System.out.println("They are different.");
   }
   
   //concat functions concat two strings
   String newName = name.concat(" Amreen");
   System.out.println(newName);
   
	}

}
