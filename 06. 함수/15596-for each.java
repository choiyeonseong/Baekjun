public class Main {
    long sum(int[] a) {
        long ans = 0;
        for(int value:a){
            ans+=value;
        }
        return ans;
   }
}
//일반 for문보다 for-each문이 더 
