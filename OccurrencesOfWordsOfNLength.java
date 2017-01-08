import java.util.*;
public class OccurrencesOfWordsOfNLength {
	public static void main(String[] args){
		getUserInputString();
	}
	public static void getUserInputString(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String userInputString = sc.nextLine();
		sc.close();
		countOccurencesOfEachWord(userInputString);
	}
	public static void countOccurencesOfEachWord(String userInputString){
		String[] stringsToBeCounted = userInputString.split(" ");
		int longestString = getLongestString(stringsToBeCounted).length();
		int[] countOfLengths = new int[longestString];
		for(int i = 0; i <stringsToBeCounted.length;i++){
			int lengthOfCurrentString = stringsToBeCounted[i].length();
			countOfLengths[lengthOfCurrentString-1] +=1;
		}
		printOccurrences(countOfLengths);
	}
	public static String getLongestString(String[] splitString) {
	      int maxLength = 0;
	      String longestString = null;
	      for (String s : splitString) {
	          if (s.length() > maxLength) {
	              maxLength = s.length();
	              longestString = s;
	          }
	      }
	      return longestString;
	  }
	
	public static void printOccurrences(int[] countOfLengths){
		System.out.println("Word Length" + String.format("%30s","Occurrences"));
		for(int i = 0; i < countOfLengths.length;i++){
			System.out.println(i+1+String.format("%30s",countOfLengths[i]));
		}
	}
}
