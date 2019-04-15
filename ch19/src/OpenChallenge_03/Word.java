package OpenChallenge_03;

public class Word implements Comparable<Word> {
	private String word;
	private String count;
	
	public Word(String word, String count) {
		this.word = word;
		this.count = count;
	}
	public void setWord(String word) {
		this.word = word;
	}

	public void setCount(String count) {
		this.count = count;
	}
	
	public String getWord() {return word;}

	public String getCount() {return count;}

	@Override
	public int compareTo(Word o) {
		if ( count.compareTo(o.getCount()) > 0 ) return 1;
		if ( count.compareTo(o.getCount()) < 0 ) return -1;
		return word.compareTo(o.getWord());
	}

}
