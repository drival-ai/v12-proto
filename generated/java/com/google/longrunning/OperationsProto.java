// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/longrunning/operations.proto
// Protobuf Java Version: 4.29.1

package com.google.longrunning;

public final class OperationsProto {
  private OperationsProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      OperationsProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int OPERATION_INFO_FIELD_NUMBER = 1049;
  /**
   * <pre>
   * Additional information regarding long-running operations.
   * In particular, this specifies the types that are returned from
   * long-running operations.
   *
   * Required for methods that return `google.longrunning.Operation`; invalid
   * otherwise.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      com.google.longrunning.OperationInfo> operationInfo = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.google.longrunning.OperationInfo.class,
        com.google.longrunning.OperationInfo.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_longrunning_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_GetOperationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_longrunning_GetOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_ListOperationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_longrunning_ListOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_ListOperationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_CancelOperationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_longrunning_CancelOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_DeleteOperationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_longrunning_DeleteOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_WaitOperationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_longrunning_WaitOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_longrunning_OperationInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_longrunning_OperationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/longrunning/operations.proto\022\022g" +
      "oogle.longrunning\032\034google/api/annotation" +
      "s.proto\032\027google/api/client.proto\032\031google" +
      "/protobuf/any.proto\032\036google/protobuf/dur" +
      "ation.proto\032\033google/protobuf/empty.proto" +
      "\032\027google/rpc/status.proto\032 google/protob" +
      "uf/descriptor.proto\"\317\001\n\tOperation\022\022\n\004nam" +
      "e\030\001 \001(\tR\004name\0220\n\010metadata\030\002 \001(\0132\024.google" +
      ".protobuf.AnyR\010metadata\022\022\n\004done\030\003 \001(\010R\004d" +
      "one\022*\n\005error\030\004 \001(\0132\022.google.rpc.StatusH\000" +
      "R\005error\0222\n\010response\030\005 \001(\0132\024.google.proto" +
      "buf.AnyH\000R\010responseB\010\n\006result\")\n\023GetOper" +
      "ationRequest\022\022\n\004name\030\001 \001(\tR\004name\"\177\n\025List" +
      "OperationsRequest\022\022\n\004name\030\004 \001(\tR\004name\022\026\n" +
      "\006filter\030\001 \001(\tR\006filter\022\033\n\tpage_size\030\002 \001(\005" +
      "R\010pageSize\022\035\n\npage_token\030\003 \001(\tR\tpageToke" +
      "n\"\177\n\026ListOperationsResponse\022=\n\noperation" +
      "s\030\001 \003(\0132\035.google.longrunning.OperationR\n" +
      "operations\022&\n\017next_page_token\030\002 \001(\tR\rnex" +
      "tPageToken\",\n\026CancelOperationRequest\022\022\n\004" +
      "name\030\001 \001(\tR\004name\",\n\026DeleteOperationReque" +
      "st\022\022\n\004name\030\001 \001(\tR\004name\"_\n\024WaitOperationR" +
      "equest\022\022\n\004name\030\001 \001(\tR\004name\0223\n\007timeout\030\002 " +
      "\001(\0132\031.google.protobuf.DurationR\007timeout\"" +
      "Y\n\rOperationInfo\022#\n\rresponse_type\030\001 \001(\tR" +
      "\014responseType\022#\n\rmetadata_type\030\002 \001(\tR\014me" +
      "tadataType2\252\005\n\nOperations\022\224\001\n\016ListOperat" +
      "ions\022).google.longrunning.ListOperations" +
      "Request\032*.google.longrunning.ListOperati" +
      "onsResponse\"+\332A\013name,filter\202\323\344\223\002\027\022\025/v1/{" +
      "name=operations}\022\177\n\014GetOperation\022\'.googl" +
      "e.longrunning.GetOperationRequest\032\035.goog" +
      "le.longrunning.Operation\"\'\332A\004name\202\323\344\223\002\032\022" +
      "\030/v1/{name=operations/**}\022~\n\017DeleteOpera" +
      "tion\022*.google.longrunning.DeleteOperatio" +
      "nRequest\032\026.google.protobuf.Empty\"\'\332A\004nam" +
      "e\202\323\344\223\002\032*\030/v1/{name=operations/**}\022\210\001\n\017Ca" +
      "ncelOperation\022*.google.longrunning.Cance" +
      "lOperationRequest\032\026.google.protobuf.Empt" +
      "y\"1\332A\004name\202\323\344\223\002$\"\037/v1/{name=operations/*" +
      "*}:cancel:\001*\022Z\n\rWaitOperation\022(.google.l" +
      "ongrunning.WaitOperationRequest\032\035.google" +
      ".longrunning.Operation\"\000\032\035\312A\032longrunning" +
      ".googleapis.com:i\n\016operation_info\022\036.goog" +
      "le.protobuf.MethodOptions\030\231\010 \001(\0132!.googl" +
      "e.longrunning.OperationInfoR\roperationIn" +
      "foB\227\001\n\026com.google.longrunningB\017Operation" +
      "sProtoP\001Z=google.golang.org/genproto/goo" +
      "gleapis/longrunning;longrunning\370\001\001\252\002\022Goo" +
      "gle.LongRunning\312\002\022Google\\LongRunningb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_google_longrunning_Operation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_longrunning_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_longrunning_Operation_descriptor,
        new java.lang.String[] { "Name", "Metadata", "Done", "Error", "Response", "Result", });
    internal_static_google_longrunning_GetOperationRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_longrunning_GetOperationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_longrunning_GetOperationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_longrunning_ListOperationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_longrunning_ListOperationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_longrunning_ListOperationsRequest_descriptor,
        new java.lang.String[] { "Name", "Filter", "PageSize", "PageToken", });
    internal_static_google_longrunning_ListOperationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_longrunning_ListOperationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_longrunning_ListOperationsResponse_descriptor,
        new java.lang.String[] { "Operations", "NextPageToken", });
    internal_static_google_longrunning_CancelOperationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_longrunning_CancelOperationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_longrunning_CancelOperationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_longrunning_DeleteOperationRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_longrunning_DeleteOperationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_longrunning_DeleteOperationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_longrunning_WaitOperationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_longrunning_WaitOperationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_longrunning_WaitOperationRequest_descriptor,
        new java.lang.String[] { "Name", "Timeout", });
    internal_static_google_longrunning_OperationInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_longrunning_OperationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_longrunning_OperationInfo_descriptor,
        new java.lang.String[] { "ResponseType", "MetadataType", });
    operationInfo.internalInit(descriptor.getExtensions().get(0));
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.protobuf.DescriptorProtos.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
