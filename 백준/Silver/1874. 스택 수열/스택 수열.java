import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    void run(){
        try {
            int N = Integer.parseInt(br.readLine());
            int [] arr = new int[N];
            Stack<Integer> stack = new Stack<>();
            int num=1;

            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(br.readLine());
            }

            for(int i=0;i<N;i++){
                int temp = arr[i];
                if(temp>=num){
                    while(temp>=num){
                        stack.push(num++);
                        sb.append("+\n");
                    }
                    stack.pop();
                    sb.append("-\n");
                }else{
                    int n = stack.pop();
                    if(n>temp){
                        sb.delete(0,sb.length());
                        sb.append("NO");
                        break;
                    }else{
                        sb.append("-\n");
                    }
                }
            }
            System.out.println(sb);
        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}