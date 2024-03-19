package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreateDeleteRename {
	
	public void Create(String name) throws IOException{
		
		File f1 = new File("../JavaLearning/src/FileHandling/"+name);
		
		f1.createNewFile();
		
		System.out.println(f1.getName()+" created Successfully!");
				
	}
	
	public void Delete(String name) {
		
		File f2 = new File("../JavaLearning/src/FileHandling/"+name);
		
		if (f2.exists()) {
			
			f2.delete();		
			
			System.out.println(f2.getName()+" deleted Successfully!");
			
		}
		else {
			System.out.println(f2.getName()+" does not exist!");
		}
		
	}
	
	public void Rename(String oldName, String newName) {
		  File oldfile = new File("../JavaLearning/src/FileHandling/" + oldName);
		  File newfile = new File("../JavaLearning/src/FileHandling/" + newName);

		  if (oldfile.exists()) {
				
				oldfile.renameTo(newfile);		
				
				System.out.println(oldfile.getName()+" renamed to "+newfile.getName()+" Successfully!");
				
			}
			else {
				System.out.println(oldfile.getName()+" does not exist!");
			}
			
		}

	
	public static void main(String[] args) throws IOException {
		
		FileCreateDeleteRename file = new FileCreateDeleteRename();
		Scanner s = new Scanner(System.in);
		

		System.out.println("File Handling \n\n1. Create\n2. Delete\n3. Rename\n\nEnter your choice: ");

		String choice = s.next();	//Why I not declare choice as integer ? (because when integer, it can cause InputMismatchException)

		
		switch (choice) {

		case "1":
			System.out.println("Enter file name to create: ");
			String cr_name = s.next();
			file.Create(cr_name);
			break;
		
		case "2":
			System.out.println("Enter file name to delete: ");
			String dl_name = s.next();
			file.Delete(dl_name);
			break;

		case "3":
			System.out.println("Enter file name to rename: ");
			String oldname = s.next();
			System.out.println("Enter new file name: ");
			String newname = s.next();
			file.Rename(oldname, newname);
			break;

		default:
			System.out.println("Invalid choice!");
			break;
		}

		s.close();
	}
}
