package Third.JavaLearning.JavaLearning;

public class MaxNumInArray {

	public static void main(String[] args) {
		int[][] a = { { 2, 4, 5 }, 
					  { 3, 4, 7 }, 
					  { 11, 2, 1 } };
		int min = a[0][0];
		int maxcol = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] <= min) {
					min = a[i][j];
					maxcol = 0;
					for (int k = 0; k < a.length; k++) {
						if (a[k][j] >= maxcol) {
							maxcol = a[k][j];
						}
					}
				}
			}
		}
		System.out.println("Min num is: " + min);
		System.out.println("MaxCOl num is: " + maxcol);
	}

}
