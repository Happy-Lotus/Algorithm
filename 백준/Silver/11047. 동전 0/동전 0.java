import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    void run(){
        try {
            st  = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int count=0;

            ArrayList<Integer> money = new ArrayList<>();
            for(int i=0;i<N;i++){
                money.add(Integer.parseInt(br.readLine()));
            }

            int j = money.size()-1;
            while(K!=0){
                int value = money.get(j);

                if(K>=value){
                    count += K/value;
                    K%=value;
                }
                j--;
            }

            bw.write(count+"");
            bw.flush();
        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}