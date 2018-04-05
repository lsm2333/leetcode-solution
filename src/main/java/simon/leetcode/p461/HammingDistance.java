package simon.leetcode.p461;

public class HammingDistance {
	public static void main(String[] args) {
		System.out.println(SolutionP461.hammingDistance(4, 1));
	}
}

class SolutionP461 {
	public static int hammingDistance(int x, int y) {
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		String binaryStrMax = java.lang.Integer.toBinaryString(max);
		String binaryStrMin = java.lang.Integer.toBinaryString(min);
		int lengthMax = binaryStrMax.length();
		int lengthMin = binaryStrMin.length();
		int diff = lengthMax - lengthMin;
		int count = 0;
		int distance = 0;
		while (count < diff) {
			binaryStrMin = 0 + binaryStrMin;
			count++;
		}
		for (int i = 0; i < lengthMax; i++) {
			if (binaryStrMax.toCharArray()[i] != binaryStrMin.toCharArray()[i]) {
				distance++;
			}
		}
		return distance;
	}
}