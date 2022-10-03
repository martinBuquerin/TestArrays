/*
crear un array de enteros e imprimirla
 */
package testarrays;

/**
 *
 * @author Martín
 */

public class TestArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayInt [] = new int[5];
        arrayInt[0]=2;
        arrayInt[1]=23;
        arrayInt[2]=45;
        arrayInt[3]=12;
        arrayInt[4]=73;
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
            
        }
    }
    
}
