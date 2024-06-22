import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    void run(){
        try {
            st = new StringTokenizer(br.readLine());
            long i = Long.parseLong(st.nextToken());
            long j = Long.parseLong(st.nextToken());
            int count=0;

            long [] arr = new long[10000001];

            for(int k = 2;k<arr.length;k++){
                arr[k] = k;
            }

            for(int k = 2;k<=Math.sqrt(arr.length);k++){
                if(arr[k]==0){
                    continue;
                }

                for(int n = k+k;n<arr.length;n+=k){
                    arr[n]=0;
                }
            }

            for(int n=2;n<10000001;n++){
                if(arr[n]!=0){
                    long temp = arr[n];
                    while((double)arr[n] <= (double)j/(double)temp){
                        if((double)arr[n] >= (double)i/(double)temp){
                            count++;
                        }
                        temp *= arr[n];

                    }
                }
            }

            bw.write(count+"");
            bw.flush();
        }catch(Exception e){}
    }
    
    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}