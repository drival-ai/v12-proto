// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/httpbody.proto
// Protobuf Java Version: 4.29.1

package com.google.api;

public final class HttpBodyProto {
  private HttpBodyProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      HttpBodyProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_HttpBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_HttpBody_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031google/api/httpbody.proto\022\ngoogle.api\032" +
      "\031google/protobuf/any.proto\"w\n\010HttpBody\022!" +
      "\n\014content_type\030\001 \001(\tR\013contentType\022\022\n\004dat" +
      "a\030\002 \001(\014R\004data\0224\n\nextensions\030\003 \003(\0132\024.goog" +
      "le.protobuf.AnyR\nextensionsBe\n\016com.googl" +
      "e.apiB\rHttpBodyProtoP\001Z;google.golang.or" +
      "g/genproto/googleapis/api/httpbody;httpb" +
      "ody\242\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_google_api_HttpBody_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_HttpBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_HttpBody_descriptor,
        new java.lang.String[] { "ContentType", "Data", "Extensions", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
