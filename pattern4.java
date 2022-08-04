public class pattern4 {
    public static void main(String args[]){
        for(int i=7;i>=1;i-=2){
            for(int j=1;j<=7;j++){
                if(j>=i) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i+=2){
            System.out.print(" ");
            for(int j=1;j<=5;j++){
                if(j>=i) System.out.print(" *");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
