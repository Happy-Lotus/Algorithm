import java.io.*;
import java.util.StringTokenizer;

public class Main {

    void run(){
        try{
            int count,query;
            int [] A;
            int [] S;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;

            st = new StringTokenizer(br.readLine());
            count = Integer.parseInt(st.nextToken());
            query = Integer.parseInt(st.nextToken());
            A = new int[count+1];
            S = new int[count+1];

            st = new StringTokenizer(br.readLine());

            for(int i=1;i<count+1;i++){
                int temp = Integer.parseInt(st.nextToken());
                A[i] = temp;
                if(i!=1){
                    S[i] = S[i-1]+A[i];
                }else{
                    S[1] = A[1];
                }
            }

            for(int j=0;j<query;j++){
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                bw.write((S[end]-S[start-1])+"\n");
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
