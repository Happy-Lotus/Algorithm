import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    void run(){
        try {
            String [] s = br.readLine().split("-");
            int result = 0;

            for(int i=0;i<s.length;i++){
                String [] temp = s[i].split("\\+");
                int sum=0;

                if(temp.length==1){
                    sum+=Integer.parseInt(temp[0]);
                }else{
                    for(int j=0;j<temp.length;j++){
                        sum+=Integer.parseInt(temp[j]);
                    }
                }

                if(i==0) result += sum;
                else result-=sum;
            }
            bw.write(result+"");
            bw.flush();
        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}