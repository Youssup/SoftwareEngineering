package src; 

import java.util.concurrent.TimeUnit;

import java.util.Scanner;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import scienceRules.ComputeCoordinatorGrpc;
//import scienceRules.ComputeCoordinatorOuterClass.ComputeRequest;
import scienceRules.ComputeCoordinatorOuterClass.ComputingResult;
import scienceRules.ComputeCoordinatorGrpc.ComputeCoordinatorBlockingStub;

public class ComputeClient { 
	 private ComputeCoordinatorBlockingStub blockingStub = null; 
	 // Boilerplate TODO: update to appropriate blocking stub

	  public ComputeClient(Channel channel) {
	    blockingStub = ComputeCoordinatorGrpc.newBlockingStub(channel);  
	    // Boilerplate TODO: update to appropriate blocking stub
	  }
	  //C:\Users\sbran\Documents\SE\DarknessImprisonsMe\SoftwareEngineering\largeInput.txt
	  // Boilerplate TODO: replace this method with actual client call/response logic
	  public void compute(String path, char delimiter) {
		scienceRules.DataStorageAPIOuterClass.FileInput fileInput = 
				scienceRules.DataStorageAPIOuterClass.FileInput.newBuilder().
				setPath(path).build();
		scienceRules.ComputeCoordinatorOuterClass.ComputeRequest 
		request = scienceRules.ComputeCoordinatorOuterClass.ComputeRequest
				.newBuilder().setFileInput(fileInput).
				setDelimiter(Character.toString(delimiter)).build();
		
		
		//ComputeRequest request = ComputeRequest.newBuilder().
		//setFileInput(fileInput).build(); 
		// Boilerplate TODO: update to appropriate request
	    ComputingResult response;
	    try {
	      response = blockingStub.run(request);
	    } catch (StatusRuntimeException e) { //Error here
	    	e.printStackTrace();
	      return;
	    }
	    if (response.isInitialized()) {
	    	System.out.println("Initialized:");
	    } else {
	    	System.err.println("Error:");
	    }
	  }

	  public static void main(String[] args) throws Exception {
	    String target = "localhost:55504";  
	    // Boilerplate TODO: make sure the server
	    // /port match the server/port you want to connect to

	    ManagedChannel channel = Grpc.newChannelBuilder
	    		(target, InsecureChannelCredentials.create())
	        .build();
	    try {
	    	ComputeClient client = new ComputeClient(channel); 
	    	// Boilerplate TODO: update to this class name
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Enter the path to the file: ");
	    	String path = scanner.nextLine();
	    	client.compute(path, ',');
	    	scanner.close();

	    } finally {
	      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
}
