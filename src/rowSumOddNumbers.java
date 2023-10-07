/*
Given the triangle of consecutive odd numbers:

        1
        3     5
        7     9    11
        13    15    17    19
        21    23    25    27    29
        ...
        Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

        1 -->  1
        2 --> 3 + 5 = 8
*/


class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int x = (n * (n - 1)) + 1;  //here we are calculating the first number of the given row
        int sum = 0;

        //here we are adding all the numbers of the given row
        for (int i = 0; i < n; i++) {
            sum += x;
            x += 2;
        }

        return sum;
    }
}