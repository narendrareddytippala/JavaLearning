package Fourth.JavaLearning.JavaLearning.Array;

public class Find_Pair_with_givensum {

	public static void main(String[] args) {
		int a[]={10,20,30,40,50};
		int sum = 50;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==sum){
					System.out.println(a[i]+" + "+a[j]+" == "+sum);
				}
			}
		}
	}
}
