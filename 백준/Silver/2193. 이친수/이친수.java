import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    long [][] D;
    void run(){
        try {

            int N = Integer.parseInt(br.readLine());

            D = new long[N+1][2];

            D[1][1]=1;
            D[1][0]=0;

            for(int i=2;i<N+1;i++){
                D[i][0]=D[i-1][0] + D[i-1][1];
                D[i][1]=D[i-1][0];
            }

            bw.write((D[N][0]+D[N][1])+"");
            bw.flush();
        }catch(Exception e){}
    }
    
    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}