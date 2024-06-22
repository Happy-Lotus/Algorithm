import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    boolean [] arr;

    void run() {

        try {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            arr = new boolean[M+1];

            arr[0]=true;
            arr[1]=true;

            for(int i=2;i<Math.sqrt(arr.length);i++){
                if(arr[i]){
                    continue;
                }

                for(int j=i*i;j<arr.length;j+=i){
                    arr[j] = true;
                }
            }

            for(int i=N;i<arr.length;i++){
                if(!arr[i])bw.write((i)+"\n");
            }

            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main b = new Main();
        b.run();
    }
}