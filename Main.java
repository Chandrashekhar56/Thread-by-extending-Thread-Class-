 class a extends Thread
{
   public void run()
    {
        int i=0;
        for(i=10;i<20;i++)
        {
            System.out.println("class a: "+i);
        }
    }
}
class b extends Thread
{
    public void run()
    {
        int i=0;
        for(i=20;i<30;i++)
        {
            System.out.println("class b: "+i);
        }
    }
}
class c extends Thread
{
    public void run()
    {
        int i=0;
        for(i=1;i<10;i++)
        {
            System.out.println("class c: "+i);
        }
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    a ob=new a();
	    b ob1=new b();
	    c ob2=new c();
	    
	    ob.setPriority(Thread.MIN_PRIORITY);
	    ob1.setPriority(Thread.NORM_PRIORITY);
	    ob2.setPriority(Thread.MAX_PRIORITY);
	    
	    ob.start();
	    ob1.start();
	    ob2.start();
	}
}
