public class SquareRunner{

	public static void main(String [] args){

		PerfectSquare printer = new PerfectSquare(){

			public boolean PerfectSquare(int number){

				int x = (int) Math.sqrt(number);
				if(Math.pow(x,2) == number)
					return true;
				else
					return false;

			}

		};

		System.out.println(printer.PerfectSquare(24));


	}

}