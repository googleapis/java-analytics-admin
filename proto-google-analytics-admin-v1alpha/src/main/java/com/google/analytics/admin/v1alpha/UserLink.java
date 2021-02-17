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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * A resource message representing a user's permissions on an Account or
 * Property resource.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.UserLink}
 */
public final class UserLink extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.UserLink)
    UserLinkOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UserLink.newBuilder() to construct.
  private UserLink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UserLink() {
    name_ = "";
    emailAddress_ = "";
    directRoles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UserLink();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UserLink(
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

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              emailAddress_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                directRoles_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              directRoles_.add(s);
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
        directRoles_ = directRoles_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_UserLink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_UserLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.UserLink.class,
            com.google.analytics.admin.v1alpha.UserLink.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Example format: properties/1234/userLinks/5678
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Example format: properties/1234/userLinks/5678
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_ADDRESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object emailAddress_;
  /**
   *
   *
   * <pre>
   * Email address of the user to link
   * </pre>
   *
   * <code>string email_address = 2;</code>
   *
   * @return The emailAddress.
   */
  @java.lang.Override
  public java.lang.String getEmailAddress() {
    java.lang.Object ref = emailAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailAddress_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Email address of the user to link
   * </pre>
   *
   * <code>string email_address = 2;</code>
   *
   * @return The bytes for emailAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEmailAddressBytes() {
    java.lang.Object ref = emailAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      emailAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIRECT_ROLES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList directRoles_;
  /**
   *
   *
   * <pre>
   * Roles directly assigned to this user for this account or property.
   * Valid values:
   * predefinedRoles/read
   * predefinedRoles/collaborate
   * predefinedRoles/edit
   * predefinedRoles/manage-users
   * Excludes roles that are inherited from a higher-level entity, group,
   * or organization admin role.
   * A UserLink that is updated to have an empty list of direct_roles will be
   * deleted.
   * </pre>
   *
   * <code>repeated string direct_roles = 3;</code>
   *
   * @return A list containing the directRoles.
   */
  public com.google.protobuf.ProtocolStringList getDirectRolesList() {
    return directRoles_;
  }
  /**
   *
   *
   * <pre>
   * Roles directly assigned to this user for this account or property.
   * Valid values:
   * predefinedRoles/read
   * predefinedRoles/collaborate
   * predefinedRoles/edit
   * predefinedRoles/manage-users
   * Excludes roles that are inherited from a higher-level entity, group,
   * or organization admin role.
   * A UserLink that is updated to have an empty list of direct_roles will be
   * deleted.
   * </pre>
   *
   * <code>repeated string direct_roles = 3;</code>
   *
   * @return The count of directRoles.
   */
  public int getDirectRolesCount() {
    return directRoles_.size();
  }
  /**
   *
   *
   * <pre>
   * Roles directly assigned to this user for this account or property.
   * Valid values:
   * predefinedRoles/read
   * predefinedRoles/collaborate
   * predefinedRoles/edit
   * predefinedRoles/manage-users
   * Excludes roles that are inherited from a higher-level entity, group,
   * or organization admin role.
   * A UserLink that is updated to have an empty list of direct_roles will be
   * deleted.
   * </pre>
   *
   * <code>repeated string direct_roles = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The directRoles at the given index.
   */
  public java.lang.String getDirectRoles(int index) {
    return directRoles_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Roles directly assigned to this user for this account or property.
   * Valid values:
   * predefinedRoles/read
   * predefinedRoles/collaborate
   * predefinedRoles/edit
   * predefinedRoles/manage-users
   * Excludes roles that are inherited from a higher-level entity, group,
   * or organization admin role.
   * A UserLink that is updated to have an empty list of direct_roles will be
   * deleted.
   * </pre>
   *
   * <code>repeated string direct_roles = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the directRoles at the given index.
   */
  public com.google.protobuf.ByteString getDirectRolesBytes(int index) {
    return directRoles_.getByteString(index);
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getEmailAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, emailAddress_);
    }
    for (int i = 0; i < directRoles_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, directRoles_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getEmailAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, emailAddress_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < directRoles_.size(); i++) {
        dataSize += computeStringSizeNoTag(directRoles_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDirectRolesList().size();
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.UserLink)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.UserLink other =
        (com.google.analytics.admin.v1alpha.UserLink) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getEmailAddress().equals(other.getEmailAddress())) return false;
    if (!getDirectRolesList().equals(other.getDirectRolesList())) return false;
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
    hash = (37 * hash) + EMAIL_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getEmailAddress().hashCode();
    if (getDirectRolesCount() > 0) {
      hash = (37 * hash) + DIRECT_ROLES_FIELD_NUMBER;
      hash = (53 * hash) + getDirectRolesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UserLink parseFrom(
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

  public static Builder newBuilder(com.google.analytics.admin.v1alpha.UserLink prototype) {
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
   * A resource message representing a user's permissions on an Account or
   * Property resource.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.UserLink}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.UserLink)
      com.google.analytics.admin.v1alpha.UserLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_UserLink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_UserLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.UserLink.class,
              com.google.analytics.admin.v1alpha.UserLink.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.UserLink.newBuilder()
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
      name_ = "";

      emailAddress_ = "";

      directRoles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_UserLink_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UserLink getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.UserLink.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UserLink build() {
      com.google.analytics.admin.v1alpha.UserLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UserLink buildPartial() {
      com.google.analytics.admin.v1alpha.UserLink result =
          new com.google.analytics.admin.v1alpha.UserLink(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.emailAddress_ = emailAddress_;
      if (((bitField0_ & 0x00000001) != 0)) {
        directRoles_ = directRoles_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.directRoles_ = directRoles_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.UserLink) {
        return mergeFrom((com.google.analytics.admin.v1alpha.UserLink) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.UserLink other) {
      if (other == com.google.analytics.admin.v1alpha.UserLink.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getEmailAddress().isEmpty()) {
        emailAddress_ = other.emailAddress_;
        onChanged();
      }
      if (!other.directRoles_.isEmpty()) {
        if (directRoles_.isEmpty()) {
          directRoles_ = other.directRoles_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDirectRolesIsMutable();
          directRoles_.addAll(other.directRoles_);
        }
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
      com.google.analytics.admin.v1alpha.UserLink parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.admin.v1alpha.UserLink) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Example format: properties/1234/userLinks/5678
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Example format: properties/1234/userLinks/5678
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Example format: properties/1234/userLinks/5678
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Example format: properties/1234/userLinks/5678
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Example format: properties/1234/userLinks/5678
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object emailAddress_ = "";
    /**
     *
     *
     * <pre>
     * Email address of the user to link
     * </pre>
     *
     * <code>string email_address = 2;</code>
     *
     * @return The emailAddress.
     */
    public java.lang.String getEmailAddress() {
      java.lang.Object ref = emailAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email address of the user to link
     * </pre>
     *
     * <code>string email_address = 2;</code>
     *
     * @return The bytes for emailAddress.
     */
    public com.google.protobuf.ByteString getEmailAddressBytes() {
      java.lang.Object ref = emailAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        emailAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email address of the user to link
     * </pre>
     *
     * <code>string email_address = 2;</code>
     *
     * @param value The emailAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEmailAddress(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      emailAddress_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of the user to link
     * </pre>
     *
     * <code>string email_address = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEmailAddress() {

      emailAddress_ = getDefaultInstance().getEmailAddress();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of the user to link
     * </pre>
     *
     * <code>string email_address = 2;</code>
     *
     * @param value The bytes for emailAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEmailAddressBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      emailAddress_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList directRoles_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureDirectRolesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        directRoles_ = new com.google.protobuf.LazyStringArrayList(directRoles_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Roles directly assigned to this user for this account or property.
     * Valid values:
     * predefinedRoles/read
     * predefinedRoles/collaborate
     * predefinedRoles/edit
     * predefinedRoles/manage-users
     * Excludes roles that are inherited from a higher-level entity, group,
     * or organization admin role.
     * A UserLink that is updated to have an empty list of direct_roles will be
     * deleted.
     * </pre>
     *
     * <code>repeated string direct_roles = 3;</code>
     *
     * @return A list containing the directRoles.
     */
    public com.google.protobuf.ProtocolStringList getDirectRolesList() {
      return directRoles_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Roles directly assigned to this user for this account or property.
     * Valid values:
     * predefinedRoles/read
     * predefinedRoles/collaborate
     * predefinedRoles/edit
     * predefinedRoles/manage-users
     * Excludes roles that are inherited from a higher-level entity, group,
     * or organization admin role.
     * A UserLink that is updated to have an empty list of direct_roles will be
     * deleted.
     * </pre>
     *
     * <code>repeated string direct_roles = 3;</code>
     *
     * @return The count of directRoles.
     */
    public int getDirectRolesCount() {
      return directRoles_.size();
    }
    /**
     *
     *
     * <pre>
     * Roles directly assigned to this user for this account or property.
     * Valid values:
     * predefinedRoles/read
     * predefinedRoles/collaborate
     * predefinedRoles/edit
     * predefinedRoles/manage-users
     * Excludes roles that are inherited from a higher-level entity, group,
     * or organization admin role.
     * A UserLink that is updated to have an empty list of direct_roles will be
     * deleted.
     * </pre>
     *
     * <code>repeated string direct_roles = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The directRoles at the given index.
     */
    public java.lang.String getDirectRoles(int index) {
      return directRoles_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Roles directly assigned to this user for this account or property.
     * Valid values:
     * predefinedRoles/read
     * predefinedRoles/collaborate
     * predefinedRoles/edit
     * predefinedRoles/manage-users
     * Excludes roles that are inherited from a higher-level entity, group,
     * or organization admin role.
     * A UserLink that is updated to have an empty list of direct_roles will be
     * deleted.
     * </pre>
     *
     * <code>repeated string direct_roles = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the directRoles at the given index.
     */
    public com.google.protobuf.ByteString getDirectRolesBytes(int index) {
      return directRoles_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Roles directly assigned to this user for this account or property.
     * Valid values:
     * predefinedRoles/read
     * predefinedRoles/collaborate
     * predefinedRoles/edit
     * predefinedRoles/manage-users
     * Excludes roles that are inherited from a higher-level entity, group,
     * or organization admin role.
     * A UserLink that is updated to have an empty list of direct_roles will be
     * deleted.
     * </pre>
     *
     * <code>repeated string direct_roles = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The directRoles to set.
     * @return This builder for chaining.
     */
    public Builder setDirectRoles(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDirectRolesIsMutable();
      directRoles_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Roles directly assigned to this user for this account or property.
     * Valid values:
     * predefinedRoles/read
     * predefinedRoles/collaborate
     * predefinedRoles/edit
     * predefinedRoles/manage-users
     * Excludes roles that are inherited from a higher-level entity, group,
     * or organization admin role.
     * A UserLink that is updated to have an empty list of direct_roles will be
     * deleted.
     * </pre>
     *
     * <code>repeated string direct_roles = 3;</code>
     *
     * @param value The directRoles to add.
     * @return This builder for chaining.
     */
    public Builder addDirectRoles(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDirectRolesIsMutable();
      directRoles_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Roles directly assigned to this user for this account or property.
     * Valid values:
     * predefinedRoles/read
     * predefinedRoles/collaborate
     * predefinedRoles/edit
     * predefinedRoles/manage-users
     * Excludes roles that are inherited from a higher-level entity, group,
     * or organization admin role.
     * A UserLink that is updated to have an empty list of direct_roles will be
     * deleted.
     * </pre>
     *
     * <code>repeated string direct_roles = 3;</code>
     *
     * @param values The directRoles to add.
     * @return This builder for chaining.
     */
    public Builder addAllDirectRoles(java.lang.Iterable<java.lang.String> values) {
      ensureDirectRolesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, directRoles_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Roles directly assigned to this user for this account or property.
     * Valid values:
     * predefinedRoles/read
     * predefinedRoles/collaborate
     * predefinedRoles/edit
     * predefinedRoles/manage-users
     * Excludes roles that are inherited from a higher-level entity, group,
     * or organization admin role.
     * A UserLink that is updated to have an empty list of direct_roles will be
     * deleted.
     * </pre>
     *
     * <code>repeated string direct_roles = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDirectRoles() {
      directRoles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Roles directly assigned to this user for this account or property.
     * Valid values:
     * predefinedRoles/read
     * predefinedRoles/collaborate
     * predefinedRoles/edit
     * predefinedRoles/manage-users
     * Excludes roles that are inherited from a higher-level entity, group,
     * or organization admin role.
     * A UserLink that is updated to have an empty list of direct_roles will be
     * deleted.
     * </pre>
     *
     * <code>repeated string direct_roles = 3;</code>
     *
     * @param value The bytes of the directRoles to add.
     * @return This builder for chaining.
     */
    public Builder addDirectRolesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureDirectRolesIsMutable();
      directRoles_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.UserLink)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.UserLink)
  private static final com.google.analytics.admin.v1alpha.UserLink DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.UserLink();
  }

  public static com.google.analytics.admin.v1alpha.UserLink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserLink> PARSER =
      new com.google.protobuf.AbstractParser<UserLink>() {
        @java.lang.Override
        public UserLink parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UserLink(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UserLink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserLink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.UserLink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
