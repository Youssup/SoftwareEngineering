package src;

public class ComputingResult implements ComputeResult {

	public static final ComputingResult SUCCESS = new ComputingResult();

	public ComputingResult() {

	}


	@Override
	public ComputeResultStatus getStatus() {
		throw new UnsupportedOperationException("Unimplemented method 'getStatus'");
	}

}
