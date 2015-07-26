package sortingNSearching;

import java.util.BitSet;

public class   Bitset {

	public static void main(String[] args) {
		BitSet bs = new BitSet();
		int arr[] = {5,3,9,3,7,8};
		
		for(int i = 0  ; i < arr.length ; ++i)
			if(bs.get(arr[i]))
				System.out.println(arr[i] + " is already present ");
			else
				bs.set(arr[i]);
	}

}
