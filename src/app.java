import java.util.Arrays;

public class app {

	public static void main(String[] args) {
	
		String[] case1;
		String[] result;
		
		case1 = "Hello 2 world :-)".split(" ");
		result = lessOrEqualThree(case1);
		System.out.println(Arrays.toString(case1) + " -> " + Arrays.toString(result));
		
		case1 = "1234,1567,-2,computer science”".split(",");
		result = lessOrEqualThree(case1);
		System.out.println(Arrays.toString(case1) + " -> " + Arrays.toString(result));
		
		case1 = "Russia Denmark Kazan".split(" ");
		result = lessOrEqualThree(case1);
		System.out.println(Arrays.toString(case1) + " -> " + Arrays.toString(result));

	}
	
	/**
	 * Возвращает массив строк длиной меньше или равно 3 из входящего массива строк
	 * @param array исходный массив строк
	 * @return массив строк длиной меньше или равно 3
	 */
	private static String[] lessOrEqualThree(String[] array) {
	
		/** Количество удовлетворяющих условию элементов*/
		int resultCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() <= 3)
				resultCount++;
		}
		/** Результирующий массив*/
		String[] resultArray = new String[resultCount];
		if (resultCount > 0) {
			/** Индекс элемента результирующего массива*/
			int j = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].length() <= 3)
					resultArray[j++] = array[i];
			}
		}
		return resultArray;
	}

}
