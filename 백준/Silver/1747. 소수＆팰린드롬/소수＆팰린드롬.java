import java.io.*;
import java.util.*;

public class Main {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    void run(){
        try {

            int N = Integer.parseInt(br.readLine());
            int [] arr = new int[10000001];

            for(int i=2;i<arr.length;i++){
                arr[i]=i;
            }

            for(int j=2;j<Math.sqrt(arr.length);j++){
                if(arr[j]==0) continue;

                for(int k = j+j; k<arr.length;k+=j){
                    arr[k]=0;
                }
            }
            int i = N;
            while(true) {
                if (arr[i] != 0) {
                    int result = arr[i];
                    if (isPalindrome(result)) {
                        bw.write(result + "");
                        break;
                    }
                }
                i++;
            }
            bw.flush();
        }catch(Exception e){}
    }

    boolean isPalindrome(int num){
        String s = String.valueOf(num);
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.run();
    }
}