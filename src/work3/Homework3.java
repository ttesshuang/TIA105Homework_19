package work3;

import java.util.Scanner;

//題目1：使用者輸入三角形的三個邊長，由系統判斷是哪一種三角形
public class Homework3 {
	public static void main(String[] args) {
		int i=0, j=0, k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入第一個數字： ");	
		if(sc.hasNextInt()) {
			i = sc.nextInt();
		}
		System.out.println("請輸入第二個數字： ");	
		if(sc.hasNextInt()) {
			j = sc.nextInt();
		}
		System.out.println("請輸入第三個數字： ");	
		if(sc.hasNextInt()) {
			k = sc.nextInt();
		}
		
		if(i!=0&&j!=0&&k!=0) {
			if(i==j&&j==k) {
				System.out.println("正三角形");
				}
			
			if(i==j||i==k||j==k) {
				System.out.println("等腰三角形");
			}
			
			if(i!=j && i!=k && j !=k) {
				System.out.println("其他三角形");
			}
			
			if(i*i==j*j+k*k|| j*j==i*i+k*k||k*k==i*i+j*j) {
				System.out.println("直角三角形");
			}
		}
		else {
			System.out.println("不是三角形");
		}	
	}
}


//題目2：設計一隻程式,會亂數產生一個 0~9 的數字,玩猜數字遊戲

//public class Homework3 {
//	public static void main(String[] args) {
//		int i, j=0;
//		i=(int)(Math.random()*10)+0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("猜猜看答案是什麼？（一個個位數字）： ");	
//		if(sc.hasNextInt()) {
//			j = sc.nextInt();
//		}
//		
//		outer:
//		while(j!=i) {
//			System.out.println("猜錯囉！再猜一次： ");
//			Scanner sc2 = new Scanner(System.in);
//			if(sc2.hasNextInt()) {
//				j = sc2.nextInt();
//				continue outer;
//				}
//			}		
//		  while(j==i) {	
//			System.out.println("猜對囉！答案就是" +i);	
//			break;
//			}
//		}
//}

//題目3：阿文很喜歡簽大樂透(1~49),但他是個善變的人,他想要依心情決定討厭哪個數字,
//請設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數:
//
//public class Homework3 {
//	public static void main(String[] args) {
//		int x=0;
//			
//		System.out.println("請輸入你討厭的數字");
//		Scanner sc = new Scanner(System.in);
//		if(sc.hasNextInt()) {
//			x = sc.nextInt();
//		}
//		
//		int sum=0;
//		for(int i=0; i<=4; i++) {
//			for(int j=0; j<=9; j++) {
//				if(j!=x &&i!=x&& i+j!=0) {
//					System.out.print(i+""+j+"\t");
//					sum = sum+1;
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("總共有 "+sum+" 個數字可以選！");
//	}
//	
//}

			


	
	

	

		
