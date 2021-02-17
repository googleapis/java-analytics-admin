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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for ListAndroidDataStreams RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse}
 */
public final class ListAndroidAppDataStreamsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse)
    ListAndroidAppDataStreamsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAndroidAppDataStreamsResponse.newBuilder() to construct.
  private ListAndroidAppDataStreamsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAndroidAppDataStreamsResponse() {
    androidAppDataStreams_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAndroidAppDataStreamsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListAndroidAppDataStreamsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                androidAppDataStreams_ =
                    new java.util.ArrayList<
                        com.google.analytics.admin.v1alpha.AndroidAppDataStream>();
                mutable_bitField0_ |= 0x00000001;
              }
              androidAppDataStreams_.add(
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.AndroidAppDataStream.parser(),
                      extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        androidAppDataStreams_ = java.util.Collections.unmodifiableList(androidAppDataStreams_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListAndroidAppDataStreamsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListAndroidAppDataStreamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse.class,
            com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse.Builder.class);
  }

  public static final int ANDROID_APP_DATA_STREAMS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.admin.v1alpha.AndroidAppDataStream>
      androidAppDataStreams_;
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.AndroidAppDataStream>
      getAndroidAppDataStreamsList() {
    return androidAppDataStreams_;
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.AndroidAppDataStreamOrBuilder>
      getAndroidAppDataStreamsOrBuilderList() {
    return androidAppDataStreams_;
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
   * </code>
   */
  @java.lang.Override
  public int getAndroidAppDataStreamsCount() {
    return androidAppDataStreams_.size();
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AndroidAppDataStream getAndroidAppDataStreams(
      int index) {
    return androidAppDataStreams_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AndroidAppDataStreamOrBuilder
      getAndroidAppDataStreamsOrBuilder(int index) {
    return androidAppDataStreams_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < androidAppDataStreams_.size(); i++) {
      output.writeMessage(1, androidAppDataStreams_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < androidAppDataStreams_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, androidAppDataStreams_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse other =
        (com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse) obj;

    if (!getAndroidAppDataStreamsList().equals(other.getAndroidAppDataStreamsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getAndroidAppDataStreamsCount() > 0) {
      hash = (37 * hash) + ANDROID_APP_DATA_STREAMS_FIELD_NUMBER;
      hash = (53 * hash) + getAndroidAppDataStreamsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parseFrom(
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
      com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse prototype) {
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
   * Request message for ListAndroidDataStreams RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse)
      com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListAndroidAppDataStreamsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListAndroidAppDataStreamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse.class,
              com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse.Builder.class);
    }

    // Construct using
    // com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAndroidAppDataStreamsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (androidAppDataStreamsBuilder_ == null) {
        androidAppDataStreams_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        androidAppDataStreamsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListAndroidAppDataStreamsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse build() {
      com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse buildPartial() {
      com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse result =
          new com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse(this);
      int from_bitField0_ = bitField0_;
      if (androidAppDataStreamsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          androidAppDataStreams_ = java.util.Collections.unmodifiableList(androidAppDataStreams_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.androidAppDataStreams_ = androidAppDataStreams_;
      } else {
        result.androidAppDataStreams_ = androidAppDataStreamsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse) {
        return mergeFrom(
            (com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse other) {
      if (other
          == com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse
              .getDefaultInstance()) return this;
      if (androidAppDataStreamsBuilder_ == null) {
        if (!other.androidAppDataStreams_.isEmpty()) {
          if (androidAppDataStreams_.isEmpty()) {
            androidAppDataStreams_ = other.androidAppDataStreams_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAndroidAppDataStreamsIsMutable();
            androidAppDataStreams_.addAll(other.androidAppDataStreams_);
          }
          onChanged();
        }
      } else {
        if (!other.androidAppDataStreams_.isEmpty()) {
          if (androidAppDataStreamsBuilder_.isEmpty()) {
            androidAppDataStreamsBuilder_.dispose();
            androidAppDataStreamsBuilder_ = null;
            androidAppDataStreams_ = other.androidAppDataStreams_;
            bitField0_ = (bitField0_ & ~0x00000001);
            androidAppDataStreamsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAndroidAppDataStreamsFieldBuilder()
                    : null;
          } else {
            androidAppDataStreamsBuilder_.addAllMessages(other.androidAppDataStreams_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.analytics.admin.v1alpha.AndroidAppDataStream>
        androidAppDataStreams_ = java.util.Collections.emptyList();

    private void ensureAndroidAppDataStreamsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        androidAppDataStreams_ =
            new java.util.ArrayList<com.google.analytics.admin.v1alpha.AndroidAppDataStream>(
                androidAppDataStreams_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AndroidAppDataStream,
            com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder,
            com.google.analytics.admin.v1alpha.AndroidAppDataStreamOrBuilder>
        androidAppDataStreamsBuilder_;

    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.AndroidAppDataStream>
        getAndroidAppDataStreamsList() {
      if (androidAppDataStreamsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(androidAppDataStreams_);
      } else {
        return androidAppDataStreamsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public int getAndroidAppDataStreamsCount() {
      if (androidAppDataStreamsBuilder_ == null) {
        return androidAppDataStreams_.size();
      } else {
        return androidAppDataStreamsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AndroidAppDataStream getAndroidAppDataStreams(
        int index) {
      if (androidAppDataStreamsBuilder_ == null) {
        return androidAppDataStreams_.get(index);
      } else {
        return androidAppDataStreamsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public Builder setAndroidAppDataStreams(
        int index, com.google.analytics.admin.v1alpha.AndroidAppDataStream value) {
      if (androidAppDataStreamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAndroidAppDataStreamsIsMutable();
        androidAppDataStreams_.set(index, value);
        onChanged();
      } else {
        androidAppDataStreamsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public Builder setAndroidAppDataStreams(
        int index,
        com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder builderForValue) {
      if (androidAppDataStreamsBuilder_ == null) {
        ensureAndroidAppDataStreamsIsMutable();
        androidAppDataStreams_.set(index, builderForValue.build());
        onChanged();
      } else {
        androidAppDataStreamsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public Builder addAndroidAppDataStreams(
        com.google.analytics.admin.v1alpha.AndroidAppDataStream value) {
      if (androidAppDataStreamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAndroidAppDataStreamsIsMutable();
        androidAppDataStreams_.add(value);
        onChanged();
      } else {
        androidAppDataStreamsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public Builder addAndroidAppDataStreams(
        int index, com.google.analytics.admin.v1alpha.AndroidAppDataStream value) {
      if (androidAppDataStreamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAndroidAppDataStreamsIsMutable();
        androidAppDataStreams_.add(index, value);
        onChanged();
      } else {
        androidAppDataStreamsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public Builder addAndroidAppDataStreams(
        com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder builderForValue) {
      if (androidAppDataStreamsBuilder_ == null) {
        ensureAndroidAppDataStreamsIsMutable();
        androidAppDataStreams_.add(builderForValue.build());
        onChanged();
      } else {
        androidAppDataStreamsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public Builder addAndroidAppDataStreams(
        int index,
        com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder builderForValue) {
      if (androidAppDataStreamsBuilder_ == null) {
        ensureAndroidAppDataStreamsIsMutable();
        androidAppDataStreams_.add(index, builderForValue.build());
        onChanged();
      } else {
        androidAppDataStreamsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public Builder addAllAndroidAppDataStreams(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.AndroidAppDataStream>
            values) {
      if (androidAppDataStreamsBuilder_ == null) {
        ensureAndroidAppDataStreamsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, androidAppDataStreams_);
        onChanged();
      } else {
        androidAppDataStreamsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public Builder clearAndroidAppDataStreams() {
      if (androidAppDataStreamsBuilder_ == null) {
        androidAppDataStreams_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        androidAppDataStreamsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public Builder removeAndroidAppDataStreams(int index) {
      if (androidAppDataStreamsBuilder_ == null) {
        ensureAndroidAppDataStreamsIsMutable();
        androidAppDataStreams_.remove(index);
        onChanged();
      } else {
        androidAppDataStreamsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder
        getAndroidAppDataStreamsBuilder(int index) {
      return getAndroidAppDataStreamsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AndroidAppDataStreamOrBuilder
        getAndroidAppDataStreamsOrBuilder(int index) {
      if (androidAppDataStreamsBuilder_ == null) {
        return androidAppDataStreams_.get(index);
      } else {
        return androidAppDataStreamsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.analytics.admin.v1alpha.AndroidAppDataStreamOrBuilder>
        getAndroidAppDataStreamsOrBuilderList() {
      if (androidAppDataStreamsBuilder_ != null) {
        return androidAppDataStreamsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(androidAppDataStreams_);
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder
        addAndroidAppDataStreamsBuilder() {
      return getAndroidAppDataStreamsFieldBuilder()
          .addBuilder(com.google.analytics.admin.v1alpha.AndroidAppDataStream.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder
        addAndroidAppDataStreamsBuilder(int index) {
      return getAndroidAppDataStreamsFieldBuilder()
          .addBuilder(
              index, com.google.analytics.admin.v1alpha.AndroidAppDataStream.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.AndroidAppDataStream android_app_data_streams = 1;
     * </code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder>
        getAndroidAppDataStreamsBuilderList() {
      return getAndroidAppDataStreamsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AndroidAppDataStream,
            com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder,
            com.google.analytics.admin.v1alpha.AndroidAppDataStreamOrBuilder>
        getAndroidAppDataStreamsFieldBuilder() {
      if (androidAppDataStreamsBuilder_ == null) {
        androidAppDataStreamsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.AndroidAppDataStream,
                com.google.analytics.admin.v1alpha.AndroidAppDataStream.Builder,
                com.google.analytics.admin.v1alpha.AndroidAppDataStreamOrBuilder>(
                androidAppDataStreams_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        androidAppDataStreams_ = null;
      }
      return androidAppDataStreamsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse)
  private static final com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse();
  }

  public static com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAndroidAppDataStreamsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAndroidAppDataStreamsResponse>() {
        @java.lang.Override
        public ListAndroidAppDataStreamsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListAndroidAppDataStreamsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListAndroidAppDataStreamsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAndroidAppDataStreamsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
