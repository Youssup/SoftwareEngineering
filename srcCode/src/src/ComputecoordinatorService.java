package src;

import io.grpc.stub.StreamObserver;
import src.ComputeCoordinatorGrpc.ComputeCoordinatorImplBase;
import src.ComputeCoordinatorOuterClass.ComputeRequest;
import src.ComputeCoordinatorOuterClass.ComputingResult;

public class ComputecoordinatorService extends ComputeCoordinatorImplBase {

	@Override
	public void compute(ComputeRequest request, StreamObserver<ComputingResult> responseObserver) {
		// TODO Auto-generated method stub
		super.compute(request, responseObserver);
	}
	
	
}