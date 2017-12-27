package test;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//Test t = new Test();	
		Test  t1= Test.getInstance();
		//Test t2 = Test.class.newInstance();
		//Test t3= (Test) Class.forName("test.Test").newInstance();
		//System.out.println(t1.hashCode()+"\n"+t2.hashCode()+"\n"+t3.hashCode());
		System.out.println(t1.hashCode());
		
	}

}
