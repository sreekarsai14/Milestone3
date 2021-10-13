package counter;
class A
{
	static int i;
	
	public A()
	{
		i++;
		
	}
	public void count()
	{
		
		System.out.println(i);
	}
}

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		A obj2=new A();
		obj2.count();

	}

}
