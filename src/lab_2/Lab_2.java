package lab_2;
import java.util.Arrays;
/**
 *
 * @author AKRAM
 */
public class Lab_2 {
    int[] array ={10,20,30,40,50};
    int[] backArray = new int [array.length];
        void reverse(){
        int o = array.length -1;
        for (int i = 0; i < array.length/2; i++) {
            int j = array[i];
            array[i] = array[o];
            array[o] = j;
            o--;
        }
        print("Reversed ",array);
    }
        void backupArray(){
            for (int i = 0; i < backArray.length; i++) {
                backArray[i] = array[i]; 
            }
            print("BackUp ",backArray);
        }
    void remove(int arr[],int index){
    if(index >0 && index<arr.length){
    int i =index;
        while (i<arr.length-1) {            
            arr[i]=arr[i+1];
            i++;
        }
        arr[i]=0;
    }
    print("One Element Removed ",array);
    }
    void print (String arrName,int arr[]){
            System.out.print(arrName);
            System.out.print(Arrays.toString(arr)+"\n");
        }
    public static void main(String[] args) {
        Lab_2 lab = new Lab_2();
        lab.print("Origenal ", lab.array);
        lab.backupArray();
        lab.reverse();
        lab.remove(lab.array, 4);
    }
    
}
