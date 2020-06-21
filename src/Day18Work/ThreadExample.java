package Day18Work;


class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		for(int i=0;i<100;i=i+10)
		{
			System.out.println("the value of  Mythread  is"+i);
		}
	}
	
}

public class ThreadExample {

	
	void printTenNumber()
	{
		System.out.println(Thread.currentThread().getName());
		
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
	
	for(int i=0;i<10;i++)
	{
		System.out.println("the value of  i is"+i);
	}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample te =new ThreadExample();
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		
		t1.start();
		te.printTenNumber();

	}

}
