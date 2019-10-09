import java.util.Scanner;

public class AlbumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Album darkSideOfTheMoon = new Album();
		darkSideOfTheMoon.setName("Dark Side of The Moon");
		darkSideOfTheMoon.setArtist("Pink Floyd");
		darkSideOfTheMoon.addSong("Time", 6);
		darkSideOfTheMoon.addSong("Money", 4);
		
		System.out.println("Album name: " + darkSideOfTheMoon.getName());
		System.out.println("Artist name: " + darkSideOfTheMoon.getArtist());
		System.out.println("Songs: " + darkSideOfTheMoon.getSongs());
		System.out.println("Time per song: " + darkSideOfTheMoon.getSongsTime());
		System.out.println("Running time: " + darkSideOfTheMoon.getRunningTime());
		
//		System.out.println("name and time: " + darkSideOfTheMoon.getSongNameAndTime());
	}

}
