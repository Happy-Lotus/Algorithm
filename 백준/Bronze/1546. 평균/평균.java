import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    void run(){
        try {
           int count = Integer.parseInt(br.readLine());
           st = new StringTokenizer(br.readLine());
           int sum=0;
           int max = 0;
           while(st.hasMoreTokens()){
               int num = Integer.parseInt(st.nextToken());
               if(max<num){
                   max=num;
               }
               sum+= num;
           }
           bw.write(((double)sum/count/max*100)+"");
           bw.flush();
        }catch(Exception e){}
    }
    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}