import java.util.Arrays;

public class Lab2 {
   static int data[] = {3,4,5};
   static int N = data.length;
   static int size = data.length;
   static void add (int d){ 
	   if(isFull()) expand(d);
	   data [size++] = d;
	   }
   public static void main(String[] args){
	   add(9);
	   System.out.println(Arrays.toString(data));
   }
	static void add2(int d){
		N = 2 * N ;
		int tmp[] = new int [N];
		for (int i = 0 ; i < size ; i++){
			tmp[i] = data[i];			
		}
		tmp[size] = d;
		data = tmp;
		System.gc();
	}
	static boolean isFull(){
		return size == N;
	}
	static void expand(int d){
		N = 2 * N;
		int tmp[] = new int [N];
		for(int i = 0; i < size ; i++)	{
			tmp[i] = data[i];	
		}
		tmp[size] = d;
		data = tmp;
		System.gc();
	}
	
}
