
public class Geometry
  {
    int l;
    int b;
    int a;
    int p;
    int s;
public Geometry(int l)
  {
	this.l =l;

}
public void breadth (int breadth)
{
      b=breadth;
}
public void perimeter ()
{
  p=2*(l+b);
  System.out.println("perimeter:"+ p);
}
public void area()
{
  a=(l*b);
  System.out.println("Area:"+a);
}
public void sum()
{
  s=(p+a);
  System.out.println("sum:"+s);
}

}

