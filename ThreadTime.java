class ThreadTime extends Thread{
	public static void main(String args [])
	{
		ThreadTime ref = new ThreadTime();
		
		ref.start();
	}
	public void run(){
		int i=1;
		while(i>0)
		{
			System.out.print(i+ "\r");
			i++;
			try{
			Thread.sleep(1000);
			}catch(InterruptedException ie){
				System.out.println("Interrupted");
			}
		}
		
	}
}
