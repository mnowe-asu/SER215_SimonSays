import java.util.ArrayList;
/**
 * Sequence determines which sequence the user will have to complete each round.
 *
 * @author 
 * @version 1.0
 */
public class Sequence {
	 private ArrayList<Integer> sequence = new ArrayList<Integer>();
	 private int[] key;
	 private int round = 1;
	 
    /**
     * Constructor for the Sequence class
     * @param int[] key a pattern to continuously repeat
     */
	 public Sequence(int[] key) {
		 this.key = key;
	 }
	 
    /**
     * Returns the size of the sequence, which should be equivalent to the number of rounds.
     * @return int number of elements in the sequence
     */
	 public int getSize() {
		 return sequence.size();
	 }
	 
    /**
     * Creates a new sequence for the user to follow during this round.
     * This adds elements of the key in order n many times. n = number of rounds
     */
	 public void startNextRound() {
		 int index = 0;
		 for(int i = 0; i < round; i++) {
			 sequence.add(key[index]);
			 index++;
			 if(index >= key.length)
				 index = 0;
		 }
		 round++;
	 }
	 
    /**
     * Returns a string of all elements within the sequence
     * @return String of all elements within sequence
	 */
	 public String toString() {
		 String result = "";
		 for(int i = 0; i < sequence.size(); i++) {
			 result += sequence.get(i) + " ";
		 }
		 return result;
	 }
	
	 // FOR CLASS TESTING PURPOSES ONLY
	 private void setRound(int round) {
		 this.round = round;
	 }
	 
	 public static void main(String[] args) {
		 // creates a key 1 to 5, then prints out the first round.
		 // then changes the round to 10 and prints out the sequence
		 int[] testKey = {1,2,3,4,5};
		 Sequence pattern = new Sequence(testKey);
		 pattern.startNextRound();
		 System.out.println(pattern.toString()); // should print 1
		 pattern.setRound(10);
		 pattern.startNextRound();
		 System.out.println(pattern.toString()); // should print 1 1 2 3 4 5 1 2 3 4 5
	 }
}
