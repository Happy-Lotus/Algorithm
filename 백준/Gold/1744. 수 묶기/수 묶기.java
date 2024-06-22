import java.io.*;
import java.util.*;

public class Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    ArrayList<Integer> plusArray = new ArrayList<>();
    ArrayList<Integer> minusArray = new ArrayList<>();
    
    void run(){
        try {
            int N = Integer.parseInt(br.readLine());

            for(int i = 0; i < N; i++){
                int num = Integer.parseInt(br.readLine());
                if(num > 0){
                    plusArray.add(num);
                }else {
                    minusArray.add(num);
                }
            }

            Collections.sort(plusArray, Collections.reverseOrder());
            Collections.sort(minusArray);

            int result = 0;

            // Pair positive numbers
            for(int i = 0; i < plusArray.size() - 1; i += 2){
                if(plusArray.get(i) > 1 && plusArray.get(i + 1) > 1){
                    result += plusArray.get(i) * plusArray.get(i + 1);
                } else {
                    result += plusArray.get(i) + plusArray.get(i + 1);
                }
            }
            if(plusArray.size() % 2 == 1){
                result += plusArray.get(plusArray.size() - 1);
            }

            // Pair negative numbers
            for(int i = 0; i < minusArray.size() - 1; i += 2){
                result += minusArray.get(i) * minusArray.get(i + 1);
            }
            if(minusArray.size() % 2 == 1){
                result += minusArray.get(minusArray.size() - 1);
            }

            bw.write(result + "");
            bw.flush();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}