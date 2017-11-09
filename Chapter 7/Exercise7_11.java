
class Exercise7_11{
	public static void main (String [] args){
		int [] counts = new int[10];
		int [] bonus = new int[15];
		int [] bestScores = new int[5];
		int pos = 0;

		for (int x : counts)
			counts[pos++] = 9;

		pos = 0;
		for (int x : bonus)
			bonus[pos++] += 1;

		pos = 0;
		for (int x : bestScores){
			bestScores[pos] += pos;
			System.out.print(bestScores[pos++]+"\t");
		}
			

		System.out.println("hey");
	}
}