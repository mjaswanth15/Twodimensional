
public class Twodimensional {

	public static void main(String[] args) {
		int[][] array = {{0,1,2},
				         {3,4,5},
				         {6,7,8}};
		int[][] array2 = new int[2][2];
		array2[0][0]=1;
		array2[0][1]=11;
		array2[1][0]=111;
		array2[1][1]=1111;
			System.out.println("1. First type output");
			System.out.println(".........................");
			for(int i=0;i < array.length;i++) {
				for(int j=0;j < array.length;j++) {
					System.out.println(array[i][j]);
					}
				}
			System.out.println(".............................");
			System.out.println("2. Second type output");
			System.out.println("..............................");
			System.out.println("Number in array2 at [0][1] position is "+ array2[0][0]);
			System.out.println("Number in array2 at [0][1] position is "+ array2[0][1]);
			System.out.println("Number in array2 at [1][0] position is "+ array2[1][0]);
			System.out.println("Number in array2 at [1][1] position is "+ array2[1][1]);
			}
	}
