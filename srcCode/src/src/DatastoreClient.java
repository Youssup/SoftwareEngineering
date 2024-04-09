package src;
/*
import src.Datastorage;
import java.util.concurrent.TimeUnit;
import Datastore.Datastore.AddNumbersRequest;
import Datastore.Datastore.AddNumbersResponse;
import Datastore.DatastoreServiceGrpc.DatastoreServiceBlockingStub;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
*/
/*
public class DatastoreClient {

	     private final Datastoreblockingstub blockingStub; // Boilerplate TODO: update to appropriate blocking stub

	      public DatastoreClient(Channel channel) {
	        blockingStub = DatastoreServiceGrpc.newBlockingStub(channel);  // Boilerplate TODO: update to appropriate blocking stub
	      }

	      public void add() {
	        AddNumbersRequest request = AddNumbersRequest.newBuilder().setOne(2).setTwo(3).build();
	        AddNumbersResponse response;
	        try {
	          response = blockingStub.addNumbers(request);
	        } catch (StatusRuntimeException e) {
	          return;
	        }
	        if (response.hasErrorMessage()) {
	            System.err.println("Error: " + response.getErrorMessage());
	        } else {
	            System.out.println("Result: " + response.getResult());
	        }
	      }

	      public static void main(String[] args) throws Exception {
	        String target = "localhost:50051";

	        ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
	            .build();
	        try {
	          DatastoreClient client = new DatastoreClient(channel);
	          client.add();
	        } finally {
	          channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
	        }
	      }
}
*/