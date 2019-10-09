package randomTests;

import java.util.Stack;


public class Dinglemouse {
	
	public static void main(String[] arg) {
		
		char[][] house = {
			      "  o                o        #######".toCharArray(),
			      "###############             #     #".toCharArray(),
			      "#             #        o    #     #".toCharArray(),
			      "#  X          ###############     #".toCharArray(),
			      "#                                 #".toCharArray(),
			      "###################################".toCharArray()
			    };
		
	    char[][] house2 = {
	    	      "#################             ".toCharArray(),
	    	      "#     o         #   o         ".toCharArray(),
	    	      "#          ######        o    ".toCharArray(),
	    	      "####       #                  ".toCharArray(),
	    	      "   #       ###################".toCharArray(),
	    	      "   #                         #".toCharArray(),
	    	      "   #                  X      #".toCharArray(),
	    	      "   ###########################".toCharArray()
	    	    };
	    char[][] house3 = {
	          "o                             ".toCharArray(),
	          "############                  ".toCharArray(),
	          "#          #                  ".toCharArray(),
	          "#          #      ############".toCharArray(),
 	          "#          #      #          #".toCharArray(),
	          "############      #     X    #".toCharArray(),
	          "                  #          #".toCharArray(),
	          "                  ############".toCharArray(),
	          "          o                   ".toCharArray()
	                                          
	    };
	    char[][] house4 = {
	    		"################################".toCharArray(),
	    		"#     o                        #".toCharArray(),
	    		"#                              #".toCharArray(),
	    		"#   ########################   #".toCharArray(),
	    		"#   #                      #   #".toCharArray(),
	    		"#   #                      #   #".toCharArray(),
	    		"#   ########################   #".toCharArray(),
	    		"#                              #".toCharArray(),
	    		"#              X               #".toCharArray(),
	    		"################################".toCharArray()
	    };
	    
	    char[][] house5 = {
	    	  "############                  ".toCharArray(),
	    	  "#     o    #                  ".toCharArray(),
	    	  "#   o      #      ############".toCharArray(),
	    	  "#          #      #          #".toCharArray(),
	    	  "############ o    #     X    #".toCharArray(),
	    	  "                  #          #".toCharArray(),
	    	  "                  ############".toCharArray(),
	    	  "            o                 ".toCharArray()
	    	                                
	    };

		for(int k = 0 ; k < house4.length ; k ++) {
			System.out.println(house4[k]);
		}
		
		System.out.println(allAlone(house4));

		
		
//		boolean check = false;
//		for(int i = 1 ; i < house.length- 1 ; i++) {
//			for(int j = 1 ; j < house[i].length -1; j++) {
//				if(house[i-1][j-1] == '#' && house[i-1][j] == '#' && house[i][j] != '#') {
//					if(house[i][j] == 'o') {
//						return false;
//					}
//					
//					house[i][j] = '#';
//				}
//				System.out.print(house[i][j]);
				
				
//			}
//			System.out.println();
//		}
	
	
//	for(int t = 0 ; t < house.length ; t++) {
//		System.out.println(house[t]);
//	}
	
	}
	public static boolean allAlone(char[][] house) {
		// Your code here

		
		for(int i = 1 ; i < house.length- 1 ; i++) {
			for(int j = 1 ; j < house[i].length -1; j++) {
				if(house[i-1][j-1] == '#' && house[i][j-1] == '#' && house[i-1][j] == '#' && house[i][j] != '#') {
					if(house[i][j] == 'o') {
						for(int k = 0; k < house.length ; k++) {
							System.out.println(house[k]);
						}
						return false;
					}
					house[i][j] = '#';
				}
			}
		}
		for(int k = 0; k < house.length ; k++) {
			System.out.println(house[k]);
		}
		return true;
	}

	
}