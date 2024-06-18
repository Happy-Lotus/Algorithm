import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int N,M;
    ArrayList<Integer>[]array;
    Boolean check[];
    int count=0;
    void run(){
        try {
            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());
            check = new Boolean[N+1];
            array = new ArrayList[N+1];

            for(int i=1;i<N+1;i++){
                array[i] = new ArrayList<>();
                check[i]=false;
            }

            for(int i=0;i<M;i++){
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());

                array[s].add(t);
                array[t].add(s);
            }

            if(array[1].size()==0){
                bw.write(0+"");
            }else{
                DFS(1);
                bw.write(count+"");
            }
            bw.flush();
        }catch(Exception e){}
    }

    void DFS(int start){
        if(check[start]){
            return;
        }
        check[start]=true;
        if(start!=1){
            count++;
        }

        for(int j=0;j<array[start].size();j++ ){
            DFS(array[start].get(j));
        }
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}