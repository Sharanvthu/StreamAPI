package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AlienDemo 
{

	public static void main(String[] args)
	{
		Alien a1=new Alien("sharan", 1, 8);
		Alien a2=new Alien("basava", 2, 4);
		Alien a3=new Alien("MANTHU", 3, 7);
		Alien a4=new Alien("sneha", 4, 9);
		

		List<Alien> list=new ArrayList<Alien>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		Stream<Alien> data=list.stream().filter(n ->n.getArating()>1);
		data.forEach(n ->System.out.println(n));
		a1.updatedName("vignesh");
		a2.updatedName("harsha");
		System.out.println("=====================================");
		Stream<Alien> data1=list.stream().filter(n ->n.getArating()>1);
		data1.forEach(n->System.out.println(n));
	}
}