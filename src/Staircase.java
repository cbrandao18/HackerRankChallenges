/**
 * https://www.hackerrank.com/challenges/staircase?h_r=next-challenge&h_v=zen
 * Staircase
 *
 *
 * Created by Christie on 6/16/2017.
 */
public class Staircase {
    public static void main(String[] args) {
        int n = 6;
        int spaces = n-1;
        int pounds = 1;
        for(int i=0; i<n; i++){
            for (int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            for (int k=0; k<pounds; k++){
                System.out.print("#");
            }
            System.out.println();
            spaces -= 1;
            pounds += 1;
        }
    }
}
