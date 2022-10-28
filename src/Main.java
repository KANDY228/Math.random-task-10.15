public class Main {

	public static void main(String[] args) { 

		int n1 = getFirstPlayer(1,250,746);
		System.out.println(n1);
		int n2 = getSecondPlayer(1,250,746);
		System.out.println(n2);
		calculateNumberForFirstPlayer();
		if(n1>n2 ) {
			System.out.println("число= "+n1+" больше числа= "+n2);
		} else {
			System.out.println("число= "+n1+" меньше числа= "+n2);
		}
		
}
	public static int getFirstPlayer(int sizeOfAray, int n1, int n2) {	
		int firstPlayer= 0;
		sizeOfAray=1;
		int[] numbersAray;
		numbersAray = new int[sizeOfAray];
		for (int i = 0; i < numbersAray.length; i++) {
			numbersAray[i] = (int)(n1+(n2-n1)*Math.random());
			firstPlayer = 0+numbersAray[i];
		}
		return firstPlayer;	
	}
	public static int getSecondPlayer(int sizeOfAray, int n1, int n2) {
		int SecondPlayer= 0;
		sizeOfAray=1;
		int[] numbersAray;
		numbersAray = new int[sizeOfAray];
		for (int i = 0; i < numbersAray.length; i++) {
			numbersAray[i] = (int)(n1+(n2-n1)*Math.random());
			SecondPlayer = 0+numbersAray[i];
		}
		return SecondPlayer;	
	}
	public static void calculateNumberForFirstPlayer() {
		int c1 = getFirstPlayer(1,250,746)/100;
		int c2 = getFirstPlayer(1,250,746)/10%10;
		int c3 = getFirstPlayer(1,250,746)%10;
		int c4 = getSecondPlayer(1,250,746)/100;
		int c5 = getSecondPlayer(1,250,746)/10%10;
		int c6 = getSecondPlayer(1,250,746)%10;
		if(c1==c4||c2==c5||c3==c6) {
			System.out.println("цифры в числах равны");
		} 		
	}
}