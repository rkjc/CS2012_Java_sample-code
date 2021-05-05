package binaryio;

import java.io.*;
import java.util.Date;

public class Exercise17_07 {


	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		double total = 0;
		double total2 = 0;
		int count = 0;
		
		try (ObjectInputStream input = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("Exercise17_06.dat")));) 
		{
				
				while(true) {
					Loan tempLoan = (Loan) (input.readObject());
					total2 += tempLoan.getLoanAmount();
					count += 1;
				}
			
//				Loan loan1 = (Loan) (input.readObject());
//				Loan loan2 = (Loan) (input.readObject());
//				Loan loan3 = (Loan) (input.readObject());
//				Loan loan4 = (Loan) (input.readObject());
//				Loan loan5 = (Loan) (input.readObject());
//				
//				total = loan1.getLoanAmount() + loan2.getLoanAmount() + loan3.getLoanAmount() + loan4.getLoanAmount() + loan5.getLoanAmount();
//				System.out.println(total);
	
		} catch (EOFException e) {
			System.out.println("total2= " + total2);
			System.out.println("count= " + count);
		}
	}
}
