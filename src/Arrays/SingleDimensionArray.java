package Arrays;


/**
 * 1. insert  into an Array
 * 2. Traverse an Array
 * 3. Delete Array for both (specific value as well as the whole array)
 * 4. Search for an element in an array
 */
import java.util.Arrays;

public class SingleDimensionArray{
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
//        initialize the array with min values
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToInsert){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" +  e);
        }
    }

    public void insertNoIndex( int value) {
        try {
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == Integer.MIN_VALUE) {
                    arr[i] = value;
                    System.out.println("successfully inserted value");
                    return;
                }
            }
            }
        catch (Exception e){
            System.out.println("Error" + e.getMessage());
            }
        }

    public void traverse() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public void delete(int valueToDelete) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToDelete) {
                arr[i] = Integer.MIN_VALUE;
                found = true;
            }
        }
        if (found) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Value not found in the array");
        }
    }

    public void deleteAll() {
        Arrays.fill(arr, Integer.MIN_VALUE);
        System.out.println("Array deleted");
    }

    public boolean search(int valueToSearch) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Successfully deleted");
                return true;
            }
        }
        return false;
    }

    public int[] getArray() {
        return arr;
    }

    public int length (){
        return arr.length;
    }

    public static void main(String[] args) {
        //create the object of the class
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        singleDimensionArray.insert(0,1);
        singleDimensionArray.insert(1,2);
        singleDimensionArray.insert(2,3);
        singleDimensionArray.insert(3,4);
        singleDimensionArray.insert(4,5);
        singleDimensionArray.insert(5,3);
        singleDimensionArray.insert(6,4);
        singleDimensionArray.insert(7,5);
//        System.out.println(singleDimensionArray.toString());
        System.out.println(Arrays.toString(singleDimensionArray.arr));
        singleDimensionArray.insertNoIndex(10);


        singleDimensionArray.traverse();

        singleDimensionArray.delete(3);
        singleDimensionArray.traverse();

        singleDimensionArray.deleteAll();
        singleDimensionArray.traverse();

        boolean found = singleDimensionArray.search(5);
        System.out.println("Value found: " + found);
    }
}
