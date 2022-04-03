//Sunny Jin, 114452827

public class ArrayUtils {
    public static int[] randomArray(int size, int UpperBound){
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = (int)(Math.random() * UpperBound);
        }
        return result;
    }

    public static void print(int [] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public static int arraySum(int[] values){
        int result = 0;
        for(int i = 0; i < values.length; i++){
            result+= values[i];
        }
        return result;
    }

    public static int contains(int[] arr, int index){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == index){
                return i;
            }
        }

        return -1;
    }

    public static boolean IsAMultipleOf(int value, int multiple){
        if((value % multiple == 0) || (value == 0)){
            return true;
        }else{
            return false;
        }
    }

    public static int countMultiplesOf(int[] arr, int value){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(IsAMultipleOf(arr[i], value)){
                counter++;
            }
        }
        return counter;
        
    }
 

    public static void main(String[] args){
       
        
        //Part A
        int[] arr = randomArray(100, 21);
        
        //Part B
//        print(arr);

        //Part C
        int[] numbers = {1,2,3,4,5,6,7,0,8,9}; // Total = 45 Avg = 45/10 = 4.5
        double average = (double)arraySum(numbers) / numbers.length;
//        System.out.print(average);

        //Part D
//        System.out.print("\n" + contains(arr, 12));

        //Part E
//        System.out.print("\n" + countMultiplesOf(arr, 12));


    }
    
}


/* a
(15 points) Create a Java file named ArrayUtils.java and follow the steps below:
a. (3 points) Define a method, named randomArray with two parameters: 
1) an integer indicating the size of the array to be created and 
2) an integer indicating the upper limit for the range of random numbers to be generated.
If the second parameter is 101, then it would mean that the random numbers will be in the range of 0 and 100 inclusive. This method should create an array of the given size and fill it with random numbers between the given range. The function returns the array created as its return value. In your main call randomArray with two actual arguments: 100 as the size and 21 as the upper limit, and store the returned array into a local variable in main.
*/
/* b
b. (3 points)Define a method named print with one parameter of type array of integers, which outputs the elements of the given array to the standard output device, i.e., the computer screen. 
In your main call print with the local variable that you chose in the step above to see if the elements in the array are printed okay. You will want to use this print function whenever you want to see the elements of an array containing integers. While testing your program, include a call to this function wherever useful, but comment out all the calls to this function in the final version that you hand in.*/
/*c. 
(3 points) Define a method, named arraySum with one parameter of type array of integers, which returns the sum of all the elements in the array. 
In your main print the average as a double of all the numbers in the array that you obtained in the first step above. To compute the average, you must use arraySum that you defined earlier. Make sure to add annotations to the output so that it will be meaningful for people seeing the program run.
*/
/* d
d. (3 points) Define a method named contains with two formal parameters: 1) an array of integers and 2) a single integer. The method returns the index of the array where the first occurrence of the second argument is found, if that number is contained within the array. If the second argument is not contained in the first array argument, the method returns −1. Do not use the existing indexOf method for solving this problem, you are writing your own solution. In your main call contains with the array obtained in the first step above and 12 as the second argument, and prints the result.
*/
/* e
e. (3 points) Define a method named countMultiplesOf and add it to the ArrayUtils class. The method should take two parameters: 1) an array of integers and 2) an integer. This method returns the count of the integers in the array that are multiples of the second parameter. For example, 8 is a multiple of 2, but not a multiple of 3, and zero is a multiple of any number. Hint: I suggest that you also define and use an auxiliary function that tests if a number is a multiple of another number and returns a boolean value.In your main call countMultiplesOf with the array obtained in the first step. Use 7 as the second argument and print the result.
*/