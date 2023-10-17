package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

		List<Integer> values=Arrays.asList(1,5,2,8,10,15);
		//		for (int i = 0; i < 5; i++) {
		//			System.out.println(values.get(i));
		//		}

		//		for(int i:values)
		//		{
		//			System.out.println(i);
		//		}

		int data=values.stream().filter(i ->i%2==1).map(i -> i*2).reduce(0, (c,e) ->c+e);
		System.out.println(data);
		}
	}