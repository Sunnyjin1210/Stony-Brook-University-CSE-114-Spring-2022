//Sunny jin 114452827

public class InterleaveArrays {
    public static int[] interleaveArrays(int[] array1, int[] array2){
        int [] newArray = new int[array1.length + array2.length];
        int index = 0;

        if(array1.length > array2.length){
            for(int i = 0; i < array1.length; i++){
                if(i < array2.length){
                    newArray[index] = array1[i];
                    index++;
                    newArray[index] = array2[i];
                    index++;
                }else{
                    newArray[index] = array1[i];
                    index++;
                }
            }
            return newArray;
        }else if(array1.length < array2.length){
            for(int i = 0; i < array2.length; i++){
                if(i < array1.length){
                    newArray[index] = array1[i];
                    index++;
                    newArray[index] = array2[i];
                    index++;
                }else{
                    newArray[index] = array2[i];
                    index++;
                }
            }
            return newArray;
        }else{
            for(int i = 0; i < array1.length;i++){
                newArray[index] = array1[i];
                index++;
                newArray[index] = array2[i];
                index++;
                
            }
            return newArray;
        }
    }


    //Took this from Problem 2 just to make make easier
    public static void print(int [] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }


    public static void main(String[] args){
        int[] arr = interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6});
        int[] arr2 = interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8});
        int[] arr3 = interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10});
        int[] arr4 = interleaveArrays(new int[]{1}, new int[]{2,4,6,8,10,15,25,6,23,86});
        int[] arr5 = interleaveArrays(new int[]{1,3,5,7,9}, new int[]{2,4,6,8,10});
        print(arr5);
        
    }
    
}

/*3. (3 points) InterleaveArrays.java: Write a method public static int[] interleaveArrays(int[] array1, int[] array2) that takes in two arrays of integers. Create and return a new array by interleaving the array together. Once an array is empty, use all the elements from the remaining array. Include in your program the test cases listed below and add at least 2 more.
Example:
interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6}) returns [1, 2, 3, 4, 5, 6]
interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8}) returns [10, 2, 20, 4, 30, 6, 40, 8, 50, 60, 70, 80]
interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10}) returns [1, 2, 3, 4, 5, 6, 8, 10]
*/