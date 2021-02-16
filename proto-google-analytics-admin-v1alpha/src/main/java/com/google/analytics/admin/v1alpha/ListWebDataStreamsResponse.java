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
 * Request message for ListWebDataStreams RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ListWebDataStreamsResponse}
 */
public final class ListWebDataStreamsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ListWebDataStreamsResponse)
    ListWebDataStreamsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListWebDataStreamsResponse.newBuilder() to construct.
  private ListWebDataStreamsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListWebDataStreamsResponse() {
    webDataStreams_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListWebDataStreamsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListWebDataStreamsResponse(
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
                webDataStreams_ =
                    new java.util.ArrayList<com.google.analytics.admin.v1alpha.WebDataStream>();
                mutable_bitField0_ |= 0x00000001;
              }
              webDataStreams_.add(
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.WebDataStream.parser(),
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
        webDataStreams_ = java.util.Collections.unmodifiableList(webDataStreams_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListWebDataStreamsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListWebDataStreamsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse.class,
            com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse.Builder.class);
  }

  public static final int WEB_DATA_STREAMS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.admin.v1alpha.WebDataStream> webDataStreams_;
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.WebDataStream> getWebDataStreamsList() {
    return webDataStreams_;
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder>
      getWebDataStreamsOrBuilderList() {
    return webDataStreams_;
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
   */
  @java.lang.Override
  public int getWebDataStreamsCount() {
    return webDataStreams_.size();
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.WebDataStream getWebDataStreams(int index) {
    return webDataStreams_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder getWebDataStreamsOrBuilder(
      int index) {
    return webDataStreams_.get(index);
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
    for (int i = 0; i < webDataStreams_.size(); i++) {
      output.writeMessage(1, webDataStreams_.get(i));
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
    for (int i = 0; i < webDataStreams_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, webDataStreams_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse other =
        (com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse) obj;

    if (!getWebDataStreamsList().equals(other.getWebDataStreamsList())) return false;
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
    if (getWebDataStreamsCount() > 0) {
      hash = (37 * hash) + WEB_DATA_STREAMS_FIELD_NUMBER;
      hash = (53 * hash) + getWebDataStreamsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parseFrom(
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
      com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse prototype) {
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
   * Request message for ListWebDataStreams RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ListWebDataStreamsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ListWebDataStreamsResponse)
      com.google.analytics.admin.v1alpha.ListWebDataStreamsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListWebDataStreamsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListWebDataStreamsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse.class,
              com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWebDataStreamsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (webDataStreamsBuilder_ == null) {
        webDataStreams_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        webDataStreamsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListWebDataStreamsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse build() {
      com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse buildPartial() {
      com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse result =
          new com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse(this);
      int from_bitField0_ = bitField0_;
      if (webDataStreamsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          webDataStreams_ = java.util.Collections.unmodifiableList(webDataStreams_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.webDataStreams_ = webDataStreams_;
      } else {
        result.webDataStreams_ = webDataStreamsBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse) {
        return mergeFrom((com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse other) {
      if (other
          == com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse.getDefaultInstance())
        return this;
      if (webDataStreamsBuilder_ == null) {
        if (!other.webDataStreams_.isEmpty()) {
          if (webDataStreams_.isEmpty()) {
            webDataStreams_ = other.webDataStreams_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWebDataStreamsIsMutable();
            webDataStreams_.addAll(other.webDataStreams_);
          }
          onChanged();
        }
      } else {
        if (!other.webDataStreams_.isEmpty()) {
          if (webDataStreamsBuilder_.isEmpty()) {
            webDataStreamsBuilder_.dispose();
            webDataStreamsBuilder_ = null;
            webDataStreams_ = other.webDataStreams_;
            bitField0_ = (bitField0_ & ~0x00000001);
            webDataStreamsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getWebDataStreamsFieldBuilder()
                    : null;
          } else {
            webDataStreamsBuilder_.addAllMessages(other.webDataStreams_);
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
      com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse)
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

    private java.util.List<com.google.analytics.admin.v1alpha.WebDataStream> webDataStreams_ =
        java.util.Collections.emptyList();

    private void ensureWebDataStreamsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        webDataStreams_ =
            new java.util.ArrayList<com.google.analytics.admin.v1alpha.WebDataStream>(
                webDataStreams_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.WebDataStream,
            com.google.analytics.admin.v1alpha.WebDataStream.Builder,
            com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder>
        webDataStreamsBuilder_;

    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.WebDataStream>
        getWebDataStreamsList() {
      if (webDataStreamsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(webDataStreams_);
      } else {
        return webDataStreamsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public int getWebDataStreamsCount() {
      if (webDataStreamsBuilder_ == null) {
        return webDataStreams_.size();
      } else {
        return webDataStreamsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.WebDataStream getWebDataStreams(int index) {
      if (webDataStreamsBuilder_ == null) {
        return webDataStreams_.get(index);
      } else {
        return webDataStreamsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public Builder setWebDataStreams(
        int index, com.google.analytics.admin.v1alpha.WebDataStream value) {
      if (webDataStreamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWebDataStreamsIsMutable();
        webDataStreams_.set(index, value);
        onChanged();
      } else {
        webDataStreamsBuilder_.setMessage(index, value);
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
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public Builder setWebDataStreams(
        int index, com.google.analytics.admin.v1alpha.WebDataStream.Builder builderForValue) {
      if (webDataStreamsBuilder_ == null) {
        ensureWebDataStreamsIsMutable();
        webDataStreams_.set(index, builderForValue.build());
        onChanged();
      } else {
        webDataStreamsBuilder_.setMessage(index, builderForValue.build());
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
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public Builder addWebDataStreams(com.google.analytics.admin.v1alpha.WebDataStream value) {
      if (webDataStreamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWebDataStreamsIsMutable();
        webDataStreams_.add(value);
        onChanged();
      } else {
        webDataStreamsBuilder_.addMessage(value);
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
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public Builder addWebDataStreams(
        int index, com.google.analytics.admin.v1alpha.WebDataStream value) {
      if (webDataStreamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWebDataStreamsIsMutable();
        webDataStreams_.add(index, value);
        onChanged();
      } else {
        webDataStreamsBuilder_.addMessage(index, value);
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
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public Builder addWebDataStreams(
        com.google.analytics.admin.v1alpha.WebDataStream.Builder builderForValue) {
      if (webDataStreamsBuilder_ == null) {
        ensureWebDataStreamsIsMutable();
        webDataStreams_.add(builderForValue.build());
        onChanged();
      } else {
        webDataStreamsBuilder_.addMessage(builderForValue.build());
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
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public Builder addWebDataStreams(
        int index, com.google.analytics.admin.v1alpha.WebDataStream.Builder builderForValue) {
      if (webDataStreamsBuilder_ == null) {
        ensureWebDataStreamsIsMutable();
        webDataStreams_.add(index, builderForValue.build());
        onChanged();
      } else {
        webDataStreamsBuilder_.addMessage(index, builderForValue.build());
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
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public Builder addAllWebDataStreams(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.WebDataStream> values) {
      if (webDataStreamsBuilder_ == null) {
        ensureWebDataStreamsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, webDataStreams_);
        onChanged();
      } else {
        webDataStreamsBuilder_.addAllMessages(values);
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
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public Builder clearWebDataStreams() {
      if (webDataStreamsBuilder_ == null) {
        webDataStreams_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        webDataStreamsBuilder_.clear();
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
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public Builder removeWebDataStreams(int index) {
      if (webDataStreamsBuilder_ == null) {
        ensureWebDataStreamsIsMutable();
        webDataStreams_.remove(index);
        onChanged();
      } else {
        webDataStreamsBuilder_.remove(index);
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
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.WebDataStream.Builder getWebDataStreamsBuilder(
        int index) {
      return getWebDataStreamsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder getWebDataStreamsOrBuilder(
        int index) {
      if (webDataStreamsBuilder_ == null) {
        return webDataStreams_.get(index);
      } else {
        return webDataStreamsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder>
        getWebDataStreamsOrBuilderList() {
      if (webDataStreamsBuilder_ != null) {
        return webDataStreamsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(webDataStreams_);
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.WebDataStream.Builder addWebDataStreamsBuilder() {
      return getWebDataStreamsFieldBuilder()
          .addBuilder(com.google.analytics.admin.v1alpha.WebDataStream.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.WebDataStream.Builder addWebDataStreamsBuilder(
        int index) {
      return getWebDataStreamsFieldBuilder()
          .addBuilder(index, com.google.analytics.admin.v1alpha.WebDataStream.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.WebDataStream web_data_streams = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.WebDataStream.Builder>
        getWebDataStreamsBuilderList() {
      return getWebDataStreamsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.WebDataStream,
            com.google.analytics.admin.v1alpha.WebDataStream.Builder,
            com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder>
        getWebDataStreamsFieldBuilder() {
      if (webDataStreamsBuilder_ == null) {
        webDataStreamsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.WebDataStream,
                com.google.analytics.admin.v1alpha.WebDataStream.Builder,
                com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder>(
                webDataStreams_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        webDataStreams_ = null;
      }
      return webDataStreamsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ListWebDataStreamsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ListWebDataStreamsResponse)
  private static final com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse();
  }

  public static com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListWebDataStreamsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListWebDataStreamsResponse>() {
        @java.lang.Override
        public ListWebDataStreamsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListWebDataStreamsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListWebDataStreamsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListWebDataStreamsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
