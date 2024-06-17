import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    void run(){
        try {
            int N = Integer.parseInt(br.readLine());
            int sum=1,start=1,end=1,count=1;

            while(end!=N){
                if(sum==N){
                    count++;
                    end++;
                    sum+=end;
                }else if(sum>N){
                    sum-=start;
                    start++;
                }else if(sum<N){
                    end++;
                    sum+=end;
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