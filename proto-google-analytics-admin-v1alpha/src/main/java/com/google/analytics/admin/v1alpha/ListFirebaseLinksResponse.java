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
 * Response message for ListFirebaseLinks RPC
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ListFirebaseLinksResponse}
 */
public final class ListFirebaseLinksResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ListFirebaseLinksResponse)
    ListFirebaseLinksResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListFirebaseLinksResponse.newBuilder() to construct.
  private ListFirebaseLinksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListFirebaseLinksResponse() {
    firebaseLinks_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListFirebaseLinksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListFirebaseLinksResponse(
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
                firebaseLinks_ =
                    new java.util.ArrayList<com.google.analytics.admin.v1alpha.FirebaseLink>();
                mutable_bitField0_ |= 0x00000001;
              }
              firebaseLinks_.add(
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.FirebaseLink.parser(), extensionRegistry));
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
        firebaseLinks_ = java.util.Collections.unmodifiableList(firebaseLinks_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListFirebaseLinksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListFirebaseLinksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse.class,
            com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse.Builder.class);
  }

  public static final int FIREBASE_LINKS_FIELD_NUMBER = 1;
  private java.util.List<com.google.analytics.admin.v1alpha.FirebaseLink> firebaseLinks_;
  /**
   *
   *
   * <pre>
   * List of FirebaseLinks. This will have at most one value.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.FirebaseLink> getFirebaseLinksList() {
    return firebaseLinks_;
  }
  /**
   *
   *
   * <pre>
   * List of FirebaseLinks. This will have at most one value.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder>
      getFirebaseLinksOrBuilderList() {
    return firebaseLinks_;
  }
  /**
   *
   *
   * <pre>
   * List of FirebaseLinks. This will have at most one value.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
   */
  @java.lang.Override
  public int getFirebaseLinksCount() {
    return firebaseLinks_.size();
  }
  /**
   *
   *
   * <pre>
   * List of FirebaseLinks. This will have at most one value.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.FirebaseLink getFirebaseLinks(int index) {
    return firebaseLinks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of FirebaseLinks. This will have at most one value.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder getFirebaseLinksOrBuilder(
      int index) {
    return firebaseLinks_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * Currently, Google Analytics supports only one FirebaseLink per property,
   * so this will never be populated.
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
   * Currently, Google Analytics supports only one FirebaseLink per property,
   * so this will never be populated.
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
    for (int i = 0; i < firebaseLinks_.size(); i++) {
      output.writeMessage(1, firebaseLinks_.get(i));
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
    for (int i = 0; i < firebaseLinks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, firebaseLinks_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse other =
        (com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse) obj;

    if (!getFirebaseLinksList().equals(other.getFirebaseLinksList())) return false;
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
    if (getFirebaseLinksCount() > 0) {
      hash = (37 * hash) + FIREBASE_LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getFirebaseLinksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parseFrom(
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
      com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse prototype) {
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
   * Response message for ListFirebaseLinks RPC
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ListFirebaseLinksResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ListFirebaseLinksResponse)
      com.google.analytics.admin.v1alpha.ListFirebaseLinksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListFirebaseLinksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListFirebaseLinksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse.class,
              com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFirebaseLinksFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (firebaseLinksBuilder_ == null) {
        firebaseLinks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        firebaseLinksBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListFirebaseLinksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse build() {
      com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse buildPartial() {
      com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse result =
          new com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse(this);
      int from_bitField0_ = bitField0_;
      if (firebaseLinksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          firebaseLinks_ = java.util.Collections.unmodifiableList(firebaseLinks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.firebaseLinks_ = firebaseLinks_;
      } else {
        result.firebaseLinks_ = firebaseLinksBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse) {
        return mergeFrom((com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse other) {
      if (other
          == com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse.getDefaultInstance())
        return this;
      if (firebaseLinksBuilder_ == null) {
        if (!other.firebaseLinks_.isEmpty()) {
          if (firebaseLinks_.isEmpty()) {
            firebaseLinks_ = other.firebaseLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFirebaseLinksIsMutable();
            firebaseLinks_.addAll(other.firebaseLinks_);
          }
          onChanged();
        }
      } else {
        if (!other.firebaseLinks_.isEmpty()) {
          if (firebaseLinksBuilder_.isEmpty()) {
            firebaseLinksBuilder_.dispose();
            firebaseLinksBuilder_ = null;
            firebaseLinks_ = other.firebaseLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            firebaseLinksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFirebaseLinksFieldBuilder()
                    : null;
          } else {
            firebaseLinksBuilder_.addAllMessages(other.firebaseLinks_);
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
      com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.analytics.admin.v1alpha.FirebaseLink> firebaseLinks_ =
        java.util.Collections.emptyList();

    private void ensureFirebaseLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        firebaseLinks_ =
            new java.util.ArrayList<com.google.analytics.admin.v1alpha.FirebaseLink>(
                firebaseLinks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.FirebaseLink,
            com.google.analytics.admin.v1alpha.FirebaseLink.Builder,
            com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder>
        firebaseLinksBuilder_;

    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.FirebaseLink> getFirebaseLinksList() {
      if (firebaseLinksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(firebaseLinks_);
      } else {
        return firebaseLinksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public int getFirebaseLinksCount() {
      if (firebaseLinksBuilder_ == null) {
        return firebaseLinks_.size();
      } else {
        return firebaseLinksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.FirebaseLink getFirebaseLinks(int index) {
      if (firebaseLinksBuilder_ == null) {
        return firebaseLinks_.get(index);
      } else {
        return firebaseLinksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public Builder setFirebaseLinks(
        int index, com.google.analytics.admin.v1alpha.FirebaseLink value) {
      if (firebaseLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFirebaseLinksIsMutable();
        firebaseLinks_.set(index, value);
        onChanged();
      } else {
        firebaseLinksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public Builder setFirebaseLinks(
        int index, com.google.analytics.admin.v1alpha.FirebaseLink.Builder builderForValue) {
      if (firebaseLinksBuilder_ == null) {
        ensureFirebaseLinksIsMutable();
        firebaseLinks_.set(index, builderForValue.build());
        onChanged();
      } else {
        firebaseLinksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public Builder addFirebaseLinks(com.google.analytics.admin.v1alpha.FirebaseLink value) {
      if (firebaseLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFirebaseLinksIsMutable();
        firebaseLinks_.add(value);
        onChanged();
      } else {
        firebaseLinksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public Builder addFirebaseLinks(
        int index, com.google.analytics.admin.v1alpha.FirebaseLink value) {
      if (firebaseLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFirebaseLinksIsMutable();
        firebaseLinks_.add(index, value);
        onChanged();
      } else {
        firebaseLinksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public Builder addFirebaseLinks(
        com.google.analytics.admin.v1alpha.FirebaseLink.Builder builderForValue) {
      if (firebaseLinksBuilder_ == null) {
        ensureFirebaseLinksIsMutable();
        firebaseLinks_.add(builderForValue.build());
        onChanged();
      } else {
        firebaseLinksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public Builder addFirebaseLinks(
        int index, com.google.analytics.admin.v1alpha.FirebaseLink.Builder builderForValue) {
      if (firebaseLinksBuilder_ == null) {
        ensureFirebaseLinksIsMutable();
        firebaseLinks_.add(index, builderForValue.build());
        onChanged();
      } else {
        firebaseLinksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public Builder addAllFirebaseLinks(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.FirebaseLink> values) {
      if (firebaseLinksBuilder_ == null) {
        ensureFirebaseLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, firebaseLinks_);
        onChanged();
      } else {
        firebaseLinksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public Builder clearFirebaseLinks() {
      if (firebaseLinksBuilder_ == null) {
        firebaseLinks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        firebaseLinksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public Builder removeFirebaseLinks(int index) {
      if (firebaseLinksBuilder_ == null) {
        ensureFirebaseLinksIsMutable();
        firebaseLinks_.remove(index);
        onChanged();
      } else {
        firebaseLinksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.FirebaseLink.Builder getFirebaseLinksBuilder(
        int index) {
      return getFirebaseLinksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder getFirebaseLinksOrBuilder(
        int index) {
      if (firebaseLinksBuilder_ == null) {
        return firebaseLinks_.get(index);
      } else {
        return firebaseLinksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder>
        getFirebaseLinksOrBuilderList() {
      if (firebaseLinksBuilder_ != null) {
        return firebaseLinksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(firebaseLinks_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.FirebaseLink.Builder addFirebaseLinksBuilder() {
      return getFirebaseLinksFieldBuilder()
          .addBuilder(com.google.analytics.admin.v1alpha.FirebaseLink.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.FirebaseLink.Builder addFirebaseLinksBuilder(
        int index) {
      return getFirebaseLinksFieldBuilder()
          .addBuilder(index, com.google.analytics.admin.v1alpha.FirebaseLink.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of FirebaseLinks. This will have at most one value.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.FirebaseLink firebase_links = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.FirebaseLink.Builder>
        getFirebaseLinksBuilderList() {
      return getFirebaseLinksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.FirebaseLink,
            com.google.analytics.admin.v1alpha.FirebaseLink.Builder,
            com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder>
        getFirebaseLinksFieldBuilder() {
      if (firebaseLinksBuilder_ == null) {
        firebaseLinksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.FirebaseLink,
                com.google.analytics.admin.v1alpha.FirebaseLink.Builder,
                com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder>(
                firebaseLinks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        firebaseLinks_ = null;
      }
      return firebaseLinksBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * Currently, Google Analytics supports only one FirebaseLink per property,
     * so this will never be populated.
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
     * Currently, Google Analytics supports only one FirebaseLink per property,
     * so this will never be populated.
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
     * Currently, Google Analytics supports only one FirebaseLink per property,
     * so this will never be populated.
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
     * Currently, Google Analytics supports only one FirebaseLink per property,
     * so this will never be populated.
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
     * Currently, Google Analytics supports only one FirebaseLink per property,
     * so this will never be populated.
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ListFirebaseLinksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ListFirebaseLinksResponse)
  private static final com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse();
  }

  public static com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFirebaseLinksResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListFirebaseLinksResponse>() {
        @java.lang.Override
        public ListFirebaseLinksResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListFirebaseLinksResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListFirebaseLinksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFirebaseLinksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
