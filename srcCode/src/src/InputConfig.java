package src;

public class InputConfig implements Input {

	private final String fileName;

	public InputConfig(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

}
