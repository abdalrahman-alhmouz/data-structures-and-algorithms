  import java.util.Arrays;

class Main {
  public static void main(String[] args) {
int[] i2 = {1, 2, 3,4,5,6};
    System.out.println(Arrays.toString(reverseArray(i2)));

  }


    static int[] reverseArray (int[] array){
      int[] arrayOne =new int[array.length] ;
        for(int i=0;i<array.length ;i++){
            // Scanner input =new Scanner(System.in) ;
            arrayOne[i]=array[array.length-1-i];
        }
                return arrayOne ;

    }


}

