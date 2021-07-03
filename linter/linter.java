import java.util.*; 
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


class Linter  {
    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
          {66, 64, 58, 65, 71, 57, 60},
          {57, 65, 65, 70, 72, 65, 51},
          {55, 54, 60, 53, 59, 57, 61},
          {65, 56, 55, 52, 55, 62, 57}
        }; 
	getTemp(weeklyMonthTemperatures);
	

	List<String> votes = new ArrayList<>();
	votes.add("Bush");
	votes.add("Bush");
	votes.add("Bush");
	votes.add("Shrub");
	votes.add("Hedge");
	votes.add("Shrub");
	votes.add("Bush");
	votes.add("Hedge");
	votes.add("Bush");
	tally(votes);
    }
	public static void getTemp(int[][] arr){
	HashSet<Integer> weatherData=new HashSet<Integer>();
        for(int[] el:arr){
            for (int elem: el){
                weatherData.add(elem);
            }
        }
         Object min = Collections.min(weatherData);
         Object max = Collections.max(weatherData);
        int minNum = (int) min;
        int maxNum = (int) max;
        System.out.println("High: "+maxNum);
        System.out.println("Low: "+minNum);
        for(int i=minNum; i<maxNum; i++){
            if(!weatherData.contains(i)){
                System.out.println("Never saw temperature: "+i);
            }
        }
		ReadFile("./resources/gates.js");
	}

	public static void tally(List <String> arrList){
		// create an array with length of number of unique values
        	HashSet<String> namesHash = new HashSet<String>(arrList);
        	int i = 0;
        	int[] count = new int[namesHash.size()];
        	// count occurance of each unique value and add it to the array
        	for (String name:namesHash){
         	   count[i] = Collections.frequency(arrList, name);
         	   i++;
       		 }
       		 // get the maximum value in the array
        	int res = count[0];
        	int idx = 0; 
        	for (int j = 1; j < count.length; j++){
            		res = Math.max(res, count[j]);
            		if(res == count[j]){
                	idx = j;
            		}
        	}
        	// print out the name with highest value
        	int currentIndex = 0;
        	for (String el : namesHash){
            		if(currentIndex == idx){
                		System.out.println(el + " received the most votes!");  
            		}
            		currentIndex++;
        	}
		}
	public static void ReadFile(String path) {
			try {
				File myObj = new File(path);
				Scanner myReader = new Scanner(myObj);
				int i=1;
				while (myReader.hasNextLine()) {
				  String data = myReader.nextLine();
				//   System.out.println("Line" + i + " : "+ data );
				//   System.out.println(data.substring(data.length() - 1).equals(";"));
				  if(!data.substring(data.length() - 1).equals(";") && !data.substring(data.length() - 1).equals("{") && !data.substring(data.length() - 1).equals("}") && !data.contains("if") && !data.contains("else") ){
					System.out.println("Line" + i + ": Missing semicolon.");
				  }
				  i++;
				//   System.out.println(data.substring(data.length() - 1));
				}
				myReader.close();
			  } catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			  }
	}
	}