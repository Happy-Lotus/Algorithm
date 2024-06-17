import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    void run(){
        try{
            int N,start,end,count=0;
            long [] A;
            long k;

            N = Integer.parseInt(br.readLine());
            A = new long[N];

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                A[i] = Long.parseLong(st.nextToken());
            }

            Arrays.sort(A);

            for(int i=0;i<N;i++){
                k=A[i];
                start=0;
                end=N-1;
                while(start<end){
                    if(start == i){
                        start++;
                        continue;
                    }else if(end == i){
                        end--;
                        continue;
                    }
                    if(A[start]+A[end] == k){
                        count++;
                        break;
                    }else if(A[start]+A[end]<k){
                        start++;
                    }else if(A[start]+A[end]>k){
                        end--;
                    }
                }
            }
            bw.write(String.valueOf(count).toString());
            bw.flush();
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
}
