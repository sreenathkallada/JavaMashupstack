import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class QN9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to append:");
		String append = input.nextLine();
		File file = new File("file.text");
		try {
			boolean value = file.createNewFile();
			if (value) {
				FileWriter output = new FileWriter("file.text");
				output.write(append);
				System.out.println("Data is writtemn on the file");
				output.close();
			}
			else {
			System.out.println("The file already exists or cant process");
			}
		}
		catch(Exception e){
			e.getStackTrace();
		}
		
		input.close();
	}

}
