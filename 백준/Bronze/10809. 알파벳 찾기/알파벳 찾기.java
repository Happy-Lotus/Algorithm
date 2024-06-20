import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void run(){
        try {
            char [] c = br.readLine().toCharArray();
            int [] alp = new int[26];

            Arrays.fill(alp,-1);

            for(int j=0;j<c.length;j++){
                if(alp[c[j]-'a']!=-1)
                    continue;
                alp[c[j]-'a'] = j;
            }

            for (int i : alp) {
                sb.append(i+" ");
            }
            System.out.println(sb);

        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}