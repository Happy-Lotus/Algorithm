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
            D = new int[46];
            Arrays.fill(D,-1);

            D[0]=0;
            D[1]=1;
            int result = fibo(N);
            bw.write(result+"");
            bw.flush();

        }catch(Exception e){}
    }

    int fibo(int n){
        if(D[n]!=-1)
            return D[n];

        D[n] = fibo(n-1)+fibo(n-2);
        return D[n];
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}