import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    void run(){

        try{

            int N;
            N = Integer.parseInt(br.readLine());

            for(int i=0;i<N;i++) {
                String s = br.readLine();
                int [] alp = new int[26];

                for(int j=0;j<s.length();j++) {
                    if(s.charAt(j)>='a' && s.charAt(j)<='z')
                        alp[s.charAt(j)-'a']++;
                }

                int max=0;
                for(int r:alp){
                    if(r>max)
                        max=r;
                }

                int result=0;
                int count=0;

                for(int k=0;k<26;k++){
                    if(max == alp[k]){
                        count++;
                        result =k;
                    }
                }
                String output = count == 1 ? (char) (result + 'a') +"\n" : "?\n";
                bw.write(output);
            }
            bw.flush();
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        Main b = new Main();
        b.run();
    }
}