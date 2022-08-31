package StriverSheet;

public class Prime {
    public static void main(String[] args) {
        int n = 55;  
        if(n == 0 || n == 1){
            System.out.println("Not Prime");
        }

        if(n>=2 && n%2 == 0){
            System.out.println("HPrime");
        }else{
            int top = (int)Math.sqrt(n)+1;
            for(int i=3; i<top; i+=2){
                if( n % i == 0){
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
        
        
            
        

       

        
    }   
}
