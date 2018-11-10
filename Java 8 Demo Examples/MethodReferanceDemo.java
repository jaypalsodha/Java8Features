
class MethodReferanceDemo

{
	public int m1(int x)
	{
		for (int i =0;i<10 ;i++ ) {
				System.out.println("Child Thread");
			}
			return -1;
	}
	public static void main(String[] args) {
		
		MethodReferanceDemo mr = new MethodReferanceDemo();
		Runnable r = mr :: m1;
		Thread t = new Thread(r);
		t.start();
		for (int i =0;i<10 ;i++ ) {
				System.out.println("Main Thread");
			}
	}
}