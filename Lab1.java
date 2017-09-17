public class Lab1 {

    static boolean isPrime0(int n){

        if(n < 2) return false;

        int m = n / 2;
        for(int i = 2; i <= m; i++){
            if((n % i) == 0) return false;
        }

        return true;
    }

    static boolean isPrime1(int n){

        if(n < 2) return false;

        int m = (int) Math.sqrt(n);
        for(int i = 2; i <= m; i++){
            if((n % i) == 0) return false;
        }

        return true;
    }

    static boolean isPrime2(int n){

        if(n <= 1) return false;
        else if(n <= 3) return true;
        else if(n % 2 == 0 || n % 3 == 0) return false;

        int m = (int) Math.sqrt(n);
        for(int i = 5; i <= m; i += 6){
            if((n % i) == 0 || (n % (i+2)) == 0) return false;
        }

        return true;
    }

    public static void main(String [] args){
        //isPrime0
        System.out.println("isPrime0");

        int n = 1000;
        long start = System.currentTimeMillis();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(isPrime0(i)) count++;
        }
        long time = (System.currentTimeMillis()-start);
        System.out.println(n+"\t"+count+"\t"+time);

        n = 10000;
        start = System.currentTimeMillis();
        count = 0;
        for(int i = 0; i < n; i++){
            if(isPrime0(i)) count++;
        }
        time = (System.currentTimeMillis()-start);
        System.out.println(n+"\t"+count+"\t"+time);

        for(n = 100000; n <= 1000000; n+=100000){
            start = System.currentTimeMillis();
            count = 0;
            for(int i = 1; i < n; i++){
                if(isPrime0(i)) count++;
            }
            time = (System.currentTimeMillis()-start);
            System.out.println(n+"\t"+count+"\t"+time);
        }

        System.out.println();

        //isPrime1
        System.out.println("isPrime1");

        n = 1000;
        start = System.currentTimeMillis();
        count = 0;
        for(int i = 0; i < n; i++){
            if(isPrime1(i)) count++;
        }
        time = (System.currentTimeMillis()-start);
        System.out.println(n+"\t"+count+"\t"+time);

        n = 10000;
        start = System.currentTimeMillis();
        count = 0;
        for(int i = 0; i < n; i++){
            if(isPrime1(i)) count++;
        }
        time = (System.currentTimeMillis()-start);
        System.out.println(n+"\t"+count+"\t"+time);

        for(n = 100000; n <= 1000000; n+=100000){
            start = System.currentTimeMillis();
            count = 0;
            for(int i = 1; i < n; i++){
                if(isPrime1(i)) count++;
            }
            time = (System.currentTimeMillis()-start);
            System.out.println(n+"\t"+count+"\t"+time);
        }

        System.out.println();

        //isPrime2
        System.out.println("isPrime2");

        n = 1000;
        start = System.currentTimeMillis();
        count = 0;
        for(int i = 0; i < n; i++){
            if(isPrime2(i)) count++;
        }
        time = (System.currentTimeMillis()-start);
        System.out.println(n+"\t"+count+"\t"+time);

        n = 10000;
        start = System.currentTimeMillis();
        count = 0;
        for(int i = 0; i < n; i++){
            if(isPrime2(i)) count++;
        }
        time = (System.currentTimeMillis()-start);
        System.out.println(n+"\t"+count+"\t"+time);

        for(n = 100000; n <= 1000000; n+=100000){
            start = System.currentTimeMillis();
            count = 0;
            for(int i = 1; i < n; i++){
                if(isPrime2(i)) count++;
            }
            time = (System.currentTimeMillis()-start);
            System.out.println(n+"\t"+count+"\t"+time);
        }
    }
}