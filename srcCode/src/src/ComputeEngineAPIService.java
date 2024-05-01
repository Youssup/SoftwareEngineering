package src;

import java.math.BigInteger;

import io.grpc.stub.StreamObserver;
import scienceRules.ComputeEngineAPIGrpc.ComputeEngineAPIImplBase;
import scienceRules.ComputeEngineAPIOuterClass.ComputeEngineRequest;
import scienceRules.ComputeEngineAPIOuterClass.InputValue;
import scienceRules.ComputeEngineAPIOuterClass.OutputString;
import scienceRules.ComputeEngineAPIOuterClass;
import scienceRules.ComputeEngineAPIGrpc;


public class ComputeEngineAPIService extends ComputeEngineAPIImplBase{

	ComputeEngineAPI computeEngineAPI = new ComputeEngineAPI();
	
	@Override
	public void avl(InputValue request, StreamObserver<OutputString> responseObserver) {
		
		OutputString response = null;
		try {
			int height = request.getValue();
			BigInteger result = computeEngineAPI.avl(height);
			response = OutputString.newBuilder().setOutput((result).toString()).build();
		} catch (Exception e) {
			response = OutputString.newBuilder().setOutput("Error").build();
		}
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}
	@Override
	public void compute(ComputeEngineRequest request, StreamObserver<OutputString> responseObserver) {
		// TODO Auto-generated method stub
		super.compute(request, responseObserver);
	}
	
}