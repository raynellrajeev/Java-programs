abstract class shape
{
    abstract void numberofsides();
}
class triangle extends shape
{
    void numberofsides()
    {
        System.out.println("triangle has 3 sides");
    }
}
class rectangle extends shape
{
    void numberofsides()
    {
        System.out.println("rectangle has 4 sides");
    }
}
class hexagon extends shape
{
    void numberofsides()
    {
        System.out.println("6 sides");
    }




public static void main(String[] args) 
{
    triangle t= new triangle();
    rectangle r= new rectangle();
    hexagon h = new hexagon();
    shape s;
    s= t;
    s.numberofsides();
    s= r;
    s.numberofsides();
    s= h;
    s.numberofsides();
}}