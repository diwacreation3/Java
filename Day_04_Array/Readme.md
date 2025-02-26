# Java Array 
In java, an array is a data structures that allows you to store multiple values of the sample type under a single variable name. Arrays have a fixed size, which is determined when the array is created. 

### Array Declaration 
To declare an array variable, you specify the element type followed by sequare brackets []:

```java
dataType[] arrayName; // Preferred syntax
```

### Array Initilization 
You can initilize an array when it is declared, specifying the initial values inside the curly braces {}: 

```java
datatype[] arrayName = {value1, value2, value3, ...}
```
or 

```java
dataType[] arrayName = new dataType[]{value, value2, value3, ...}; // Explicit Initilization
```
### Example 

```java
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
```


