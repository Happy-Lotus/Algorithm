import java.io.*;
import java.util.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int [][] arr;
    
    public void run(){
        try{
            int N = Integer.parseInt(br.readLine());
            int answer=0;
            int prev=0;
            
            arr = new int[N][2];
            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr,new Comparator<int[]>(){

                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[1]==o2[1]){
                        return o1[0]-o2[0];
                    }
                    return o1[1]-o2[1];
                }
            });

            for(int i=0;i<N;i++){
                int start = arr[i][0];

                if(i==0){
                    answer++;
                    prev = arr[i][1];
                }else{
                    if(prev<=start){
                        prev = arr[i][1];
                        answer++;
                    }
                }
            }
            bw.write(answer+"");
            bw.flush();
        }catch(Exception e){
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.run();
    }
}