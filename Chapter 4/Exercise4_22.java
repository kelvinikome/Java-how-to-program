class Exercise4_22{
	public static void main (String [] args){
		System.out.println("N\t10*N\t1000*N");
		for (int i=1;i<6;i++){
			int n10 = i * 10;
			int n1000 = i * 1000;
			System.out.println(i+"\t"+n10+"\t"+n1000);
		}
	}
}