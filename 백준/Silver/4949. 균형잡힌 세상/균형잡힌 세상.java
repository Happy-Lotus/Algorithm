import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    void run(){
        try {
            String s;
            Stack<Character> stack = new Stack<>();
            while((s=br.readLine()).contains(".") && s.length()>1){
                char [] c = s.toCharArray();

                for(int i=0;i<c.length;i++){

                    if(c[i] == '('){
                        stack.push(c[i]);
                    }else if(c[i] == '['){
                        stack.push(c[i]);
                    } else if(c[i]==')' ){
                        if((stack.isEmpty() && i!=c.length-1) ){
                            bw.write("no\n");
                            break;
                        }else if(stack.peek()!='['){
                            stack.pop();
                        }else{
                            bw.write("no\n");
                            break;
                        }
                    }else if(c[i]==']'){
                        if((stack.isEmpty() && i!=c.length-1) ){
                            bw.write("no\n");
                            break;
                        }else if(stack.peek()!='('){
                            stack.pop();
                        }else{
                            bw.write("no\n");
                            break;
                        }
                    }

                    if(i==c.length-1){
                        if(!stack.isEmpty()){
                            bw.write("no\n");
                        }else{
                            bw.write("yes\n");
                        }
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