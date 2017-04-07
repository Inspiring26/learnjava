import java.util.*;
public class Collect
{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		//sop("size:"+al.size());
		al.remove("java01");
		sop(al);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}