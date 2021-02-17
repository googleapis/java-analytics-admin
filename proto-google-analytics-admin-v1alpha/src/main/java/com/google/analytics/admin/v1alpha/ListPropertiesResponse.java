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
 * Response message for ListProperties RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ListPropertiesResponse}
 */
public final class ListPropertiesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ListPropertiesResponse)
    ListPropertiesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListPropertiesResponse.newBuilder() to construct.
  private ListPropertiesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListPropertiesResponse() {
    properties_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListPropertiesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListPropertiesResponse(
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
                properties_ =
                    new java.util.ArrayList<com.google.analytics.admin.v1alpha.Property>();
                mutable_bitField0_ |= 0x00000001;
              }
              properties_.add(
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.Property.parser(), extensionRegistry));
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
        properties_ = java.util.Collections.unmodifiableList(properties_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListPropertiesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListPropertiesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ListPropertiesResponse.class,
            com.google.analytics.admin.v1alpha.ListPropertiesResponse.Builder.class);
  }

  public static final int PROPERTIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.admin.v1alpha.Property> properties_;
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.Property> getPropertiesList() {
    return properties_;
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.PropertyOrBuilder>
      getPropertiesOrBuilderList() {
    return properties_;
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
   */
  @java.lang.Override
  public int getPropertiesCount() {
    return properties_.size();
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.Property getProperties(int index) {
    return properties_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Results that matched the filter criteria and were accessible to the caller.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.PropertyOrBuilder getPropertiesOrBuilder(int index) {
    return properties_.get(index);
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
    for (int i = 0; i < properties_.size(); i++) {
      output.writeMessage(1, properties_.get(i));
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
    for (int i = 0; i < properties_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, properties_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ListPropertiesResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ListPropertiesResponse other =
        (com.google.analytics.admin.v1alpha.ListPropertiesResponse) obj;

    if (!getPropertiesList().equals(other.getPropertiesList())) return false;
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
    if (getPropertiesCount() > 0) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getPropertiesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse parseFrom(
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
      com.google.analytics.admin.v1alpha.ListPropertiesResponse prototype) {
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
   * Response message for ListProperties RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ListPropertiesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ListPropertiesResponse)
      com.google.analytics.admin.v1alpha.ListPropertiesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListPropertiesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListPropertiesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ListPropertiesResponse.class,
              com.google.analytics.admin.v1alpha.ListPropertiesResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.ListPropertiesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPropertiesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (propertiesBuilder_ == null) {
        properties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        propertiesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListPropertiesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListPropertiesResponse getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ListPropertiesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListPropertiesResponse build() {
      com.google.analytics.admin.v1alpha.ListPropertiesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListPropertiesResponse buildPartial() {
      com.google.analytics.admin.v1alpha.ListPropertiesResponse result =
          new com.google.analytics.admin.v1alpha.ListPropertiesResponse(this);
      int from_bitField0_ = bitField0_;
      if (propertiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          properties_ = java.util.Collections.unmodifiableList(properties_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.properties_ = properties_;
      } else {
        result.properties_ = propertiesBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.ListPropertiesResponse) {
        return mergeFrom((com.google.analytics.admin.v1alpha.ListPropertiesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.ListPropertiesResponse other) {
      if (other == com.google.analytics.admin.v1alpha.ListPropertiesResponse.getDefaultInstance())
        return this;
      if (propertiesBuilder_ == null) {
        if (!other.properties_.isEmpty()) {
          if (properties_.isEmpty()) {
            properties_ = other.properties_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePropertiesIsMutable();
            properties_.addAll(other.properties_);
          }
          onChanged();
        }
      } else {
        if (!other.properties_.isEmpty()) {
          if (propertiesBuilder_.isEmpty()) {
            propertiesBuilder_.dispose();
            propertiesBuilder_ = null;
            properties_ = other.properties_;
            bitField0_ = (bitField0_ & ~0x00000001);
            propertiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPropertiesFieldBuilder()
                    : null;
          } else {
            propertiesBuilder_.addAllMessages(other.properties_);
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
      com.google.analytics.admin.v1alpha.ListPropertiesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.ListPropertiesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.analytics.admin.v1alpha.Property> properties_ =
        java.util.Collections.emptyList();

    private void ensurePropertiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        properties_ =
            new java.util.ArrayList<com.google.analytics.admin.v1alpha.Property>(properties_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.Property,
            com.google.analytics.admin.v1alpha.Property.Builder,
            com.google.analytics.admin.v1alpha.PropertyOrBuilder>
        propertiesBuilder_;

    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.Property> getPropertiesList() {
      if (propertiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(properties_);
      } else {
        return propertiesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public int getPropertiesCount() {
      if (propertiesBuilder_ == null) {
        return properties_.size();
      } else {
        return propertiesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.Property getProperties(int index) {
      if (propertiesBuilder_ == null) {
        return properties_.get(index);
      } else {
        return propertiesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public Builder setProperties(int index, com.google.analytics.admin.v1alpha.Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.set(index, value);
        onChanged();
      } else {
        propertiesBuilder_.setMessage(index, value);
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
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public Builder setProperties(
        int index, com.google.analytics.admin.v1alpha.Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.set(index, builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.setMessage(index, builderForValue.build());
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
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public Builder addProperties(com.google.analytics.admin.v1alpha.Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.add(value);
        onChanged();
      } else {
        propertiesBuilder_.addMessage(value);
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
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public Builder addProperties(int index, com.google.analytics.admin.v1alpha.Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.add(index, value);
        onChanged();
      } else {
        propertiesBuilder_.addMessage(index, value);
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
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public Builder addProperties(
        com.google.analytics.admin.v1alpha.Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.add(builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.addMessage(builderForValue.build());
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
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public Builder addProperties(
        int index, com.google.analytics.admin.v1alpha.Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.add(index, builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.addMessage(index, builderForValue.build());
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
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public Builder addAllProperties(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.Property> values) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, properties_);
        onChanged();
      } else {
        propertiesBuilder_.addAllMessages(values);
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
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public Builder clearProperties() {
      if (propertiesBuilder_ == null) {
        properties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        propertiesBuilder_.clear();
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
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public Builder removeProperties(int index) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.remove(index);
        onChanged();
      } else {
        propertiesBuilder_.remove(index);
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
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.Property.Builder getPropertiesBuilder(int index) {
      return getPropertiesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.PropertyOrBuilder getPropertiesOrBuilder(int index) {
      if (propertiesBuilder_ == null) {
        return properties_.get(index);
      } else {
        return propertiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.PropertyOrBuilder>
        getPropertiesOrBuilderList() {
      if (propertiesBuilder_ != null) {
        return propertiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(properties_);
      }
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.Property.Builder addPropertiesBuilder() {
      return getPropertiesFieldBuilder()
          .addBuilder(com.google.analytics.admin.v1alpha.Property.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.Property.Builder addPropertiesBuilder(int index) {
      return getPropertiesFieldBuilder()
          .addBuilder(index, com.google.analytics.admin.v1alpha.Property.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Results that matched the filter criteria and were accessible to the caller.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Property properties = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.Property.Builder>
        getPropertiesBuilderList() {
      return getPropertiesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.Property,
            com.google.analytics.admin.v1alpha.Property.Builder,
            com.google.analytics.admin.v1alpha.PropertyOrBuilder>
        getPropertiesFieldBuilder() {
      if (propertiesBuilder_ == null) {
        propertiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.Property,
                com.google.analytics.admin.v1alpha.Property.Builder,
                com.google.analytics.admin.v1alpha.PropertyOrBuilder>(
                properties_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        properties_ = null;
      }
      return propertiesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ListPropertiesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ListPropertiesResponse)
  private static final com.google.analytics.admin.v1alpha.ListPropertiesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ListPropertiesResponse();
  }

  public static com.google.analytics.admin.v1alpha.ListPropertiesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPropertiesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListPropertiesResponse>() {
        @java.lang.Override
        public ListPropertiesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListPropertiesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListPropertiesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPropertiesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ListPropertiesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
