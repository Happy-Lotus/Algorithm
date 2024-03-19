import java.io.*;
import java.util.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    Queue<Integer> queue = new LinkedList<>();


    public void run(){
        try{
            int N = Integer.parseInt(br.readLine());
            int num=0,last=0,result=0;

            while(N>0){
                N--;
                st = new StringTokenizer(br.readLine());
                String order = st.nextToken();
                if(order.equals("push")) {
                    num = Integer.parseInt(st.nextToken());
                    last = num;
                }

                switch(order){
                    case "push":
                        queue.add(num);
                        continue;
                    case "pop":
                        if(queue.isEmpty())
                            result = -1;
                        else
                            result = queue.poll();
                        break;
                    case "size":
                        result = queue.size();
                        break;
                    case "empty":
                        if(queue.isEmpty())
                            result = 1;
                        else
                            result = 0;
                        break;
                    case "front":
                        if(queue.isEmpty())
                            result = -1;
                        else
                            result = queue.peek();
                        break;
                    case "back":
                        if(queue.isEmpty())
                            result = -1;
                        else
                            result = last;
                        break;
                    default:
                        break;
                }
                bw.write(result+"\n");
            }
            bw.flush();
            bw.close();
        }catch(Exception e){

        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.run();
    }
}