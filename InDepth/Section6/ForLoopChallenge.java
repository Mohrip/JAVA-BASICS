package InDepth.Section6;

public class ForLoopChallenge {
    public static void main(String[] args) {
        // You can call the isprime method here if needed
    }

    public static boolean isprime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
