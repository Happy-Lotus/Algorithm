import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    
    int N,M,u,w;
    int [][]arr;
    int count=0;
    boolean visited[];

    void run()throws IOException
    {
    	StringTokenizer stoken=new StringTokenizer(input.readLine());
    	do {
        	N=Integer.parseInt(stoken.nextToken());
        	M=Integer.parseInt(stoken.nextToken());
        }while((N<1 || N>1000)&&(M<0 || M>(N*((N-1)/2)))); 
        arr=new int[N+1][N+1];
        visited=new boolean[N+1];
        
        for(int i=0;i<M;i++)
        {
        	stoken=new StringTokenizer(input.readLine());
        	do {
        	u=Integer.parseInt(stoken.nextToken());
        	w=Integer.parseInt(stoken.nextToken());
        	}while((u<1||w>N)&&(u!=w));
        	arr[u][w]=arr[u][w]=1;
        }
      
        for(int i=1;i<=N;i++)
        {
        	if(visited[i]!=true)
        	{
        		DFS(i);
        		count++;
        	}        		
        }
        System.out.println(count);
    }
    
    void DFS(int start)
    {
    	visited[start]=true;
    
    	for(int i=0;i<=N;i++)
    	{
    		if((arr[start][i]==1||arr[i][start]==1) && visited[i]!=true)
    		{
    			DFS(i);
    		}
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main my=new Main();
        try{
        	my.run();
        }catch(IOException e)
        {
        	System.out.println("ERROR");
        }
	}
}