package src;
import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.1)",
    comments = "Source: ComputeEngineAPI.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ComputeEngineAPIGrpc {

  private ComputeEngineAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ComputeEngineAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ComputeEngineAPIOuterClass.ComputeEngineRequest,
      ComputeEngineAPIOuterClass.OutputString> getComputeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "compute",
      requestType = ComputeEngineAPIOuterClass.ComputeEngineRequest.class,
      responseType = ComputeEngineAPIOuterClass.OutputString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ComputeEngineAPIOuterClass.ComputeEngineRequest,
      ComputeEngineAPIOuterClass.OutputString> getComputeMethod() {
    io.grpc.MethodDescriptor<ComputeEngineAPIOuterClass.ComputeEngineRequest, ComputeEngineAPIOuterClass.OutputString> getComputeMethod;
    if ((getComputeMethod = ComputeEngineAPIGrpc.getComputeMethod) == null) {
      synchronized (ComputeEngineAPIGrpc.class) {
        if ((getComputeMethod = ComputeEngineAPIGrpc.getComputeMethod) == null) {
          ComputeEngineAPIGrpc.getComputeMethod = getComputeMethod =
              io.grpc.MethodDescriptor.<ComputeEngineAPIOuterClass.ComputeEngineRequest, ComputeEngineAPIOuterClass.OutputString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "compute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComputeEngineAPIOuterClass.ComputeEngineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComputeEngineAPIOuterClass.OutputString.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeEngineAPIMethodDescriptorSupplier("compute"))
              .build();
        }
      }
    }
    return getComputeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ComputeEngineAPIOuterClass.InputValue,
      ComputeEngineAPIOuterClass.OutputString> getAvlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "avl",
      requestType = ComputeEngineAPIOuterClass.InputValue.class,
      responseType = ComputeEngineAPIOuterClass.OutputString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ComputeEngineAPIOuterClass.InputValue,
      ComputeEngineAPIOuterClass.OutputString> getAvlMethod() {
    io.grpc.MethodDescriptor<ComputeEngineAPIOuterClass.InputValue, ComputeEngineAPIOuterClass.OutputString> getAvlMethod;
    if ((getAvlMethod = ComputeEngineAPIGrpc.getAvlMethod) == null) {
      synchronized (ComputeEngineAPIGrpc.class) {
        if ((getAvlMethod = ComputeEngineAPIGrpc.getAvlMethod) == null) {
          ComputeEngineAPIGrpc.getAvlMethod = getAvlMethod =
              io.grpc.MethodDescriptor.<ComputeEngineAPIOuterClass.InputValue, ComputeEngineAPIOuterClass.OutputString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "avl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComputeEngineAPIOuterClass.InputValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ComputeEngineAPIOuterClass.OutputString.getDefaultInstance()))
              .setSchemaDescriptor(new ComputeEngineAPIMethodDescriptorSupplier("avl"))
              .build();
        }
      }
    }
    return getAvlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComputeEngineAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeEngineAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeEngineAPIStub>() {
        @java.lang.Override
        public ComputeEngineAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeEngineAPIStub(channel, callOptions);
        }
      };
    return ComputeEngineAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComputeEngineAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeEngineAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeEngineAPIBlockingStub>() {
        @java.lang.Override
        public ComputeEngineAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeEngineAPIBlockingStub(channel, callOptions);
        }
      };
    return ComputeEngineAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComputeEngineAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComputeEngineAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComputeEngineAPIFutureStub>() {
        @java.lang.Override
        public ComputeEngineAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComputeEngineAPIFutureStub(channel, callOptions);
        }
      };
    return ComputeEngineAPIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void compute(ComputeEngineAPIOuterClass.ComputeEngineRequest request,
        io.grpc.stub.StreamObserver<ComputeEngineAPIOuterClass.OutputString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getComputeMethod(), responseObserver);
    }

    /**
     */
    default void avl(ComputeEngineAPIOuterClass.InputValue request,
        io.grpc.stub.StreamObserver<ComputeEngineAPIOuterClass.OutputString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAvlMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ComputeEngineAPI.
   */
  public static abstract class ComputeEngineAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ComputeEngineAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ComputeEngineAPI.
   */
  public static final class ComputeEngineAPIStub
      extends io.grpc.stub.AbstractAsyncStub<ComputeEngineAPIStub> {
    private ComputeEngineAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeEngineAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeEngineAPIStub(channel, callOptions);
    }

    /**
     */
    public void compute(ComputeEngineAPIOuterClass.ComputeEngineRequest request,
        io.grpc.stub.StreamObserver<ComputeEngineAPIOuterClass.OutputString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getComputeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void avl(ComputeEngineAPIOuterClass.InputValue request,
        io.grpc.stub.StreamObserver<ComputeEngineAPIOuterClass.OutputString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAvlMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ComputeEngineAPI.
   */
  public static final class ComputeEngineAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ComputeEngineAPIBlockingStub> {
    private ComputeEngineAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeEngineAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeEngineAPIBlockingStub(channel, callOptions);
    }

    /**
     */
    public ComputeEngineAPIOuterClass.OutputString compute(ComputeEngineAPIOuterClass.ComputeEngineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getComputeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ComputeEngineAPIOuterClass.OutputString avl(ComputeEngineAPIOuterClass.InputValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAvlMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ComputeEngineAPI.
   */
  public static final class ComputeEngineAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<ComputeEngineAPIFutureStub> {
    private ComputeEngineAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComputeEngineAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComputeEngineAPIFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ComputeEngineAPIOuterClass.OutputString> compute(
        ComputeEngineAPIOuterClass.ComputeEngineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getComputeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ComputeEngineAPIOuterClass.OutputString> avl(
        ComputeEngineAPIOuterClass.InputValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAvlMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMPUTE = 0;
  private static final int METHODID_AVL = 1;

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
          serviceImpl.compute((ComputeEngineAPIOuterClass.ComputeEngineRequest) request,
              (io.grpc.stub.StreamObserver<ComputeEngineAPIOuterClass.OutputString>) responseObserver);
          break;
        case METHODID_AVL:
          serviceImpl.avl((ComputeEngineAPIOuterClass.InputValue) request,
              (io.grpc.stub.StreamObserver<ComputeEngineAPIOuterClass.OutputString>) responseObserver);
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
              ComputeEngineAPIOuterClass.ComputeEngineRequest,
              ComputeEngineAPIOuterClass.OutputString>(
                service, METHODID_COMPUTE)))
        .addMethod(
          getAvlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ComputeEngineAPIOuterClass.InputValue,
              ComputeEngineAPIOuterClass.OutputString>(
                service, METHODID_AVL)))
        .build();
  }

  private static abstract class ComputeEngineAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ComputeEngineAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ComputeEngineAPIOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ComputeEngineAPI");
    }
  }

  private static final class ComputeEngineAPIFileDescriptorSupplier
      extends ComputeEngineAPIBaseDescriptorSupplier {
    ComputeEngineAPIFileDescriptorSupplier() {}
  }

  private static final class ComputeEngineAPIMethodDescriptorSupplier
      extends ComputeEngineAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ComputeEngineAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ComputeEngineAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ComputeEngineAPIFileDescriptorSupplier())
              .addMethod(getComputeMethod())
              .addMethod(getAvlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
