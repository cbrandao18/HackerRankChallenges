import java.util.ArrayList;
import java.util.Scanner;

/**
 * We want to find the amount of storage space required by the array in kilobytes, assuming that a single integer is 4
 * bytes and there are 1024 bytes in  kilobyte.
 *
 * https://www.hackerrank.com/contests/101hack49/challenges/calculate-array-size
 *
 * Created by Christie on 6/14/2017.
 */
public class CalculateArraySize {

    private static int calculate(Integer[] dimensions){
        int numOfIntegers = 1;
        for (int i=0; i<dimensions.length; i++){
            numOfIntegers *= dimensions[i];
        }
        int numOfBytes = 4 * numOfIntegers;
        int numOfKilobytes = numOfBytes/1024;

        return  numOfKilobytes;
    }
    public static void main(String[] args) {
        ArrayList<Integer> inputs = new ArrayList<>();
        System.out.println("This program calculates the amount of storage needed for your array.");
        System.out.println("Enter in the first value of the first dimension: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        inputs.add(num);
        System.out.println("Enter in the next value or type 0 to start calculation: ");
        num = in.nextInt();
        while (num != 0){
            inputs.add(num);
            System.out.println("Enter in the next value or type 0 to start calculation: ");
            num = in.nextInt();

        }
        Integer[] inputsArr = inputs.toArray( new Integer[inputs.size()]);
        int output = calculate(inputsArr);
        System.out.println("--------------------------------------------------------------------");
        String matrix = "array";
        for (int i=0; i<inputsArr.length; i++){
            matrix += "[" + inputsArr[i].toString() + "]";
        }
        System.out.println(matrix + " needs " + output + " kilobytes");

    }
}
