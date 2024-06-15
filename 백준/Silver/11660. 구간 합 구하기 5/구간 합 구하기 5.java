import java.io.*;
import java.util.StringTokenizer;

public class Main {

    void run(){
        try{
            int N,query;
            int [][]A;
            int [][]S;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;

            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            query = Integer.parseInt(st.nextToken());

            A = new int[N+1][N+1];
            S = new int[N+1][N+1];

            for(int i=1;i<N+1;i++){
                st = new StringTokenizer(br.readLine());

                for(int j=1;j<N+1;j++){
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i=1;i<N+1;i++){

                for(int j=1;j<N+1;j++){

                    if(i==1) {
                        S[1][j] = S[1][j - 1] + A[1][j];
                    }else if(j==1){
                        S[i][1] = S[i-1][1]+A[i][1];
                    }else {
                        S[i][j] = S[i][j-1]+S[i-1][j]-S[i-1][j-1]+A[i][j];
                    }
                }
            }

            for(int k=0;k<query;k++){
                st = new StringTokenizer(br.readLine());
                int x1 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());

                int result = S[x2][y2]-S[x1-1][y2]-S[x2][y1-1]+S[x1-1][y1-1];
                bw.write(result+"\n");
            }
            bw.flush();

        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
}
