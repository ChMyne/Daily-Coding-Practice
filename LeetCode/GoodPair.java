import java.util.*;
public class Main
{
    public static int goodNum(int nums[]){
        int cnt=0;
        int freq[]=new int[101];
        for(int a:nums){
            cnt+=freq[a];
            freq[a]++;
        }
        return cnt;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++){
		    nums[i]=sc.nextInt();
		}
		System.out.println(goodNum(nums));
		
	}
}
