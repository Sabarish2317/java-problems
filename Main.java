import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //table
	    HashMap<Integer, Integer> map = new HashMap<>();
	    
		int[] roll_number = {5,2,9,4,1,6,7,8,9,9};
		int[] marks =  {55,28,99,45,10,69,75,82,96,94};
		
		for(int i=0; i<roll_number.length; i++){
		    map.put( roll_number[i] , marks[i] );
		} 
		
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
		
	}
}