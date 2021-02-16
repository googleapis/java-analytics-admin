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
 * Request message for ProvisionAccountTicket RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ProvisionAccountTicketRequest}
 */
public final class ProvisionAccountTicketRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ProvisionAccountTicketRequest)
    ProvisionAccountTicketRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProvisionAccountTicketRequest.newBuilder() to construct.
  private ProvisionAccountTicketRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProvisionAccountTicketRequest() {
    redirectUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProvisionAccountTicketRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ProvisionAccountTicketRequest(
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
              com.google.analytics.admin.v1alpha.Account.Builder subBuilder = null;
              if (account_ != null) {
                subBuilder = account_.toBuilder();
              }
              account_ =
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.Account.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(account_);
                account_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              redirectUri_ = s;
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
        .internal_static_google_analytics_admin_v1alpha_ProvisionAccountTicketRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ProvisionAccountTicketRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest.class,
            com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest.Builder.class);
  }

  public static final int ACCOUNT_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1alpha.Account account_;
  /**
   *
   *
   * <pre>
   * The account to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
   *
   * @return Whether the account field is set.
   */
  @java.lang.Override
  public boolean hasAccount() {
    return account_ != null;
  }
  /**
   *
   *
   * <pre>
   * The account to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
   *
   * @return The account.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.Account getAccount() {
    return account_ == null
        ? com.google.analytics.admin.v1alpha.Account.getDefaultInstance()
        : account_;
  }
  /**
   *
   *
   * <pre>
   * The account to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AccountOrBuilder getAccountOrBuilder() {
    return getAccount();
  }

  public static final int REDIRECT_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object redirectUri_;
  /**
   *
   *
   * <pre>
   * Redirect URI where the user will be sent after accepting Terms of Service.
   * Must be configured in Developers Console as a Redirect URI
   * </pre>
   *
   * <code>string redirect_uri = 2;</code>
   *
   * @return The redirectUri.
   */
  @java.lang.Override
  public java.lang.String getRedirectUri() {
    java.lang.Object ref = redirectUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      redirectUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Redirect URI where the user will be sent after accepting Terms of Service.
   * Must be configured in Developers Console as a Redirect URI
   * </pre>
   *
   * <code>string redirect_uri = 2;</code>
   *
   * @return The bytes for redirectUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRedirectUriBytes() {
    java.lang.Object ref = redirectUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      redirectUri_ = b;
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
    if (account_ != null) {
      output.writeMessage(1, getAccount());
    }
    if (!getRedirectUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, redirectUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (account_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAccount());
    }
    if (!getRedirectUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, redirectUri_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest other =
        (com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest) obj;

    if (hasAccount() != other.hasAccount()) return false;
    if (hasAccount()) {
      if (!getAccount().equals(other.getAccount())) return false;
    }
    if (!getRedirectUri().equals(other.getRedirectUri())) return false;
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
    if (hasAccount()) {
      hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAccount().hashCode();
    }
    hash = (37 * hash) + REDIRECT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getRedirectUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest prototype) {
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
   * Request message for ProvisionAccountTicket RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ProvisionAccountTicketRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ProvisionAccountTicketRequest)
      com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ProvisionAccountTicketRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ProvisionAccountTicketRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest.class,
              com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest.newBuilder()
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
      if (accountBuilder_ == null) {
        account_ = null;
      } else {
        account_ = null;
        accountBuilder_ = null;
      }
      redirectUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ProvisionAccountTicketRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest build() {
      com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest buildPartial() {
      com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest result =
          new com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest(this);
      if (accountBuilder_ == null) {
        result.account_ = account_;
      } else {
        result.account_ = accountBuilder_.build();
      }
      result.redirectUri_ = redirectUri_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest.getDefaultInstance())
        return this;
      if (other.hasAccount()) {
        mergeAccount(other.getAccount());
      }
      if (!other.getRedirectUri().isEmpty()) {
        redirectUri_ = other.redirectUri_;
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
      com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.analytics.admin.v1alpha.Account account_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.Account,
            com.google.analytics.admin.v1alpha.Account.Builder,
            com.google.analytics.admin.v1alpha.AccountOrBuilder>
        accountBuilder_;
    /**
     *
     *
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
     *
     * @return Whether the account field is set.
     */
    public boolean hasAccount() {
      return accountBuilder_ != null || account_ != null;
    }
    /**
     *
     *
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
     *
     * @return The account.
     */
    public com.google.analytics.admin.v1alpha.Account getAccount() {
      if (accountBuilder_ == null) {
        return account_ == null
            ? com.google.analytics.admin.v1alpha.Account.getDefaultInstance()
            : account_;
      } else {
        return accountBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
     */
    public Builder setAccount(com.google.analytics.admin.v1alpha.Account value) {
      if (accountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        account_ = value;
        onChanged();
      } else {
        accountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
     */
    public Builder setAccount(com.google.analytics.admin.v1alpha.Account.Builder builderForValue) {
      if (accountBuilder_ == null) {
        account_ = builderForValue.build();
        onChanged();
      } else {
        accountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
     */
    public Builder mergeAccount(com.google.analytics.admin.v1alpha.Account value) {
      if (accountBuilder_ == null) {
        if (account_ != null) {
          account_ =
              com.google.analytics.admin.v1alpha.Account.newBuilder(account_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          account_ = value;
        }
        onChanged();
      } else {
        accountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
     */
    public Builder clearAccount() {
      if (accountBuilder_ == null) {
        account_ = null;
        onChanged();
      } else {
        account_ = null;
        accountBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.Account.Builder getAccountBuilder() {

      onChanged();
      return getAccountFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AccountOrBuilder getAccountOrBuilder() {
      if (accountBuilder_ != null) {
        return accountBuilder_.getMessageOrBuilder();
      } else {
        return account_ == null
            ? com.google.analytics.admin.v1alpha.Account.getDefaultInstance()
            : account_;
      }
    }
    /**
     *
     *
     * <pre>
     * The account to create.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.Account account = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.Account,
            com.google.analytics.admin.v1alpha.Account.Builder,
            com.google.analytics.admin.v1alpha.AccountOrBuilder>
        getAccountFieldBuilder() {
      if (accountBuilder_ == null) {
        accountBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.Account,
                com.google.analytics.admin.v1alpha.Account.Builder,
                com.google.analytics.admin.v1alpha.AccountOrBuilder>(
                getAccount(), getParentForChildren(), isClean());
        account_ = null;
      }
      return accountBuilder_;
    }

    private java.lang.Object redirectUri_ = "";
    /**
     *
     *
     * <pre>
     * Redirect URI where the user will be sent after accepting Terms of Service.
     * Must be configured in Developers Console as a Redirect URI
     * </pre>
     *
     * <code>string redirect_uri = 2;</code>
     *
     * @return The redirectUri.
     */
    public java.lang.String getRedirectUri() {
      java.lang.Object ref = redirectUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        redirectUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Redirect URI where the user will be sent after accepting Terms of Service.
     * Must be configured in Developers Console as a Redirect URI
     * </pre>
     *
     * <code>string redirect_uri = 2;</code>
     *
     * @return The bytes for redirectUri.
     */
    public com.google.protobuf.ByteString getRedirectUriBytes() {
      java.lang.Object ref = redirectUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        redirectUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Redirect URI where the user will be sent after accepting Terms of Service.
     * Must be configured in Developers Console as a Redirect URI
     * </pre>
     *
     * <code>string redirect_uri = 2;</code>
     *
     * @param value The redirectUri to set.
     * @return This builder for chaining.
     */
    public Builder setRedirectUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      redirectUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Redirect URI where the user will be sent after accepting Terms of Service.
     * Must be configured in Developers Console as a Redirect URI
     * </pre>
     *
     * <code>string redirect_uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRedirectUri() {

      redirectUri_ = getDefaultInstance().getRedirectUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Redirect URI where the user will be sent after accepting Terms of Service.
     * Must be configured in Developers Console as a Redirect URI
     * </pre>
     *
     * <code>string redirect_uri = 2;</code>
     *
     * @param value The bytes for redirectUri to set.
     * @return This builder for chaining.
     */
    public Builder setRedirectUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      redirectUri_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ProvisionAccountTicketRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ProvisionAccountTicketRequest)
  private static final com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest();
  }

  public static com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProvisionAccountTicketRequest> PARSER =
      new com.google.protobuf.AbstractParser<ProvisionAccountTicketRequest>() {
        @java.lang.Override
        public ProvisionAccountTicketRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProvisionAccountTicketRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ProvisionAccountTicketRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProvisionAccountTicketRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
