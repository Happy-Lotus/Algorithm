import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    int [] A = new int[4];
    int [] B = new int[4];
    int checkSecret=0;
    void Add(int n){
            switch(n){
                case 'A':
                    B[0]++;
                    if(A[0] == B[0])checkSecret++;
                    break;
                case 'C':
                    B[1]++;
                    if(A[1] == B[1])checkSecret++;
                    break;
                case 'G':
                    B[2]++;
                    if(A[2] == B[2])checkSecret++;
                    break;
                case 'T':
                    B[3]++;
                    if(A[3] == B[3])checkSecret++;
                    break;
            }
    }

    void Minus(int n){
        switch(n){
            case 'A':
                if(A[0] == B[0])checkSecret--;
                B[0]--;
                break;
            case 'C':
                if(A[1] == B[1])checkSecret--;
                B[1]--;
                break;
            case 'G':
                if(A[2] == B[2])checkSecret--;
                B[2]--;
                break;
            case 'T':
                if(A[3] == B[3])checkSecret--;
                B[3]--;
                break;
        }
    }

    void run(){
        try{
            int P,S,count=0;
            String str;
            char [] strChar;

            st = new StringTokenizer(br.readLine());
            P = Integer.parseInt(st.nextToken()); 
            S = Integer.parseInt(st.nextToken()); 

            str = br.readLine();
            strChar = str.toCharArray();

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<4;i++){
                A[i] = Integer.parseInt(st.nextToken());
                if(A[i]==0)
                    checkSecret++;
            }

            for(int i=0;i<S;i++){
                Add(strChar[i]);
            }

            if(checkSecret == 4){
                count++;
            }

            for(int i=S;i<P;i++){
                int j=i-S;

                Add(strChar[i]);
                Minus(strChar[j]);
                if(checkSecret ==4)
                    count++;
            }
            System.out.println(count);

        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
}
