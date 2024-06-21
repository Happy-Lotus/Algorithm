import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    void run(){
        try {
            int N = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int sum=0;
            
            for(int i=0;i<N;i++){
                int n = Integer.parseInt(br.readLine());
                queue.add(n);
            }

            while(queue.size()!=1){
                int d1 = queue.remove();
                int d2 = queue.remove();

                sum += (d1+d2);
                queue.add(d1+d2);
            }
            bw.write(sum+"");
            bw.flush();
        }catch(Exception e){}
    }
    
    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}