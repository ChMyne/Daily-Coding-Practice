import java.util.*;
class Main {
    public static boolean isOneBitCharacter(int[] bits) {
        final int n=bits.length;
        int i=0;
        while(i<n-1){
            i+=1+bits[i];
        }
        return i==n-1;
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bits[]=new int[n];
        for(int i=0;i<n;i++){
            bits[i]=sc.nextInt();
        }
        System.out.println(isOneBitCharacter(bits));
    }
}
