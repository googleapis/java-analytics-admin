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
 * A resource message representing a Google Analytics Android app stream.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.AndroidAppDataStream}
 */
public final class AndroidAppDataStream extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.AndroidAppDataStream)
    AndroidAppDataStreamOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AndroidAppDataStream.newBuilder() to construct.
  private AndroidAppDataStream(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AndroidAppDataStream() {
    name_ = "";
    firebaseAppId_ = "";
    packageName_ = "";
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AndroidAppDataStream();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AndroidAppDataStream(
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

              firebaseAppId_ = s;
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

              packageName_ = s;
              break;
            }
          case 50:
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
        .internal_static_google_analytics_admin_v1alpha_AndroidAppDataStream_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_AndroidAppDataStream_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.AndroidAppDataStream.class,
            com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this Data Stream.
   * Format: properties/{property_id}/androidAppDataStreams/{stream_id}
   * Example: "properties/1000/androidAppDataStreams/2000"
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
   * Format: properties/{property_id}/androidAppDataStreams/{stream_id}
   * Example: "properties/1000/androidAppDataStreams/2000"
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

  public static final int FIREBASE_APP_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object firebaseAppId_;
  /**
   *
   *
   * <pre>
   * Output only. ID of the corresponding Android app in Firebase, if any.
   * This ID can change if the Android app is deleted and recreated.
   * </pre>
   *
   * <code>string firebase_app_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. ID of the corresponding Android app in Firebase, if any.
   * This ID can change if the Android app is deleted and recreated.
   * </pre>
   *
   * <code>string firebase_app_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

  public static final int CREATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp createTime_;
  /**
   *
   *
   * <pre>
   * Output only. Time when this stream was originally created.
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
   * Output only. Time when this stream was originally created.
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
   * Output only. Time when this stream was originally created.
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
   * Output only. Time when stream payload fields were last updated.
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
   * Output only. Time when stream payload fields were last updated.
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
   * Output only. Time when stream payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
  }

  public static final int PACKAGE_NAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object packageName_;
  /**
   *
   *
   * <pre>
   * Immutable. The package name for the app being measured.
   * Example: "com.example.myandroidapp"
   * </pre>
   *
   * <code>string package_name = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The packageName.
   */
  @java.lang.Override
  public java.lang.String getPackageName() {
    java.lang.Object ref = packageName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      packageName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. The package name for the app being measured.
   * Example: "com.example.myandroidapp"
   * </pre>
   *
   * <code>string package_name = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for packageName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPackageNameBytes() {
    java.lang.Object ref = packageName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      packageName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 6;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * Human-readable display name for the Data Stream.
   * The max allowed display name length is 255 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 6;</code>
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
   * Human-readable display name for the Data Stream.
   * The max allowed display name length is 255 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 6;</code>
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
    if (!getFirebaseAppIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firebaseAppId_);
    }
    if (createTime_ != null) {
      output.writeMessage(3, getCreateTime());
    }
    if (updateTime_ != null) {
      output.writeMessage(4, getUpdateTime());
    }
    if (!getPackageNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, packageName_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, displayName_);
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
    if (!getFirebaseAppIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firebaseAppId_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCreateTime());
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getUpdateTime());
    }
    if (!getPackageNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, packageName_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, displayName_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.AndroidAppDataStream)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.AndroidAppDataStream other =
        (com.google.analytics.admin.v1alpha.AndroidAppDataStream) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getFirebaseAppId().equals(other.getFirebaseAppId())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime().equals(other.getCreateTime())) return false;
    }
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (!getPackageName().equals(other.getPackageName())) return false;
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
    hash = (37 * hash) + PACKAGE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPackageName().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream parseFrom(
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

  public static Builder newBuilder(
      com.google.analytics.admin.v1alpha.AndroidAppDataStream prototype) {
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
   * A resource message representing a Google Analytics Android app stream.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.AndroidAppDataStream}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.AndroidAppDataStream)
      com.google.analytics.admin.v1alpha.AndroidAppDataStreamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_AndroidAppDataStream_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_AndroidAppDataStream_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.AndroidAppDataStream.class,
              com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.AndroidAppDataStream.newBuilder()
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
      packageName_ = "";

      displayName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_AndroidAppDataStream_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AndroidAppDataStream getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.AndroidAppDataStream.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AndroidAppDataStream build() {
      com.google.analytics.admin.v1alpha.AndroidAppDataStream result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AndroidAppDataStream buildPartial() {
      com.google.analytics.admin.v1alpha.AndroidAppDataStream result =
          new com.google.analytics.admin.v1alpha.AndroidAppDataStream(this);
      result.name_ = name_;
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
      result.packageName_ = packageName_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.AndroidAppDataStream) {
        return mergeFrom((com.google.analytics.admin.v1alpha.AndroidAppDataStream) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.AndroidAppDataStream other) {
      if (other == com.google.analytics.admin.v1alpha.AndroidAppDataStream.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
      if (!other.getPackageName().isEmpty()) {
        packageName_ = other.packageName_;
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
      com.google.analytics.admin.v1alpha.AndroidAppDataStream parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.AndroidAppDataStream) e.getUnfinishedMessage();
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
     * Format: properties/{property_id}/androidAppDataStreams/{stream_id}
     * Example: "properties/1000/androidAppDataStreams/2000"
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
     * Format: properties/{property_id}/androidAppDataStreams/{stream_id}
     * Example: "properties/1000/androidAppDataStreams/2000"
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
     * Format: properties/{property_id}/androidAppDataStreams/{stream_id}
     * Example: "properties/1000/androidAppDataStreams/2000"
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
     * Format: properties/{property_id}/androidAppDataStreams/{stream_id}
     * Example: "properties/1000/androidAppDataStreams/2000"
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
     * Format: properties/{property_id}/androidAppDataStreams/{stream_id}
     * Example: "properties/1000/androidAppDataStreams/2000"
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

    private java.lang.Object firebaseAppId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. ID of the corresponding Android app in Firebase, if any.
     * This ID can change if the Android app is deleted and recreated.
     * </pre>
     *
     * <code>string firebase_app_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. ID of the corresponding Android app in Firebase, if any.
     * This ID can change if the Android app is deleted and recreated.
     * </pre>
     *
     * <code>string firebase_app_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. ID of the corresponding Android app in Firebase, if any.
     * This ID can change if the Android app is deleted and recreated.
     * </pre>
     *
     * <code>string firebase_app_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. ID of the corresponding Android app in Firebase, if any.
     * This ID can change if the Android app is deleted and recreated.
     * </pre>
     *
     * <code>string firebase_app_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. ID of the corresponding Android app in Firebase, if any.
     * This ID can change if the Android app is deleted and recreated.
     * </pre>
     *
     * <code>string firebase_app_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Time when this stream was originally created.
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
     * Output only. Time when this stream was originally created.
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
     * Output only. Time when this stream was originally created.
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
     * Output only. Time when this stream was originally created.
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
     * Output only. Time when this stream was originally created.
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
     * Output only. Time when this stream was originally created.
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
     * Output only. Time when this stream was originally created.
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
     * Output only. Time when this stream was originally created.
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
     * Output only. Time when stream payload fields were last updated.
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
     * Output only. Time when stream payload fields were last updated.
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
     * Output only. Time when stream payload fields were last updated.
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
     * Output only. Time when stream payload fields were last updated.
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
     * Output only. Time when stream payload fields were last updated.
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
     * Output only. Time when stream payload fields were last updated.
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
     * Output only. Time when stream payload fields were last updated.
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
     * Output only. Time when stream payload fields were last updated.
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
     * Output only. Time when stream payload fields were last updated.
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

    private java.lang.Object packageName_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. The package name for the app being measured.
     * Example: "com.example.myandroidapp"
     * </pre>
     *
     * <code>string package_name = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The packageName.
     */
    public java.lang.String getPackageName() {
      java.lang.Object ref = packageName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        packageName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. The package name for the app being measured.
     * Example: "com.example.myandroidapp"
     * </pre>
     *
     * <code>string package_name = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The bytes for packageName.
     */
    public com.google.protobuf.ByteString getPackageNameBytes() {
      java.lang.Object ref = packageName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        packageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. The package name for the app being measured.
     * Example: "com.example.myandroidapp"
     * </pre>
     *
     * <code>string package_name = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The packageName to set.
     * @return This builder for chaining.
     */
    public Builder setPackageName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      packageName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The package name for the app being measured.
     * Example: "com.example.myandroidapp"
     * </pre>
     *
     * <code>string package_name = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPackageName() {

      packageName_ = getDefaultInstance().getPackageName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The package name for the app being measured.
     * Example: "com.example.myandroidapp"
     * </pre>
     *
     * <code>string package_name = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The bytes for packageName to set.
     * @return This builder for chaining.
     */
    public Builder setPackageNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      packageName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Human-readable display name for the Data Stream.
     * The max allowed display name length is 255 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 6;</code>
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
     * Human-readable display name for the Data Stream.
     * The max allowed display name length is 255 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 6;</code>
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
     * Human-readable display name for the Data Stream.
     * The max allowed display name length is 255 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 6;</code>
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
     * Human-readable display name for the Data Stream.
     * The max allowed display name length is 255 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 6;</code>
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
     * Human-readable display name for the Data Stream.
     * The max allowed display name length is 255 UTF-16 code units.
     * </pre>
     *
     * <code>string display_name = 6;</code>
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.AndroidAppDataStream)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.AndroidAppDataStream)
  private static final com.google.analytics.admin.v1alpha.AndroidAppDataStream DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.AndroidAppDataStream();
  }

  public static com.google.analytics.admin.v1alpha.AndroidAppDataStream getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AndroidAppDataStream> PARSER =
      new com.google.protobuf.AbstractParser<AndroidAppDataStream>() {
        @java.lang.Override
        public AndroidAppDataStream parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AndroidAppDataStream(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AndroidAppDataStream> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AndroidAppDataStream> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AndroidAppDataStream getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
