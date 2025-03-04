// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/iam/v1/policy.proto
// Protobuf Java Version: 4.29.1

package com.google.iam.v1;

public interface AuditConfigDeltaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.v1.AuditConfigDelta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The action that was performed on an audit configuration in a policy.
   * Required
   * </pre>
   *
   * <code>.google.iam.v1.AuditConfigDelta.Action action = 1 [json_name = "action"];</code>
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   * <pre>
   * The action that was performed on an audit configuration in a policy.
   * Required
   * </pre>
   *
   * <code>.google.iam.v1.AuditConfigDelta.Action action = 1 [json_name = "action"];</code>
   * @return The action.
   */
  com.google.iam.v1.AuditConfigDelta.Action getAction();

  /**
   * <pre>
   * Specifies a service that was configured for Cloud Audit Logging.
   * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
   * `allServices` is a special value that covers all services.
   * Required
   * </pre>
   *
   * <code>string service = 2 [json_name = "service"];</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <pre>
   * Specifies a service that was configured for Cloud Audit Logging.
   * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
   * `allServices` is a special value that covers all services.
   * Required
   * </pre>
   *
   * <code>string service = 2 [json_name = "service"];</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <pre>
   * A single identity that is exempted from "data access" audit
   * logging for the `service` specified above.
   * Follows the same format of Binding.members.
   * </pre>
   *
   * <code>string exempted_member = 3 [json_name = "exemptedMember"];</code>
   * @return The exemptedMember.
   */
  java.lang.String getExemptedMember();
  /**
   * <pre>
   * A single identity that is exempted from "data access" audit
   * logging for the `service` specified above.
   * Follows the same format of Binding.members.
   * </pre>
   *
   * <code>string exempted_member = 3 [json_name = "exemptedMember"];</code>
   * @return The bytes for exemptedMember.
   */
  com.google.protobuf.ByteString
      getExemptedMemberBytes();

  /**
   * <pre>
   * Specifies the log_type that was be enabled. ADMIN_ACTIVITY is always
   * enabled, and cannot be configured.
   * Required
   * </pre>
   *
   * <code>string log_type = 4 [json_name = "logType"];</code>
   * @return The logType.
   */
  java.lang.String getLogType();
  /**
   * <pre>
   * Specifies the log_type that was be enabled. ADMIN_ACTIVITY is always
   * enabled, and cannot be configured.
   * Required
   * </pre>
   *
   * <code>string log_type = 4 [json_name = "logType"];</code>
   * @return The bytes for logType.
   */
  com.google.protobuf.ByteString
      getLogTypeBytes();
}
