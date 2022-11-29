import java.util.*;
class factorialRecursion
{
    public static int fact(int n)
    {
        if(n==1 || n==0) 
        return 1;
        else
        return n*fact(n-1); 
    }
    public static void main(String[]abc)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("insert a number to find the factorial of a given number");
        int a=sc.nextInt();
        int factorial=fact(a);
        System.out.println("the factorial of given number is :-"+factorial);
    }
}