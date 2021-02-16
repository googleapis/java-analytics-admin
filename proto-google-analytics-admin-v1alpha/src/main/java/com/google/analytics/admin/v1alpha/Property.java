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
 * A resource message representing a Google Analytics GA4 property.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.Property}
 */
public final class Property extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.Property)
    PropertyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Property.newBuilder() to construct.
  private Property(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Property() {
    name_ = "";
    parent_ = "";
    displayName_ = "";
    industryCategory_ = 0;
    timeZone_ = "";
    currencyCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Property();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Property(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 26:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (createTime_ != null) {
                subBuilder = createTime_.toBuilder();
              }
              createTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(createTime_);
                createTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 34:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (updateTime_ != null) {
                subBuilder = updateTime_.toBuilder();
              }
              updateTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateTime_);
                updateTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 42:
            {
              java.lang.String s = input.readStringRequireUtf8();

              displayName_ = s;
              break;
            }
          case 48:
            {
              int rawValue = input.readEnum();

              industryCategory_ = rawValue;
              break;
            }
          case 58:
            {
              java.lang.String s = input.readStringRequireUtf8();

              timeZone_ = s;
              break;
            }
          case 66:
            {
              java.lang.String s = input.readStringRequireUtf8();

              currencyCode_ = s;
              break;
            }
          case 72:
            {
              deleted_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_Property_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_Property_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.Property.class,
            com.google.analytics.admin.v1alpha.Property.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this property.
   * Format: properties/{property_id}
   * Example: "properties/1000"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this property.
   * Format: properties/{property_id}
   * Example: "properties/1000"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp createTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time when the entity was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time when the entity was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time when the entity was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time when entity payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time when entity payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Time when entity payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
  }

  public static final int PARENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Immutable. Resource name of this property's logical parent.
   * Note: The Property-Moving UI can be used to change the parent.
   * Format: accounts/{account}
   * Example: "accounts/100"
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. Resource name of this property's logical parent.
   * Note: The Property-Moving UI can be used to change the parent.
   * Format: accounts/{account}
   * Example: "accounts/100"
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * Required. Human-readable display name for this property.
   * The max allowed display name length is 100 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Human-readable display name for this property.
   * The max allowed display name length is 100 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INDUSTRY_CATEGORY_FIELD_NUMBER = 6;
  private int industryCategory_;
  /**
   *
   *
   * <pre>
   * Industry associated with this property
   * Example: AUTOMOTIVE, FOOD_AND_DRINK
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.IndustryCategory industry_category = 6;</code>
   *
   * @return The enum numeric value on the wire for industryCategory.
   */
  @java.lang.Override
  public int getIndustryCategoryValue() {
    return industryCategory_;
  }
  /**
   *
   *
   * <pre>
   * Industry associated with this property
   * Example: AUTOMOTIVE, FOOD_AND_DRINK
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.IndustryCategory industry_category = 6;</code>
   *
   * @return The industryCategory.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.IndustryCategory getIndustryCategory() {
    @SuppressWarnings("deprecation")
    com.google.analytics.admin.v1alpha.IndustryCategory result =
        com.google.analytics.admin.v1alpha.IndustryCategory.valueOf(industryCategory_);
    return result == null
        ? com.google.analytics.admin.v1alpha.IndustryCategory.UNRECOGNIZED
        : result;
  }

  public static final int TIME_ZONE_FIELD_NUMBER = 7;
  private volatile java.lang.Object timeZone_;
  /**
   *
   *
   * <pre>
   * Reporting Time Zone, used as the day boundary for reports, regardless of
   * where the data originates. If the time zone honors DST, Analytics will
   * automatically adjust for the changes.
   * NOTE: Changing the time zone only affects data going forward, and is not
   * applied retroactively.
   * Format: https://www.iana.org/time-zones
   * Example: "America/Los_Angeles"
   * </pre>
   *
   * <code>string time_zone = 7;</code>
   *
   * @return The timeZone.
   */
  @java.lang.Override
  public java.lang.String getTimeZone() {
    java.lang.Object ref = timeZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timeZone_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Reporting Time Zone, used as the day boundary for reports, regardless of
   * where the data originates. If the time zone honors DST, Analytics will
   * automatically adjust for the changes.
   * NOTE: Changing the time zone only affects data going forward, and is not
   * applied retroactively.
   * Format: https://www.iana.org/time-zones
   * Example: "America/Los_Angeles"
   * </pre>
   *
   * <code>string time_zone = 7;</code>
   *
   * @return The bytes for timeZone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTimeZoneBytes() {
    java.lang.Object ref = timeZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      timeZone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENCY_CODE_FIELD_NUMBER = 8;
  private volatile java.lang.Object currencyCode_;
  /**
   *
   *
   * <pre>
   * The currency type used in reports involving monetary values.
   * Format: https://en.wikipedia.org/wiki/ISO_4217
   * Examples: "USD", "EUR", "JPY"
   * </pre>
   *
   * <code>string currency_code = 8;</code>
   *
   * @return The currencyCode.
   */
  @java.lang.Override
  public java.lang.String getCurrencyCode() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currencyCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The currency type used in reports involving monetary values.
   * Format: https://en.wikipedia.org/wiki/ISO_4217
   * Examples: "USD", "EUR", "JPY"
   * </pre>
   *
   * <code>string currency_code = 8;</code>
   *
   * @return The bytes for currencyCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCurrencyCodeBytes() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      currencyCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELETED_FIELD_NUMBER = 9;
  private boolean deleted_;
  /**
   *
   *
   * <pre>
   * Output only. Indicates whether this Property is soft-deleted or not. Deleted properties
   * are excluded from List results unless specifically requested.
   * </pre>
   *
   * <code>bool deleted = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The deleted.
   */
  @java.lang.Override
  public boolean getDeleted() {
    return deleted_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, parent_);
    }
    if (createTime_ != null) {
      output.writeMessage(3, getCreateTime());
    }
    if (updateTime_ != null) {
      output.writeMessage(4, getUpdateTime());
    }
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, displayName_);
    }
    if (industryCategory_
        != com.google.analytics.admin.v1alpha.IndustryCategory.INDUSTRY_CATEGORY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(6, industryCategory_);
    }
    if (!getTimeZoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, timeZone_);
    }
    if (!getCurrencyCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, currencyCode_);
    }
    if (deleted_ != false) {
      output.writeBool(9, deleted_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, parent_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCreateTime());
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getUpdateTime());
    }
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, displayName_);
    }
    if (industryCategory_
        != com.google.analytics.admin.v1alpha.IndustryCategory.INDUSTRY_CATEGORY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(6, industryCategory_);
    }
    if (!getTimeZoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, timeZone_);
    }
    if (!getCurrencyCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, currencyCode_);
    }
    if (deleted_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(9, deleted_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.analytics.admin.v1alpha.Property)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.Property other =
        (com.google.analytics.admin.v1alpha.Property) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime().equals(other.getCreateTime())) return false;
    }
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (!getParent().equals(other.getParent())) return false;
    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (industryCategory_ != other.industryCategory_) return false;
    if (!getTimeZone().equals(other.getTimeZone())) return false;
    if (!getCurrencyCode().equals(other.getCurrencyCode())) return false;
    if (getDeleted() != other.getDeleted()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + INDUSTRY_CATEGORY_FIELD_NUMBER;
    hash = (53 * hash) + industryCategory_;
    hash = (37 * hash) + TIME_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getTimeZone().hashCode();
    hash = (37 * hash) + CURRENCY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCurrencyCode().hashCode();
    hash = (37 * hash) + DELETED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDeleted());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.Property parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.Property parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.Property parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.Property parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.Property parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.Property parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.Property parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.Property parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.Property parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.Property parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.Property parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.Property parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.analytics.admin.v1alpha.Property prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A resource message representing a Google Analytics GA4 property.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.Property}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.Property)
      com.google.analytics.admin.v1alpha.PropertyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_Property_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_Property_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.Property.class,
              com.google.analytics.admin.v1alpha.Property.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.Property.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (createTimeBuilder_ == null) {
        createTime_ = null;
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      parent_ = "";

      displayName_ = "";

      industryCategory_ = 0;

      timeZone_ = "";

      currencyCode_ = "";

      deleted_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_Property_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.Property getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.Property.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.Property build() {
      com.google.analytics.admin.v1alpha.Property result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.Property buildPartial() {
      com.google.analytics.admin.v1alpha.Property result =
          new com.google.analytics.admin.v1alpha.Property(this);
      result.name_ = name_;
      if (createTimeBuilder_ == null) {
        result.createTime_ = createTime_;
      } else {
        result.createTime_ = createTimeBuilder_.build();
      }
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
      }
      result.parent_ = parent_;
      result.displayName_ = displayName_;
      result.industryCategory_ = industryCategory_;
      result.timeZone_ = timeZone_;
      result.currencyCode_ = currencyCode_;
      result.deleted_ = deleted_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.analytics.admin.v1alpha.Property) {
        return mergeFrom((com.google.analytics.admin.v1alpha.Property) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.Property other) {
      if (other == com.google.analytics.admin.v1alpha.Property.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (other.industryCategory_ != 0) {
        setIndustryCategoryValue(other.getIndustryCategoryValue());
      }
      if (!other.getTimeZone().isEmpty()) {
        timeZone_ = other.timeZone_;
        onChanged();
      }
      if (!other.getCurrencyCode().isEmpty()) {
        currencyCode_ = other.currencyCode_;
        onChanged();
      }
      if (other.getDeleted() != false) {
        setDeleted(other.getDeleted());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.analytics.admin.v1alpha.Property parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.admin.v1alpha.Property) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Resource name of this property.
     * Format: properties/{property_id}
     * Example: "properties/1000"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of this property.
     * Format: properties/{property_id}
     * Example: "properties/1000"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of this property.
     * Format: properties/{property_id}
     * Example: "properties/1000"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of this property.
     * Format: properties/{property_id}
     * Example: "properties/1000"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name of this property.
     * Format: properties/{property_id}
     * Example: "properties/1000"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        createTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Time when the entity was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return createTimeBuilder_ != null || createTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the entity was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the entity was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
        onChanged();
      } else {
        createTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the entity was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
        onChanged();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the entity was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (createTime_ != null) {
          createTime_ =
              com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
        } else {
          createTime_ = value;
        }
        onChanged();
      } else {
        createTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the entity was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearCreateTime() {
      if (createTimeBuilder_ == null) {
        createTime_ = null;
        onChanged();
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the entity was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {

      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the entity was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : createTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when the entity was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(), getParentForChildren(), isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Time when entity payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when entity payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when entity payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when entity payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when entity payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
              com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when entity payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when entity payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {

      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when entity payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Time when entity payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. Resource name of this property's logical parent.
     * Note: The Property-Moving UI can be used to change the parent.
     * Format: accounts/{account}
     * Example: "accounts/100"
     * </pre>
     *
     * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Resource name of this property's logical parent.
     * Note: The Property-Moving UI can be used to change the parent.
     * Format: accounts/{account}
     * Example: "accounts/100"
     * </pre>
     *
     * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Resource name of this property's logical parent.
     * Note: The Property-Moving UI can be used to change the parent.
     * Format: accounts/{account}
     * Example: "accounts/100"
     * </pre>
     *
     * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Resource name of this property's logical parent.
     * Note: The Property-Moving UI can be used to change the parent.
     * Format: accounts/{account}
     * Example: "accounts/100"
     * </pre>
     *
     * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Resource name of this property's logical parent.
     * Note: The Property-Moving UI can be used to change the parent.
     * Format: accounts/{account}
     * Example: "accounts/100"
     * </pre>
     *
     * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for this property.
     * The max allowed display name length is 100 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for this property.
     * The max allowed display name length is 100 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for this property.
     * The max allowed display name length is 100 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for this property.
     * The max allowed display name length is 100 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {

      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for this property.
     * The max allowed display name length is 100 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      displayName_ = value;
      onChanged();
      return this;
    }

    private int industryCategory_ = 0;
    /**
     *
     *
     * <pre>
     * Industry associated with this property
     * Example: AUTOMOTIVE, FOOD_AND_DRINK
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.IndustryCategory industry_category = 6;</code>
     *
     * @return The enum numeric value on the wire for industryCategory.
     */
    @java.lang.Override
    public int getIndustryCategoryValue() {
      return industryCategory_;
    }
    /**
     *
     *
     * <pre>
     * Industry associated with this property
     * Example: AUTOMOTIVE, FOOD_AND_DRINK
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.IndustryCategory industry_category = 6;</code>
     *
     * @param value The enum numeric value on the wire for industryCategory to set.
     * @return This builder for chaining.
     */
    public Builder setIndustryCategoryValue(int value) {

      industryCategory_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Industry associated with this property
     * Example: AUTOMOTIVE, FOOD_AND_DRINK
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.IndustryCategory industry_category = 6;</code>
     *
     * @return The industryCategory.
     */
    @java.lang.Override
    public com.google.analytics.admin.v1alpha.IndustryCategory getIndustryCategory() {
      @SuppressWarnings("deprecation")
      com.google.analytics.admin.v1alpha.IndustryCategory result =
          com.google.analytics.admin.v1alpha.IndustryCategory.valueOf(industryCategory_);
      return result == null
          ? com.google.analytics.admin.v1alpha.IndustryCategory.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Industry associated with this property
     * Example: AUTOMOTIVE, FOOD_AND_DRINK
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.IndustryCategory industry_category = 6;</code>
     *
     * @param value The industryCategory to set.
     * @return This builder for chaining.
     */
    public Builder setIndustryCategory(com.google.analytics.admin.v1alpha.IndustryCategory value) {
      if (value == null) {
        throw new NullPointerException();
      }

      industryCategory_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Industry associated with this property
     * Example: AUTOMOTIVE, FOOD_AND_DRINK
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.IndustryCategory industry_category = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIndustryCategory() {

      industryCategory_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object timeZone_ = "";
    /**
     *
     *
     * <pre>
     * Reporting Time Zone, used as the day boundary for reports, regardless of
     * where the data originates. If the time zone honors DST, Analytics will
     * automatically adjust for the changes.
     * NOTE: Changing the time zone only affects data going forward, and is not
     * applied retroactively.
     * Format: https://www.iana.org/time-zones
     * Example: "America/Los_Angeles"
     * </pre>
     *
     * <code>string time_zone = 7;</code>
     *
     * @return The timeZone.
     */
    public java.lang.String getTimeZone() {
      java.lang.Object ref = timeZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Reporting Time Zone, used as the day boundary for reports, regardless of
     * where the data originates. If the time zone honors DST, Analytics will
     * automatically adjust for the changes.
     * NOTE: Changing the time zone only affects data going forward, and is not
     * applied retroactively.
     * Format: https://www.iana.org/time-zones
     * Example: "America/Los_Angeles"
     * </pre>
     *
     * <code>string time_zone = 7;</code>
     *
     * @return The bytes for timeZone.
     */
    public com.google.protobuf.ByteString getTimeZoneBytes() {
      java.lang.Object ref = timeZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        timeZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Reporting Time Zone, used as the day boundary for reports, regardless of
     * where the data originates. If the time zone honors DST, Analytics will
     * automatically adjust for the changes.
     * NOTE: Changing the time zone only affects data going forward, and is not
     * applied retroactively.
     * Format: https://www.iana.org/time-zones
     * Example: "America/Los_Angeles"
     * </pre>
     *
     * <code>string time_zone = 7;</code>
     *
     * @param value The timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      timeZone_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Reporting Time Zone, used as the day boundary for reports, regardless of
     * where the data originates. If the time zone honors DST, Analytics will
     * automatically adjust for the changes.
     * NOTE: Changing the time zone only affects data going forward, and is not
     * applied retroactively.
     * Format: https://www.iana.org/time-zones
     * Example: "America/Los_Angeles"
     * </pre>
     *
     * <code>string time_zone = 7;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimeZone() {

      timeZone_ = getDefaultInstance().getTimeZone();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Reporting Time Zone, used as the day boundary for reports, regardless of
     * where the data originates. If the time zone honors DST, Analytics will
     * automatically adjust for the changes.
     * NOTE: Changing the time zone only affects data going forward, and is not
     * applied retroactively.
     * Format: https://www.iana.org/time-zones
     * Example: "America/Los_Angeles"
     * </pre>
     *
     * <code>string time_zone = 7;</code>
     *
     * @param value The bytes for timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      timeZone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object currencyCode_ = "";
    /**
     *
     *
     * <pre>
     * The currency type used in reports involving monetary values.
     * Format: https://en.wikipedia.org/wiki/ISO_4217
     * Examples: "USD", "EUR", "JPY"
     * </pre>
     *
     * <code>string currency_code = 8;</code>
     *
     * @return The currencyCode.
     */
    public java.lang.String getCurrencyCode() {
      java.lang.Object ref = currencyCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currencyCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The currency type used in reports involving monetary values.
     * Format: https://en.wikipedia.org/wiki/ISO_4217
     * Examples: "USD", "EUR", "JPY"
     * </pre>
     *
     * <code>string currency_code = 8;</code>
     *
     * @return The bytes for currencyCode.
     */
    public com.google.protobuf.ByteString getCurrencyCodeBytes() {
      java.lang.Object ref = currencyCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        currencyCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The currency type used in reports involving monetary values.
     * Format: https://en.wikipedia.org/wiki/ISO_4217
     * Examples: "USD", "EUR", "JPY"
     * </pre>
     *
     * <code>string currency_code = 8;</code>
     *
     * @param value The currencyCode to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      currencyCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The currency type used in reports involving monetary values.
     * Format: https://en.wikipedia.org/wiki/ISO_4217
     * Examples: "USD", "EUR", "JPY"
     * </pre>
     *
     * <code>string currency_code = 8;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCurrencyCode() {

      currencyCode_ = getDefaultInstance().getCurrencyCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The currency type used in reports involving monetary values.
     * Format: https://en.wikipedia.org/wiki/ISO_4217
     * Examples: "USD", "EUR", "JPY"
     * </pre>
     *
     * <code>string currency_code = 8;</code>
     *
     * @param value The bytes for currencyCode to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      currencyCode_ = value;
      onChanged();
      return this;
    }

    private boolean deleted_;
    /**
     *
     *
     * <pre>
     * Output only. Indicates whether this Property is soft-deleted or not. Deleted properties
     * are excluded from List results unless specifically requested.
     * </pre>
     *
     * <code>bool deleted = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The deleted.
     */
    @java.lang.Override
    public boolean getDeleted() {
      return deleted_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Indicates whether this Property is soft-deleted or not. Deleted properties
     * are excluded from List results unless specifically requested.
     * </pre>
     *
     * <code>bool deleted = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The deleted to set.
     * @return This builder for chaining.
     */
    public Builder setDeleted(boolean value) {

      deleted_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Indicates whether this Property is soft-deleted or not. Deleted properties
     * are excluded from List results unless specifically requested.
     * </pre>
     *
     * <code>bool deleted = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeleted() {

      deleted_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.Property)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.Property)
  private static final com.google.analytics.admin.v1alpha.Property DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.Property();
  }

  public static com.google.analytics.admin.v1alpha.Property getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Property> PARSER =
      new com.google.protobuf.AbstractParser<Property>() {
        @java.lang.Override
        public Property parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Property(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Property> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Property> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.Property getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
