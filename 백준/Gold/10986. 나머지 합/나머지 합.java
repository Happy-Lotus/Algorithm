import java.io.*;
import java.util.StringTokenizer;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    void run(){
        try{
            int N,M;
            long [] S;
            long [] C;
            long count=0;

            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            S = new long[N+1];
            C = new long[M];

            st = new StringTokenizer(br.readLine());
            for(int i=1;i<N+1;i++){
                S[i] = (S[i-1]+Integer.parseInt(st.nextToken()))%M;

                if(S[i] == 0)count++;

                C[(int)S[i]]++;
            }

            for(int i=0;i<M;i++){
                if(C[i]>1)
                    count = count + (C[i] * (C[i]-1) / 2);
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
