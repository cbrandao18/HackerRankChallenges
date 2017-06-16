
/**
 * https://www.hackerrank.com/challenges/plus-minus?h_r=next-challenge&h_v=zen
 * Plus Minus
 *
 * Iterate through array and find out fraction of integers that are positive, negative or zero.
 *
 * Created by Christie on 6/16/2017.
 */
public class PlusMinus {
    public static void main(String[] args) {

        int n = 6;
        int arr[] = new int[]{-4, 3, -9, 0, 4, 1};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i=0; i<n; i++){
            if (arr[i] > 0){
                positive += 1;
            } else if (arr[i] < 0){
                negative += 1;
            } else {
                zero += 1;
            }
        }
        double positiveDb = positive/(double)n;
        double negativeDb = negative/(double)n;
        double zeroDb = zero/(double)n;
        System.out.println(positiveDb);
        System.out.println(negativeDb);
        System.out.println(zeroDb);
    }
}
