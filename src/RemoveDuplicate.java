import com.sun.deploy.security.CredentialManager;

import java.util.Arrays;

public class RemoveDuplicate {
    public void doBF(int[] arr){
        int length= arr.length;
        for (int i = 0; i<length; i++) {
            for (int j = i+1; j <length ; j++) {
                if( arr[i]==arr[j])
                    System.out.print(arr[i]+", ");

            }
        }
    }
    public void doOn(int[] arr){
        int length =arr.length;
       String str ="";
        for (int i = 0; i <length; i++) {
            if(!str.contains(String.valueOf(arr[i])))  str+=arr[i];
        }
        System.out.println(str);

    }
    public static void main(String[] args) {
        int[] arr={1,2,4,4,1,2,3, 1, 5, 6, 5,1,6,6};
       RemoveDuplicate rmDup = new RemoveDuplicate();
     //  rmDup.doBF(arr);
    //   rmDup.doOn(arr);

        int value = rmDup.removeDupe(arr);
        for (int i = 0; i <value; i++) {
            System.out.println(arr[i]);
        }

    }

    int removeDupe(int[] arr) {
        int count = 0;
        Arrays.sort (arr);
        System.out.println(Arrays.toString(arr));
        int i = 0;
        for ( ; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                arr[count++] = arr[i];
            }
//            if(arr[i] != arr[i+1] && i==arr.length-2){
//            arr[count++] = arr[i+1];
//            }
        }
        arr[count++] = arr[i];
        return count;
    }
}
