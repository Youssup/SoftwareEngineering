package src; 

import java.util.concurrent.TimeUnit;

import java.util.Scanner;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import scienceRules.ComputeCoordinatorGrpc;
import scienceRules.ComputeCoordinatorOuterClass.ComputeRequest;
import scienceRules.ComputeCoordinatorOuterClass.ComputingResult;
import scienceRules.ComputeCoordinatorGrpc.ComputeCoordinatorBlockingStub;

public class ComputeClient { 
	 private ComputeCoordinatorBlockingStub blockingStub = null; // Boilerplate TODO: update to appropriate blocking stub

	  public ComputeClient(Channel channel) {
	    blockingStub = ComputeCoordinatorGrpc.newBlockingStub(channel);  // Boilerplate TODO: update to appropriate blocking stub
	  }
	  
	  // Boilerplate TODO: replace this method with actual client call/response logic
	  public void compute(String path) {
		scienceRules.DataStorageAPIOuterClass.FileInput fileInput = 
				scienceRules.DataStorageAPIOuterClass.FileInput.newBuilder().
				setPath(path).build();
		
		ComputeRequest request = ComputeRequest.newBuilder().setFileInput(fileInput).build(); // Boilerplate TODO: update to appropriate request
	    ComputingResult response;
	    try {
	      response = blockingStub.run(request);
	    } catch (StatusRuntimeException e) {
	      return;
	    }
	    if (response.isInitialized()) {
	    	System.err.println("Error: ");
	    } else {
<<<<<<< HEAD
	    	System.out.println("Initialized: ");
=======
	    	System.out.println("I'm joker now: ");
>>>>>>> main
	    }
	  }

	  public static void main(String[] args) throws Exception {
<<<<<<< HEAD
	    String target = "localhost:55504";  // Boilerplate TODO: make sure the server/port match the server/port you want to connect to
=======
	    String target = "localhost:42069";  // Boilerplate TODO: make sure the server/port match the server/port you want to connect to
>>>>>>> main

	    ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
	        .build();
	    try {
	    	ComputeClient client = new ComputeClient(channel); // Boilerplate TODO: update to this class name
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Enter the path to the file: ");
	    	String path = scanner.nextLine();
	    	client.compute(path);
<<<<<<< HEAD
	    	scanner.close();
=======
>>>>>>> main
	    } finally {
	      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
}
