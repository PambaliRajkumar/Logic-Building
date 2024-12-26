import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {
		
		// lets say the text be "Hello world Hello"
		String text = "Hello world Hello";
		
		//converting string to array of words by splitting with space " "
		String[] words = text.split(" ");
		
		//creating empty HashMap to store key as String and value as repetition count
		Map<String,Integer> wordMap=new HashMap<>();
		
		// looping array of words
		for(String word:words) {
			
			/*
			 * hashMap.getOrDefault(word, 0)
			 * this above method returns the value for the mapped key,
			 * or defaultValue if this map contains no mapping for 
			 * the key.
			 */
			
			wordMap.put(word,wordMap.getOrDefault(word, 0)+1);
			
			
		}

		System.out.println(wordMap);
		
		//Output:: {world=1, Hello=2}
	}

}
