import static org.junit.Assert.*;

import org.junit.Test;

public class SortingTest {

	@Test
	public void test() {
		Sorting sorting = new Sorting();
		int[] arr = new int[] { 2, 1 };
		assertEquals(false, sorting.isSorted(arr));
		sorting.insertionSort(arr);
		assertArrayEquals(new int[] { 1, 2 }, arr);
		assertEquals(true, sorting.isSorted(arr));
		int[] arrForQuickSort = new int[] { 3,2, 1 };
		Sorting.quicksort(arrForQuickSort);
		assertArrayEquals(new int[] { 1, 2,3 }, arrForQuickSort);
		int [] arrForQuickSort2 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
		Sorting.quicksort(arrForQuickSort2);
		assertArrayEquals(new int[]{1, 2,3,4,5,6,7,8,9,10,11,12},arrForQuickSort2);
		int[] arrForSwap = new int[] { 2, 1 };
		Sorting.swap(arrForSwap, 0, 1);
		assertArrayEquals(new int[] { 1, 2 }, arrForSwap);
		Object object1 = new Object();
		Object object2 = new Object();
		Object[] arrForSwapReference = new Object[]{object1,object2};
		Sorting.swapReferences(arrForSwapReference, 0, 1);
		assertArrayEquals(new Object[]{object2, object1},arrForSwapReference);
	}

}
