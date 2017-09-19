import java.util.Arrays;
class SumArray{
    public static void main(String[] args){
        int a[]  = {9,1,4,3};
        int b[]  = new int[a.length];
        for(int i = 0; i < a.length; i++){
            if(i == 0){
                b[i] = a[i];
            }else{
             b[i] = b[i - 1] + a[i];
            }
        }
         System.out.println(Arrays.toString(a));
         System.out.println(Arrays.toString(b));

    }
}

