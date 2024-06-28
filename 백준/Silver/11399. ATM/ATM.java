import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    void run(){
        try {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int [] a = new int[N];
            int [] s = new int[N];

            for(int i = 0;i<N;i++){
                a[i]=Integer.parseInt(st.nextToken());
            }

            int target = 1;
            while(target<N){
                int num = a[target];
                int index=target;
                for(int j=target-1;j>=0;j--){
                    if(num<a[j]){
                        index=j;
                    }
                }
                if(target!=index){
                    for(int j = target;j>index;j--){
                        int temp = a[j-1];
                        a[j-1]=num;
                        a[j]=temp;

                    }
                }
                target++;
            }

            int result = a[0];
            s[0]=a[0];
            for(int i = 1;i<N;i++){
                s[i]=s[i-1]+a[i];
                result+=s[i];
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