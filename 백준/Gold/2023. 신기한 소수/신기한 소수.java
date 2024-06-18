import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    int N;
    void run(){
        try {
            N = Integer.parseInt(br.readLine());
            DFS(2,1);
            DFS(3,1);
            DFS(5,1);
            DFS(7,1);

            System.out.println(sb);
        }catch(Exception e){}
    }

    void DFS(int num,int count){
        if(count==N){
            if(isPrime(num)){
                sb.append(num+"\n");
            }
            return;
        }

        for(int i=1;i<10;i+=2){
            if(isPrime(num*10+i)){
                DFS(num*10+i,count+1);
            }
        }
    }

    boolean isPrime(int num){
        for(int j=2;j<num/2;j++){
            if(num%j==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}