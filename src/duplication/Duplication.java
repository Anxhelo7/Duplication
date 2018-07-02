package duplication;

/**
 *
 * @author Anxhelo
 */
public class Duplication {

    public static void main(String[] args) {
        int [] array1 = {10, 45, 2, 56, 12, 34, 90, 27};
        int [] array2 = {45, 1, 89, 77, 2, 90, 100};
        for(int i = 0;i < array1.length;i++) {
            
            for(int j = 0; j<array2.length;j++){
                
                if(array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
    
}
