package lab_6;

public class Sorting {
	public static void selectionSort(Comparable[] list) {
		int max;
		Comparable temp;
		
		for(int index = 0; index < list.length-1; index++) {
			max = index;
			
			for (int scan = index + 1; scan < list.length; scan++) {
				if (list[scan].compareTo(list[max]) < 0) {
					max = scan;
				}
			}
				
				temp = list[max];
				list[max] = list[index];
				list[index] = temp;
		}
	}
}
