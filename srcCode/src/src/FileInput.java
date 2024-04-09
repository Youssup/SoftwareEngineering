package src;

public class FileInput implements Input {

	private final String fileName;

	public FileInput(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}
}
