import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    void run(){
        try {
            int N = Integer.parseInt(br.readLine());
            int [] A = new int[N];
            Stack<Integer>stack = new Stack<>();
            for(int i=0;i<N;i++){
                A[i]=Integer.parseInt(br.readLine());
            }
            int c = 1;

            for(int i=0;i<A.length;i++){
                int num = A[i];
                if(c<=num){
                    while(c<=num){
                        stack.push(c++);
                        sb.append("+\n");
                    }
                    stack.pop();
                    sb.append("-\n");
                }else{
                    int n = stack.pop();
                    if(n>num){
                        System.out.print("NO");
                        return;
                    }else{
                        sb.append("-\n");
                    }
                }
            }
            System.out.print(sb);
        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}