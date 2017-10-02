import java.util.*;
class reverse{
    public  static void main(String[] args){
        int a[] = {5,4,3,2,1};
        int b[] = new int[a.length];
        for(int i = 0; i < a.length;i++){
            b[(a.length - 1)  - i] = a[i] * a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
