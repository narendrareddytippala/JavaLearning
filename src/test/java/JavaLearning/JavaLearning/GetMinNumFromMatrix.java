package JavaLearning.JavaLearning;

public class GetMinNumFromMatrix {
		public static void main(String[] arg){
//			int num [][] = {{7,8,7},
//							{6,5,11},
//							{11,25,10}};
			int num[][]={{1,2,3},
					   {4,8,6},
					   {11,15,19}};
			int smallnum=num[0][0];
			int maxnum=0;
			for(int i=0; i<3;i++){
				for(int j=0; j<3;j++){
					System.out.print(num[i][j]);
					System.out.print("\t");
					if(num[i][j]<=smallnum){
						maxnum=0;
						smallnum=num[i][j];
						for(int k =0;k<3;k++){
							if(num[k][j]>=maxnum){
								maxnum=num[k][j];
							}
						}
					}
				}
				System.out.println();
			}
			System.out.println(smallnum);	
			System.out.println(maxnum);	
		}
}