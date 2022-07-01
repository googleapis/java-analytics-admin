// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1beta/resources.proto

package com.google.analytics.admin.v1beta;

/**
 * <pre>
 * A conversion event in a Google Analytics property.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.ConversionEvent}
 */
public final class ConversionEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.ConversionEvent)
    ConversionEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionEvent.newBuilder() to construct.
  private ConversionEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionEvent() {
    name_ = "";
    eventName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConversionEvent(
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

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            eventName_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (createTime_ != null) {
              subBuilder = createTime_.toBuilder();
            }
            createTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(createTime_);
              createTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            deletable_ = input.readBool();
            break;
          }
          case 40: {

            custom_ = input.readBool();
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
    return com.google.analytics.admin.v1beta.ResourcesProto.internal_static_google_analytics_admin_v1beta_ConversionEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.ResourcesProto.internal_static_google_analytics_admin_v1beta_ConversionEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.ConversionEvent.class, com.google.analytics.admin.v1beta.ConversionEvent.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Output only. Resource name of this conversion event.
   * Format: properties/{property}/conversionEvents/{conversion_event}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Resource name of this conversion event.
   * Format: properties/{property}/conversionEvents/{conversion_event}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object eventName_;
  /**
   * <pre>
   * Immutable. The event name for this conversion event.
   * Examples: 'click', 'purchase'
   * </pre>
   *
   * <code>string event_name = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The eventName.
   */
  @java.lang.Override
  public java.lang.String getEventName() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The event name for this conversion event.
   * Examples: 'click', 'purchase'
   * </pre>
   *
   * <code>string event_name = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for eventName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventNameBytes() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Output only. Time when this conversion event was created in the property.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * Output only. Time when this conversion event was created in the property.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Output only. Time when this conversion event was created in the property.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int DELETABLE_FIELD_NUMBER = 4;
  private boolean deletable_;
  /**
   * <pre>
   * Output only. If set, this event can currently be deleted via DeleteConversionEvent.
   * </pre>
   *
   * <code>bool deletable = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The deletable.
   */
  @java.lang.Override
  public boolean getDeletable() {
    return deletable_;
  }

  public static final int CUSTOM_FIELD_NUMBER = 5;
  private boolean custom_;
  /**
   * <pre>
   * Output only. If set to true, this conversion event refers to a custom event.  If set to
   * false, this conversion event refers to a default event in GA. Default
   * events typically have special meaning in GA. Default events are usually
   * created for you by the GA system, but in some cases can be created by
   * property admins. Custom events count towards the maximum number of
   * custom conversion events that may be created per property.
   * </pre>
   *
   * <code>bool custom = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The custom.
   */
  @java.lang.Override
  public boolean getCustom() {
    return custom_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, eventName_);
    }
    if (createTime_ != null) {
      output.writeMessage(3, getCreateTime());
    }
    if (deletable_ != false) {
      output.writeBool(4, deletable_);
    }
    if (custom_ != false) {
      output.writeBool(5, custom_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, eventName_);
    }
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCreateTime());
    }
    if (deletable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, deletable_);
    }
    if (custom_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, custom_);
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.ConversionEvent)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.ConversionEvent other = (com.google.analytics.admin.v1beta.ConversionEvent) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getEventName()
        .equals(other.getEventName())) return false;
    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (getDeletable()
        != other.getDeletable()) return false;
    if (getCustom()
        != other.getCustom()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + EVENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getEventName().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (37 * hash) + DELETABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDeletable());
    hash = (37 * hash) + CUSTOM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCustom());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.ConversionEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.admin.v1beta.ConversionEvent parseFrom(
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
  public static Builder newBuilder(com.google.analytics.admin.v1beta.ConversionEvent prototype) {
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
   * A conversion event in a Google Analytics property.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.ConversionEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.ConversionEvent)
      com.google.analytics.admin.v1beta.ConversionEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.admin.v1beta.ResourcesProto.internal_static_google_analytics_admin_v1beta_ConversionEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.ResourcesProto.internal_static_google_analytics_admin_v1beta_ConversionEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.ConversionEvent.class, com.google.analytics.admin.v1beta.ConversionEvent.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.ConversionEvent.newBuilder()
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
      name_ = "";

      eventName_ = "";

      if (createTimeBuilder_ == null) {
        createTime_ = null;
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }
      deletable_ = false;

      custom_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.admin.v1beta.ResourcesProto.internal_static_google_analytics_admin_v1beta_ConversionEvent_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ConversionEvent getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.ConversionEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ConversionEvent build() {
      com.google.analytics.admin.v1beta.ConversionEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ConversionEvent buildPartial() {
      com.google.analytics.admin.v1beta.ConversionEvent result = new com.google.analytics.admin.v1beta.ConversionEvent(this);
      result.name_ = name_;
      result.eventName_ = eventName_;
      if (createTimeBuilder_ == null) {
        result.createTime_ = createTime_;
      } else {
        result.createTime_ = createTimeBuilder_.build();
      }
      result.deletable_ = deletable_;
      result.custom_ = custom_;
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
      if (other instanceof com.google.analytics.admin.v1beta.ConversionEvent) {
        return mergeFrom((com.google.analytics.admin.v1beta.ConversionEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.ConversionEvent other) {
      if (other == com.google.analytics.admin.v1beta.ConversionEvent.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getEventName().isEmpty()) {
        eventName_ = other.eventName_;
        onChanged();
      }
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.getDeletable() != false) {
        setDeletable(other.getDeletable());
      }
      if (other.getCustom() != false) {
        setCustom(other.getCustom());
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
      com.google.analytics.admin.v1beta.ConversionEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.admin.v1beta.ConversionEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Output only. Resource name of this conversion event.
     * Format: properties/{property}/conversionEvents/{conversion_event}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Resource name of this conversion event.
     * Format: properties/{property}/conversionEvents/{conversion_event}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Resource name of this conversion event.
     * Format: properties/{property}/conversionEvents/{conversion_event}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Resource name of this conversion event.
     * Format: properties/{property}/conversionEvents/{conversion_event}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Resource name of this conversion event.
     * Format: properties/{property}/conversionEvents/{conversion_event}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object eventName_ = "";
    /**
     * <pre>
     * Immutable. The event name for this conversion event.
     * Examples: 'click', 'purchase'
     * </pre>
     *
     * <code>string event_name = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The eventName.
     */
    public java.lang.String getEventName() {
      java.lang.Object ref = eventName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The event name for this conversion event.
     * Examples: 'click', 'purchase'
     * </pre>
     *
     * <code>string event_name = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The bytes for eventName.
     */
    public com.google.protobuf.ByteString
        getEventNameBytes() {
      java.lang.Object ref = eventName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The event name for this conversion event.
     * Examples: 'click', 'purchase'
     * </pre>
     *
     * <code>string event_name = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The event name for this conversion event.
     * Examples: 'click', 'purchase'
     * </pre>
     *
     * <code>string event_name = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearEventName() {
      
      eventName_ = getDefaultInstance().getEventName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The event name for this conversion event.
     * Examples: 'click', 'purchase'
     * </pre>
     *
     * <code>string event_name = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The bytes for eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eventName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Output only. Time when this conversion event was created in the property.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return createTimeBuilder_ != null || createTime_ != null;
    }
    /**
     * <pre>
     * Output only. Time when this conversion event was created in the property.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. Time when this conversion event was created in the property.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
        onChanged();
      } else {
        createTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Time when this conversion event was created in the property.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
        onChanged();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Time when this conversion event was created in the property.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (createTime_ != null) {
          createTime_ =
            com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
        } else {
          createTime_ = value;
        }
        onChanged();
      } else {
        createTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Time when this conversion event was created in the property.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearCreateTime() {
      if (createTimeBuilder_ == null) {
        createTime_ = null;
        onChanged();
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. Time when this conversion event was created in the property.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. Time when this conversion event was created in the property.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * Output only. Time when this conversion event was created in the property.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private boolean deletable_ ;
    /**
     * <pre>
     * Output only. If set, this event can currently be deleted via DeleteConversionEvent.
     * </pre>
     *
     * <code>bool deletable = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The deletable.
     */
    @java.lang.Override
    public boolean getDeletable() {
      return deletable_;
    }
    /**
     * <pre>
     * Output only. If set, this event can currently be deleted via DeleteConversionEvent.
     * </pre>
     *
     * <code>bool deletable = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The deletable to set.
     * @return This builder for chaining.
     */
    public Builder setDeletable(boolean value) {
      
      deletable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. If set, this event can currently be deleted via DeleteConversionEvent.
     * </pre>
     *
     * <code>bool deletable = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeletable() {
      
      deletable_ = false;
      onChanged();
      return this;
    }

    private boolean custom_ ;
    /**
     * <pre>
     * Output only. If set to true, this conversion event refers to a custom event.  If set to
     * false, this conversion event refers to a default event in GA. Default
     * events typically have special meaning in GA. Default events are usually
     * created for you by the GA system, but in some cases can be created by
     * property admins. Custom events count towards the maximum number of
     * custom conversion events that may be created per property.
     * </pre>
     *
     * <code>bool custom = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The custom.
     */
    @java.lang.Override
    public boolean getCustom() {
      return custom_;
    }
    /**
     * <pre>
     * Output only. If set to true, this conversion event refers to a custom event.  If set to
     * false, this conversion event refers to a default event in GA. Default
     * events typically have special meaning in GA. Default events are usually
     * created for you by the GA system, but in some cases can be created by
     * property admins. Custom events count towards the maximum number of
     * custom conversion events that may be created per property.
     * </pre>
     *
     * <code>bool custom = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The custom to set.
     * @return This builder for chaining.
     */
    public Builder setCustom(boolean value) {
      
      custom_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. If set to true, this conversion event refers to a custom event.  If set to
     * false, this conversion event refers to a default event in GA. Default
     * events typically have special meaning in GA. Default events are usually
     * created for you by the GA system, but in some cases can be created by
     * property admins. Custom events count towards the maximum number of
     * custom conversion events that may be created per property.
     * </pre>
     *
     * <code>bool custom = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustom() {
      
      custom_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.ConversionEvent)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.ConversionEvent)
  private static final com.google.analytics.admin.v1beta.ConversionEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.ConversionEvent();
  }

  public static com.google.analytics.admin.v1beta.ConversionEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionEvent>
      PARSER = new com.google.protobuf.AbstractParser<ConversionEvent>() {
    @java.lang.Override
    public ConversionEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConversionEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConversionEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.ConversionEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

