// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 * <pre>
 * Request message for CreateAudience RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.CreateAudienceRequest}
 */
public final class CreateAudienceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateAudienceRequest)
    CreateAudienceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAudienceRequest.newBuilder() to construct.
  private CreateAudienceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAudienceRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAudienceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateAudienceRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.analytics.admin.v1alpha.Audience.Builder subBuilder = null;
            if (audience_ != null) {
              subBuilder = audience_.toBuilder();
            }
            audience_ = input.readMessage(com.google.analytics.admin.v1alpha.Audience.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(audience_);
              audience_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateAudienceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateAudienceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateAudienceRequest.class, com.google.analytics.admin.v1alpha.CreateAudienceRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUDIENCE_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.Audience audience_;
  /**
   * <pre>
   * Required. The audience to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the audience field is set.
   */
  @java.lang.Override
  public boolean hasAudience() {
    return audience_ != null;
  }
  /**
   * <pre>
   * Required. The audience to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The audience.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.Audience getAudience() {
    return audience_ == null ? com.google.analytics.admin.v1alpha.Audience.getDefaultInstance() : audience_;
  }
  /**
   * <pre>
   * Required. The audience to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceOrBuilder getAudienceOrBuilder() {
    return getAudience();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (audience_ != null) {
      output.writeMessage(2, getAudience());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (audience_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAudience());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.CreateAudienceRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateAudienceRequest other = (com.google.analytics.admin.v1alpha.CreateAudienceRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasAudience() != other.hasAudience()) return false;
    if (hasAudience()) {
      if (!getAudience()
          .equals(other.getAudience())) return false;
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
    if (hasAudience()) {
      hash = (37 * hash) + AUDIENCE_FIELD_NUMBER;
      hash = (53 * hash) + getAudience().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1alpha.CreateAudienceRequest prototype) {
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
   * Request message for CreateAudience RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.CreateAudienceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateAudienceRequest)
      com.google.analytics.admin.v1alpha.CreateAudienceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateAudienceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateAudienceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateAudienceRequest.class, com.google.analytics.admin.v1alpha.CreateAudienceRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.CreateAudienceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (audienceBuilder_ == null) {
        audience_ = null;
      } else {
        audience_ = null;
        audienceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto.internal_static_google_analytics_admin_v1alpha_CreateAudienceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateAudienceRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateAudienceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateAudienceRequest build() {
      com.google.analytics.admin.v1alpha.CreateAudienceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateAudienceRequest buildPartial() {
      com.google.analytics.admin.v1alpha.CreateAudienceRequest result = new com.google.analytics.admin.v1alpha.CreateAudienceRequest(this);
      result.parent_ = parent_;
      if (audienceBuilder_ == null) {
        result.audience_ = audience_;
      } else {
        result.audience_ = audienceBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.CreateAudienceRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.CreateAudienceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.CreateAudienceRequest other) {
      if (other == com.google.analytics.admin.v1alpha.CreateAudienceRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasAudience()) {
        mergeAudience(other.getAudience());
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
      com.google.analytics.admin.v1alpha.CreateAudienceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.admin.v1alpha.CreateAudienceRequest) e.getUnfinishedMessage();
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
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.Audience audience_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1alpha.Audience, com.google.analytics.admin.v1alpha.Audience.Builder, com.google.analytics.admin.v1alpha.AudienceOrBuilder> audienceBuilder_;
    /**
     * <pre>
     * Required. The audience to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the audience field is set.
     */
    public boolean hasAudience() {
      return audienceBuilder_ != null || audience_ != null;
    }
    /**
     * <pre>
     * Required. The audience to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The audience.
     */
    public com.google.analytics.admin.v1alpha.Audience getAudience() {
      if (audienceBuilder_ == null) {
        return audience_ == null ? com.google.analytics.admin.v1alpha.Audience.getDefaultInstance() : audience_;
      } else {
        return audienceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The audience to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAudience(com.google.analytics.admin.v1alpha.Audience value) {
      if (audienceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audience_ = value;
        onChanged();
      } else {
        audienceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The audience to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAudience(
        com.google.analytics.admin.v1alpha.Audience.Builder builderForValue) {
      if (audienceBuilder_ == null) {
        audience_ = builderForValue.build();
        onChanged();
      } else {
        audienceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The audience to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeAudience(com.google.analytics.admin.v1alpha.Audience value) {
      if (audienceBuilder_ == null) {
        if (audience_ != null) {
          audience_ =
            com.google.analytics.admin.v1alpha.Audience.newBuilder(audience_).mergeFrom(value).buildPartial();
        } else {
          audience_ = value;
        }
        onChanged();
      } else {
        audienceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The audience to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearAudience() {
      if (audienceBuilder_ == null) {
        audience_ = null;
        onChanged();
      } else {
        audience_ = null;
        audienceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The audience to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.analytics.admin.v1alpha.Audience.Builder getAudienceBuilder() {
      
      onChanged();
      return getAudienceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The audience to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.analytics.admin.v1alpha.AudienceOrBuilder getAudienceOrBuilder() {
      if (audienceBuilder_ != null) {
        return audienceBuilder_.getMessageOrBuilder();
      } else {
        return audience_ == null ?
            com.google.analytics.admin.v1alpha.Audience.getDefaultInstance() : audience_;
      }
    }
    /**
     * <pre>
     * Required. The audience to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Audience audience = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.admin.v1alpha.Audience, com.google.analytics.admin.v1alpha.Audience.Builder, com.google.analytics.admin.v1alpha.AudienceOrBuilder> 
        getAudienceFieldBuilder() {
      if (audienceBuilder_ == null) {
        audienceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.Audience, com.google.analytics.admin.v1alpha.Audience.Builder, com.google.analytics.admin.v1alpha.AudienceOrBuilder>(
                getAudience(),
                getParentForChildren(),
                isClean());
        audience_ = null;
      }
      return audienceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateAudienceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateAudienceRequest)
  private static final com.google.analytics.admin.v1alpha.CreateAudienceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.CreateAudienceRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateAudienceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAudienceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAudienceRequest>() {
    @java.lang.Override
    public CreateAudienceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateAudienceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateAudienceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAudienceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateAudienceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

