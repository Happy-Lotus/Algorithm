import java.io.*;
import java.util.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Stack<Integer> stack = new Stack<>();

    public void run(){
        try{
            long sum=0;
            int k = Integer.parseInt(br.readLine());
            for(int i=0;i<k;i++){
                int num = Integer.parseInt(br.readLine());
                if(num == 0){
                    stack.pop();
                }else{
                    stack.add(num);
                }
            }

            while(!stack.isEmpty()){
                sum+=stack.pop();
            }
            bw.write(sum+"");
            bw.flush();

        }catch(Exception e){

        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.run();
    }
}