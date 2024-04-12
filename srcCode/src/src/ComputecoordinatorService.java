package src;

import io.grpc.stub.StreamObserver;
import scienceRules.ComputeCoordinatorGrpc.ComputeCoordinatorImplBase;
import scienceRules.ComputeCoordinatorOuterClass.ComputeRequest;
import scienceRules.ComputeCoordinatorOuterClass.ComputingResult;

public class ComputecoordinatorService extends ComputeCoordinatorImplBase {
		
	ComputeCoordinator cc = new ComputeCoordinator();

	@Override
	public void run(ComputeRequest request, StreamObserver<ComputingResult> responseObserver) {
		ComputingResult response = null;
		try {
			FileInput input = new FileInput(request.getFileInput().getPath());
			src.ComputingResult cr = cc.run(input, 
					request.getDelimiter().charAt(0));
			response = ComputingResult.newBuilder().setResultValue(1).build();

		} catch (Exception e) {
			response = ComputingResult.newBuilder().setResultValue(2).build();
			responseObserver.onError(e);
		}
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
}
	
	
