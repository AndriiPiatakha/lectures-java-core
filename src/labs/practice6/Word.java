package labs.practice6;


/**
 * Represent one word and describe it by its string representation
 * and frequency of appearing in text.
 * 
 * Implements Comparable interface and define compereTo() method.
 * Ready for using in sorted containers.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Word implements Comparable<Word>{
	
	/**
	 * String representation of word entity.
	 */
	private String word;
	
	/**
	 * Frequency of appearing in the text.
	 */
	private int frequency;
	
	/**
	 * Word length.
	 */
	private int wordLength;
	
	/**
	 * Public constructor.
	 * 
	 * @param word - value of string type.
	 * @param frequency - int type value.
	 */
	public Word(String word, int frequency) {
		this.word = word;
		this.frequency = frequency;
	}
	
	/**
	 * Another constructor which takes only one string as a parameter.
	 * 
	 * @param word string type word.
	 */
	public Word(String word ) {
		this.word = word;
		wordLength = word.length();
	}
	
	/**
	 * Indicates whether some other object is "equal to" this one.
     * 
     * The method implements an equivalence relation
     * on non-null object references.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (frequency != other.frequency)
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	
	
	/**
	 * Overrides method from the Comparable interfaces.
	 * Sorting Word entities by their frequency, and after by their string.
	 */
	@Override
	public int compareTo(Word otherWord) {
		int result = otherWord.frequency - this.frequency;
		if (result == 0) {
			result = this.word.compareTo(otherWord.word);
		}
		return result;
	}
	
	/**
	 * Overrides to String method.
	 * 
	 * Word string representation as it specified in the task.
	 */
	@Override
	public String toString() {
		return word;
	}
	
	/**
	 * Returns word field.
	 * 
	 * @return string
	 */
	public String getWord() {
		return word;
	}

	/**
	 * Returns frequency field.
	 * 
	 * @return int type value
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * Returns wordLength field.
	 * 
	 * @return int type value
	 */
	public int getWordLength() {
		return wordLength;
	}

}
