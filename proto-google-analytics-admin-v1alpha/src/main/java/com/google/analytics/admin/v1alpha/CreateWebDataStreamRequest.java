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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for CreateWebDataStream RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.CreateWebDataStreamRequest}
 */
public final class CreateWebDataStreamRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateWebDataStreamRequest)
    CreateWebDataStreamRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateWebDataStreamRequest.newBuilder() to construct.
  private CreateWebDataStreamRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateWebDataStreamRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateWebDataStreamRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateWebDataStreamRequest(
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
              com.google.analytics.admin.v1alpha.WebDataStream.Builder subBuilder = null;
              if (webDataStream_ != null) {
                subBuilder = webDataStream_.toBuilder();
              }
              webDataStream_ =
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.WebDataStream.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(webDataStream_);
                webDataStream_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
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
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateWebDataStreamRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateWebDataStreamRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest.class,
            com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest.Builder.class);
  }

  public static final int WEB_DATA_STREAM_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1alpha.WebDataStream webDataStream_;
  /**
   *
   *
   * <pre>
   * Required. The web stream to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the webDataStream field is set.
   */
  @java.lang.Override
  public boolean hasWebDataStream() {
    return webDataStream_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The web stream to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The webDataStream.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.WebDataStream getWebDataStream() {
    return webDataStream_ == null
        ? com.google.analytics.admin.v1alpha.WebDataStream.getDefaultInstance()
        : webDataStream_;
  }
  /**
   *
   *
   * <pre>
   * Required. The web stream to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder getWebDataStreamOrBuilder() {
    return getWebDataStream();
  }

  public static final int PARENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this web data stream will be created.
   * Format: properties/123
   * </pre>
   *
   * <code>
   * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. The parent resource where this web data stream will be created.
   * Format: properties/123
   * </pre>
   *
   * <code>
   * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
    if (webDataStream_ != null) {
      output.writeMessage(1, getWebDataStream());
    }
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, parent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (webDataStream_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getWebDataStream());
    }
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, parent_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest other =
        (com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest) obj;

    if (hasWebDataStream() != other.hasWebDataStream()) return false;
    if (hasWebDataStream()) {
      if (!getWebDataStream().equals(other.getWebDataStream())) return false;
    }
    if (!getParent().equals(other.getParent())) return false;
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
    if (hasWebDataStream()) {
      hash = (37 * hash) + WEB_DATA_STREAM_FIELD_NUMBER;
      hash = (53 * hash) + getWebDataStream().hashCode();
    }
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest prototype) {
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
   * Request message for CreateWebDataStream RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.CreateWebDataStreamRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateWebDataStreamRequest)
      com.google.analytics.admin.v1alpha.CreateWebDataStreamRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateWebDataStreamRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateWebDataStreamRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest.class,
              com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest.newBuilder()
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
      if (webDataStreamBuilder_ == null) {
        webDataStream_ = null;
      } else {
        webDataStream_ = null;
        webDataStreamBuilder_ = null;
      }
      parent_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateWebDataStreamRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest build() {
      com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest buildPartial() {
      com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest result =
          new com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest(this);
      if (webDataStreamBuilder_ == null) {
        result.webDataStream_ = webDataStream_;
      } else {
        result.webDataStream_ = webDataStreamBuilder_.build();
      }
      result.parent_ = parent_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest.getDefaultInstance())
        return this;
      if (other.hasWebDataStream()) {
        mergeWebDataStream(other.getWebDataStream());
      }
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
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
      com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.analytics.admin.v1alpha.WebDataStream webDataStream_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.WebDataStream,
            com.google.analytics.admin.v1alpha.WebDataStream.Builder,
            com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder>
        webDataStreamBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The web stream to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the webDataStream field is set.
     */
    public boolean hasWebDataStream() {
      return webDataStreamBuilder_ != null || webDataStream_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The web stream to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The webDataStream.
     */
    public com.google.analytics.admin.v1alpha.WebDataStream getWebDataStream() {
      if (webDataStreamBuilder_ == null) {
        return webDataStream_ == null
            ? com.google.analytics.admin.v1alpha.WebDataStream.getDefaultInstance()
            : webDataStream_;
      } else {
        return webDataStreamBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The web stream to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWebDataStream(com.google.analytics.admin.v1alpha.WebDataStream value) {
      if (webDataStreamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        webDataStream_ = value;
        onChanged();
      } else {
        webDataStreamBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The web stream to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWebDataStream(
        com.google.analytics.admin.v1alpha.WebDataStream.Builder builderForValue) {
      if (webDataStreamBuilder_ == null) {
        webDataStream_ = builderForValue.build();
        onChanged();
      } else {
        webDataStreamBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The web stream to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWebDataStream(com.google.analytics.admin.v1alpha.WebDataStream value) {
      if (webDataStreamBuilder_ == null) {
        if (webDataStream_ != null) {
          webDataStream_ =
              com.google.analytics.admin.v1alpha.WebDataStream.newBuilder(webDataStream_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          webDataStream_ = value;
        }
        onChanged();
      } else {
        webDataStreamBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The web stream to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWebDataStream() {
      if (webDataStreamBuilder_ == null) {
        webDataStream_ = null;
        onChanged();
      } else {
        webDataStream_ = null;
        webDataStreamBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The web stream to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.WebDataStream.Builder getWebDataStreamBuilder() {

      onChanged();
      return getWebDataStreamFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The web stream to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder getWebDataStreamOrBuilder() {
      if (webDataStreamBuilder_ != null) {
        return webDataStreamBuilder_.getMessageOrBuilder();
      } else {
        return webDataStream_ == null
            ? com.google.analytics.admin.v1alpha.WebDataStream.getDefaultInstance()
            : webDataStream_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The web stream to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.WebDataStream web_data_stream = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.WebDataStream,
            com.google.analytics.admin.v1alpha.WebDataStream.Builder,
            com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder>
        getWebDataStreamFieldBuilder() {
      if (webDataStreamBuilder_ == null) {
        webDataStreamBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.WebDataStream,
                com.google.analytics.admin.v1alpha.WebDataStream.Builder,
                com.google.analytics.admin.v1alpha.WebDataStreamOrBuilder>(
                getWebDataStream(), getParentForChildren(), isClean());
        webDataStream_ = null;
      }
      return webDataStreamBuilder_;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource where this web data stream will be created.
     * Format: properties/123
     * </pre>
     *
     * <code>
     * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The parent resource where this web data stream will be created.
     * Format: properties/123
     * </pre>
     *
     * <code>
     * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The parent resource where this web data stream will be created.
     * Format: properties/123
     * </pre>
     *
     * <code>
     * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The parent resource where this web data stream will be created.
     * Format: properties/123
     * </pre>
     *
     * <code>
     * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The parent resource where this web data stream will be created.
     * Format: properties/123
     * </pre>
     *
     * <code>
     * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateWebDataStreamRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateWebDataStreamRequest)
  private static final com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateWebDataStreamRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateWebDataStreamRequest>() {
        @java.lang.Override
        public CreateWebDataStreamRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateWebDataStreamRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateWebDataStreamRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateWebDataStreamRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
