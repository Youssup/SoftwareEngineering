package src;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.protobuf.services.ProtoReflectionService;

public class ComputeServer { 
	  private Server server;

	  private void start() throws IOException {
	    /* The port on which the server should run */
	    int port = 55504; 
	    
	    server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create())
	        .addService(new ComputecoordinatorService()) 
	        .addService(ProtoReflectionService.newInstance())
	        .build()
	        .start();
	    System.out.println("Server started on port " + port);
	    
	    Runtime.getRuntime().addShutdownHook(new Thread() {
	      @Override
	      public void run() {
	        System.err.println("*** shutting down gRPC server since JVM is shutting down");
	        try {
	        	if (server != null) {
	      	      server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
	      	    }
	        } catch (InterruptedException e) {
	          e.printStackTrace(System.err);
	        }
	        System.err.println("*** server shut down");
	      }
	    });
	  }

	  /**
	   * Await termination on the main thread since the grpc library uses daemon threads.
	   */
	  private void blockUntilShutdown() throws InterruptedException {
	    if (server != null) {
	      server.awaitTermination();
	    }
	  }

	  public static void main(String[] args) throws Exception {
		  ComputeServer server = new ComputeServer(); 
		  server.start();
		  System.out.println(avl(40));
		  server.blockUntilShutdown();
	  }
	  public static int avl(int height) {
	 		if (height == 0) {
				return 1;
			} else if (height == 1) {
			return 2;
		} else {
			return avl(height - 1) + avl(height - 2) + 1;
			}
		}
}
