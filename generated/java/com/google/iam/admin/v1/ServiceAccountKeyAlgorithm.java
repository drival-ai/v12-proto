// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/iam/admin/v1/iam.proto
// Protobuf Java Version: 4.29.1

package com.google.iam.admin.v1;

/**
 * <pre>
 * Supported key algorithms.
 * </pre>
 *
 * Protobuf enum {@code google.iam.admin.v1.ServiceAccountKeyAlgorithm}
 */
public enum ServiceAccountKeyAlgorithm
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * An unspecified key algorithm.
   * </pre>
   *
   * <code>KEY_ALG_UNSPECIFIED = 0;</code>
   */
  KEY_ALG_UNSPECIFIED(0),
  /**
   * <pre>
   * 1k RSA Key.
   * </pre>
   *
   * <code>KEY_ALG_RSA_1024 = 1;</code>
   */
  KEY_ALG_RSA_1024(1),
  /**
   * <pre>
   * 2k RSA Key.
   * </pre>
   *
   * <code>KEY_ALG_RSA_2048 = 2;</code>
   */
  KEY_ALG_RSA_2048(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      ServiceAccountKeyAlgorithm.class.getName());
  }
  /**
   * <pre>
   * An unspecified key algorithm.
   * </pre>
   *
   * <code>KEY_ALG_UNSPECIFIED = 0;</code>
   */
  public static final int KEY_ALG_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * 1k RSA Key.
   * </pre>
   *
   * <code>KEY_ALG_RSA_1024 = 1;</code>
   */
  public static final int KEY_ALG_RSA_1024_VALUE = 1;
  /**
   * <pre>
   * 2k RSA Key.
   * </pre>
   *
   * <code>KEY_ALG_RSA_2048 = 2;</code>
   */
  public static final int KEY_ALG_RSA_2048_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ServiceAccountKeyAlgorithm valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ServiceAccountKeyAlgorithm forNumber(int value) {
    switch (value) {
      case 0: return KEY_ALG_UNSPECIFIED;
      case 1: return KEY_ALG_RSA_1024;
      case 2: return KEY_ALG_RSA_2048;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServiceAccountKeyAlgorithm>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ServiceAccountKeyAlgorithm> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ServiceAccountKeyAlgorithm>() {
          public ServiceAccountKeyAlgorithm findValueByNumber(int number) {
            return ServiceAccountKeyAlgorithm.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.iam.admin.v1.IamProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ServiceAccountKeyAlgorithm[] VALUES = values();

  public static ServiceAccountKeyAlgorithm valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ServiceAccountKeyAlgorithm(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.iam.admin.v1.ServiceAccountKeyAlgorithm)
}

