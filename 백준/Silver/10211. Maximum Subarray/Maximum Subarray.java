import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;
    void run(){
        try {
           int T = Integer.parseInt(br.readLine());
           int [] num;
           int [] s;

           for(int t=0;t<T;t++){
               int N = Integer.parseInt(br.readLine());
               num = new int[N];
               s = new int [N];
               st = new StringTokenizer(br.readLine());
               for(int i=0;i<N;i++){
                   num[i] = Integer.parseInt(st.nextToken());
               }
               int max = num[0];
               s[0] = num[0];
               for(int i=1; i<N; i++) {
                   s[i] = Math.max(s[i-1] + num[i], num[i]);
                   max = Math.max(max,  s[i]);
               }
               bw.write(max+"\n");
           }
           bw.flush();
        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}