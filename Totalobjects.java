class Totalobjects
{
    static int count;
    Totalobjects()
    {
        count++;
    }

public static void main(String[] args) {
		Totalobjects t1=new Totalobjects();
				Totalobjects t2=new Totalobjects();
		Totalobjects t3=new Totalobjects();
				Totalobjects t4=new Totalobjects();
        System.out.println("Total number of objects: " + count);

	}
}