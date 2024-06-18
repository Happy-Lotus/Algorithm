import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    void run(){
        try {

            int N = Integer.parseInt(br.readLine());
            int [] array = new int[N];
            st = new StringTokenizer(br.readLine());
            
            for(int i=0;i<N;i++){
                array[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(array);
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            while(M>0){
                int target = Integer.parseInt(st.nextToken());
                if(findNum(target,array)) bw.write(1+"\n");
                else bw.write(0+"\n");
                M--;
            }
            bw.flush();
        }catch(Exception e){}
    }

    boolean findNum(int target, int[]array){
        int i=0;
        int j=array.length-1;
        int mid=0;
        while(i<=j){
            mid = (j+i)/2;
            if(array[mid]>target){
                j=mid-1;

            }else if(array[mid]<target){
                i=mid+1;
            }else if(array[mid]==target){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}