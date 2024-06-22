import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    void run(){
        try {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            Deque<int[]> deque = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            for(int i=0;i<N;i++){
                int num = Integer.parseInt(st.nextToken());

                while(!deque.isEmpty() && deque.peekLast()[1]>num){
                    deque.removeLast();
                }

                deque.addLast(new int[]{i,num});

                if(deque.peekLast()[0] - deque.peekFirst()[0] == K){
                    deque.removeFirst();
                }
                bw.write(deque.peekFirst()[1]+" ");
            }

            bw.flush();
        }catch(Exception e){}
    }
    
    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}