package chapter17;

import java.io.*;

public class TestDataStream {

	public static void main(String[] args) throws IOException {
		try ( // Create an output stream for file temp.dat
				DataOutputStream output = new DataOutputStream(new FileOutputStream("boring.dll"));) {
			// Write student test scores to the file
			output.writeUTF("John");
      output.writeDouble(86875647565.534);
//      output.writeUTF("Jim");
//      output.writeDouble(185.5);
//      output.writeUTF("George");
//      output.writeDouble(105.25);
    	output.writeLong(5);
			//output.writeUTF("5");
		output.writeInt(5);
    	output.writeDouble(5);
		}

		try ( // Create an input stream for file temp.dat
			DataInputStream datinput = new DataInputStream(new FileInputStream("boring.dll"));) {
			// Read student test scores from the file
			// System.out.println(datinput.readUTF());
			System.out.println(datinput.readUTF() + " " + datinput.readDouble());
//			System.out.println(datinput.readUTF() + " " + datinput.readDouble());
//			System.out.println(datinput.readUTF() + " " + datinput.readDouble());

    	//System.out.println(datinput.readLong());
			//System.out.println(datinput.readUTF());
			System.out.println(datinput.readInt());
			System.out.println(datinput.readInt());
			System.out.println(datinput.readInt());
//    	System.out.println(datinput.readInt());
		}
	}
}
