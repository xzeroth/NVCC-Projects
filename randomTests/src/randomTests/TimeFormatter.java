package randomTests;

public class TimeFormatter {
    
 
	public static void main(String[] args ) {
		
	
	formatDuration(68416919);
	
	}
	
	
	
	public static String formatDuration(int seconds) {
        // your code goes here
		
		String returnString = "";
		
		//year is = 31536000 seconds
		//day is = 86400 seconds
		//hour is = 3600 seconds
 		//minute is = 60 seconds
		//
		
		int year = 0;
		int day = 0;
		int hour = 0;
		int minute = 0;
		int second = 0;
		
//		if(seconds >= 31536000) {
//			year = seconds / 31536000;
//			seconds = seconds - (year * 31536000);
//		}
		
		year = seconds / 31535600;
		day = (seconds % 31536000) / 86400;
		hour = ((seconds % 31536000) % 86400) / 3600;
		minute = (((seconds % 31536000) % 86400) % 3600) / 60;
		second = ((((seconds % 31536000) % 86400) % 3600) % 60);
		
		if(year > 1) {
			returnString = returnString + 
		}
		return null;
		
		
    }
}