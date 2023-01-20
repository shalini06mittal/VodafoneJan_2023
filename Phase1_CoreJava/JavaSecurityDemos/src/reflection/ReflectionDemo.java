package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo {

	public static void m1(int a[])
	{
		a[0]= 100;
	}
	public static void main(String[] args) throws ClassNotFoundException {
		
		int x[] = {1,2,3};
		m1(x);
		System.out.println(x[0]);
		
		Class obj = Class.forName("reflection.Product");
		
		System.out.println(obj.getModifiers());
		System.out.println(obj.getName());
		Class superclass = obj.getSuperclass()
;
		System.out.println(superclass.getName());
		Method []methods = obj.getDeclaredMethods();
		for(Method m:methods)
		{
			System.out.println("NAme "+m.getName());
			System.out.println("Modifier "+Modifier.toString(m.getModifiers()));
			System.out.println(m.getReturnType());
		}
	}

}
