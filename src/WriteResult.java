// This is just a simple implementation of the WriteResult class
// We will adjust and build this shortly

public class WriteResult{

    public WriteResultStatus getStatus(){
        return WriteResultStatus.SUCCESS;
    }
	
	public static enum WriteResultStatus {
		SUCCESS,
		FAILURE;
	}
}
