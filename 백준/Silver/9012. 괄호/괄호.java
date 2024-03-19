import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Stack<Character> stack;

    int check(){
        if(stack.empty())
            return 1;
        else
            return 0;
    }
    void run() {

        try {

            int N = Integer.parseInt(br.readLine());

            for(int i=0;i<N;i++){
                String s = br.readLine();
                stack = new Stack<>();
                int count=0;

                for(int j=0;j<s.length();j++){
                    char c = s.charAt(j);

                    if(stack.empty() && c==')') {
                        count=-1;
                        break;
                    }

                    if(c == '(')
                        stack.push(c);
                    else if(c == ')'){
                        stack.pop();
                    }

                }

                if(!stack.empty())
                    bw.write("NO\n");
                else if (count<0)
                    bw.write("NO\n");
                else
                    bw.write("YES\n");
            }

            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main b = new Main();
        b.run();
    }
}