package Fourth.JavaLearning.JavaLearning.Array;

import org.omg.Messaging.SyncScopeHelper;

public class PrintNumberWithoutLoop {
	//static int i=1;
	public static void main(String[] args) {
//		count();
		count1(10);
	}
//	public static void count(){
//		if(i<=100){
//			System.out.println(i++);
//			count();
//		}
//	}

	private static void count1(int i) {
		if(i!=0){
			System.out.println(i);
			count1(i-1);
		}	
	}
}
