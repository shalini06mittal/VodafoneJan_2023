package serialization;
// serialization => process to convert java objects to byte streams so 
// that they can be transferred over the streams

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import reflection.Product;

public class SerializaDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Product p1 = new Product(1, "P1", "D12", 2312.23);
		// serialization
		FileOutputStream writer = new FileOutputStream("products.txt");
		ObjectOutputStream output = new ObjectOutputStream(writer);
		output.writeObject(p1);
		output.close();
		writer.close();
		// deserialization
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("products.txt"));
		System.out.println(inputStream.readObject());
		inputStream.close();
	}
}
