import com.sun.org.apache.xpath.internal.operations.Bool;

public class PetrolBunk {
    static int remainingPetrol = 2;
    static int[] bunkDistance = {4,8,3};
    static int[] bunkCapacity = {6,4,2};
    static Boolean Possible = true;

    public static void main(String[] args) {
        for (int i = 0; i < bunkDistance.length; i++) {
                remainingPetrol = remainingPetrol + bunkCapacity[i] - bunkDistance[i];
                if (remainingPetrol<0){
                    Possible=false;
                    break;
                }
        }
        if(!Possible){
            System.out.println("cant complete Travel");
        }
        else{
            System.out.println(remainingPetrol);
        }
    }
}
