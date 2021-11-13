import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(int a,int b){
        length=a;
        breadth=b;
    }
    int Area(){
        int lb=length*breadth;
        return(lb);
    }
}
class Calculate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len1=sc.nextInt();
        int bre1=sc.nextInt();
        int len2=sc.nextInt();
        int bre2=sc.nextInt();
        Rectangle obj1=new Rectangle(len1,bre1);
        Rectangle obj2=new Rectangle(len2,bre2);

        int m=obj1.Area();
        System.out.println(m);
        int n=obj2.Area();
        System.out.println(n);

    }
}
