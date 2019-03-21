package OpenChallenge_01;

public class SongLyrics extends Song{
	String lyrics; 
	
	public SongLyrics(String title, String artist, String album, int track, int year, String composer, String lyrics) {
		super(title, artist, album, track, year, composer);
		this.lyrics = lyrics;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("가사");
		System.out.println(lyrics);
	}


	
}
