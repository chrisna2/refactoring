package code.refactoring.methodsimple_8;

public class ResourcePoolTest {
	
	public static void main(String[] args) { 
	 	Resource a=new Resource(); a.num=1; 
	 	Resource b=new Resource(); a.num=2; 
	 	ResourcePool rp=new ResourcePool();
	 	System.out.println( rp.getResource().num );
	}

}
