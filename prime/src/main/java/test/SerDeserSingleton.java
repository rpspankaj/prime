package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserSingleton {
	public static void main(String[] args)
	{ 
		Test object = Test.getInstance();
		System.out.println(object.hashCode());
		
		String filename = "file.ser";
		
		// Serialization 
		try
		{ 
			//Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// Method for serialization of object
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");

		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}


		Test object1 = null;

		// Deserialization
		try
		{ 
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method for deserialization of object
			object1 = (Test)in.readObject();
			System.out.println(object1.hashCode());
			in.close();
			file.close();
			
			System.out.println("Object has been deserialized ");
			
		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}

	}
}
