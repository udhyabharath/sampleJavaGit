package Day14Work;

import java.util.*;

public class GenricExample {
	
	void stackSample()
	{
		Stack<Integer> intstack=new Stack<Integer>();
		intstack.push(100);
		intstack.push(213);
		intstack.push(2434);
		
		intstack.push(65);
		
		
		System.out.println("The stack" +intstack);
		System.out.println("pop" +intstack.pop());
		System.out.println("The stack after pop1" +intstack);
		System.out.println("The stack" +intstack.peek());
		System.out.println("The stack" +intstack);
		intstack.push(444);
		System.out.println("Peek" +intstack.peek());
		System.out.println("The stack after peek2" +intstack);
		
	}
	
	/// Hash Set
	
	void setSample()
	{
		Set<String> stringSet=new HashSet<String>();
		stringSet.add("Hello");
		stringSet.add("Hi");
		stringSet.add("Welcome");
		stringSet.add("Done");
		//stringSet.add("Bye");
		
		for(String str1 : stringSet)
		{
			System.out.println(str1);
		}
		
		
	}
		////// Tree Set
		
		void setSample1()
		{
			Set<String> stringSet=new TreeSet<String>();
			stringSet.add("Hello");
			stringSet.add("Hi");
			stringSet.add("Welcome");
			stringSet.add("Done");
			stringSet.add("Bye");
			
			for(String str1 : stringSet)
			{
				System.out.println(str1);
			}
			
		
		
	}
	
		/////List
		
		
		void listSample()
		{
			LinkedList<Float> floatList = new LinkedList<Float>();
			floatList.add(123.33f);
			floatList.add(290.43f);
			floatList.add(67.223f);
			floatList.add(98776.09f);
			floatList.addFirst(345.4f);
			floatList.add(2, 23.33f);
			Set<Float> floatSet = new TreeSet<Float>();
			floatSet.addAll(floatList);		
			System.out.println(floatSet);
			
					
	}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenricExample ge=new GenricExample();
		ge.stackSample();
		ge.setSample();
		ge.setSample1();
		ge.listSample();

	}

}
