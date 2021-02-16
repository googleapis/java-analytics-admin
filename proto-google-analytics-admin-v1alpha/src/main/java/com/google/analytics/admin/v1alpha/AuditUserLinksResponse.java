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
 * Response message for AuditUserLinks RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.AuditUserLinksResponse}
 */
public final class AuditUserLinksResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.AuditUserLinksResponse)
    AuditUserLinksResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AuditUserLinksResponse.newBuilder() to construct.
  private AuditUserLinksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AuditUserLinksResponse() {
    userLinks_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AuditUserLinksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AuditUserLinksResponse(
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
                userLinks_ =
                    new java.util.ArrayList<com.google.analytics.admin.v1alpha.AuditUserLink>();
                mutable_bitField0_ |= 0x00000001;
              }
              userLinks_.add(
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.AuditUserLink.parser(),
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
        userLinks_ = java.util.Collections.unmodifiableList(userLinks_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_AuditUserLinksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_AuditUserLinksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.AuditUserLinksResponse.class,
            com.google.analytics.admin.v1alpha.AuditUserLinksResponse.Builder.class);
  }

  public static final int USER_LINKS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.admin.v1alpha.AuditUserLink> userLinks_;
  /**
   *
   *
   * <pre>
   * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.AuditUserLink> getUserLinksList() {
    return userLinks_;
  }
  /**
   *
   *
   * <pre>
   * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.AuditUserLinkOrBuilder>
      getUserLinksOrBuilderList() {
    return userLinks_;
  }
  /**
   *
   *
   * <pre>
   * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
   */
  @java.lang.Override
  public int getUserLinksCount() {
    return userLinks_.size();
  }
  /**
   *
   *
   * <pre>
   * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AuditUserLink getUserLinks(int index) {
    return userLinks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AuditUserLinkOrBuilder getUserLinksOrBuilder(
      int index) {
    return userLinks_.get(index);
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
    for (int i = 0; i < userLinks_.size(); i++) {
      output.writeMessage(1, userLinks_.get(i));
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
    for (int i = 0; i < userLinks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, userLinks_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.AuditUserLinksResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.AuditUserLinksResponse other =
        (com.google.analytics.admin.v1alpha.AuditUserLinksResponse) obj;

    if (!getUserLinksList().equals(other.getUserLinksList())) return false;
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
    if (getUserLinksCount() > 0) {
      hash = (37 * hash) + USER_LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getUserLinksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse parseFrom(
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
      com.google.analytics.admin.v1alpha.AuditUserLinksResponse prototype) {
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
   * Response message for AuditUserLinks RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.AuditUserLinksResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.AuditUserLinksResponse)
      com.google.analytics.admin.v1alpha.AuditUserLinksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_AuditUserLinksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_AuditUserLinksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.AuditUserLinksResponse.class,
              com.google.analytics.admin.v1alpha.AuditUserLinksResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.AuditUserLinksResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUserLinksFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userLinksBuilder_ == null) {
        userLinks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userLinksBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_AuditUserLinksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AuditUserLinksResponse getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.AuditUserLinksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AuditUserLinksResponse build() {
      com.google.analytics.admin.v1alpha.AuditUserLinksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AuditUserLinksResponse buildPartial() {
      com.google.analytics.admin.v1alpha.AuditUserLinksResponse result =
          new com.google.analytics.admin.v1alpha.AuditUserLinksResponse(this);
      int from_bitField0_ = bitField0_;
      if (userLinksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userLinks_ = java.util.Collections.unmodifiableList(userLinks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userLinks_ = userLinks_;
      } else {
        result.userLinks_ = userLinksBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.AuditUserLinksResponse) {
        return mergeFrom((com.google.analytics.admin.v1alpha.AuditUserLinksResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.AuditUserLinksResponse other) {
      if (other == com.google.analytics.admin.v1alpha.AuditUserLinksResponse.getDefaultInstance())
        return this;
      if (userLinksBuilder_ == null) {
        if (!other.userLinks_.isEmpty()) {
          if (userLinks_.isEmpty()) {
            userLinks_ = other.userLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserLinksIsMutable();
            userLinks_.addAll(other.userLinks_);
          }
          onChanged();
        }
      } else {
        if (!other.userLinks_.isEmpty()) {
          if (userLinksBuilder_.isEmpty()) {
            userLinksBuilder_.dispose();
            userLinksBuilder_ = null;
            userLinks_ = other.userLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userLinksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getUserLinksFieldBuilder()
                    : null;
          } else {
            userLinksBuilder_.addAllMessages(other.userLinks_);
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
      com.google.analytics.admin.v1alpha.AuditUserLinksResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.AuditUserLinksResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.analytics.admin.v1alpha.AuditUserLink> userLinks_ =
        java.util.Collections.emptyList();

    private void ensureUserLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userLinks_ =
            new java.util.ArrayList<com.google.analytics.admin.v1alpha.AuditUserLink>(userLinks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AuditUserLink,
            com.google.analytics.admin.v1alpha.AuditUserLink.Builder,
            com.google.analytics.admin.v1alpha.AuditUserLinkOrBuilder>
        userLinksBuilder_;

    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.AuditUserLink> getUserLinksList() {
      if (userLinksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userLinks_);
      } else {
        return userLinksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public int getUserLinksCount() {
      if (userLinksBuilder_ == null) {
        return userLinks_.size();
      } else {
        return userLinksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AuditUserLink getUserLinks(int index) {
      if (userLinksBuilder_ == null) {
        return userLinks_.get(index);
      } else {
        return userLinksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public Builder setUserLinks(int index, com.google.analytics.admin.v1alpha.AuditUserLink value) {
      if (userLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserLinksIsMutable();
        userLinks_.set(index, value);
        onChanged();
      } else {
        userLinksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public Builder setUserLinks(
        int index, com.google.analytics.admin.v1alpha.AuditUserLink.Builder builderForValue) {
      if (userLinksBuilder_ == null) {
        ensureUserLinksIsMutable();
        userLinks_.set(index, builderForValue.build());
        onChanged();
      } else {
        userLinksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public Builder addUserLinks(com.google.analytics.admin.v1alpha.AuditUserLink value) {
      if (userLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserLinksIsMutable();
        userLinks_.add(value);
        onChanged();
      } else {
        userLinksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public Builder addUserLinks(int index, com.google.analytics.admin.v1alpha.AuditUserLink value) {
      if (userLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserLinksIsMutable();
        userLinks_.add(index, value);
        onChanged();
      } else {
        userLinksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public Builder addUserLinks(
        com.google.analytics.admin.v1alpha.AuditUserLink.Builder builderForValue) {
      if (userLinksBuilder_ == null) {
        ensureUserLinksIsMutable();
        userLinks_.add(builderForValue.build());
        onChanged();
      } else {
        userLinksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public Builder addUserLinks(
        int index, com.google.analytics.admin.v1alpha.AuditUserLink.Builder builderForValue) {
      if (userLinksBuilder_ == null) {
        ensureUserLinksIsMutable();
        userLinks_.add(index, builderForValue.build());
        onChanged();
      } else {
        userLinksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public Builder addAllUserLinks(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.AuditUserLink> values) {
      if (userLinksBuilder_ == null) {
        ensureUserLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, userLinks_);
        onChanged();
      } else {
        userLinksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public Builder clearUserLinks() {
      if (userLinksBuilder_ == null) {
        userLinks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userLinksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public Builder removeUserLinks(int index) {
      if (userLinksBuilder_ == null) {
        ensureUserLinksIsMutable();
        userLinks_.remove(index);
        onChanged();
      } else {
        userLinksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AuditUserLink.Builder getUserLinksBuilder(int index) {
      return getUserLinksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AuditUserLinkOrBuilder getUserLinksOrBuilder(
        int index) {
      if (userLinksBuilder_ == null) {
        return userLinks_.get(index);
      } else {
        return userLinksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.AuditUserLinkOrBuilder>
        getUserLinksOrBuilderList() {
      if (userLinksBuilder_ != null) {
        return userLinksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userLinks_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AuditUserLink.Builder addUserLinksBuilder() {
      return getUserLinksFieldBuilder()
          .addBuilder(com.google.analytics.admin.v1alpha.AuditUserLink.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AuditUserLink.Builder addUserLinksBuilder(int index) {
      return getUserLinksFieldBuilder()
          .addBuilder(index, com.google.analytics.admin.v1alpha.AuditUserLink.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of AuditUserLinks. These will be ordered stably, but in an arbitrary
     * order.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.AuditUserLink user_links = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.AuditUserLink.Builder>
        getUserLinksBuilderList() {
      return getUserLinksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AuditUserLink,
            com.google.analytics.admin.v1alpha.AuditUserLink.Builder,
            com.google.analytics.admin.v1alpha.AuditUserLinkOrBuilder>
        getUserLinksFieldBuilder() {
      if (userLinksBuilder_ == null) {
        userLinksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.AuditUserLink,
                com.google.analytics.admin.v1alpha.AuditUserLink.Builder,
                com.google.analytics.admin.v1alpha.AuditUserLinkOrBuilder>(
                userLinks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        userLinks_ = null;
      }
      return userLinksBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.AuditUserLinksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.AuditUserLinksResponse)
  private static final com.google.analytics.admin.v1alpha.AuditUserLinksResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.AuditUserLinksResponse();
  }

  public static com.google.analytics.admin.v1alpha.AuditUserLinksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuditUserLinksResponse> PARSER =
      new com.google.protobuf.AbstractParser<AuditUserLinksResponse>() {
        @java.lang.Override
        public AuditUserLinksResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AuditUserLinksResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AuditUserLinksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuditUserLinksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AuditUserLinksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
