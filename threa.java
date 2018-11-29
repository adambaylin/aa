package thuatToanQuayLui;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiThreadedPrimeFinder {
    static final int nThreads = 2;

    public static void main(String[] args) throws InterruptedException{
        int t;
        int total = 0;
        Isprimer[] pthreads = new Isprimer[nThreads];
        long starttime, endtime, runtime, a = 0;
        starttime = System.currentTimeMillis();
        //for(int i = 0; i <10000000; i ++)
            //a+=i;
        for (t=0; t<nThreads; t++)
        {
            pthreads[t] = new Isprimer();
            pthreads[t].start();
        }
        for(t= 0; t<nThreads;t++) {
        	pthreads[t].join();
        }
        //System.out.println(Isprimer.fs);
        //System.out.println(Isprimer.fs);
    }
}
    
