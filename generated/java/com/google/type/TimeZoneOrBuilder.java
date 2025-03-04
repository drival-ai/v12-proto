// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/type/datetime.proto
// Protobuf Java Version: 4.29.1

package com.google.type;

public interface TimeZoneOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.type.TimeZone)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IANA Time Zone Database time zone, e.g. "America/New_York".
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * IANA Time Zone Database time zone, e.g. "America/New_York".
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Optional. IANA Time Zone Database version number, e.g. "2019a".
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Optional. IANA Time Zone Database version number, e.g. "2019a".
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
