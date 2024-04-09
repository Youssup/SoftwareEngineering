package src;

public class ComputingRequest implements ComputeRequest {

	private final FileInput inputConfig;
	private final FileOutput outputConfig;
	private final char delimeter;

	// Constructor for testing purposes
	public ComputingRequest() {
		this.inputConfig = new FileInput("TestInput.txt");
		this.outputConfig = new FileOutput("TestOutput.txt");
		this.delimeter = ',';
	}

	public ComputingRequest(FileInput inputConfig, FileOutput outputConfig, char delimeter) {
		this.inputConfig = inputConfig;
		this.outputConfig = outputConfig;
		this.delimeter = delimeter;
	}

	@Override
	public FileInput getInputConfig() {
		return inputConfig;
	}

	@Override
	public FileOutput getOutputConfig() {
		return outputConfig;
	}

	@Override
	public char getDelimeter() {
		return delimeter;
	}

}
