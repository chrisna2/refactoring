package code.refactoring.dataarrange_5;

//±¸Çö
public class MakeSentence {
	
	private String first_word;
	private String second_word;
	
	public MakeSentence(String first_word, String second_word) {
		this.first_word = first_word;
		this.second_word = second_word;
	}

	public void print() {
		System.out.println(first_word+" "+second_word);
	}
	

}
