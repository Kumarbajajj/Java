public class zero_one_triangle {
    public static void main(String args[]){
        int N=5;
        
        for(int i =1; i<=N; i++){
            for(int j = 1; j<=i; j++){
                int sum =i+j;
                if(sum%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
                
            }
            System.out.println();
        }
    }
}
