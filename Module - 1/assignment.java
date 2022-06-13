import java.util.*;
public class assignment{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student in Mathematics: ");
        int m = sc.nextInt();
        System.out.println("Enter the marks of the student in Science: ");
        int s = sc.nextInt();
        System.out.println("Enter the marks of the student in English: ");
        int e = sc.nextInt();
        int avg = 0;
        avg = (m+s+e)/3;
        if(avg>=90){
            System.out.println("Grade: A");
        }
        else if(avg>=70 && avg<90){
            System.out.println("Grade: B");
        }
        else if(avg>=50 && avg<70){
            System.out.println("Grade: C");
        }
        else{
            System.out.println("Grade: D");
        }
    }
}