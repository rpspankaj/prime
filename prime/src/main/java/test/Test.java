package test;

import java.io.Serializable;

class Test implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 4475302749015460797L;
	private static Test t=null;
	
	private Test(){
	}
	
	public static Test getInstance(){
	if(t==null){
	t= new Test();
		}
	return t;
	}
	
	protected Object readResolve(){
		return t;
		
	}
}
