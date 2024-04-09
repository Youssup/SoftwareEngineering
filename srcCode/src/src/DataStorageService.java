package src;

import java.util.Iterator;

import io.grpc.stub.StreamObserver;
import src.DataStorageAPIGrpc.DataStorageAPIImplBase;
import src.DataStorageAPIOuterClass.FileInput;
import src.DataStorageAPIOuterClass.FileOutput;
import src.DataStorageAPIOuterClass.IntegerIterator;
import src.DataStorageAPIOuterClass.WritingResult;

public class DataStorageService extends DataStorageAPIImplBase {

	@Override
	public void read(FileInput request, StreamObserver<IntegerIterator> responseObserver) {
		Iterator<Integer> intIterator = null;
		try {
			intIterator = DataStorageAPI.readFile(request.getPath());
			
			IntegerIterator.Builder builder = IntegerIterator.newBuilder();
			
			
			
		} catch (Exception e) {
	        intIterator = null;
			e.printStackTrace();
		}
		
		if (intIterator != null) {
			while (intIterator.hasNext()) {
				responseObserver.onNext(IntegerIterator.newBuilder().addValue(intIterator.next()).build());
			}
			responseObserver.onCompleted();
		} else {
			responseObserver.onError(new Exception("Error reading file"));
		}
	}

	@Override
	public void userTranslate(FileOutput request, StreamObserver<WritingResult> responseObserver) {
		WritingResult.Builder builder = WritingResult.newBuilder();
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	
	
}