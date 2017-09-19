class floorSqrnsqr{
    static int floorSqrNSqr1(double n){
        int r = 1;
        while(r < Math.sqrt(n*n)){
            r++;
        }
        return r-1;
    }
    static int floorSqrNSqr2(double n){
        int i = 1;
        int r = i*i;
        while(r < n*n)
        {
            i++;
            r = i* i;
        }
        return r-1;
    }
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        int Data  = floorSqrNSqr1(9);
        long time = (System.currentTimeMillis()-start);
        System.out.println(Data);
        System.out.println(time);

    }
}

