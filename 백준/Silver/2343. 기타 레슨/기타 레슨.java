import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    void run(){
        try {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int [] array = new int[l];
            st = new StringTokenizer(br.readLine());

            long min=0;
            long max=0;
            for(int i=0;i<l;i++){
                array[i] = Integer.parseInt(st.nextToken());
                max+=array[i];
                min = Math.max(array[i],min);
            }

            bw.write(binary_serarch(min,max,array,b)+"");
            bw.flush();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    long binary_serarch(long min,long max,int [] lesson,int c){
        while(min<=max){
            long sum = 0;
            long mid = (min+max)/2;
            int count = 1;

            for(int i=0;i<lesson.length;i++){
                sum+=lesson[i];
                if(sum>mid){
                    sum=lesson[i];
                    count++;
                }
            }

            if(count<=c){
                max=mid-1;
            }else min=mid+1;
        }

        return min;
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}