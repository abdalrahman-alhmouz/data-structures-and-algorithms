  import java.util.Arrays;

class Main {
  public static void main(String[] args) {
int[] arrray={1,2,3,4,6,8};
    insertShiftArray(arrray,5);

  }


     public static int[] insertShiftArray(int[] array ,int n){
        int half = array.length % 2 == 0 ? array.length / 2 : (array.length + 1) / 2;
        int[] arrayTow=new int[array.length+1];
        for(int i=0;i<array.length+1;i++){
            if(i<half){
                arrayTow[i]=array[i];
            }else if(i==half){
                arrayTow[i]=n;
            }else{
                arrayTow[i]=array[i-1];
            }
        }
        return arrayTow ;
    }

}

