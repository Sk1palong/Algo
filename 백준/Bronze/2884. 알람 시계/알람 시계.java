import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (h >0 && m >= 45) {
            System.out.println(h+" "+ (m-45));
        } 
        else if (h>0 && m<45){
            System.out.println(h-1+" " +(m+15));
          }
        else if (h==0 && m >=45)
            System.out.println(h+" "+ (m-45));
        else if (h==0 && m<45)
            System.out.println(h+23 +" " +(m+15));
          
    }
}