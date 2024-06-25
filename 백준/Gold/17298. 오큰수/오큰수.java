import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    void run(){
        try {

            int N = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            int [] arr = new int[N];
            int [] ans = new int[N];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            stack.push(0);
            for(int i=1;i<N;i++){
                while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                    ans[stack.pop()] = arr[i];
                }
                stack.push(i);
            }

            while(!stack.isEmpty()){
                ans[stack.pop()]=-1;
            }

            for(int i=0;i<N;i++){
                bw.write(ans[i]+" ");
            }
            bw.flush();
        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}