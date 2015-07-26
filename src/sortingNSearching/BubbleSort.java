package sortingNSearching;

public class BubbleSort {

	public static void main(String[] args) {
		int num[] = new int[10];
		for (int i = 0; i < num.length; ++i) {
			num[i] = (int) (Math.random() * 100);
		}

		// before sort
		System.out.println("Before sort : ");
		for (int i = 0; i < num.length; ++i)
			System.out.print (num[i] + " ");

		System.out.println("\n after sort : ");

		for (int passes = 1; passes < num.length; ++passes)
			for (int j = 0; j < num.length - passes ; ++j) {
				if(num[j] > num[j+1]  )
				{
					int temp = num[j];
					num[j] = num[j+1] ;
					num[j+1] = temp;
							
				}
			}
		
		for(int i= 0 ; i < num.length ; ++i)
			System.out.print(num[i] + " ");
	}

}
