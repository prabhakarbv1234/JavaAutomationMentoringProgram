package cleancode.hometask.four;

public class Utilities {
	public int maxMirror(int[] nums) {
		int max = 0;
		for (int start = 0; start < nums.length; start++) {
			for (int begin = nums.length - 1; begin >= 0; begin--) {
				int size = 0;
				int i = start;
				int j = begin;
				while (i < nums.length && j >= 0 && nums[i] == nums[j]) {
					size++;
					i++;
					j--;
				}

				max = Math.max(max, size);
			}
		}
		return max;
	}

	public boolean linearIn(int[] outer, int[] inner) {

		int i = 0;
		int j = 0;
		while (i < inner.length && j < outer.length) {
			if (inner[i] > outer[j]) {
				j++;
			} else if (inner[i] < outer[j]) {
				return false;
			} else {
				i++;
			}
		}
		if (i != inner.length)
			return false;
		return true;
	}

	public int countClumps(int[] nums) {
		int count = 0;
		int i = 0;
		while (i < nums.length) {
			int val = nums[i];
			i++;
			int length = 1;
			while (i < nums.length && nums[i] == val) {
				i++;
				length++;
			}
			if (length > 1)
				count++;
		}
		return count;

	}

	public int maxSpan(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			int j = nums.length - 1;
			while (nums[i] != nums[j])
				j--;
			int span = j - i + 1;
			if (span > max)
				max = span;
		}
		return max;
	}

	public boolean canBalance(int[] nums) {
		int first = 0;
		int second = 0;
		for (int i = 0; i < nums.length; i++)
			second += nums[i];
		for (int i = 0; i <= nums.length - 2; i++) {

			first += nums[i];
			second -= nums[i];
			if (first == second)

				return true;
		}
		return false;

	}
}
