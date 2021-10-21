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
 * Response message for ApproveDisplayVideo360AdvertiserLinkProposal RPC.
 * </pre>
 *
 * Protobuf type {@code
 * google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse}
 */
public final class ApproveDisplayVideo360AdvertiserLinkProposalResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse)
    ApproveDisplayVideo360AdvertiserLinkProposalResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ApproveDisplayVideo360AdvertiserLinkProposalResponse.newBuilder() to construct.
  private ApproveDisplayVideo360AdvertiserLinkProposalResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApproveDisplayVideo360AdvertiserLinkProposalResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ApproveDisplayVideo360AdvertiserLinkProposalResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ApproveDisplayVideo360AdvertiserLinkProposalResponse(
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
              com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.Builder subBuilder =
                  null;
              if (displayVideo360AdvertiserLink_ != null) {
                subBuilder = displayVideo360AdvertiserLink_.toBuilder();
              }
              displayVideo360AdvertiserLink_ =
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(displayVideo360AdvertiserLink_);
                displayVideo360AdvertiserLink_ = subBuilder.buildPartial();
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
        .internal_static_google_analytics_admin_v1alpha_ApproveDisplayVideo360AdvertiserLinkProposalResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ApproveDisplayVideo360AdvertiserLinkProposalResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
                .class,
            com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
                .Builder.class);
  }

  public static final int DISPLAY_VIDEO_360_ADVERTISER_LINK_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink
      displayVideo360AdvertiserLink_;
  /**
   *
   *
   * <pre>
   * The DisplayVideo360AdvertiserLink created as a result of approving the
   * proposal.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
   * </code>
   *
   * @return Whether the displayVideo360AdvertiserLink field is set.
   */
  @java.lang.Override
  public boolean hasDisplayVideo360AdvertiserLink() {
    return displayVideo360AdvertiserLink_ != null;
  }
  /**
   *
   *
   * <pre>
   * The DisplayVideo360AdvertiserLink created as a result of approving the
   * proposal.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
   * </code>
   *
   * @return The displayVideo360AdvertiserLink.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink
      getDisplayVideo360AdvertiserLink() {
    return displayVideo360AdvertiserLink_ == null
        ? com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.getDefaultInstance()
        : displayVideo360AdvertiserLink_;
  }
  /**
   *
   *
   * <pre>
   * The DisplayVideo360AdvertiserLink created as a result of approving the
   * proposal.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkOrBuilder
      getDisplayVideo360AdvertiserLinkOrBuilder() {
    return getDisplayVideo360AdvertiserLink();
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
    if (displayVideo360AdvertiserLink_ != null) {
      output.writeMessage(1, getDisplayVideo360AdvertiserLink());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (displayVideo360AdvertiserLink_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, getDisplayVideo360AdvertiserLink());
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
    if (!(obj
        instanceof
        com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse other =
        (com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse)
            obj;

    if (hasDisplayVideo360AdvertiserLink() != other.hasDisplayVideo360AdvertiserLink())
      return false;
    if (hasDisplayVideo360AdvertiserLink()) {
      if (!getDisplayVideo360AdvertiserLink().equals(other.getDisplayVideo360AdvertiserLink()))
        return false;
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
    if (hasDisplayVideo360AdvertiserLink()) {
      hash = (37 * hash) + DISPLAY_VIDEO_360_ADVERTISER_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getDisplayVideo360AdvertiserLink().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      parseFrom(
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
      com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
          prototype) {
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
   * Response message for ApproveDisplayVideo360AdvertiserLinkProposal RPC.
   * </pre>
   *
   * Protobuf type {@code
   * google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse)
      com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ApproveDisplayVideo360AdvertiserLinkProposalResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ApproveDisplayVideo360AdvertiserLinkProposalResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha
                  .ApproveDisplayVideo360AdvertiserLinkProposalResponse.class,
              com.google.analytics.admin.v1alpha
                  .ApproveDisplayVideo360AdvertiserLinkProposalResponse.Builder.class);
    }

    // Construct using
    // com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse.newBuilder()
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
      if (displayVideo360AdvertiserLinkBuilder_ == null) {
        displayVideo360AdvertiserLink_ = null;
      } else {
        displayVideo360AdvertiserLink_ = null;
        displayVideo360AdvertiserLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ApproveDisplayVideo360AdvertiserLinkProposalResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
        build() {
      com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
        buildPartial() {
      com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
          result =
              new com.google.analytics.admin.v1alpha
                  .ApproveDisplayVideo360AdvertiserLinkProposalResponse(this);
      if (displayVideo360AdvertiserLinkBuilder_ == null) {
        result.displayVideo360AdvertiserLink_ = displayVideo360AdvertiserLink_;
      } else {
        result.displayVideo360AdvertiserLink_ = displayVideo360AdvertiserLinkBuilder_.build();
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
      if (other
          instanceof
          com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse) {
        return mergeFrom(
            (com.google.analytics.admin.v1alpha
                    .ApproveDisplayVideo360AdvertiserLinkProposalResponse)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
            other) {
      if (other
          == com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
              .getDefaultInstance()) return this;
      if (other.hasDisplayVideo360AdvertiserLink()) {
        mergeDisplayVideo360AdvertiserLink(other.getDisplayVideo360AdvertiserLink());
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
      com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
          parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha
                    .ApproveDisplayVideo360AdvertiserLinkProposalResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink
        displayVideo360AdvertiserLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink,
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.Builder,
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkOrBuilder>
        displayVideo360AdvertiserLinkBuilder_;
    /**
     *
     *
     * <pre>
     * The DisplayVideo360AdvertiserLink created as a result of approving the
     * proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
     * </code>
     *
     * @return Whether the displayVideo360AdvertiserLink field is set.
     */
    public boolean hasDisplayVideo360AdvertiserLink() {
      return displayVideo360AdvertiserLinkBuilder_ != null
          || displayVideo360AdvertiserLink_ != null;
    }
    /**
     *
     *
     * <pre>
     * The DisplayVideo360AdvertiserLink created as a result of approving the
     * proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
     * </code>
     *
     * @return The displayVideo360AdvertiserLink.
     */
    public com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink
        getDisplayVideo360AdvertiserLink() {
      if (displayVideo360AdvertiserLinkBuilder_ == null) {
        return displayVideo360AdvertiserLink_ == null
            ? com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.getDefaultInstance()
            : displayVideo360AdvertiserLink_;
      } else {
        return displayVideo360AdvertiserLinkBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The DisplayVideo360AdvertiserLink created as a result of approving the
     * proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
     * </code>
     */
    public Builder setDisplayVideo360AdvertiserLink(
        com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink value) {
      if (displayVideo360AdvertiserLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        displayVideo360AdvertiserLink_ = value;
        onChanged();
      } else {
        displayVideo360AdvertiserLinkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DisplayVideo360AdvertiserLink created as a result of approving the
     * proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
     * </code>
     */
    public Builder setDisplayVideo360AdvertiserLink(
        com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.Builder builderForValue) {
      if (displayVideo360AdvertiserLinkBuilder_ == null) {
        displayVideo360AdvertiserLink_ = builderForValue.build();
        onChanged();
      } else {
        displayVideo360AdvertiserLinkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DisplayVideo360AdvertiserLink created as a result of approving the
     * proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
     * </code>
     */
    public Builder mergeDisplayVideo360AdvertiserLink(
        com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink value) {
      if (displayVideo360AdvertiserLinkBuilder_ == null) {
        if (displayVideo360AdvertiserLink_ != null) {
          displayVideo360AdvertiserLink_ =
              com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.newBuilder(
                      displayVideo360AdvertiserLink_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          displayVideo360AdvertiserLink_ = value;
        }
        onChanged();
      } else {
        displayVideo360AdvertiserLinkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DisplayVideo360AdvertiserLink created as a result of approving the
     * proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
     * </code>
     */
    public Builder clearDisplayVideo360AdvertiserLink() {
      if (displayVideo360AdvertiserLinkBuilder_ == null) {
        displayVideo360AdvertiserLink_ = null;
        onChanged();
      } else {
        displayVideo360AdvertiserLink_ = null;
        displayVideo360AdvertiserLinkBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The DisplayVideo360AdvertiserLink created as a result of approving the
     * proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.Builder
        getDisplayVideo360AdvertiserLinkBuilder() {

      onChanged();
      return getDisplayVideo360AdvertiserLinkFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The DisplayVideo360AdvertiserLink created as a result of approving the
     * proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkOrBuilder
        getDisplayVideo360AdvertiserLinkOrBuilder() {
      if (displayVideo360AdvertiserLinkBuilder_ != null) {
        return displayVideo360AdvertiserLinkBuilder_.getMessageOrBuilder();
      } else {
        return displayVideo360AdvertiserLink_ == null
            ? com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.getDefaultInstance()
            : displayVideo360AdvertiserLink_;
      }
    }
    /**
     *
     *
     * <pre>
     * The DisplayVideo360AdvertiserLink created as a result of approving the
     * proposal.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink display_video_360_advertiser_link = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink,
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.Builder,
            com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkOrBuilder>
        getDisplayVideo360AdvertiserLinkFieldBuilder() {
      if (displayVideo360AdvertiserLinkBuilder_ == null) {
        displayVideo360AdvertiserLinkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink,
                com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink.Builder,
                com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLinkOrBuilder>(
                getDisplayVideo360AdvertiserLink(), getParentForChildren(), isClean());
        displayVideo360AdvertiserLink_ = null;
      }
      return displayVideo360AdvertiserLinkBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse)
  private static final com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.analytics.admin.v1alpha
            .ApproveDisplayVideo360AdvertiserLinkProposalResponse();
  }

  public static com.google.analytics.admin.v1alpha
          .ApproveDisplayVideo360AdvertiserLinkProposalResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<
          ApproveDisplayVideo360AdvertiserLinkProposalResponse>
      PARSER =
          new com.google.protobuf.AbstractParser<
              ApproveDisplayVideo360AdvertiserLinkProposalResponse>() {
            @java.lang.Override
            public ApproveDisplayVideo360AdvertiserLinkProposalResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new ApproveDisplayVideo360AdvertiserLinkProposalResponse(
                  input, extensionRegistry);
            }
          };

  public static com.google.protobuf.Parser<ApproveDisplayVideo360AdvertiserLinkProposalResponse>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApproveDisplayVideo360AdvertiserLinkProposalResponse>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ApproveDisplayVideo360AdvertiserLinkProposalResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
