// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 * <pre>
 * Response message for ListConnectedSiteTags RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse}
 */
public final class ListConnectedSiteTagsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse)
    ListConnectedSiteTagsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListConnectedSiteTagsResponse.newBuilder() to construct.
  private ListConnectedSiteTagsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListConnectedSiteTagsResponse() {
    connectedSiteTags_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListConnectedSiteTagsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_ListConnectedSiteTagsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_ListConnectedSiteTagsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse.class, com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse.Builder.class);
  }

  public static final int CONNECTED_SITE_TAGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.admin.v1alpha.ConnectedSiteTag> connectedSiteTags_;
  /**
   * <pre>
   * The site tags for the Universal Analytics property. A maximum of 20
   * connected site tags will be returned.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.ConnectedSiteTag> getConnectedSiteTagsList() {
    return connectedSiteTags_;
  }
  /**
   * <pre>
   * The site tags for the Universal Analytics property. A maximum of 20
   * connected site tags will be returned.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.ConnectedSiteTagOrBuilder> 
      getConnectedSiteTagsOrBuilderList() {
    return connectedSiteTags_;
  }
  /**
   * <pre>
   * The site tags for the Universal Analytics property. A maximum of 20
   * connected site tags will be returned.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
   */
  @java.lang.Override
  public int getConnectedSiteTagsCount() {
    return connectedSiteTags_.size();
  }
  /**
   * <pre>
   * The site tags for the Universal Analytics property. A maximum of 20
   * connected site tags will be returned.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ConnectedSiteTag getConnectedSiteTags(int index) {
    return connectedSiteTags_.get(index);
  }
  /**
   * <pre>
   * The site tags for the Universal Analytics property. A maximum of 20
   * connected site tags will be returned.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ConnectedSiteTagOrBuilder getConnectedSiteTagsOrBuilder(
      int index) {
    return connectedSiteTags_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < connectedSiteTags_.size(); i++) {
      output.writeMessage(1, connectedSiteTags_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < connectedSiteTags_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, connectedSiteTags_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse other = (com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse) obj;

    if (!getConnectedSiteTagsList()
        .equals(other.getConnectedSiteTagsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getConnectedSiteTagsCount() > 0) {
      hash = (37 * hash) + CONNECTED_SITE_TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getConnectedSiteTagsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response message for ListConnectedSiteTags RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse)
      com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_ListConnectedSiteTagsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_ListConnectedSiteTagsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse.class, com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (connectedSiteTagsBuilder_ == null) {
        connectedSiteTags_ = java.util.Collections.emptyList();
      } else {
        connectedSiteTags_ = null;
        connectedSiteTagsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_ListConnectedSiteTagsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse build() {
      com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse buildPartial() {
      com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse result = new com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse result) {
      if (connectedSiteTagsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          connectedSiteTags_ = java.util.Collections.unmodifiableList(connectedSiteTags_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.connectedSiteTags_ = connectedSiteTags_;
      } else {
        result.connectedSiteTags_ = connectedSiteTagsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse) {
        return mergeFrom((com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse other) {
      if (other == com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse.getDefaultInstance()) return this;
      if (connectedSiteTagsBuilder_ == null) {
        if (!other.connectedSiteTags_.isEmpty()) {
          if (connectedSiteTags_.isEmpty()) {
            connectedSiteTags_ = other.connectedSiteTags_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConnectedSiteTagsIsMutable();
            connectedSiteTags_.addAll(other.connectedSiteTags_);
          }
          onChanged();
        }
      } else {
        if (!other.connectedSiteTags_.isEmpty()) {
          if (connectedSiteTagsBuilder_.isEmpty()) {
            connectedSiteTagsBuilder_.dispose();
            connectedSiteTagsBuilder_ = null;
            connectedSiteTags_ = other.connectedSiteTags_;
            bitField0_ = (bitField0_ & ~0x00000001);
            connectedSiteTagsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConnectedSiteTagsFieldBuilder() : null;
          } else {
            connectedSiteTagsBuilder_.addAllMessages(other.connectedSiteTags_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.analytics.admin.v1alpha.ConnectedSiteTag m =
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.ConnectedSiteTag.parser(),
                      extensionRegistry);
              if (connectedSiteTagsBuilder_ == null) {
                ensureConnectedSiteTagsIsMutable();
                connectedSiteTags_.add(m);
              } else {
                connectedSiteTagsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.analytics.admin.v1alpha.ConnectedSiteTag> connectedSiteTags_ =
      java.util.Collections.emptyList();
    private void ensureConnectedSiteTagsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        connectedSiteTags_ = new java.util.ArrayList<com.google.analytics.admin.v1alpha.ConnectedSiteTag>(connectedSiteTags_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.analytics.admin.v1alpha.ConnectedSiteTag, com.google.analytics.admin.v1alpha.ConnectedSiteTag.Builder, com.google.analytics.admin.v1alpha.ConnectedSiteTagOrBuilder> connectedSiteTagsBuilder_;

    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.ConnectedSiteTag> getConnectedSiteTagsList() {
      if (connectedSiteTagsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(connectedSiteTags_);
      } else {
        return connectedSiteTagsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public int getConnectedSiteTagsCount() {
      if (connectedSiteTagsBuilder_ == null) {
        return connectedSiteTags_.size();
      } else {
        return connectedSiteTagsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.ConnectedSiteTag getConnectedSiteTags(int index) {
      if (connectedSiteTagsBuilder_ == null) {
        return connectedSiteTags_.get(index);
      } else {
        return connectedSiteTagsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public Builder setConnectedSiteTags(
        int index, com.google.analytics.admin.v1alpha.ConnectedSiteTag value) {
      if (connectedSiteTagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectedSiteTagsIsMutable();
        connectedSiteTags_.set(index, value);
        onChanged();
      } else {
        connectedSiteTagsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public Builder setConnectedSiteTags(
        int index, com.google.analytics.admin.v1alpha.ConnectedSiteTag.Builder builderForValue) {
      if (connectedSiteTagsBuilder_ == null) {
        ensureConnectedSiteTagsIsMutable();
        connectedSiteTags_.set(index, builderForValue.build());
        onChanged();
      } else {
        connectedSiteTagsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public Builder addConnectedSiteTags(com.google.analytics.admin.v1alpha.ConnectedSiteTag value) {
      if (connectedSiteTagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectedSiteTagsIsMutable();
        connectedSiteTags_.add(value);
        onChanged();
      } else {
        connectedSiteTagsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public Builder addConnectedSiteTags(
        int index, com.google.analytics.admin.v1alpha.ConnectedSiteTag value) {
      if (connectedSiteTagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConnectedSiteTagsIsMutable();
        connectedSiteTags_.add(index, value);
        onChanged();
      } else {
        connectedSiteTagsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public Builder addConnectedSiteTags(
        com.google.analytics.admin.v1alpha.ConnectedSiteTag.Builder builderForValue) {
      if (connectedSiteTagsBuilder_ == null) {
        ensureConnectedSiteTagsIsMutable();
        connectedSiteTags_.add(builderForValue.build());
        onChanged();
      } else {
        connectedSiteTagsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public Builder addConnectedSiteTags(
        int index, com.google.analytics.admin.v1alpha.ConnectedSiteTag.Builder builderForValue) {
      if (connectedSiteTagsBuilder_ == null) {
        ensureConnectedSiteTagsIsMutable();
        connectedSiteTags_.add(index, builderForValue.build());
        onChanged();
      } else {
        connectedSiteTagsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public Builder addAllConnectedSiteTags(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.ConnectedSiteTag> values) {
      if (connectedSiteTagsBuilder_ == null) {
        ensureConnectedSiteTagsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, connectedSiteTags_);
        onChanged();
      } else {
        connectedSiteTagsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public Builder clearConnectedSiteTags() {
      if (connectedSiteTagsBuilder_ == null) {
        connectedSiteTags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        connectedSiteTagsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public Builder removeConnectedSiteTags(int index) {
      if (connectedSiteTagsBuilder_ == null) {
        ensureConnectedSiteTagsIsMutable();
        connectedSiteTags_.remove(index);
        onChanged();
      } else {
        connectedSiteTagsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.ConnectedSiteTag.Builder getConnectedSiteTagsBuilder(
        int index) {
      return getConnectedSiteTagsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.ConnectedSiteTagOrBuilder getConnectedSiteTagsOrBuilder(
        int index) {
      if (connectedSiteTagsBuilder_ == null) {
        return connectedSiteTags_.get(index);  } else {
        return connectedSiteTagsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.ConnectedSiteTagOrBuilder> 
         getConnectedSiteTagsOrBuilderList() {
      if (connectedSiteTagsBuilder_ != null) {
        return connectedSiteTagsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(connectedSiteTags_);
      }
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.ConnectedSiteTag.Builder addConnectedSiteTagsBuilder() {
      return getConnectedSiteTagsFieldBuilder().addBuilder(
          com.google.analytics.admin.v1alpha.ConnectedSiteTag.getDefaultInstance());
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.ConnectedSiteTag.Builder addConnectedSiteTagsBuilder(
        int index) {
      return getConnectedSiteTagsFieldBuilder().addBuilder(
          index, com.google.analytics.admin.v1alpha.ConnectedSiteTag.getDefaultInstance());
    }
    /**
     * <pre>
     * The site tags for the Universal Analytics property. A maximum of 20
     * connected site tags will be returned.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tags = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.ConnectedSiteTag.Builder> 
         getConnectedSiteTagsBuilderList() {
      return getConnectedSiteTagsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.analytics.admin.v1alpha.ConnectedSiteTag, com.google.analytics.admin.v1alpha.ConnectedSiteTag.Builder, com.google.analytics.admin.v1alpha.ConnectedSiteTagOrBuilder> 
        getConnectedSiteTagsFieldBuilder() {
      if (connectedSiteTagsBuilder_ == null) {
        connectedSiteTagsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.ConnectedSiteTag, com.google.analytics.admin.v1alpha.ConnectedSiteTag.Builder, com.google.analytics.admin.v1alpha.ConnectedSiteTagOrBuilder>(
                connectedSiteTags_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        connectedSiteTags_ = null;
      }
      return connectedSiteTagsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse)
  private static final com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse();
  }

  public static com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConnectedSiteTagsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListConnectedSiteTagsResponse>() {
    @java.lang.Override
    public ListConnectedSiteTagsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ListConnectedSiteTagsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConnectedSiteTagsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ListConnectedSiteTagsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

