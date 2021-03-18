package code00_06;
//ここからグレードアップ目指して始める
//今日の調子を調べるアプリ
//今朝までの睡眠時間




public class Tone {

	public static void main(String[] args) {
		int setting;
		System.out.println("睡眠時間を入力してください");

		int value = new java.util.Scanner(System.in).nextInt();

	 for(int i = 1 ; i < 25 ; i++) {
		 if(i < 2 &&  value == i ) {

			System.out.println("寝不足です");
			System.out.println("もっと睡眠を取りましょう");
			break;
		 } else if(i < 3 && value == i){
			 System.out.println("寝不足です");
			 System.out.println("もっと睡眠を取りましょう");
			 break;
		 } else if(i < 4 && value == i) {
			 System.out.println("寝不足です");
			 System.out.println("もっと睡眠を取りましょう");
			 break;
		 } else if(i < 5 && value == i) {
			 System.out.println("もう少し睡眠を取ろう");
			 break;
		 } else if(i < 6 && value == i) {
			 System.out.println("もう少し睡眠を取ろう");
			 break;
		 } else if(i < 7 && value == i) {
			 System.out.println("適切な睡眠時間です");
			 break;
		 } else if(i < 8 && value == i) {
			 System.out.println("適切な睡眠時間です");
			 break;
		 } else if(i < 9 && value == i) {
			 System.out.println("少し寝すぎています");
			 break;
		 } else if(i < 10 && value == i) {
			 System.out.println("少し寝すぎています");
			 break;
		 } else if(i < 11 && value == i ||  i < 12 && value == i ||
				 i < 13  && value == i|| i < 14 && value == i|| i < 15 && value == i||
				 i < 16 && value == i|| i < 17 && value == i || i <18 && value == i
				|| i < 19 && value == i || i < 20 && value == i || i < 21 && value == i ||
				i < 22 && value == i || i < 23 && value == i|| i < 24 && value == i||
				i < 25 && value == i ){
			 System.out.println("寝すぎです");
			 System.out.println("もっと早く起きる事をおすすめする");
			 break;
		 }else {
			 setting = value;
		 }




	 }
	//	setting = value;

	}

}
