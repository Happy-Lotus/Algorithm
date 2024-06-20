import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    void run(){
        try {
            int T = Integer.parseInt(br.readLine());
            Stack<Character>stack = new Stack<>();

            for(int i=0;i<T;i++){
                String str = br.readLine();

                for(int j=0;j<str.length();j++){
                    char c = str.charAt(j);

                    if(c=='('){
                        stack.push(c);
                    }else if(c==')'){
                        if(!stack.isEmpty())
                            stack.pop();
                        else {
                            bw.write("NO\n");
                            break;
                        }
                    }

                    if(j==str.length()-1){
                        if(stack.isEmpty()) bw.write("YES\n");
                        else bw.write("NO\n");
                    }
                }
                stack.clear();
            }
            bw.flush();
        }catch(Exception e){}
    }
    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}