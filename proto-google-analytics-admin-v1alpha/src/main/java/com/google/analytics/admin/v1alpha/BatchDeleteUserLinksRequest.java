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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for BatchDeleteUserLinks RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest}
 */
public final class BatchDeleteUserLinksRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest)
    BatchDeleteUserLinksRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchDeleteUserLinksRequest.newBuilder() to construct.
  private BatchDeleteUserLinksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchDeleteUserLinksRequest() {
    parent_ = "";
    requests_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchDeleteUserLinksRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchDeleteUserLinksRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                requests_ =
                    new java.util.ArrayList<
                        com.google.analytics.admin.v1alpha.DeleteUserLinkRequest>();
                mutable_bitField0_ |= 0x00000001;
              }
              requests_.add(
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.parser(),
                      extensionRegistry));
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
        requests_ = java.util.Collections.unmodifiableList(requests_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_BatchDeleteUserLinksRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_BatchDeleteUserLinksRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest.class,
            com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The account or property that all user links in the request are
   * for. The parent of all values for user link names to delete must match this
   * field.
   * Example format: accounts/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
   * Required. The account or property that all user links in the request are
   * for. The parent of all values for user link names to delete must match this
   * field.
   * Example format: accounts/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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

  public static final int REQUESTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.analytics.admin.v1alpha.DeleteUserLinkRequest> requests_;
  /**
   *
   *
   * <pre>
   * Required. The requests specifying the user links to update.
   * A maximum of 1000 user links can be updated in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.DeleteUserLinkRequest>
      getRequestsList() {
    return requests_;
  }
  /**
   *
   *
   * <pre>
   * Required. The requests specifying the user links to update.
   * A maximum of 1000 user links can be updated in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.DeleteUserLinkRequestOrBuilder>
      getRequestsOrBuilderList() {
    return requests_;
  }
  /**
   *
   *
   * <pre>
   * Required. The requests specifying the user links to update.
   * A maximum of 1000 user links can be updated in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getRequestsCount() {
    return requests_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The requests specifying the user links to update.
   * A maximum of 1000 user links can be updated in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.DeleteUserLinkRequest getRequests(int index) {
    return requests_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The requests specifying the user links to update.
   * A maximum of 1000 user links can be updated in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.DeleteUserLinkRequestOrBuilder getRequestsOrBuilder(
      int index) {
    return requests_.get(index);
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < requests_.size(); i++) {
      output.writeMessage(2, requests_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    for (int i = 0; i < requests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, requests_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest other =
        (com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getRequestsList().equals(other.getRequestsList())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (getRequestsCount() > 0) {
      hash = (37 * hash) + REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest prototype) {
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
   * Request message for BatchDeleteUserLinks RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest)
      com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_BatchDeleteUserLinksRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_BatchDeleteUserLinksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest.class,
              com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRequestsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_BatchDeleteUserLinksRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest build() {
      com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest buildPartial() {
      com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest result =
          new com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest(this);
      int from_bitField0_ = bitField0_;
      result.parent_ = parent_;
      if (requestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          requests_ = java.util.Collections.unmodifiableList(requests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.requests_ = requests_;
      } else {
        result.requests_ = requestsBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (requestsBuilder_ == null) {
        if (!other.requests_.isEmpty()) {
          if (requests_.isEmpty()) {
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRequestsIsMutable();
            requests_.addAll(other.requests_);
          }
          onChanged();
        }
      } else {
        if (!other.requests_.isEmpty()) {
          if (requestsBuilder_.isEmpty()) {
            requestsBuilder_.dispose();
            requestsBuilder_ = null;
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            requestsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRequestsFieldBuilder()
                    : null;
          } else {
            requestsBuilder_.addAllMessages(other.requests_);
          }
        }
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
      com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest)
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The account or property that all user links in the request are
     * for. The parent of all values for user link names to delete must match this
     * field.
     * Example format: accounts/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
     * Required. The account or property that all user links in the request are
     * for. The parent of all values for user link names to delete must match this
     * field.
     * Example format: accounts/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
     * Required. The account or property that all user links in the request are
     * for. The parent of all values for user link names to delete must match this
     * field.
     * Example format: accounts/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
     * Required. The account or property that all user links in the request are
     * for. The parent of all values for user link names to delete must match this
     * field.
     * Example format: accounts/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
     * Required. The account or property that all user links in the request are
     * for. The parent of all values for user link names to delete must match this
     * field.
     * Example format: accounts/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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

    private java.util.List<com.google.analytics.admin.v1alpha.DeleteUserLinkRequest> requests_ =
        java.util.Collections.emptyList();

    private void ensureRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        requests_ =
            new java.util.ArrayList<com.google.analytics.admin.v1alpha.DeleteUserLinkRequest>(
                requests_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.DeleteUserLinkRequest,
            com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.Builder,
            com.google.analytics.admin.v1alpha.DeleteUserLinkRequestOrBuilder>
        requestsBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.DeleteUserLinkRequest>
        getRequestsList() {
      if (requestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requests_);
      } else {
        return requestsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getRequestsCount() {
      if (requestsBuilder_ == null) {
        return requests_.size();
      } else {
        return requestsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DeleteUserLinkRequest getRequests(int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRequests(
        int index, com.google.analytics.admin.v1alpha.DeleteUserLinkRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.set(index, value);
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRequests(
        int index,
        com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(com.google.analytics.admin.v1alpha.DeleteUserLinkRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(
        int index, com.google.analytics.admin.v1alpha.DeleteUserLinkRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(index, value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(
        com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(
        int index,
        com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllRequests(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.DeleteUserLinkRequest>
            values) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, requests_);
        onChanged();
      } else {
        requestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRequests() {
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeRequests(int index) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.remove(index);
        onChanged();
      } else {
        requestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.Builder getRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DeleteUserLinkRequestOrBuilder getRequestsOrBuilder(
        int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<
            ? extends com.google.analytics.admin.v1alpha.DeleteUserLinkRequestOrBuilder>
        getRequestsOrBuilderList() {
      if (requestsBuilder_ != null) {
        return requestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requests_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.Builder addRequestsBuilder() {
      return getRequestsFieldBuilder()
          .addBuilder(
              com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.Builder addRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder()
          .addBuilder(
              index, com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. The requests specifying the user links to update.
     * A maximum of 1000 user links can be updated in a batch.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.DeleteUserLinkRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.Builder>
        getRequestsBuilderList() {
      return getRequestsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.DeleteUserLinkRequest,
            com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.Builder,
            com.google.analytics.admin.v1alpha.DeleteUserLinkRequestOrBuilder>
        getRequestsFieldBuilder() {
      if (requestsBuilder_ == null) {
        requestsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.DeleteUserLinkRequest,
                com.google.analytics.admin.v1alpha.DeleteUserLinkRequest.Builder,
                com.google.analytics.admin.v1alpha.DeleteUserLinkRequestOrBuilder>(
                requests_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        requests_ = null;
      }
      return requestsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest)
  private static final com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest();
  }

  public static com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchDeleteUserLinksRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchDeleteUserLinksRequest>() {
        @java.lang.Override
        public BatchDeleteUserLinksRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchDeleteUserLinksRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchDeleteUserLinksRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchDeleteUserLinksRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
