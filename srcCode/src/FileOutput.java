package src;

public class FileOutput implements Output {
	
	private final String fileName;

	public FileOutput(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}
}
