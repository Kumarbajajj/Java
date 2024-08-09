public class Floyd_triangle {
    public static void main(String args[]){

        int N = 10;
        int Number = 1;

        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(Number +" ");
                Number++;
            }
                System.out.println();
        }
    }
}
