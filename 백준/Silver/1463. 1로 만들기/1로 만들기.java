import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int [] D;
    void run(){
        try {
            int N = Integer.parseInt(br.readLine());
            D = new int[N+1];
            D[1]=0;
            
            for(int i=2;i<N+1;i++){
                D[i] = D[i-1]+1;
                if(i%2==0){D[i] = Math.min(D[i],D[i/2]+1);}
                if(i%3==0){ D[i] = Math.min(D[i],D[i/3]+1);}
            }
            bw.write(D[N]+"");
            bw.flush();
        }catch(Exception e){}
    }
    
    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}