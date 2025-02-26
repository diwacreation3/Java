package Day_04_Array;

public class Array {
    public static void main(String[] args) {

        // Array declaration and initilization 
        int[] numbers = {10,0,30,40,50};

        // Accessing the array elements
        int firstElement = numbers[0]; // 10

        // modifying the array element 
        numbers[2] = 35;

        // Iterating over array elements using a for loop 
        for(int i = 0; i < numbers.length; i++){
            System.out.println("element in index" + i + ":" + numbers[i]);

        }

        // Iterating over array elements using an enchanced for loop 
        for (int num : numbers){
            System.out.println("Element: " + num);
        }
    }
}
