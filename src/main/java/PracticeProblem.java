public class PracticeProblem {
	static int[] createIntArray(){
		return new int[]{1, 2, 3, 4, 5};
	}

	static String[] createArray(String str1, String str2, String str3, String str4){
		return new String[]{str1, str2, str3, str4};
	}

	static int findValue(int num, int[] arr){
		for(int i = 0; i < arr.length; ++i){
			if(arr[i] == num){
				return i;
			}
		}
		return -1;
	}

	static int findThirdValue(String str, String[] arr){
		int count = 0;
		for(int i = 0; i < arr.length; ++i){
			if(arr[i] == str){
				count++;
			}
			if(count == 3){
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]){}
}
