class Student
{
    public int age()
    {
        return 14;
    }
}

class sixth extends Student
{
    public int age()
    {
        return 12;
    }
}

class seventh extends Student
{
    public int age()
    {
        return 16;
    }
}

public class Downcasting
{
    public static void main(String[] args) {

        Student st = new sixth();
        System.out.println(((sixth)st).age()); //downcasting to sixth class methods
		Student st1 = new seventh();
        System.out.println(((seventh)st1).age()); //downcasting to seventh class methods
	}
}