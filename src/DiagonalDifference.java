import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference?h_r=next-challenge&h_v=zen
 *
 * Diagonal Difference
 *
 * Created by Christie on 6/16/2017.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int firstDia = 0;
        for (int i=0; i<n; i++){
            firstDia += a[i][i];
        }
        int secondDia = 0;
        int j = 0;
        int k = n-1;
        while (j<n){
            secondDia += a[j][k];
            j++;
            k--;
        }

        int result = firstDia-secondDia;
        result = Math.abs(result);
        System.out.println(result);
    }
}
