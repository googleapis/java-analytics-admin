/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Maximum access settings that Firebase user receive on the linked Analytics
 * property.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.admin.v1alpha.MaximumUserAccess}
 */
public enum MaximumUserAccess implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified maximum user access.
   * </pre>
   *
   * <code>MAXIMUM_USER_ACCESS_UNSPECIFIED = 0;</code>
   */
  MAXIMUM_USER_ACCESS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Firebase users have no access to the Analytics property.
   * </pre>
   *
   * <code>NO_ACCESS = 1;</code>
   */
  NO_ACCESS(1),
  /**
   *
   *
   * <pre>
   * Firebase users have Read &amp; Analyze access to the Analytics property.
   * </pre>
   *
   * <code>READ_AND_ANALYZE = 2;</code>
   */
  READ_AND_ANALYZE(2),
  /**
   *
   *
   * <pre>
   * Firebase users have edit access to the Analytics property, but may not
   * manage the Firebase link.
   * </pre>
   *
   * <code>EDITOR_WITHOUT_LINK_MANAGEMENT = 3;</code>
   */
  EDITOR_WITHOUT_LINK_MANAGEMENT(3),
  /**
   *
   *
   * <pre>
   * Firebase users have edit access to the Analytics property and may manage
   * the Firebase link.
   * </pre>
   *
   * <code>EDITOR_INCLUDING_LINK_MANAGEMENT = 4;</code>
   */
  EDITOR_INCLUDING_LINK_MANAGEMENT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified maximum user access.
   * </pre>
   *
   * <code>MAXIMUM_USER_ACCESS_UNSPECIFIED = 0;</code>
   */
  public static final int MAXIMUM_USER_ACCESS_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Firebase users have no access to the Analytics property.
   * </pre>
   *
   * <code>NO_ACCESS = 1;</code>
   */
  public static final int NO_ACCESS_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Firebase users have Read &amp; Analyze access to the Analytics property.
   * </pre>
   *
   * <code>READ_AND_ANALYZE = 2;</code>
   */
  public static final int READ_AND_ANALYZE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Firebase users have edit access to the Analytics property, but may not
   * manage the Firebase link.
   * </pre>
   *
   * <code>EDITOR_WITHOUT_LINK_MANAGEMENT = 3;</code>
   */
  public static final int EDITOR_WITHOUT_LINK_MANAGEMENT_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Firebase users have edit access to the Analytics property and may manage
   * the Firebase link.
   * </pre>
   *
   * <code>EDITOR_INCLUDING_LINK_MANAGEMENT = 4;</code>
   */
  public static final int EDITOR_INCLUDING_LINK_MANAGEMENT_VALUE = 4;

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
  public static MaximumUserAccess valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MaximumUserAccess forNumber(int value) {
    switch (value) {
      case 0:
        return MAXIMUM_USER_ACCESS_UNSPECIFIED;
      case 1:
        return NO_ACCESS;
      case 2:
        return READ_AND_ANALYZE;
      case 3:
        return EDITOR_WITHOUT_LINK_MANAGEMENT;
      case 4:
        return EDITOR_INCLUDING_LINK_MANAGEMENT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MaximumUserAccess> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<MaximumUserAccess>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MaximumUserAccess>() {
            public MaximumUserAccess findValueByNumber(int number) {
              return MaximumUserAccess.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.ResourcesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final MaximumUserAccess[] VALUES = values();

  public static MaximumUserAccess valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MaximumUserAccess(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.admin.v1alpha.MaximumUserAccess)
}
