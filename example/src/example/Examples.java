package example;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%s%8s%n,", "index", "Value");
		int []array = {10, 29, 48, 70, 39};
		for(int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

	}

}
