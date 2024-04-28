package src;

import java.util.Iterator;

import io.grpc.stub.StreamObserver;
import scienceRules.DataStorageAPIGrpc.DataStorageAPIImplBase;
import scienceRules.DataStorageAPIOuterClass.FileInput;
import scienceRules.DataStorageAPIOuterClass.FileOutput;
import scienceRules.DataStorageAPIOuterClass.IntegerIterator;
import scienceRules.DataStorageAPIOuterClass.WritingResult;


public class DataStorageService extends DataStorageAPIImplBase {
	
	DataStorageAPI ds = new DataStorageAPI();

	@Override
	public void read(FileInput request, StreamObserver<IntegerIterator> responseObserver) {
		Iterator<Integer> response = null;
		
		try {
			response = DataStorageAPI.readFile(request.getPath());
			
			//IntegerIterator.Builder builder = IntegerIterator.newBuilder();
			IntegerIterator.Builder builder = IntegerIterator.newBuilder();

			
						
			
		} catch (Exception e) {
	        response = null;
			e.printStackTrace();
		}
		
		if (response != null) {
			while (response.hasNext()) {
				responseObserver.onNext(IntegerIterator.newBuilder().addValue(response.next()).build());
			}
			responseObserver.onCompleted();
		} else {
			responseObserver.onError(new Exception("Error reading file"));
		}
	}

	@Override
	public void userTranslate(FileOutput request, StreamObserver<WritingResult> responseObserver) {
WritingResult response = null;
		
		WritingResult.Builder builder = WritingResult.newBuilder();
	
		try {
			src.FileOutput output = new src.FileOutput(request.getPath());
		    ds.userTranslate(output, request.getResult(), request.getDelimiter().charAt(0));
            response = builder.setResultValue(1).build();
        } catch (Exception e) {
            response = builder.setResultValue(2).build();
            e.printStackTrace();
        }
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}
