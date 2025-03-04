// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/longrunning/operations.proto
// Protobuf Java Version: 4.29.1

package com.google.longrunning;

public interface ListOperationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.longrunning.ListOperationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the operation's parent resource.
   * </pre>
   *
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the operation's parent resource.
   * </pre>
   *
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The standard list filter.
   * </pre>
   *
   * <code>string filter = 1 [json_name = "filter"];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * The standard list filter.
   * </pre>
   *
   * <code>string filter = 1 [json_name = "filter"];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 2 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>string page_token = 3 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>string page_token = 3 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
