package src;

public class OutputConfig implements Output{

	private final String fileName;

	public OutputConfig(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

}
