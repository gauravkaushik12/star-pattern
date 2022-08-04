public class pattern3 {
    public static void main(String args[]){
        for(int i=9;i>=1;i-=2){
            for(int j=1;j<=9;j++){
                if(j>=i) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
