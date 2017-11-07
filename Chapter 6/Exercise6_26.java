class Exercise6_26{
	
	public static int reverseInt(int input){
		long reversedNum = 0;

		long input_long = input;

		while (input_long != 0)
		{
			reversedNum = reversedNum * 10 + input_long % 10;
			input_long = input_long / 10;
		}

		if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE)
		{
			throw new IllegalArgumentException();
		}
    return (int)reversedNum;
	}
	
	public static void main (String [] args){
		int c = 123456;
		System.out.println(reverseInt(c));	
	}
}
		