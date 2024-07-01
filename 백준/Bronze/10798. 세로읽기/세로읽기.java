import java.io.*;
import java.util.*;

public class Main {
    ArrayList<Character> []A;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    void run() {
        try {
            A = new ArrayList[5];
            int max=0;
            String str="";

            for(int i=0;i<A.length;i++){
                str = br.readLine();

                if(i==0)max = str.length();
                else if(max<str.length())max=str.length();
                A[i] = new ArrayList<>();
                for(int j=0;j<str.length();j++){

                    A[i].add(str.charAt(j));
                }
            }

            int i=0,j=0;
            while(j<max){

                if(i ==5){i=0;j++;}
                if(A[i].size() <= j){
                    i++;
                    continue;
                }

                bw.write(A[i].get(j));
                i++;
            }
            bw.flush();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}