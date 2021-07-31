package activities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		String filePath = "resources\\Activity14.txt";
		// TODO Auto-generated method stub
		File file = new File(filePath);
		System.out.println("File created successfully. " + filePath);
		FileUtils.writeStringToFile(file, "This is a sample file");
		System.out.println("Write operation to file is successful");
		try {
			boolean fStatus = file.createNewFile();
			System.out.println(fStatus);
			if (fStatus) {
				System.out.println("File creation is successful");
			} else {
				System.out.println("File already exists in the path");
			}

			// get the file Object
			File fileUtil = FileUtils.getFile(filePath);
			// Read file
			System.out.println("Data in file is read successfully. Content of file is: "
					+ FileUtils.readFileToString(fileUtil, "UTF8"));

			// Create directory
			File destDir = new File("data");
			// Copy file to directory
			FileUtils.copyFileToDirectory(file, destDir);
			System.out.println("File is copied to newly created directory");
			// Get file from new directory
			File newFile = FileUtils.getFile(destDir, "Activity14.txt");
			// Read data from file
			String newFileData = FileUtils.readFileToString(newFile, "UTF8");
			System.out.println("Read data from copied file is successful.File content:" + newFileData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
