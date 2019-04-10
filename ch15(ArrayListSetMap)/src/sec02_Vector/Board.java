package sec02_Vector;

public class Board {
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {	//방법1
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override	//방법2
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
