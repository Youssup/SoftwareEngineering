package src;
import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(value = "by gRPC proto compiler (version 1.59.1)", comments = "Source: DataStorageAPI.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataStorageAPIGrpc {

	private DataStorageAPIGrpc() {
	}

	public static final java.lang.String SERVICE_NAME = "DataStorageAPI";

	// Static method descriptors that strictly reflect the proto.
	private static volatile io.grpc.MethodDescriptor<DataStorageAPIOuterClass.FileInput, DataStorageAPIOuterClass.IntegerIterator> getReadMethod;

	@io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
			+ "read", requestType = DataStorageAPIOuterClass.FileInput.class, responseType = DataStorageAPIOuterClass.IntegerIterator.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
	public static io.grpc.MethodDescriptor<DataStorageAPIOuterClass.FileInput, DataStorageAPIOuterClass.IntegerIterator> getReadMethod() {
		io.grpc.MethodDescriptor<DataStorageAPIOuterClass.FileInput, DataStorageAPIOuterClass.IntegerIterator> getReadMethod;
		if ((getReadMethod = DataStorageAPIGrpc.getReadMethod) == null) {
			synchronized (DataStorageAPIGrpc.class) {
				if ((getReadMethod = DataStorageAPIGrpc.getReadMethod) == null) {
					DataStorageAPIGrpc.getReadMethod = getReadMethod = io.grpc.MethodDescriptor.<DataStorageAPIOuterClass.FileInput, DataStorageAPIOuterClass.IntegerIterator>newBuilder()
							.setType(io.grpc.MethodDescriptor.MethodType.UNARY)
							.setFullMethodName(generateFullMethodName(SERVICE_NAME, "read"))
							.setSampledToLocalTracing(true)
							.setRequestMarshaller(io.grpc.protobuf.ProtoUtils
									.marshaller(DataStorageAPIOuterClass.FileInput.getDefaultInstance()))
							.setResponseMarshaller(io.grpc.protobuf.ProtoUtils
									.marshaller(DataStorageAPIOuterClass.IntegerIterator.getDefaultInstance()))
							.setSchemaDescriptor(new DataStorageAPIMethodDescriptorSupplier("read")).build();
				}
			}
		}
		return getReadMethod;
	}

	private static volatile io.grpc.MethodDescriptor<DataStorageAPIOuterClass.FileOutput, DataStorageAPIOuterClass.WritingResult> getUserTranslateMethod;

	@io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
			+ "userTranslate", requestType = DataStorageAPIOuterClass.FileOutput.class, responseType = DataStorageAPIOuterClass.WritingResult.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
	public static io.grpc.MethodDescriptor<DataStorageAPIOuterClass.FileOutput, DataStorageAPIOuterClass.WritingResult> getUserTranslateMethod() {
		io.grpc.MethodDescriptor<DataStorageAPIOuterClass.FileOutput, DataStorageAPIOuterClass.WritingResult> getUserTranslateMethod;
		if ((getUserTranslateMethod = DataStorageAPIGrpc.getUserTranslateMethod) == null) {
			synchronized (DataStorageAPIGrpc.class) {
				if ((getUserTranslateMethod = DataStorageAPIGrpc.getUserTranslateMethod) == null) {
					DataStorageAPIGrpc.getUserTranslateMethod = getUserTranslateMethod = io.grpc.MethodDescriptor.<DataStorageAPIOuterClass.FileOutput, DataStorageAPIOuterClass.WritingResult>newBuilder()
							.setType(io.grpc.MethodDescriptor.MethodType.UNARY)
							.setFullMethodName(generateFullMethodName(SERVICE_NAME, "userTranslate"))
							.setSampledToLocalTracing(true)
							.setRequestMarshaller(io.grpc.protobuf.ProtoUtils
									.marshaller(DataStorageAPIOuterClass.FileOutput.getDefaultInstance()))
							.setResponseMarshaller(io.grpc.protobuf.ProtoUtils
									.marshaller(DataStorageAPIOuterClass.WritingResult.getDefaultInstance()))
							.setSchemaDescriptor(new DataStorageAPIMethodDescriptorSupplier("userTranslate")).build();
				}
			}
		}
		return getUserTranslateMethod;
	}

	/**
	 * Creates a new async stub that supports all call types for the service
	 */
	public static DataStorageAPIStub newStub(io.grpc.Channel channel) {
		io.grpc.stub.AbstractStub.StubFactory<DataStorageAPIStub> factory = new io.grpc.stub.AbstractStub.StubFactory<DataStorageAPIStub>() {
			@java.lang.Override
			public DataStorageAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
				return new DataStorageAPIStub(channel, callOptions);
			}
		};
		return DataStorageAPIStub.newStub(factory, channel);
	}

	/**
	 * Creates a new blocking-style stub that supports unary and streaming output
	 * calls on the service
	 */
	public static DataStorageAPIBlockingStub newBlockingStub(io.grpc.Channel channel) {
		io.grpc.stub.AbstractStub.StubFactory<DataStorageAPIBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<DataStorageAPIBlockingStub>() {
			@java.lang.Override
			public DataStorageAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
				return new DataStorageAPIBlockingStub(channel, callOptions);
			}
		};
		return DataStorageAPIBlockingStub.newStub(factory, channel);
	}

	/**
	 * Creates a new ListenableFuture-style stub that supports unary calls on the
	 * service
	 */
	public static DataStorageAPIFutureStub newFutureStub(io.grpc.Channel channel) {
		io.grpc.stub.AbstractStub.StubFactory<DataStorageAPIFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<DataStorageAPIFutureStub>() {
			@java.lang.Override
			public DataStorageAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
				return new DataStorageAPIFutureStub(channel, callOptions);
			}
		};
		return DataStorageAPIFutureStub.newStub(factory, channel);
	}

	/**
	 */
	public interface AsyncService {

		/**
		 */
		default void read(DataStorageAPIOuterClass.FileInput request,
				io.grpc.stub.StreamObserver<DataStorageAPIOuterClass.IntegerIterator> responseObserver) {
			io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
		}

		/**
		 */
		default void userTranslate(DataStorageAPIOuterClass.FileOutput request,
				io.grpc.stub.StreamObserver<DataStorageAPIOuterClass.WritingResult> responseObserver) {
			io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserTranslateMethod(), responseObserver);
		}
	}

	/**
	 * Base class for the server implementation of the service DataStorageAPI.
	 */
	public static abstract class DataStorageAPIImplBase implements io.grpc.BindableService, AsyncService {

		@java.lang.Override
		public final io.grpc.ServerServiceDefinition bindService() {
			return DataStorageAPIGrpc.bindService(this);
		}
	}

	/**
	 * A stub to allow clients to do asynchronous rpc calls to service
	 * DataStorageAPI.
	 */
	public static final class DataStorageAPIStub extends io.grpc.stub.AbstractAsyncStub<DataStorageAPIStub> {
		private DataStorageAPIStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@java.lang.Override
		protected DataStorageAPIStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			return new DataStorageAPIStub(channel, callOptions);
		}

		/**
		 */
		public void read(DataStorageAPIOuterClass.FileInput request,
				io.grpc.stub.StreamObserver<DataStorageAPIOuterClass.IntegerIterator> responseObserver) {
			io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getReadMethod(), getCallOptions()), request,
					responseObserver);
		}

		/**
		 */
		public void userTranslate(DataStorageAPIOuterClass.FileOutput request,
				io.grpc.stub.StreamObserver<DataStorageAPIOuterClass.WritingResult> responseObserver) {
			io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getUserTranslateMethod(), getCallOptions()),
					request, responseObserver);
		}
	}

	/**
	 * A stub to allow clients to do synchronous rpc calls to service
	 * DataStorageAPI.
	 */
	public static final class DataStorageAPIBlockingStub
			extends io.grpc.stub.AbstractBlockingStub<DataStorageAPIBlockingStub> {
		private DataStorageAPIBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@java.lang.Override
		protected DataStorageAPIBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			return new DataStorageAPIBlockingStub(channel, callOptions);
		}

		/**
		 */
		public DataStorageAPIOuterClass.IntegerIterator read(DataStorageAPIOuterClass.FileInput request) {
			return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getReadMethod(), getCallOptions(), request);
		}

		/**
		 */
		public DataStorageAPIOuterClass.WritingResult userTranslate(DataStorageAPIOuterClass.FileOutput request) {
			return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getUserTranslateMethod(), getCallOptions(),
					request);
		}
	}

	/**
	 * A stub to allow clients to do ListenableFuture-style rpc calls to service
	 * DataStorageAPI.
	 */
	public static final class DataStorageAPIFutureStub
			extends io.grpc.stub.AbstractFutureStub<DataStorageAPIFutureStub> {
		private DataStorageAPIFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			super(channel, callOptions);
		}

		@java.lang.Override
		protected DataStorageAPIFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
			return new DataStorageAPIFutureStub(channel, callOptions);
		}

		/**
		 */
		public com.google.common.util.concurrent.ListenableFuture<DataStorageAPIOuterClass.IntegerIterator> read(
				DataStorageAPIOuterClass.FileInput request) {
			return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getReadMethod(), getCallOptions()),
					request);
		}

		/**
		 */
		public com.google.common.util.concurrent.ListenableFuture<DataStorageAPIOuterClass.WritingResult> userTranslate(
				DataStorageAPIOuterClass.FileOutput request) {
			return io.grpc.stub.ClientCalls
					.futureUnaryCall(getChannel().newCall(getUserTranslateMethod(), getCallOptions()), request);
		}
	}

	private static final int METHODID_READ = 0;
	private static final int METHODID_USER_TRANSLATE = 1;

	private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
			io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
			io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
			io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
		private final AsyncService serviceImpl;
		private final int methodId;

		MethodHandlers(AsyncService serviceImpl, int methodId) {
			this.serviceImpl = serviceImpl;
			this.methodId = methodId;
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("unchecked")
		public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
			switch (methodId) {
			case METHODID_READ:
				serviceImpl.read((DataStorageAPIOuterClass.FileInput) request,
						(io.grpc.stub.StreamObserver<DataStorageAPIOuterClass.IntegerIterator>) responseObserver);
				break;
			case METHODID_USER_TRANSLATE:
				serviceImpl.userTranslate((DataStorageAPIOuterClass.FileOutput) request,
						(io.grpc.stub.StreamObserver<DataStorageAPIOuterClass.WritingResult>) responseObserver);
				break;
			default:
				throw new AssertionError();
			}
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("unchecked")
		public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
			switch (methodId) {
			default:
				throw new AssertionError();
			}
		}
	}

	public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
		return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
				.addMethod(getReadMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
						new MethodHandlers<DataStorageAPIOuterClass.FileInput, DataStorageAPIOuterClass.IntegerIterator>(
								service, METHODID_READ)))
				.addMethod(getUserTranslateMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
						new MethodHandlers<DataStorageAPIOuterClass.FileOutput, DataStorageAPIOuterClass.WritingResult>(
								service, METHODID_USER_TRANSLATE)))
				.build();
	}

	private static abstract class DataStorageAPIBaseDescriptorSupplier
			implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
		DataStorageAPIBaseDescriptorSupplier() {
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
			return DataStorageAPIOuterClass.getDescriptor();
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
			return getFileDescriptor().findServiceByName("DataStorageAPI");
		}
	}

	private static final class DataStorageAPIFileDescriptorSupplier extends DataStorageAPIBaseDescriptorSupplier {
		DataStorageAPIFileDescriptorSupplier() {
		}
	}

	private static final class DataStorageAPIMethodDescriptorSupplier extends DataStorageAPIBaseDescriptorSupplier
			implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
		private final java.lang.String methodName;

		DataStorageAPIMethodDescriptorSupplier(java.lang.String methodName) {
			this.methodName = methodName;
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
			return getServiceDescriptor().findMethodByName(methodName);
		}
	}

	private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

	public static io.grpc.ServiceDescriptor getServiceDescriptor() {
		io.grpc.ServiceDescriptor result = serviceDescriptor;
		if (result == null) {
			synchronized (DataStorageAPIGrpc.class) {
				result = serviceDescriptor;
				if (result == null) {
					serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
							.setSchemaDescriptor(new DataStorageAPIFileDescriptorSupplier()).addMethod(getReadMethod())
							.addMethod(getUserTranslateMethod()).build();
				}
			}
		}
		return result;
	}
}
