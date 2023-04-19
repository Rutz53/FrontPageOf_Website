import java.util.*;
class VolOfBox1
{
public static void main(String args[])
{
int l,b,h,v;
Scanner sc = new Scanner(System.in);
System.out.println("Enter length,height,breadth");
l=sc.nextInt();
b= sc.nextInt();
h =sc.nextInt();
v = l*b*h;
System.out.println("Volume of Box:" + v);

} 
}