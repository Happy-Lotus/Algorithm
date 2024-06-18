import org.w3c.dom.Node;

import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int [][] array;
    Boolean [][]check;
    int [] dx = {-1,1,0,0};
    int [] dy = {0,0,-1,1};
    int N,M;
    
    void run(){
        try {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            array = new int [N][M];
            check = new Boolean [N][M];

            for(int i=0;i<N;i++){

                char [] c = br.readLine().toCharArray();
                for(int j=0;j<M;j++){
                    array[i][j] = c[j]-'0';
                    check[i][j] = false;
                }
            }

            BFS(0,0);
            bw.write(array[N-1][M-1]+"");
            bw.flush();
        }catch(Exception e){}
    }

    void BFS(int i,int j){
        Queue<int[]>queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        check[i][j]=true;

        while(!queue.isEmpty()){
            int [] num = queue.poll();

            for(int k=0;k<4;k++){
                int nx = num[0]+dx[k];
                int ny = num[1]+dy[k];

                if(nx>=0 && ny>=0 && nx<N && ny<M){
                    if(array[nx][ny]!=0 && !check[nx][ny]){
                        check[nx][ny]=true;
                        array[nx][ny] = array[num[0]][num[1]]+1;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}