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
 * A resource message representing a Google Analytics web stream.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.WebDataStream}
 */
public final class WebDataStream extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.WebDataStream)
    WebDataStreamOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WebDataStream.newBuilder() to construct.
  private WebDataStream(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WebDataStream() {
    name_ = "";
    measurementId_ = "";
    firebaseAppId_ = "";
    defaultUri_ = "";
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WebDataStream();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private WebDataStream(
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

              measurementId_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              firebaseAppId_ = s;
              break;
            }
          case 34:
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
          case 42:
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
          case 50:
            {
              java.lang.String s = input.readStringRequireUtf8();

              defaultUri_ = s;
              break;
            }
          case 58:
            {
              java.lang.String s = input.readStringRequireUtf8();

              displayName_ = s;
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
        .internal_static_google_analytics_admin_v1alpha_WebDataStream_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_WebDataStream_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.WebDataStream.class,
            com.google.analytics.admin.v1alpha.WebDataStream.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this Data Stream.
   * Format: properties/{property_id}/webDataStreams/{stream_id}
   * Example: "properties/1000/webDataStreams/2000"
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
   * Output only. Resource name of this Data Stream.
   * Format: properties/{property_id}/webDataStreams/{stream_id}
   * Example: "properties/1000/webDataStreams/2000"
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

  public static final int MEASUREMENT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object measurementId_;
  /**
   *
   *
   * <pre>
   * Output only. Analytics "Measurement ID", without the "G-" prefix.
   * Example: "G-1A2BCD345E" would just be "1A2BCD345E"
   * </pre>
   *
   * <code>string measurement_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The measurementId.
   */
  @java.lang.Override
  public java.lang.String getMeasurementId() {
    java.lang.Object ref = measurementId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      measurementId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Analytics "Measurement ID", without the "G-" prefix.
   * Example: "G-1A2BCD345E" would just be "1A2BCD345E"
   * </pre>
   *
   * <code>string measurement_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for measurementId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMeasurementIdBytes() {
    java.lang.Object ref = measurementId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      measurementId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIREBASE_APP_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object firebaseAppId_;
  /**
   *
   *
   * <pre>
   * Output only. ID of the corresponding web app in Firebase, if any.
   * This ID can change if the web app is deleted and recreated.
   * </pre>
   *
   * <code>string firebase_app_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The firebaseAppId.
   */
  @java.lang.Override
  public java.lang.String getFirebaseAppId() {
    java.lang.Object ref = firebaseAppId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firebaseAppId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. ID of the corresponding web app in Firebase, if any.
   * This ID can change if the web app is deleted and recreated.
   * </pre>
   *
   * <code>string firebase_app_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for firebaseAppId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFirebaseAppIdBytes() {
    java.lang.Object ref = firebaseAppId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      firebaseAppId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp createTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time when this stream was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * Output only. Time when this stream was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * Output only. Time when this stream was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time when stream payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * Output only. Time when stream payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * Output only. Time when stream payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
  }

  public static final int DEFAULT_URI_FIELD_NUMBER = 6;
  private volatile java.lang.Object defaultUri_;
  /**
   *
   *
   * <pre>
   * Immutable. Domain name of the web app being measured, or empty.
   * Example: "http://www.google.com", "https://www.google.com"
   * </pre>
   *
   * <code>string default_uri = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The defaultUri.
   */
  @java.lang.Override
  public java.lang.String getDefaultUri() {
    java.lang.Object ref = defaultUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. Domain name of the web app being measured, or empty.
   * Example: "http://www.google.com", "https://www.google.com"
   * </pre>
   *
   * <code>string default_uri = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for defaultUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDefaultUriBytes() {
    java.lang.Object ref = defaultUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      defaultUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * Required. Human-readable display name for the Data Stream.
   * The max allowed display name length is 100 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 7 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. Human-readable display name for the Data Stream.
   * The max allowed display name length is 100 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 7 [(.google.api.field_behavior) = REQUIRED];</code>
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
    if (!getMeasurementIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, measurementId_);
    }
    if (!getFirebaseAppIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, firebaseAppId_);
    }
    if (createTime_ != null) {
      output.writeMessage(4, getCreateTime());
    }
    if (updateTime_ != null) {
      output.writeMessage(5, getUpdateTime());
    }
    if (!getDefaultUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, defaultUri_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, displayName_);
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
    if (!getMeasurementIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, measurementId_);
    }
    if (!getFirebaseAppIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, firebaseAppId_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getCreateTime());
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getUpdateTime());
    }
    if (!getDefaultUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, defaultUri_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, displayName_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.WebDataStream)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.WebDataStream other =
        (com.google.analytics.admin.v1alpha.WebDataStream) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getMeasurementId().equals(other.getMeasurementId())) return false;
    if (!getFirebaseAppId().equals(other.getFirebaseAppId())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime().equals(other.getCreateTime())) return false;
    }
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (!getDefaultUri().equals(other.getDefaultUri())) return false;
    if (!getDisplayName().equals(other.getDisplayName())) return false;
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
    hash = (37 * hash) + MEASUREMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMeasurementId().hashCode();
    hash = (37 * hash) + FIREBASE_APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFirebaseAppId().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (37 * hash) + DEFAULT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultUri().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream parseFrom(
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

  public static Builder newBuilder(com.google.analytics.admin.v1alpha.WebDataStream prototype) {
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
   * A resource message representing a Google Analytics web stream.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.WebDataStream}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.WebDataStream)
      com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_WebDataStream_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_WebDataStream_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.WebDataStream.class,
              com.google.analytics.admin.v1alpha.WebDataStream.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.WebDataStream.newBuilder()
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

      measurementId_ = "";

      firebaseAppId_ = "";

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
      defaultUri_ = "";

      displayName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_WebDataStream_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.WebDataStream getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.WebDataStream.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.WebDataStream build() {
      com.google.analytics.admin.v1alpha.WebDataStream result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.WebDataStream buildPartial() {
      com.google.analytics.admin.v1alpha.WebDataStream result =
          new com.google.analytics.admin.v1alpha.WebDataStream(this);
      result.name_ = name_;
      result.measurementId_ = measurementId_;
      result.firebaseAppId_ = firebaseAppId_;
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
      result.defaultUri_ = defaultUri_;
      result.displayName_ = displayName_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.WebDataStream) {
        return mergeFrom((com.google.analytics.admin.v1alpha.WebDataStream) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.WebDataStream other) {
      if (other == com.google.analytics.admin.v1alpha.WebDataStream.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getMeasurementId().isEmpty()) {
        measurementId_ = other.measurementId_;
        onChanged();
      }
      if (!other.getFirebaseAppId().isEmpty()) {
        firebaseAppId_ = other.firebaseAppId_;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      if (!other.getDefaultUri().isEmpty()) {
        defaultUri_ = other.defaultUri_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
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
      com.google.analytics.admin.v1alpha.WebDataStream parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.admin.v1alpha.WebDataStream) e.getUnfinishedMessage();
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
     * Output only. Resource name of this Data Stream.
     * Format: properties/{property_id}/webDataStreams/{stream_id}
     * Example: "properties/1000/webDataStreams/2000"
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
     * Output only. Resource name of this Data Stream.
     * Format: properties/{property_id}/webDataStreams/{stream_id}
     * Example: "properties/1000/webDataStreams/2000"
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
     * Output only. Resource name of this Data Stream.
     * Format: properties/{property_id}/webDataStreams/{stream_id}
     * Example: "properties/1000/webDataStreams/2000"
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
     * Output only. Resource name of this Data Stream.
     * Format: properties/{property_id}/webDataStreams/{stream_id}
     * Example: "properties/1000/webDataStreams/2000"
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
     * Output only. Resource name of this Data Stream.
     * Format: properties/{property_id}/webDataStreams/{stream_id}
     * Example: "properties/1000/webDataStreams/2000"
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

    private java.lang.Object measurementId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Analytics "Measurement ID", without the "G-" prefix.
     * Example: "G-1A2BCD345E" would just be "1A2BCD345E"
     * </pre>
     *
     * <code>string measurement_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The measurementId.
     */
    public java.lang.String getMeasurementId() {
      java.lang.Object ref = measurementId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        measurementId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Analytics "Measurement ID", without the "G-" prefix.
     * Example: "G-1A2BCD345E" would just be "1A2BCD345E"
     * </pre>
     *
     * <code>string measurement_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for measurementId.
     */
    public com.google.protobuf.ByteString getMeasurementIdBytes() {
      java.lang.Object ref = measurementId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        measurementId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Analytics "Measurement ID", without the "G-" prefix.
     * Example: "G-1A2BCD345E" would just be "1A2BCD345E"
     * </pre>
     *
     * <code>string measurement_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The measurementId to set.
     * @return This builder for chaining.
     */
    public Builder setMeasurementId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      measurementId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Analytics "Measurement ID", without the "G-" prefix.
     * Example: "G-1A2BCD345E" would just be "1A2BCD345E"
     * </pre>
     *
     * <code>string measurement_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMeasurementId() {

      measurementId_ = getDefaultInstance().getMeasurementId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Analytics "Measurement ID", without the "G-" prefix.
     * Example: "G-1A2BCD345E" would just be "1A2BCD345E"
     * </pre>
     *
     * <code>string measurement_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for measurementId to set.
     * @return This builder for chaining.
     */
    public Builder setMeasurementIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      measurementId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object firebaseAppId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. ID of the corresponding web app in Firebase, if any.
     * This ID can change if the web app is deleted and recreated.
     * </pre>
     *
     * <code>string firebase_app_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The firebaseAppId.
     */
    public java.lang.String getFirebaseAppId() {
      java.lang.Object ref = firebaseAppId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firebaseAppId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. ID of the corresponding web app in Firebase, if any.
     * This ID can change if the web app is deleted and recreated.
     * </pre>
     *
     * <code>string firebase_app_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for firebaseAppId.
     */
    public com.google.protobuf.ByteString getFirebaseAppIdBytes() {
      java.lang.Object ref = firebaseAppId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        firebaseAppId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. ID of the corresponding web app in Firebase, if any.
     * This ID can change if the web app is deleted and recreated.
     * </pre>
     *
     * <code>string firebase_app_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The firebaseAppId to set.
     * @return This builder for chaining.
     */
    public Builder setFirebaseAppId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      firebaseAppId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. ID of the corresponding web app in Firebase, if any.
     * This ID can change if the web app is deleted and recreated.
     * </pre>
     *
     * <code>string firebase_app_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFirebaseAppId() {

      firebaseAppId_ = getDefaultInstance().getFirebaseAppId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. ID of the corresponding web app in Firebase, if any.
     * This ID can change if the web app is deleted and recreated.
     * </pre>
     *
     * <code>string firebase_app_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for firebaseAppId to set.
     * @return This builder for chaining.
     */
    public Builder setFirebaseAppIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      firebaseAppId_ = value;
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
     * Output only. Time when this stream was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this stream was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this stream was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this stream was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this stream was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this stream was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this stream was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this stream was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when this stream was originally created.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when stream payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when stream payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when stream payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when stream payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when stream payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when stream payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when stream payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when stream payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
     * Output only. Time when stream payload fields were last updated.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
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

    private java.lang.Object defaultUri_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. Domain name of the web app being measured, or empty.
     * Example: "http://www.google.com", "https://www.google.com"
     * </pre>
     *
     * <code>string default_uri = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The defaultUri.
     */
    public java.lang.String getDefaultUri() {
      java.lang.Object ref = defaultUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Domain name of the web app being measured, or empty.
     * Example: "http://www.google.com", "https://www.google.com"
     * </pre>
     *
     * <code>string default_uri = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The bytes for defaultUri.
     */
    public com.google.protobuf.ByteString getDefaultUriBytes() {
      java.lang.Object ref = defaultUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        defaultUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Domain name of the web app being measured, or empty.
     * Example: "http://www.google.com", "https://www.google.com"
     * </pre>
     *
     * <code>string default_uri = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The defaultUri to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      defaultUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Domain name of the web app being measured, or empty.
     * Example: "http://www.google.com", "https://www.google.com"
     * </pre>
     *
     * <code>string default_uri = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDefaultUri() {

      defaultUri_ = getDefaultInstance().getDefaultUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Domain name of the web app being measured, or empty.
     * Example: "http://www.google.com", "https://www.google.com"
     * </pre>
     *
     * <code>string default_uri = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The bytes for defaultUri to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      defaultUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Required. Human-readable display name for the Data Stream.
     * The max allowed display name length is 100 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 7 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Human-readable display name for the Data Stream.
     * The max allowed display name length is 100 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 7 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Human-readable display name for the Data Stream.
     * The max allowed display name length is 100 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 7 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Human-readable display name for the Data Stream.
     * The max allowed display name length is 100 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 7 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Human-readable display name for the Data Stream.
     * The max allowed display name length is 100 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 7 [(.google.api.field_behavior) = REQUIRED];</code>
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.WebDataStream)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.WebDataStream)
  private static final com.google.analytics.admin.v1alpha.WebDataStream DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.WebDataStream();
  }

  public static com.google.analytics.admin.v1alpha.WebDataStream getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WebDataStream> PARSER =
      new com.google.protobuf.AbstractParser<WebDataStream>() {
        @java.lang.Override
        public WebDataStream parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new WebDataStream(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<WebDataStream> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WebDataStream> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.WebDataStream getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
