import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class BasicLibrary {
    public static void main(String[] args) {
	int[] testArr = roll(4);
        System.out.println(Arrays.toString(testArr));
        containsDuplicates(testArr);
	int[] arr1 = {1, 2, 3};
	System.out.println(average1(arr1));
	int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
            };
        System.out.println(Arrays.toString(average2(weeklyMonthTemperatures)));
    }

    public static int[] roll(int n){
        int min = 0;
        int max = 7;
        int[] numbersArr = new int[n];
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i=0; i<n ; i++){
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
//            numbers.add(random_int);
            numbersArr[i] = random_int;
        }
//        return numbers;
        return numbersArr;
    }
	public static void containsDuplicates(int[] arr){
		boolean result = false;
		for (int i=0;i<arr.length;i++){
			for (int j=0; j<arr.length;j++){
				if(i != j){
					if (arr[i] == arr[j]){
						result = true;
					}
				}
			}
		}
		System.out.println(result);
    	}

	public static int average1(int[] arr){
        	int sum = 0;
        	for (int el : arr){
            		sum = sum +el;
        	}
        	int avg = sum / arr.length;
        	return avg;
    	}
	public static double[] average2(double[][] arr){
        double[] averagesArr = new double[arr.length];
        int i = 0;
        for(int j=0; j<arr.length;j++){
            double sum = 0;
            for (double elem : arr[i]){
                sum = sum +elem;
            }
             averagesArr[i] = sum / arr[i].length;
             i++;
        }
        double res = averagesArr[0];
	double[] lowestArr = arr[0];
        for (int y = 1; y < averagesArr.length; y++){
            res = Math.min(res, averagesArr[y]);
		if(res == averagesArr[y]){
			lowestArr = arr[y];
		}
	}
        return lowestArr;
    	}
}