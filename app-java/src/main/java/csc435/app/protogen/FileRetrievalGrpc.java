package csc435.app.protogen;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * TO-DO update the service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: file_retrieval.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FileRetrievalGrpc {

  private FileRetrievalGrpc() {}

  public static final java.lang.String SERVICE_NAME = "FileRetrieval";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<csc435.app.protogen.IndexRequest,
      csc435.app.protogen.IndexReply> getIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Index",
      requestType = csc435.app.protogen.IndexRequest.class,
      responseType = csc435.app.protogen.IndexReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csc435.app.protogen.IndexRequest,
      csc435.app.protogen.IndexReply> getIndexMethod() {
    io.grpc.MethodDescriptor<csc435.app.protogen.IndexRequest, csc435.app.protogen.IndexReply> getIndexMethod;
    if ((getIndexMethod = FileRetrievalGrpc.getIndexMethod) == null) {
      synchronized (FileRetrievalGrpc.class) {
        if ((getIndexMethod = FileRetrievalGrpc.getIndexMethod) == null) {
          FileRetrievalGrpc.getIndexMethod = getIndexMethod =
              io.grpc.MethodDescriptor.<csc435.app.protogen.IndexRequest, csc435.app.protogen.IndexReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Index"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csc435.app.protogen.IndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csc435.app.protogen.IndexReply.getDefaultInstance()))
              .setSchemaDescriptor(new FileRetrievalMethodDescriptorSupplier("Index"))
              .build();
        }
      }
    }
    return getIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csc435.app.protogen.SearchRequest,
      csc435.app.protogen.SearchReply> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = csc435.app.protogen.SearchRequest.class,
      responseType = csc435.app.protogen.SearchReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csc435.app.protogen.SearchRequest,
      csc435.app.protogen.SearchReply> getSearchMethod() {
    io.grpc.MethodDescriptor<csc435.app.protogen.SearchRequest, csc435.app.protogen.SearchReply> getSearchMethod;
    if ((getSearchMethod = FileRetrievalGrpc.getSearchMethod) == null) {
      synchronized (FileRetrievalGrpc.class) {
        if ((getSearchMethod = FileRetrievalGrpc.getSearchMethod) == null) {
          FileRetrievalGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<csc435.app.protogen.SearchRequest, csc435.app.protogen.SearchReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csc435.app.protogen.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csc435.app.protogen.SearchReply.getDefaultInstance()))
              .setSchemaDescriptor(new FileRetrievalMethodDescriptorSupplier("Search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<csc435.app.protogen.ConnectRequest,
      csc435.app.protogen.ConnectReply> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connect",
      requestType = csc435.app.protogen.ConnectRequest.class,
      responseType = csc435.app.protogen.ConnectReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<csc435.app.protogen.ConnectRequest,
      csc435.app.protogen.ConnectReply> getConnectMethod() {
    io.grpc.MethodDescriptor<csc435.app.protogen.ConnectRequest, csc435.app.protogen.ConnectReply> getConnectMethod;
    if ((getConnectMethod = FileRetrievalGrpc.getConnectMethod) == null) {
      synchronized (FileRetrievalGrpc.class) {
        if ((getConnectMethod = FileRetrievalGrpc.getConnectMethod) == null) {
          FileRetrievalGrpc.getConnectMethod = getConnectMethod =
              io.grpc.MethodDescriptor.<csc435.app.protogen.ConnectRequest, csc435.app.protogen.ConnectReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csc435.app.protogen.ConnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  csc435.app.protogen.ConnectReply.getDefaultInstance()))
              .setSchemaDescriptor(new FileRetrievalMethodDescriptorSupplier("Connect"))
              .build();
        }
      }
    }
    return getConnectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileRetrievalStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileRetrievalStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileRetrievalStub>() {
        @java.lang.Override
        public FileRetrievalStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileRetrievalStub(channel, callOptions);
        }
      };
    return FileRetrievalStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileRetrievalBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileRetrievalBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileRetrievalBlockingStub>() {
        @java.lang.Override
        public FileRetrievalBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileRetrievalBlockingStub(channel, callOptions);
        }
      };
    return FileRetrievalBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileRetrievalFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileRetrievalFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileRetrievalFutureStub>() {
        @java.lang.Override
        public FileRetrievalFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileRetrievalFutureStub(channel, callOptions);
        }
      };
    return FileRetrievalFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * TO-DO update the service definition
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void index(csc435.app.protogen.IndexRequest request,
        io.grpc.stub.StreamObserver<csc435.app.protogen.IndexReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIndexMethod(), responseObserver);
    }

    /**
     */
    default void search(csc435.app.protogen.SearchRequest request,
        io.grpc.stub.StreamObserver<csc435.app.protogen.SearchReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    default void connect(csc435.app.protogen.ConnectRequest request,
        io.grpc.stub.StreamObserver<csc435.app.protogen.ConnectReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FileRetrieval.
   * <pre>
   * TO-DO update the service definition
   * </pre>
   */
  public static abstract class FileRetrievalImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FileRetrievalGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FileRetrieval.
   * <pre>
   * TO-DO update the service definition
   * </pre>
   */
  public static final class FileRetrievalStub
      extends io.grpc.stub.AbstractAsyncStub<FileRetrievalStub> {
    private FileRetrievalStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileRetrievalStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileRetrievalStub(channel, callOptions);
    }

    /**
     */
    public void index(csc435.app.protogen.IndexRequest request,
        io.grpc.stub.StreamObserver<csc435.app.protogen.IndexReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(csc435.app.protogen.SearchRequest request,
        io.grpc.stub.StreamObserver<csc435.app.protogen.SearchReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void connect(csc435.app.protogen.ConnectRequest request,
        io.grpc.stub.StreamObserver<csc435.app.protogen.ConnectReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FileRetrieval.
   * <pre>
   * TO-DO update the service definition
   * </pre>
   */
  public static final class FileRetrievalBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FileRetrievalBlockingStub> {
    private FileRetrievalBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileRetrievalBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileRetrievalBlockingStub(channel, callOptions);
    }

    /**
     */
    public csc435.app.protogen.IndexReply index(csc435.app.protogen.IndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public csc435.app.protogen.SearchReply search(csc435.app.protogen.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public csc435.app.protogen.ConnectReply connect(csc435.app.protogen.ConnectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FileRetrieval.
   * <pre>
   * TO-DO update the service definition
   * </pre>
   */
  public static final class FileRetrievalFutureStub
      extends io.grpc.stub.AbstractFutureStub<FileRetrievalFutureStub> {
    private FileRetrievalFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileRetrievalFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileRetrievalFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csc435.app.protogen.IndexReply> index(
        csc435.app.protogen.IndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csc435.app.protogen.SearchReply> search(
        csc435.app.protogen.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<csc435.app.protogen.ConnectReply> connect(
        csc435.app.protogen.ConnectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INDEX = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_CONNECT = 2;

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
        case METHODID_INDEX:
          serviceImpl.index((csc435.app.protogen.IndexRequest) request,
              (io.grpc.stub.StreamObserver<csc435.app.protogen.IndexReply>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((csc435.app.protogen.SearchRequest) request,
              (io.grpc.stub.StreamObserver<csc435.app.protogen.SearchReply>) responseObserver);
          break;
        case METHODID_CONNECT:
          serviceImpl.connect((csc435.app.protogen.ConnectRequest) request,
              (io.grpc.stub.StreamObserver<csc435.app.protogen.ConnectReply>) responseObserver);
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
          getIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              csc435.app.protogen.IndexRequest,
              csc435.app.protogen.IndexReply>(
                service, METHODID_INDEX)))
        .addMethod(
          getSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              csc435.app.protogen.SearchRequest,
              csc435.app.protogen.SearchReply>(
                service, METHODID_SEARCH)))
        .addMethod(
          getConnectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              csc435.app.protogen.ConnectRequest,
              csc435.app.protogen.ConnectReply>(
                service, METHODID_CONNECT)))
        .build();
  }

  private static abstract class FileRetrievalBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileRetrievalBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return csc435.app.protogen.FileRetrievalProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileRetrieval");
    }
  }

  private static final class FileRetrievalFileDescriptorSupplier
      extends FileRetrievalBaseDescriptorSupplier {
    FileRetrievalFileDescriptorSupplier() {}
  }

  private static final class FileRetrievalMethodDescriptorSupplier
      extends FileRetrievalBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FileRetrievalMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FileRetrievalGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileRetrievalFileDescriptorSupplier())
              .addMethod(getIndexMethod())
              .addMethod(getSearchMethod())
              .addMethod(getConnectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
