class Parent
{
    void m1()
    {
        System.out.println("Parent");
    }
}
class child extends Parent

{
   void m2()
   {
       System.out.println("child");
   }    
}
class Test
{
    public static void main (String []args)
{
    child c=new child();
    c.m1();
    c.m2();
}
}
