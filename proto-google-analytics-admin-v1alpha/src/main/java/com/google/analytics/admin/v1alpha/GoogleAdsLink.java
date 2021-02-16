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
 * A link between an GA4 property and a Google Ads account.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.GoogleAdsLink}
 */
public final class GoogleAdsLink extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.GoogleAdsLink)
    GoogleAdsLinkOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GoogleAdsLink.newBuilder() to construct.
  private GoogleAdsLink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GoogleAdsLink() {
    name_ = "";
    customerId_ = "";
    emailAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GoogleAdsLink();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GoogleAdsLink(
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
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              customerId_ = s;
              break;
            }
          case 32:
            {
              canManageClients_ = input.readBool();
              break;
            }
          case 42:
            {
              com.google.protobuf.BoolValue.Builder subBuilder = null;
              if (adsPersonalizationEnabled_ != null) {
                subBuilder = adsPersonalizationEnabled_.toBuilder();
              }
              adsPersonalizationEnabled_ =
                  input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(adsPersonalizationEnabled_);
                adsPersonalizationEnabled_ = subBuilder.buildPartial();
              }

              break;
            }
          case 50:
            {
              java.lang.String s = input.readStringRequireUtf8();

              emailAddress_ = s;
              break;
            }
          case 58:
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
          case 66:
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
        .internal_static_google_analytics_admin_v1alpha_GoogleAdsLink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_GoogleAdsLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.GoogleAdsLink.class,
            com.google.analytics.admin.v1alpha.GoogleAdsLink.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Output only. Format: properties/{propertyId}/googleAdsLinks/{googleAdsLinkId}
   * Note: googleAdsLinkId is not the Google Ads customer ID.
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
   * Output only. Format: properties/{propertyId}/googleAdsLinks/{googleAdsLinkId}
   * Note: googleAdsLinkId is not the Google Ads customer ID.
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

  public static final int CUSTOMER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object customerId_;
  /**
   *
   *
   * <pre>
   * Immutable. Google Ads customer ID.
   * </pre>
   *
   * <code>string customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. Google Ads customer ID.
   * </pre>
   *
   * <code>string customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAN_MANAGE_CLIENTS_FIELD_NUMBER = 4;
  private boolean canManageClients_;
  /**
   *
   *
   * <pre>
   * Output only. If true, this link is for a Google Ads manager account.
   * </pre>
   *
   * <code>bool can_manage_clients = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The canManageClients.
   */
  @java.lang.Override
  public boolean getCanManageClients() {
    return canManageClients_;
  }

  public static final int ADS_PERSONALIZATION_ENABLED_FIELD_NUMBER = 5;
  private com.google.protobuf.BoolValue adsPersonalizationEnabled_;
  /**
   *
   *
   * <pre>
   * Enable personalized advertising features with this integration.
   * Automatically publish my Google Analytics audience lists and Google
   * Analytics remarketing events/parameters to the linked Google Ads account.
   * If this field is not set on create/update it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
   *
   * @return Whether the adsPersonalizationEnabled field is set.
   */
  @java.lang.Override
  public boolean hasAdsPersonalizationEnabled() {
    return adsPersonalizationEnabled_ != null;
  }
  /**
   *
   *
   * <pre>
   * Enable personalized advertising features with this integration.
   * Automatically publish my Google Analytics audience lists and Google
   * Analytics remarketing events/parameters to the linked Google Ads account.
   * If this field is not set on create/update it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
   *
   * @return The adsPersonalizationEnabled.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getAdsPersonalizationEnabled() {
    return adsPersonalizationEnabled_ == null
        ? com.google.protobuf.BoolValue.getDefaultInstance()
        : adsPersonalizationEnabled_;
  }
  /**
   *
   *
   * <pre>
   * Enable personalized advertising features with this integration.
   * Automatically publish my Google Analytics audience lists and Google
   * Analytics remarketing events/parameters to the linked Google Ads account.
   * If this field is not set on create/update it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getAdsPersonalizationEnabledOrBuilder() {
    return getAdsPersonalizationEnabled();
  }

  public static final int EMAIL_ADDRESS_FIELD_NUMBER = 6;
  private volatile java.lang.Object emailAddress_;
  /**
   *
   *
   * <pre>
   * Output only. Email address of the user that created the link.
   * An empty string will be returned if the email address can't be retrieved.
   * </pre>
   *
   * <code>string email_address = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The emailAddress.
   */
  @java.lang.Override
  public java.lang.String getEmailAddress() {
    java.lang.Object ref = emailAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailAddress_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Email address of the user that created the link.
   * An empty string will be returned if the email address can't be retrieved.
   * </pre>
   *
   * <code>string email_address = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for emailAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEmailAddressBytes() {
    java.lang.Object ref = emailAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      emailAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 7;
  private com.google.protobuf.Timestamp createTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time when this link was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * Output only. Time when this link was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * Output only. Time when this link was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 8;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time when this link was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * Output only. Time when this link was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * Output only. Time when this link was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
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
    if (!getCustomerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customerId_);
    }
    if (canManageClients_ != false) {
      output.writeBool(4, canManageClients_);
    }
    if (adsPersonalizationEnabled_ != null) {
      output.writeMessage(5, getAdsPersonalizationEnabled());
    }
    if (!getEmailAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, emailAddress_);
    }
    if (createTime_ != null) {
      output.writeMessage(7, getCreateTime());
    }
    if (updateTime_ != null) {
      output.writeMessage(8, getUpdateTime());
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
    if (!getCustomerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customerId_);
    }
    if (canManageClients_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, canManageClients_);
    }
    if (adsPersonalizationEnabled_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              5, getAdsPersonalizationEnabled());
    }
    if (!getEmailAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, emailAddress_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, getCreateTime());
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, getUpdateTime());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.GoogleAdsLink)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.GoogleAdsLink other =
        (com.google.analytics.admin.v1alpha.GoogleAdsLink) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getCustomerId().equals(other.getCustomerId())) return false;
    if (getCanManageClients() != other.getCanManageClients()) return false;
    if (hasAdsPersonalizationEnabled() != other.hasAdsPersonalizationEnabled()) return false;
    if (hasAdsPersonalizationEnabled()) {
      if (!getAdsPersonalizationEnabled().equals(other.getAdsPersonalizationEnabled()))
        return false;
    }
    if (!getEmailAddress().equals(other.getEmailAddress())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime().equals(other.getCreateTime())) return false;
    }
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    hash = (37 * hash) + CAN_MANAGE_CLIENTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getCanManageClients());
    if (hasAdsPersonalizationEnabled()) {
      hash = (37 * hash) + ADS_PERSONALIZATION_ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + getAdsPersonalizationEnabled().hashCode();
    }
    hash = (37 * hash) + EMAIL_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getEmailAddress().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink parseFrom(
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

  public static Builder newBuilder(com.google.analytics.admin.v1alpha.GoogleAdsLink prototype) {
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
   * A link between an GA4 property and a Google Ads account.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.GoogleAdsLink}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.GoogleAdsLink)
      com.google.analytics.admin.v1alpha.GoogleAdsLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_GoogleAdsLink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_GoogleAdsLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.GoogleAdsLink.class,
              com.google.analytics.admin.v1alpha.GoogleAdsLink.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.GoogleAdsLink.newBuilder()
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

      customerId_ = "";

      canManageClients_ = false;

      if (adsPersonalizationEnabledBuilder_ == null) {
        adsPersonalizationEnabled_ = null;
      } else {
        adsPersonalizationEnabled_ = null;
        adsPersonalizationEnabledBuilder_ = null;
      }
      emailAddress_ = "";

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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_GoogleAdsLink_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GoogleAdsLink getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.GoogleAdsLink.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GoogleAdsLink build() {
      com.google.analytics.admin.v1alpha.GoogleAdsLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GoogleAdsLink buildPartial() {
      com.google.analytics.admin.v1alpha.GoogleAdsLink result =
          new com.google.analytics.admin.v1alpha.GoogleAdsLink(this);
      result.name_ = name_;
      result.customerId_ = customerId_;
      result.canManageClients_ = canManageClients_;
      if (adsPersonalizationEnabledBuilder_ == null) {
        result.adsPersonalizationEnabled_ = adsPersonalizationEnabled_;
      } else {
        result.adsPersonalizationEnabled_ = adsPersonalizationEnabledBuilder_.build();
      }
      result.emailAddress_ = emailAddress_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.GoogleAdsLink) {
        return mergeFrom((com.google.analytics.admin.v1alpha.GoogleAdsLink) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.GoogleAdsLink other) {
      if (other == com.google.analytics.admin.v1alpha.GoogleAdsLink.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (other.getCanManageClients() != false) {
        setCanManageClients(other.getCanManageClients());
      }
      if (other.hasAdsPersonalizationEnabled()) {
        mergeAdsPersonalizationEnabled(other.getAdsPersonalizationEnabled());
      }
      if (!other.getEmailAddress().isEmpty()) {
        emailAddress_ = other.emailAddress_;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
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
      com.google.analytics.admin.v1alpha.GoogleAdsLink parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.admin.v1alpha.GoogleAdsLink) e.getUnfinishedMessage();
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
     * Output only. Format: properties/{propertyId}/googleAdsLinks/{googleAdsLinkId}
     * Note: googleAdsLinkId is not the Google Ads customer ID.
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
     * Output only. Format: properties/{propertyId}/googleAdsLinks/{googleAdsLinkId}
     * Note: googleAdsLinkId is not the Google Ads customer ID.
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
     * Output only. Format: properties/{propertyId}/googleAdsLinks/{googleAdsLinkId}
     * Note: googleAdsLinkId is not the Google Ads customer ID.
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
     * Output only. Format: properties/{propertyId}/googleAdsLinks/{googleAdsLinkId}
     * Note: googleAdsLinkId is not the Google Ads customer ID.
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
     * Output only. Format: properties/{propertyId}/googleAdsLinks/{googleAdsLinkId}
     * Note: googleAdsLinkId is not the Google Ads customer ID.
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

    private java.lang.Object customerId_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. Google Ads customer ID.
     * </pre>
     *
     * <code>string customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Google Ads customer ID.
     * </pre>
     *
     * <code>string customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Google Ads customer ID.
     * </pre>
     *
     * <code>string customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Google Ads customer ID.
     * </pre>
     *
     * <code>string customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {

      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Google Ads customer ID.
     * </pre>
     *
     * <code>string customer_id = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      customerId_ = value;
      onChanged();
      return this;
    }

    private boolean canManageClients_;
    /**
     *
     *
     * <pre>
     * Output only. If true, this link is for a Google Ads manager account.
     * </pre>
     *
     * <code>bool can_manage_clients = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The canManageClients.
     */
    @java.lang.Override
    public boolean getCanManageClients() {
      return canManageClients_;
    }
    /**
     *
     *
     * <pre>
     * Output only. If true, this link is for a Google Ads manager account.
     * </pre>
     *
     * <code>bool can_manage_clients = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The canManageClients to set.
     * @return This builder for chaining.
     */
    public Builder setCanManageClients(boolean value) {

      canManageClients_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. If true, this link is for a Google Ads manager account.
     * </pre>
     *
     * <code>bool can_manage_clients = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCanManageClients() {

      canManageClients_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.BoolValue adsPersonalizationEnabled_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue,
            com.google.protobuf.BoolValue.Builder,
            com.google.protobuf.BoolValueOrBuilder>
        adsPersonalizationEnabledBuilder_;
    /**
     *
     *
     * <pre>
     * Enable personalized advertising features with this integration.
     * Automatically publish my Google Analytics audience lists and Google
     * Analytics remarketing events/parameters to the linked Google Ads account.
     * If this field is not set on create/update it will be defaulted to true.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
     *
     * @return Whether the adsPersonalizationEnabled field is set.
     */
    public boolean hasAdsPersonalizationEnabled() {
      return adsPersonalizationEnabledBuilder_ != null || adsPersonalizationEnabled_ != null;
    }
    /**
     *
     *
     * <pre>
     * Enable personalized advertising features with this integration.
     * Automatically publish my Google Analytics audience lists and Google
     * Analytics remarketing events/parameters to the linked Google Ads account.
     * If this field is not set on create/update it will be defaulted to true.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
     *
     * @return The adsPersonalizationEnabled.
     */
    public com.google.protobuf.BoolValue getAdsPersonalizationEnabled() {
      if (adsPersonalizationEnabledBuilder_ == null) {
        return adsPersonalizationEnabled_ == null
            ? com.google.protobuf.BoolValue.getDefaultInstance()
            : adsPersonalizationEnabled_;
      } else {
        return adsPersonalizationEnabledBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Enable personalized advertising features with this integration.
     * Automatically publish my Google Analytics audience lists and Google
     * Analytics remarketing events/parameters to the linked Google Ads account.
     * If this field is not set on create/update it will be defaulted to true.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
     */
    public Builder setAdsPersonalizationEnabled(com.google.protobuf.BoolValue value) {
      if (adsPersonalizationEnabledBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adsPersonalizationEnabled_ = value;
        onChanged();
      } else {
        adsPersonalizationEnabledBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Enable personalized advertising features with this integration.
     * Automatically publish my Google Analytics audience lists and Google
     * Analytics remarketing events/parameters to the linked Google Ads account.
     * If this field is not set on create/update it will be defaulted to true.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
     */
    public Builder setAdsPersonalizationEnabled(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (adsPersonalizationEnabledBuilder_ == null) {
        adsPersonalizationEnabled_ = builderForValue.build();
        onChanged();
      } else {
        adsPersonalizationEnabledBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Enable personalized advertising features with this integration.
     * Automatically publish my Google Analytics audience lists and Google
     * Analytics remarketing events/parameters to the linked Google Ads account.
     * If this field is not set on create/update it will be defaulted to true.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
     */
    public Builder mergeAdsPersonalizationEnabled(com.google.protobuf.BoolValue value) {
      if (adsPersonalizationEnabledBuilder_ == null) {
        if (adsPersonalizationEnabled_ != null) {
          adsPersonalizationEnabled_ =
              com.google.protobuf.BoolValue.newBuilder(adsPersonalizationEnabled_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          adsPersonalizationEnabled_ = value;
        }
        onChanged();
      } else {
        adsPersonalizationEnabledBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Enable personalized advertising features with this integration.
     * Automatically publish my Google Analytics audience lists and Google
     * Analytics remarketing events/parameters to the linked Google Ads account.
     * If this field is not set on create/update it will be defaulted to true.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
     */
    public Builder clearAdsPersonalizationEnabled() {
      if (adsPersonalizationEnabledBuilder_ == null) {
        adsPersonalizationEnabled_ = null;
        onChanged();
      } else {
        adsPersonalizationEnabled_ = null;
        adsPersonalizationEnabledBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Enable personalized advertising features with this integration.
     * Automatically publish my Google Analytics audience lists and Google
     * Analytics remarketing events/parameters to the linked Google Ads account.
     * If this field is not set on create/update it will be defaulted to true.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
     */
    public com.google.protobuf.BoolValue.Builder getAdsPersonalizationEnabledBuilder() {

      onChanged();
      return getAdsPersonalizationEnabledFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Enable personalized advertising features with this integration.
     * Automatically publish my Google Analytics audience lists and Google
     * Analytics remarketing events/parameters to the linked Google Ads account.
     * If this field is not set on create/update it will be defaulted to true.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getAdsPersonalizationEnabledOrBuilder() {
      if (adsPersonalizationEnabledBuilder_ != null) {
        return adsPersonalizationEnabledBuilder_.getMessageOrBuilder();
      } else {
        return adsPersonalizationEnabled_ == null
            ? com.google.protobuf.BoolValue.getDefaultInstance()
            : adsPersonalizationEnabled_;
      }
    }
    /**
     *
     *
     * <pre>
     * Enable personalized advertising features with this integration.
     * Automatically publish my Google Analytics audience lists and Google
     * Analytics remarketing events/parameters to the linked Google Ads account.
     * If this field is not set on create/update it will be defaulted to true.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue ads_personalization_enabled = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue,
            com.google.protobuf.BoolValue.Builder,
            com.google.protobuf.BoolValueOrBuilder>
        getAdsPersonalizationEnabledFieldBuilder() {
      if (adsPersonalizationEnabledBuilder_ == null) {
        adsPersonalizationEnabledBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.BoolValue,
                com.google.protobuf.BoolValue.Builder,
                com.google.protobuf.BoolValueOrBuilder>(
                getAdsPersonalizationEnabled(), getParentForChildren(), isClean());
        adsPersonalizationEnabled_ = null;
      }
      return adsPersonalizationEnabledBuilder_;
    }

    private java.lang.Object emailAddress_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Email address of the user that created the link.
     * An empty string will be returned if the email address can't be retrieved.
     * </pre>
     *
     * <code>string email_address = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The emailAddress.
     */
    public java.lang.String getEmailAddress() {
      java.lang.Object ref = emailAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Email address of the user that created the link.
     * An empty string will be returned if the email address can't be retrieved.
     * </pre>
     *
     * <code>string email_address = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for emailAddress.
     */
    public com.google.protobuf.ByteString getEmailAddressBytes() {
      java.lang.Object ref = emailAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        emailAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Email address of the user that created the link.
     * An empty string will be returned if the email address can't be retrieved.
     * </pre>
     *
     * <code>string email_address = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The emailAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEmailAddress(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      emailAddress_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Email address of the user that created the link.
     * An empty string will be returned if the email address can't be retrieved.
     * </pre>
     *
     * <code>string email_address = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEmailAddress() {

      emailAddress_ = getDefaultInstance().getEmailAddress();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Email address of the user that created the link.
     * An empty string will be returned if the email address can't be retrieved.
     * </pre>
     *
     * <code>string email_address = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for emailAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEmailAddressBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      emailAddress_ = value;
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
     * Output only. Time when this link was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this link was last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.GoogleAdsLink)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.GoogleAdsLink)
  private static final com.google.analytics.admin.v1alpha.GoogleAdsLink DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.GoogleAdsLink();
  }

  public static com.google.analytics.admin.v1alpha.GoogleAdsLink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoogleAdsLink> PARSER =
      new com.google.protobuf.AbstractParser<GoogleAdsLink>() {
        @java.lang.Override
        public GoogleAdsLink parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GoogleAdsLink(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GoogleAdsLink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoogleAdsLink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.GoogleAdsLink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
