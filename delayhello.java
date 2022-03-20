import java.util.*;
class delayhello
{
    int data;
    delayhello link;
    delayhello()
    {
        for(int j=1;j<=999999999;j++);
        data=0;
        link=null;
        for(int j=1;j<=999999999;j++);
    }
    void create()
    {
        for(int j=1;j<=999999999;j++);
        int n;
        Scanner sc=new Scanner(System.in);
        for(int j=1;j<=999999999;j++);
        int arr[]={72,69,76,76,79,32,87,79,82,76,68};
        this.data=72;
        delayhello temp;
        delayhello ptr=this;
        for(int i=1;i<=10;i++)
        {
            temp=new delayhello();
            temp.data=arr[i];
            temp.link=null;
            ptr.link=temp;
            temp=null;
            ptr=ptr.link;
            for(int j=1;j<=999999999;j++);
        }
    }
    void display()
    {
        for(int j=1;j<=999999999;j++);
        delayhello ptr=this;
        while(ptr!=null)
        {
            System.out.print((char)(ptr.data));
            ptr=ptr.link;
        }
    }
    public static void main(String args[])
    {
        int k,p,ch;
        Scanner sc=new Scanner(System.in);
        for(int j=1;j<=999999999;j++);
        delayhello first=new delayhello();
        for(int j=1;j<=999999999;j++);
        first.create();
        first.display();
    }
}
        