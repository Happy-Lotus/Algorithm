import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    void run(){
        try {
            int N = Integer.parseInt(br.readLine());
            Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {

                    if(Math.abs(o1) == Math.abs(o2)){
                        if(o1>o2){
                            return 1;
                        }else{
                            return -1;
                        }
                    }else{
                        return Math.abs(o1)-Math.abs(o2);
                    }
                }
            });

            for(int i=0;i<N;i++){
                int num = Integer.parseInt(br.readLine());
                if(num!=0){
                    queue.add(num);
                }else{
                    if(queue.isEmpty()){
                        bw.write("0\n");
                    }else{
                        bw.write(queue.remove()+"\n");
                    }
                }
            }
            bw.flush();
        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}