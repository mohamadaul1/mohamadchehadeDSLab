/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab2021;

/**
 *
 * @author user
 */
public class Dataarraylab2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    static int arraySortedOrNot(int Arry[], int n) {
     // Array has one or no element or the
    // rest are already checked and approved.
        if (n == 1 || n == 0)
            return 1;
 
        // Unsorted pair found (Equal values allowed)
        if (arry [n - 1] < arry [n - 2])
            return 0;
 
        // Last pair was sorted
        // Keep on checking
          return arraySortedOrNot(arry, n - 1);
    }
 
    // main function
    public static void main(String[] args) {
    
        int arry[] = { 20, 23, 23, 45, 78, 88 };
        int n = arry.length;
        if (arraySortedOrNot(arry, n) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

