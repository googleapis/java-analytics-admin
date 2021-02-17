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
 * Request message for CreateGoogleAdsLink RPC
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest}
 */
public final class CreateGoogleAdsLinkRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest)
    CreateGoogleAdsLinkRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateGoogleAdsLinkRequest.newBuilder() to construct.
  private CreateGoogleAdsLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateGoogleAdsLinkRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateGoogleAdsLinkRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateGoogleAdsLinkRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.analytics.admin.v1alpha.GoogleAdsLink.Builder subBuilder = null;
              if (googleAdsLink_ != null) {
                subBuilder = googleAdsLink_.toBuilder();
              }
              googleAdsLink_ =
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.GoogleAdsLink.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(googleAdsLink_);
                googleAdsLink_ = subBuilder.buildPartial();
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
        .internal_static_google_analytics_admin_v1alpha_CreateGoogleAdsLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateGoogleAdsLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest.class,
            com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Example format: properties/1234
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
   * Required. Example format: properties/1234
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

  public static final int GOOGLE_ADS_LINK_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.GoogleAdsLink googleAdsLink_;
  /**
   *
   *
   * <pre>
   * Required. The GoogleAdsLink to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the googleAdsLink field is set.
   */
  @java.lang.Override
  public boolean hasGoogleAdsLink() {
    return googleAdsLink_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The GoogleAdsLink to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The googleAdsLink.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.GoogleAdsLink getGoogleAdsLink() {
    return googleAdsLink_ == null
        ? com.google.analytics.admin.v1alpha.GoogleAdsLink.getDefaultInstance()
        : googleAdsLink_;
  }
  /**
   *
   *
   * <pre>
   * Required. The GoogleAdsLink to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.GoogleAdsLinkOrBuilder getGoogleAdsLinkOrBuilder() {
    return getGoogleAdsLink();
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
    if (googleAdsLink_ != null) {
      output.writeMessage(2, getGoogleAdsLink());
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
    if (googleAdsLink_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getGoogleAdsLink());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest other =
        (com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasGoogleAdsLink() != other.hasGoogleAdsLink()) return false;
    if (hasGoogleAdsLink()) {
      if (!getGoogleAdsLink().equals(other.getGoogleAdsLink())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasGoogleAdsLink()) {
      hash = (37 * hash) + GOOGLE_ADS_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getGoogleAdsLink().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest prototype) {
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
   * Request message for CreateGoogleAdsLink RPC
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest)
      com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateGoogleAdsLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateGoogleAdsLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest.class,
              com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest.newBuilder()
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
      parent_ = "";

      if (googleAdsLinkBuilder_ == null) {
        googleAdsLink_ = null;
      } else {
        googleAdsLink_ = null;
        googleAdsLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateGoogleAdsLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest build() {
      com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest buildPartial() {
      com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest result =
          new com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest(this);
      result.parent_ = parent_;
      if (googleAdsLinkBuilder_ == null) {
        result.googleAdsLink_ = googleAdsLink_;
      } else {
        result.googleAdsLink_ = googleAdsLinkBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasGoogleAdsLink()) {
        mergeGoogleAdsLink(other.getGoogleAdsLink());
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
      com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
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
     * Required. Example format: properties/1234
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
     * Required. Example format: properties/1234
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
     * Required. Example format: properties/1234
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
     * Required. Example format: properties/1234
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

    private com.google.analytics.admin.v1alpha.GoogleAdsLink googleAdsLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.GoogleAdsLink,
            com.google.analytics.admin.v1alpha.GoogleAdsLink.Builder,
            com.google.analytics.admin.v1alpha.GoogleAdsLinkOrBuilder>
        googleAdsLinkBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The GoogleAdsLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the googleAdsLink field is set.
     */
    public boolean hasGoogleAdsLink() {
      return googleAdsLinkBuilder_ != null || googleAdsLink_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The GoogleAdsLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The googleAdsLink.
     */
    public com.google.analytics.admin.v1alpha.GoogleAdsLink getGoogleAdsLink() {
      if (googleAdsLinkBuilder_ == null) {
        return googleAdsLink_ == null
            ? com.google.analytics.admin.v1alpha.GoogleAdsLink.getDefaultInstance()
            : googleAdsLink_;
      } else {
        return googleAdsLinkBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The GoogleAdsLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGoogleAdsLink(com.google.analytics.admin.v1alpha.GoogleAdsLink value) {
      if (googleAdsLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        googleAdsLink_ = value;
        onChanged();
      } else {
        googleAdsLinkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The GoogleAdsLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGoogleAdsLink(
        com.google.analytics.admin.v1alpha.GoogleAdsLink.Builder builderForValue) {
      if (googleAdsLinkBuilder_ == null) {
        googleAdsLink_ = builderForValue.build();
        onChanged();
      } else {
        googleAdsLinkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The GoogleAdsLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGoogleAdsLink(com.google.analytics.admin.v1alpha.GoogleAdsLink value) {
      if (googleAdsLinkBuilder_ == null) {
        if (googleAdsLink_ != null) {
          googleAdsLink_ =
              com.google.analytics.admin.v1alpha.GoogleAdsLink.newBuilder(googleAdsLink_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          googleAdsLink_ = value;
        }
        onChanged();
      } else {
        googleAdsLinkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The GoogleAdsLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGoogleAdsLink() {
      if (googleAdsLinkBuilder_ == null) {
        googleAdsLink_ = null;
        onChanged();
      } else {
        googleAdsLink_ = null;
        googleAdsLinkBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The GoogleAdsLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.GoogleAdsLink.Builder getGoogleAdsLinkBuilder() {

      onChanged();
      return getGoogleAdsLinkFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The GoogleAdsLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.GoogleAdsLinkOrBuilder getGoogleAdsLinkOrBuilder() {
      if (googleAdsLinkBuilder_ != null) {
        return googleAdsLinkBuilder_.getMessageOrBuilder();
      } else {
        return googleAdsLink_ == null
            ? com.google.analytics.admin.v1alpha.GoogleAdsLink.getDefaultInstance()
            : googleAdsLink_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The GoogleAdsLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.GoogleAdsLink,
            com.google.analytics.admin.v1alpha.GoogleAdsLink.Builder,
            com.google.analytics.admin.v1alpha.GoogleAdsLinkOrBuilder>
        getGoogleAdsLinkFieldBuilder() {
      if (googleAdsLinkBuilder_ == null) {
        googleAdsLinkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.GoogleAdsLink,
                com.google.analytics.admin.v1alpha.GoogleAdsLink.Builder,
                com.google.analytics.admin.v1alpha.GoogleAdsLinkOrBuilder>(
                getGoogleAdsLink(), getParentForChildren(), isClean());
        googleAdsLink_ = null;
      }
      return googleAdsLinkBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest)
  private static final com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGoogleAdsLinkRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateGoogleAdsLinkRequest>() {
        @java.lang.Override
        public CreateGoogleAdsLinkRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateGoogleAdsLinkRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateGoogleAdsLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGoogleAdsLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
