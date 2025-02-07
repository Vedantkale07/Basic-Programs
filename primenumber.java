public class primenumber {
    public static void main(String[] args) {
        
        int n=25;
        int ans= prime(n);
        if(n==ans)
            System.out.println(n+" is prime !!");
        else if(ans== -1){
            System.out.println(n+" is not prime");
        }
      
      
    }

    @SuppressWarnings("unused")
    public static int prime(int n){

        for (int i = 2; i <n; i++) {
            if(n%i ==0)
            {
               break;
            }
            return n;
           
        }
        return -1;

       }
}
