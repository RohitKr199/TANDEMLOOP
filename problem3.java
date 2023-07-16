import java.util.*;
public class problem3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows(n):");
    int n=sc.nextInt();
    sc.close();
    if(n%2 == 0){
        n = n-1;
        for(var i=0; i<n*2; i++){
            if(i%2!= 0){
                System.out.println(i);
            }
        }
    } else {
        for(var i=0; i<n*2; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

    }
    
}
