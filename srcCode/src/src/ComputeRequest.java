package src;

public interface ComputeRequest {
	FileInput getInputConfig();
	FileOutput getOutputConfig();
	char getDelimeter();
}
