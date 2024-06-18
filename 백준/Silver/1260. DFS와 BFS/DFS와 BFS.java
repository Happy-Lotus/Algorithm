import org.w3c.dom.Node;

import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    ArrayList<Integer>[]array;
    Boolean check[];
    void run(){
        try {
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());
            array = new ArrayList[V+1];
            check = new Boolean[V+1];

            for(int i=1;i<V+1;i++){
                array[i]= new ArrayList<>();
                check[i]=false;
            }

            for(int j=0;j<E;j++){
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());

                array[s].add(t);
                array[t].add(s);
            }
            
            for(int i=1;i<V+1;i++){
                Collections.sort(array[i]);
            }
            
            DFS(start);
            System.out.println(sb);
            sb.delete(0,sb.length());
            for(int i=0;i<check.length;i++){
                check[i]=false;
            }
            
            BFS(start);
            System.out.println(sb);
        }catch(Exception e){}
    }

    void BFS(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        check[start]=true;

        while(!queue.isEmpty()){
            int num = queue.poll();
            sb.append(num+" ");
            for(int i=0;i<array[num].size();i++){
                if(!check[array[num].get(i)]){
                    check[array[num].get(i)]=true;
                    queue.add(array[num].get(i));
                }
            }
        }
    }

    void DFS(int start){
        if(check[start]){
            return;
        }

        check[start]=true;
        sb.append(start+" ");
        for(int j=0;j<array[start].size();j++){
            if(!check[array[start].get(j)]){
                DFS(array[start].get(j));
            }
        }
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}