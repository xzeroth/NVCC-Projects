package randomTests;



public class roman {

	public static void main(String[] arg) {
//		String x = "asdasdasdas";
//		x = x.toUpperCase();

		int[] test1 = new int[] {1,3};
		int a = test1.length;
		int[] test2 = new int[] {2 };
		int b = test2.length;
		int [] temp = new int[a+b];
		
		mergeArrays(test1,test2,a,b,temp);
		
//		for(int i : temp) {
//			System.out.println(i);
//		}
//		System.out.println();
		if(temp.length%2 != 0) {
			System.out.println();
			int o = temp[(a+b)/2];
			System.out.println(o);
		System.out.println();
		}
		int q = temp[(a+b)/2];
		int w = temp[((a+b)/2)-1];
		double e = q+w;
		double mid = e/2;
		
		System.out.println(mid);
		

	}

	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

// Store remaining elements of first array 
		while (i < n1)
			arr3[k++] = arr1[i++];

// Store remaining elements of second array 
		while (j < n2)
			arr3[k++] = arr2[j++];
	}

}
