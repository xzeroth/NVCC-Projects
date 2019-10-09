
public class Album {
	
	private String name;
	private String artist;
	//private String songs;
	private String [] songNameArray;
	private int [] songTimeArray;
	private int numberOfSongs;
	private int runningTime;
	
	public Album() {
		name = "";
		artist = "";
		//songs = "";
		songNameArray = new String[20];
		songTimeArray = new int[20];
		runningTime = 0;
		numberOfSongs = 0;
	}
	
	public void addSong(String songName, int songTime) {
		
		songNameArray[numberOfSongs] = songName;
		songTimeArray[numberOfSongs] = songTime;
		numberOfSongs += 1;
		
//		if(songTime > 0) {
//			songs = songs + "\n" + songName;
//			runningTime = songTime + runningTime;
//		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongs() {
		String songs = "";
		for(int i = 0; i < numberOfSongs; i++) {
			songs = songs + "\n" + songNameArray[i];
		}
		
		return songs;
	}

	public String getSongsTime() {
		String songsTime = "";
		for(int i = 0; i < numberOfSongs; i++) {
			songsTime = songsTime + "\n" + songTimeArray[i];
		}
		return songsTime;
		
	}
	
	public String getSongNameAndTime() {
		String songTimeName = "";
		for(int i = 0; i < numberOfSongs; i++) {
			songTimeName = songTimeName + "\n" + songNameArray[i] + "  " + songTimeArray[i];
		}
		
		return songTimeName;
	}
	
//	public void setSongs(String songs) {
//		this.songs = songs;
//	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

}
