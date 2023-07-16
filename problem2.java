import java.util.*;
public class problem2{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows(n):");
int n=sc.nextInt();
sc.close();
for(int i=0; i<n*2; i++){
    if(i%2 != 0){
        System.out.println(i);
    }
   
}
System.out.println();
 }
}