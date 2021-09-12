import java.util.*;
public class ConsecutiveXOR {

//    Find elements of array using XOR of consecutive elements
//
//    Difficulty Level : Basic
//    Last Updated : 03 Aug, 2021
//
//    Given an array arr[] in which XOR of every 2 consecutive elements of the original array is given i.e if the total number of elements in the original array is n then the size of this XOR array would be n-1. The first element in the original array is also given. The task is to find out the rest of n-1 elements of the original array.
//
//    Let a, b, c, d, e, f are the original elements, and the xor of every 2 consecutive elements is given, i.e a^b = k1, b ^ c = k2, c ^ d = k3, d ^ e = k4, e ^ f = k5 (where k1, k2, k3, k4, k5 are the elements that are given us along with the first element a), and we have to find the value of b, c, d, e, f.
//
//    Examples:
//
//    Input : arr[] = {13, 2, 6, 1}, a = 5
//    Output : 5 8 10 12 13
//            5^8=13, 8^10=2, 10^12=6, 12^13=1
//
//    Input : arr[] = {12, 5, 26, 7}, a = 6
//    Output : 6 10 15 21 18
    private static Scanner input = new Scanner(System.in);
    public static void getXORResult(int[] arr, int a) {
        int[] newArray = new int[arr.length+1];
        newArray[0] = a;
        for (int i = 0; i < newArray.length-1; i++) {
            System.out.println(Integer.toBinaryString(arr[i])+" "+Integer.toBinaryString(newArray[i]));
            newArray[i+1] = arr[i] ^ newArray[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int[] arr = new int[input.nextInt()];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int a = input.nextInt();
        ConsecutiveXOR.getXORResult(arr,a);
    }
}
