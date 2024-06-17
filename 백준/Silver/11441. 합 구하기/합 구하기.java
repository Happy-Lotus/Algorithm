import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    void run(){
        try {
           int N = Integer.parseInt(br.readLine());
           st = new StringTokenizer(br.readLine());
           int [] s = new int[N];
            
           for(int i=0;i<N;i++){
               if(i==0) s[i]=Integer.parseInt(st.nextToken());
               else{
                   s[i] = s[i-1]+Integer.parseInt(st.nextToken());
               }
           }
            
           int query = Integer.parseInt(br.readLine());
           while(query>0){
               st = new StringTokenizer(br.readLine());
               int i = Integer.parseInt(st.nextToken())-1;
               int j = Integer.parseInt(st.nextToken())-1;
               int result;
               if(i==0){
                   result = s[j];
               }else{
                   result = s[j]-s[i-1];
               }
               bw.write(result+"\n");
               query--;
           }
           bw.flush();
        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}