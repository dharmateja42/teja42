class Inheritance
{
    public void sum(int x,int y)
    {
        System.out.println(x+y);
    }
}
class A //extends Inheritance
{
    public void subt(int x,int y)
    {
        System.out.println(x-y);
    }
    public static void main(String [] args)
    {
        A aa=new A();
        Inheritance i=new Inheritance();
        i.sum(10,20);
        aa.subt(20,10);
    }
}