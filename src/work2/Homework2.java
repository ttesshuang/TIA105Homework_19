package work2;

////題目1：計算1~1000的偶數和
public class Homework2 {
	public static void main(String[] args) 	{
		int i=0;
		while(i<=998) {
			i+=2;
			System.out.println(i);
		}	
	} 
}

////題目2：計算1~10的連乘積（for迴圈）
//public class Homework2 {
//	public static void main(String[] args) {
//    int sum=1;
//    for(int i=1; i<=9;i++){
//    sum = sum*(i+1); 
//     }
//    System.out.println(sum);
//  }
//}


//題目3：計算1~10的連乘積（while迴圈）
//public class Homework2 {
//public static void main(String[] args)	{
//	int i=1;
//	int sum=1;
//	while(i<=9) {
//		sum = sum*(i+1); 
//		i+=1;
//	}	
//	System.out.println(sum);
//   }
//}

//題目4：設計一隻程式讓結果等於 1 4 9 16 25 36 49 64 81 100

//public class Homework2 {
//	public static void main(String[] args) {
//	int i=1;
//	int sum=1;
//	    while(i<=9) {
//	    sum=sum+(1+(i*2));
//	    System.out.println(sum);
//     	i=i+1;
//     	}
//	}
//}	

//// 題目5：大樂透
//01~49內，排除個位數與十位數為4的數字
//public class Homework2 {
//	public static void main(String[] args) {
//		int i,j;
//		for(i=0; i<=3; i++) {
//			for(j=0; j<=9; j++) {
//				if(j!=4 && i+j!=0) {
//					System.out.print (i+""+j+"\t");
//				}
//			}
//		 System.out.println();
//		}
//	}
//}



//題目6：製作數字三角形
//public class Homework2 {
//	public static void main(String[] args) {
//		for(int i=10; i>=1; i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//				}
//		System.out.println();
//		}
//	}
//}



//////題目7：製作英文三角形
//public class Homework2 {
//	public static void main(String[] args) {
//		char a=65;
//		for(int i=1; i<=6; i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(a);
//			}
//		System.out.println();
//		a+=1;
//		}
//	}
//}

	
