import java.util.Scanner;

public class Feranite{
    public static void main(String[] args) {
        int S,E,W,c1;
        Scanner sc = new Scanner(System.in);
        S = sc.nextInt();
        E = sc.nextInt();
        W = sc.nextInt();

        while(S<=E){
            c1= (5*(S-32))/9;
            System.out.println(S+"\t"+c1);
            S=S+W;
        }

    }
}