package src;

import io.grpc.stub.StreamObserver;
import src.ComputeEngineAPIGrpc.ComputeEngineAPIImplBase;
import src.ComputeEngineAPIOuterClass.ComputeEngineRequest;
import src.ComputeEngineAPIOuterClass.InputValue;
import src.ComputeEngineAPIOuterClass.OutputString;

public class ComputeEngineAPIService extends ComputeEngineAPIImplBase{

	@Override
	public void compute(ComputeEngineRequest request, StreamObserver<OutputString> responseObserver) {
		// TODO Auto-generated method stub
		super.compute(request, responseObserver);
	}

	@Override
	public void avl(InputValue request, StreamObserver<OutputString> responseObserver) {
		// TODO Auto-generated method stub
		super.avl(request, responseObserver);
	}
	
	
	
}