package src;



import static io.grpc.MethodDescriptor.generateFullMethodName;

import src.ComputeCoordinatorOuterClass;
import src.ComputeCoordinatorOuterClass.ComputeRequest;
import src.ComputeCoordinatorOuterClass.ComputingResult;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.1)",
    comments = "Source: ComputeCoordinator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ComputeCoordinatorGrpc {

  private ComputeCoordinatorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ComputeCoordinator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ComputeCoordinatorOuterClass.ComputeRequest,
      ComputeCoordinatorOuterClass.ComputingResult> getComputeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compute",
      requestType = ComputeCoordinatorOuterClass.ComputeRequest.class,
      responseType = ComputeCoordinatorOuterClass.ComputingResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ComputeCoordinatorOuterClass.ComputeRequest,
      ComputeCoordinatorOuterClass.ComputingResult> getComputeMethod() {
    io.grpc.MethodDescriptor<ComputeCoordinatorOuterClass.ComputeRequest, ComputeCoordinatorOuterClass.ComputingResult> getComputeMethod;
    if ((getComputeMethod = ComputeCoordinatorGrpc.getComputeMethod) == null) {
      synchronized (ComputeCoordinatorGrpc.class) {
        if ((getComputeMethod = ComputeCoordinatorGrpc.getComputeMethod) == null) {
          ComputeCoordinatorGrpc.getComputeMethod = getComputeMethod =
              io.grpc.MethodDescriptor.<ComputeCoordinatorOuterClass.ComputeRequest, ComputeCoordinatorOuterClass.ComputingResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Compute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComputeCoordinatorOuterClass.ComputeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComputeCoordinatorOuterClass.ComputingResult.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeCoordinatorMethodDescriptorSupplier("Compute"))
              .build();
        }
      }
    }
    return getComputeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComputeCoordinatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeCoordinatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeCoordinatorStub>() {
        @java.lang.Override
        public ComputeCoordinatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeCoordinatorStub(channel, callOptions);
        }
      };
    return ComputeCoordinatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComputeCoordinatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeCoordinatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeCoordinatorBlockingStub>() {
        @java.lang.Override
        public ComputeCoordinatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeCoordinatorBlockingStub(channel, callOptions);
        }
      };
    return ComputeCoordinatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComputeCoordinatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeCoordinatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeCoordinatorFutureStub>() {
        @java.lang.Override
        public ComputeCoordinatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeCoordinatorFutureStub(channel, callOptions);
        }
      };
    return ComputeCoordinatorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void compute(ComputeCoordinatorOuterClass.ComputeRequest request,
        io.grpc.stub.StreamObserver<ComputeCoordinatorOuterClass.ComputingResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getComputeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ComputeCoordinator.
   */
  public static abstract class ComputeCoordinatorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ComputeCoordinatorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ComputeCoordinator.
   */
  public static final class ComputeCoordinatorStub
      extends io.grpc.stub.AbstractAsyncStub<ComputeCoordinatorStub> {
    private ComputeCoordinatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeCoordinatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeCoordinatorStub(channel, callOptions);
    }

    /**
     */
    public void compute(ComputeCoordinatorOuterClass.ComputeRequest request,
        io.grpc.stub.StreamObserver<ComputeCoordinatorOuterClass.ComputingResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getComputeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ComputeCoordinator.
   */
  public static final class ComputeCoordinatorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ComputeCoordinatorBlockingStub> {
    private ComputeCoordinatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeCoordinatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeCoordinatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public ComputeCoordinatorOuterClass.ComputingResult compute(ComputeCoordinatorOuterClass.ComputeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getComputeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ComputeCoordinator.
   */
  public static final class ComputeCoordinatorFutureStub
      extends io.grpc.stub.AbstractFutureStub<ComputeCoordinatorFutureStub> {
    private ComputeCoordinatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeCoordinatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeCoordinatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ComputeCoordinatorOuterClass.ComputingResult> compute(
        ComputeCoordinatorOuterClass.ComputeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getComputeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMPUTE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
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
        case METHODID_COMPUTE:
          serviceImpl.compute((ComputeCoordinatorOuterClass.ComputeRequest) request,
              (io.grpc.stub.StreamObserver<ComputeCoordinatorOuterClass.ComputingResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getComputeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ComputeCoordinatorOuterClass.ComputeRequest,
              ComputeCoordinatorOuterClass.ComputingResult>(
                service, METHODID_COMPUTE)))
        .build();
  }

  private static abstract class ComputeCoordinatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComputeCoordinatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ComputeCoordinatorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComputeCoordinator");
    }
  }

  private static final class ComputeCoordinatorFileDescriptorSupplier
      extends ComputeCoordinatorBaseDescriptorSupplier {
    ComputeCoordinatorFileDescriptorSupplier() {}
  }

  private static final class ComputeCoordinatorMethodDescriptorSupplier
      extends ComputeCoordinatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ComputeCoordinatorMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ComputeCoordinatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComputeCoordinatorFileDescriptorSupplier())
              .addMethod(getComputeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
