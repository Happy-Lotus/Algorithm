import java.io.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    void run(){

        try{
            int N,sum=0;
            String s;

            N = Integer.parseInt(br.readLine());
            s = br.readLine();

            for(int i=0;i<N;i++){
                sum += s.charAt(i)-'0';
            }

            bw.write(String.valueOf(sum).toString());
            bw.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
}