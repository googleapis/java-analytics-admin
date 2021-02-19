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
 * Request message for UpdateUserLink RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.UpdateUserLinkRequest}
 */
public final class UpdateUserLinkRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.UpdateUserLinkRequest)
    UpdateUserLinkRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateUserLinkRequest.newBuilder() to construct.
  private UpdateUserLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateUserLinkRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateUserLinkRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateUserLinkRequest(
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
              com.google.analytics.admin.v1alpha.UserLink.Builder subBuilder = null;
              if (userLink_ != null) {
                subBuilder = userLink_.toBuilder();
              }
              userLink_ =
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.UserLink.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(userLink_);
                userLink_ = subBuilder.buildPartial();
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
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_UpdateUserLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_UpdateUserLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.UpdateUserLinkRequest.class,
            com.google.analytics.admin.v1alpha.UpdateUserLinkRequest.Builder.class);
  }

  public static final int USER_LINK_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1alpha.UserLink userLink_;
  /**
   *
   *
   * <pre>
   * Required. The user link to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userLink field is set.
   */
  @java.lang.Override
  public boolean hasUserLink() {
    return userLink_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The user link to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userLink.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.UserLink getUserLink() {
    return userLink_ == null
        ? com.google.analytics.admin.v1alpha.UserLink.getDefaultInstance()
        : userLink_;
  }
  /**
   *
   *
   * <pre>
   * Required. The user link to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.UserLinkOrBuilder getUserLinkOrBuilder() {
    return getUserLink();
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
    if (userLink_ != null) {
      output.writeMessage(1, getUserLink());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userLink_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUserLink());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.UpdateUserLinkRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.UpdateUserLinkRequest other =
        (com.google.analytics.admin.v1alpha.UpdateUserLinkRequest) obj;

    if (hasUserLink() != other.hasUserLink()) return false;
    if (hasUserLink()) {
      if (!getUserLink().equals(other.getUserLink())) return false;
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
    if (hasUserLink()) {
      hash = (37 * hash) + USER_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getUserLink().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.UpdateUserLinkRequest prototype) {
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
   * Request message for UpdateUserLink RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.UpdateUserLinkRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.UpdateUserLinkRequest)
      com.google.analytics.admin.v1alpha.UpdateUserLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateUserLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateUserLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.UpdateUserLinkRequest.class,
              com.google.analytics.admin.v1alpha.UpdateUserLinkRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.UpdateUserLinkRequest.newBuilder()
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
      if (userLinkBuilder_ == null) {
        userLink_ = null;
      } else {
        userLink_ = null;
        userLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateUserLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateUserLinkRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.UpdateUserLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateUserLinkRequest build() {
      com.google.analytics.admin.v1alpha.UpdateUserLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateUserLinkRequest buildPartial() {
      com.google.analytics.admin.v1alpha.UpdateUserLinkRequest result =
          new com.google.analytics.admin.v1alpha.UpdateUserLinkRequest(this);
      if (userLinkBuilder_ == null) {
        result.userLink_ = userLink_;
      } else {
        result.userLink_ = userLinkBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.UpdateUserLinkRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.UpdateUserLinkRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.UpdateUserLinkRequest other) {
      if (other == com.google.analytics.admin.v1alpha.UpdateUserLinkRequest.getDefaultInstance())
        return this;
      if (other.hasUserLink()) {
        mergeUserLink(other.getUserLink());
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
      com.google.analytics.admin.v1alpha.UpdateUserLinkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.UpdateUserLinkRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.analytics.admin.v1alpha.UserLink userLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.UserLink,
            com.google.analytics.admin.v1alpha.UserLink.Builder,
            com.google.analytics.admin.v1alpha.UserLinkOrBuilder>
        userLinkBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The user link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the userLink field is set.
     */
    public boolean hasUserLink() {
      return userLinkBuilder_ != null || userLink_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The user link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The userLink.
     */
    public com.google.analytics.admin.v1alpha.UserLink getUserLink() {
      if (userLinkBuilder_ == null) {
        return userLink_ == null
            ? com.google.analytics.admin.v1alpha.UserLink.getDefaultInstance()
            : userLink_;
      } else {
        return userLinkBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The user link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUserLink(com.google.analytics.admin.v1alpha.UserLink value) {
      if (userLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userLink_ = value;
        onChanged();
      } else {
        userLinkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The user link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUserLink(
        com.google.analytics.admin.v1alpha.UserLink.Builder builderForValue) {
      if (userLinkBuilder_ == null) {
        userLink_ = builderForValue.build();
        onChanged();
      } else {
        userLinkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The user link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUserLink(com.google.analytics.admin.v1alpha.UserLink value) {
      if (userLinkBuilder_ == null) {
        if (userLink_ != null) {
          userLink_ =
              com.google.analytics.admin.v1alpha.UserLink.newBuilder(userLink_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          userLink_ = value;
        }
        onChanged();
      } else {
        userLinkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The user link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUserLink() {
      if (userLinkBuilder_ == null) {
        userLink_ = null;
        onChanged();
      } else {
        userLink_ = null;
        userLinkBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The user link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.UserLink.Builder getUserLinkBuilder() {

      onChanged();
      return getUserLinkFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The user link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.UserLinkOrBuilder getUserLinkOrBuilder() {
      if (userLinkBuilder_ != null) {
        return userLinkBuilder_.getMessageOrBuilder();
      } else {
        return userLink_ == null
            ? com.google.analytics.admin.v1alpha.UserLink.getDefaultInstance()
            : userLink_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The user link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.UserLink user_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.UserLink,
            com.google.analytics.admin.v1alpha.UserLink.Builder,
            com.google.analytics.admin.v1alpha.UserLinkOrBuilder>
        getUserLinkFieldBuilder() {
      if (userLinkBuilder_ == null) {
        userLinkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.UserLink,
                com.google.analytics.admin.v1alpha.UserLink.Builder,
                com.google.analytics.admin.v1alpha.UserLinkOrBuilder>(
                getUserLink(), getParentForChildren(), isClean());
        userLink_ = null;
      }
      return userLinkBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.UpdateUserLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.UpdateUserLinkRequest)
  private static final com.google.analytics.admin.v1alpha.UpdateUserLinkRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.UpdateUserLinkRequest();
  }

  public static com.google.analytics.admin.v1alpha.UpdateUserLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateUserLinkRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateUserLinkRequest>() {
        @java.lang.Override
        public UpdateUserLinkRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateUserLinkRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateUserLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateUserLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.UpdateUserLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
