
public class CompactDisc {
	
	private String artist;
	private String album;
	private String language;
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String toString() {
		return String.format("Artist: %s\nAlbum: %s\nLanguage: %s\n", artist, album, language);
	}

}
