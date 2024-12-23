package work1;


//題目1：計算 12, 6 這兩個數值的和與積
public class Homework1 {
	public static void main(String[] args) {
		int a=12, b=6;
		int sum = a+b;
		int product = a*b;

		System.out.println("12和6的和是："+sum);
		System.out.println("12和6的積是："+product);

	}
}


//題目2：計算200顆蛋共是幾打、幾顆? 
//public class Homework1 {
//	public static void main(String[] args) {
//		int dozen, eggs;
//		dozen = 200/12;
//		eggs = 200 %12;
//		
//		System.out.println("200顆蛋是 "+dozen+" 打 "+eggs+" 顆");
//	}
//}


//題目3：算出 256559 秒為多少天、多少小時、多少分與多少秒
//public class Homework1 {
//	public static void main(String[] args) {
//		int totalSecond = 256559; // 總秒數
//		int daySecond = 60*60*24; // 一天等同於多少秒
//		int day= totalSecond/daySecond; // 256559 秒共是幾天 
//		int secondLeft = totalSecond%daySecond; // 256559 秒扣除天數後，還剩多少秒
//		
//		int hour = secondLeft/(60*60); //剩餘的秒數，換算成小時
//		secondLeft =  secondLeft%(60*60); //扣除小時後，還剩多少秒
//		
//		int minute = secondLeft/60; //剩餘的秒數，換算成分鐘
//		secondLeft =  secondLeft%60; //扣除分鐘後，還剩多少秒
//		
//		System.out.println("256559 秒總共是 "+day +" 天 "+ hour+" 小時 "+ minute+" 分 "+ secondLeft+" 秒");
//	
//	}
//}


//題目4：定義一個常數為 3.1415 (圓周率), 並計算半徑為 5 的圓面積與圓周長

//public class Homework1{
//	public static void main(String[] args) {
//		final double pi = 3.1415;
//		int radius = 5;
//		double circleArea = radius*radius*pi;
//		double circumFerence = radius*2*pi;
//		System.out.println("半徑為 5 的圓面積為"+ circleArea);
//		System.out.println("半徑為 5 的圓周長為"+circumFerence);
//		
//	}
//}



//題目5：某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢

//public class Homework1{
//	public static void main(String[] args) {
//		double total = 1500000;
//		
//		for(int i=1;i<=10;i++) {
//			total*=1.02;
//		}
//		
//		int result = (int) Math.floor(total);
//		System.out.println(result);
//	}
//}


//題目6：請寫一隻程式,利用System.out.println()印出以下三個運算式結果: 5 + 5 / 5 + ‘5’ / 5 + “5”
//
//public class Homework1{
//	public static void main(String[] args) {
//	            //  數字+字串+數字
//		System.out.println(5+"+"+5);
//		        // 數字+字串+字串
//		System.out.println(5+"+"+" \'5\' ");
//		       // 數字+字串+字串
//		System.out.println(5+"+"+"\"5\"");
//	}
//}




