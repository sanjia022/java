package stringFunctions;

public class MatchesStringFunction3 {

	public static void main(String[] args) {
		
		//Matches function //(.*) in java is called multi characters search. And sigle character of search "."
		// the question is : find out the given is whetever start with r or not
		
		String name = "zaina shahreen";// remember to use lower case
		boolean answer = name.matches("z(.*)");
		System.out.println(answer);
		
		boolean answer1 = name.matches("..............");// single character search in java by single dot
		System.out.println(answer1);
		
		boolean answer2 = name.matches("(.*)s(.*)");
		System.out.println(answer2);
		
		String word = "Bangladesh";
		boolean answer3 = word.matches("(.*)r(.*)");
		System.out.println(answer3);
		
		String word2 = "italy";
		boolean answer4 = word2.matches("(.*)t(.*)");
		System.out.println(answer4);
	}

}
