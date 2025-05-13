package Creational.Singleton;

import static java.lang.System.out;

public class Program {

    public static void main(String[] args) {
        {
            Singleton1 s1 = Singleton1.getInstance(); // create
            Singleton1 s2 = Singleton1.getInstance(); // reference
            out.println(s1);
            out.println(s2);
        }
        {
            Singleton2 s1 = Singleton2.getInstance();
            Singleton2 s2 = Singleton2.getInstance();
            out.println(s1);
            out.println(s2);
        }
        {
            Singleton3 s1 = Singleton3.getInstance();
            Singleton3 s2 = Singleton3.getInstance();
            out.println(s1);
            out.println(s2);
        }
		/*{
			Creational.Singleton.Singleton4 s1 = Creational.Singleton.Singleton4.getInstance();
			Creational.Singleton.Singleton4 s2 = Creational.Singleton.Singleton4.getInstance();
			out.println(s1);
			out.println(s2);
		}
		{
			Creational.Singleton.Singleton5 s1 = Creational.Singleton.Singleton5.getInstance();
			Creational.Singleton.Singleton5 s2 = Creational.Singleton.Singleton5.getInstance();
			out.println(s1);
			out.println(s2);
		}
		{
			Creational.Singleton.Singleton6 s1 = Creational.Singleton.Singleton6.instance;
			Creational.Singleton.Singleton6 s2 = Creational.Singleton.Singleton6.instance;
			out.println(s1);
			out.println(s2);
		}
		{
			Creational.Singleton.Singleton7 s1 = Creational.Singleton.Singleton7.instance;
			Creational.Singleton.Singleton7 s2 = Creational.Singleton.Singleton7.instance;
			out.println(s1);
			out.println(s2);
			s1.someMethod();
			s2.someMethod();
		}*/

    }

}
