// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/iam/admin/v1/iam.proto
// Protobuf Java Version: 4.29.1

package com.google.iam.admin.v1;

public interface SignJwtRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.SignJwtRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the service account in the following format:
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
   * Using `-` as a wildcard for the `PROJECT_ID` will infer the project from
   * the account. The `ACCOUNT` value can be the `email` address or the
   * `unique_id` of the service account.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The JWT payload to sign, a JSON JWT Claim set.
   * </pre>
   *
   * <code>string payload = 2 [json_name = "payload", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The payload.
   */
  java.lang.String getPayload();
  /**
   * <pre>
   * Required. The JWT payload to sign, a JSON JWT Claim set.
   * </pre>
   *
   * <code>string payload = 2 [json_name = "payload", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for payload.
   */
  com.google.protobuf.ByteString
      getPayloadBytes();
}
