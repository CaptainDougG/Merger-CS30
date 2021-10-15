
public class Merger {

	public int[] doMerge(int[] arrayA, int[] arrayB) {
		
		if (arrayA == null && arrayB == null) {
			return new int[0];
		}
		else if (arrayA == null) {
			return arrayB;
		}
		else if (arrayB == null) {
			return arrayA;
		}
		
		int lengthOne = arrayA.length;
		int lengthTwo = arrayB.length;
		int[] result = new int[lengthOne + lengthTwo];
		int pointerA = 0;
		int pointerB = 0;
		int pointerC = 0;
		
		
		while (pointerA < lengthOne && pointerB < lengthTwo) {
			if (arrayA[pointerA] >= arrayB[pointerB]) {
				result[pointerC] = arrayB[pointerB];
				pointerB++;
				pointerC++;
			}
			else {
				result[pointerC] = arrayA[pointerA];
				pointerA++;
				pointerC++;
			}
		}
		
		while(pointerA < lengthOne) {
			result[pointerC] = arrayA[pointerA];
			pointerA++;
			pointerC++;
		}
		
		while(pointerB < lengthTwo) {
			result[pointerC] = arrayB[pointerB];
			pointerB++;
			pointerC++;
		}
		
		return result;
	}
}
