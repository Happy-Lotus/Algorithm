import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    void run(){
        try {

            int N = Integer.parseInt(br.readLine());

            Queue<Integer> queue = new LinkedList<>();

            for(int i=1;i<N+1;i++){
                queue.add(i);
            }

            while(queue.size()!=1){
                queue.poll();
                int num=queue.remove();
                queue.add(num);
            }

            bw.write(queue.peek()+"");
            bw.flush();
        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}