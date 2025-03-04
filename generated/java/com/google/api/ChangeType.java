// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/config_change.proto
// Protobuf Java Version: 4.29.1

package com.google.api;

/**
 * <pre>
 * Classifies set of possible modifications to an object in the service
 * configuration.
 * </pre>
 *
 * Protobuf enum {@code google.api.ChangeType}
 */
public enum ChangeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No value was provided.
   * </pre>
   *
   * <code>CHANGE_TYPE_UNSPECIFIED = 0;</code>
   */
  CHANGE_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * The changed object exists in the 'new' service configuration, but not
   * in the 'old' service configuration.
   * </pre>
   *
   * <code>ADDED = 1;</code>
   */
  ADDED(1),
  /**
   * <pre>
   * The changed object exists in the 'old' service configuration, but not
   * in the 'new' service configuration.
   * </pre>
   *
   * <code>REMOVED = 2;</code>
   */
  REMOVED(2),
  /**
   * <pre>
   * The changed object exists in both service configurations, but its value
   * is different.
   * </pre>
   *
   * <code>MODIFIED = 3;</code>
   */
  MODIFIED(3),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      ChangeType.class.getName());
  }
  /**
   * <pre>
   * No value was provided.
   * </pre>
   *
   * <code>CHANGE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The changed object exists in the 'new' service configuration, but not
   * in the 'old' service configuration.
   * </pre>
   *
   * <code>ADDED = 1;</code>
   */
  public static final int ADDED_VALUE = 1;
  /**
   * <pre>
   * The changed object exists in the 'old' service configuration, but not
   * in the 'new' service configuration.
   * </pre>
   *
   * <code>REMOVED = 2;</code>
   */
  public static final int REMOVED_VALUE = 2;
  /**
   * <pre>
   * The changed object exists in both service configurations, but its value
   * is different.
   * </pre>
   *
   * <code>MODIFIED = 3;</code>
   */
  public static final int MODIFIED_VALUE = 3;


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
  public static ChangeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ChangeType forNumber(int value) {
    switch (value) {
      case 0: return CHANGE_TYPE_UNSPECIFIED;
      case 1: return ADDED;
      case 2: return REMOVED;
      case 3: return MODIFIED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ChangeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ChangeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ChangeType>() {
          public ChangeType findValueByNumber(int number) {
            return ChangeType.forNumber(number);
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
    return com.google.api.ConfigChangeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ChangeType[] VALUES = values();

  public static ChangeType valueOf(
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

  private ChangeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.api.ChangeType)
}

