package work1;

//public class TestNineNine {
//	public static void main(String[] args) {
//	for (int i=1; i<= 9; i++) {
//		for (int j=1; j<=9; j++) {
//			System.out.print(i + "*" + j + "=" +  i*j+"\t" );
//		}
//	}
//  }
//}

public class TestNineNine {
	public static void main(String[] args) {
	int i, j=0;
	for ( i=1; i<= 9; i++) {
		while(j<=8) {
			j=j+1;
		    System.out.print(i + "*" + j + "=" +  i*j+"\t" );
		 }
	   }
     }
	}






// 建立99乘法表，分別使用以下三種回圈
//for + while
//for +do while
//while + do while