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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * A virtual resource representing an overview of an account and
 * all its child GA4 properties.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.AccountSummary}
 */
public final class AccountSummary extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.AccountSummary)
    AccountSummaryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AccountSummary.newBuilder() to construct.
  private AccountSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AccountSummary() {
    name_ = "";
    account_ = "";
    displayName_ = "";
    propertySummaries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AccountSummary();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AccountSummary(
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

              account_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              displayName_ = s;
              break;
            }
          case 34:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                propertySummaries_ =
                    new java.util.ArrayList<com.google.analytics.admin.v1alpha.PropertySummary>();
                mutable_bitField0_ |= 0x00000001;
              }
              propertySummaries_.add(
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.PropertySummary.parser(),
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
        propertySummaries_ = java.util.Collections.unmodifiableList(propertySummaries_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_AccountSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_AccountSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.AccountSummary.class,
            com.google.analytics.admin.v1alpha.AccountSummary.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Resource name for this account summary.
   * Format: accountSummaries/{account_id}
   * Example: "accountSummaries/1000"
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
   * Resource name for this account summary.
   * Format: accountSummaries/{account_id}
   * Example: "accountSummaries/1000"
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

  public static final int ACCOUNT_FIELD_NUMBER = 2;
  private volatile java.lang.Object account_;
  /**
   *
   *
   * <pre>
   * Resource name of account referred to by this account summary
   * Format: accounts/{account_id}
   * Example: "accounts/1000"
   * </pre>
   *
   * <code>string account = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The account.
   */
  @java.lang.Override
  public java.lang.String getAccount() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      account_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of account referred to by this account summary
   * Format: accounts/{account_id}
   * Example: "accounts/1000"
   * </pre>
   *
   * <code>string account = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for account.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAccountBytes() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      account_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * Display name for the account referred to in this account summary.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Display name for the account referred to in this account summary.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROPERTY_SUMMARIES_FIELD_NUMBER = 4;
  private java.util.List<com.google.analytics.admin.v1alpha.PropertySummary> propertySummaries_;
  /**
   *
   *
   * <pre>
   * List of summaries for child accounts of this account.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.PropertySummary>
      getPropertySummariesList() {
    return propertySummaries_;
  }
  /**
   *
   *
   * <pre>
   * List of summaries for child accounts of this account.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.PropertySummaryOrBuilder>
      getPropertySummariesOrBuilderList() {
    return propertySummaries_;
  }
  /**
   *
   *
   * <pre>
   * List of summaries for child accounts of this account.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
   */
  @java.lang.Override
  public int getPropertySummariesCount() {
    return propertySummaries_.size();
  }
  /**
   *
   *
   * <pre>
   * List of summaries for child accounts of this account.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.PropertySummary getPropertySummaries(int index) {
    return propertySummaries_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of summaries for child accounts of this account.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.PropertySummaryOrBuilder getPropertySummariesOrBuilder(
      int index) {
    return propertySummaries_.get(index);
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
    if (!getAccountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, account_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, displayName_);
    }
    for (int i = 0; i < propertySummaries_.size(); i++) {
      output.writeMessage(4, propertySummaries_.get(i));
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
    if (!getAccountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, account_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, displayName_);
    }
    for (int i = 0; i < propertySummaries_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(4, propertySummaries_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.AccountSummary)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.AccountSummary other =
        (com.google.analytics.admin.v1alpha.AccountSummary) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getAccount().equals(other.getAccount())) return false;
    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (!getPropertySummariesList().equals(other.getPropertySummariesList())) return false;
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
    hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAccount().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    if (getPropertySummariesCount() > 0) {
      hash = (37 * hash) + PROPERTY_SUMMARIES_FIELD_NUMBER;
      hash = (53 * hash) + getPropertySummariesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary parseFrom(
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

  public static Builder newBuilder(com.google.analytics.admin.v1alpha.AccountSummary prototype) {
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
   * A virtual resource representing an overview of an account and
   * all its child GA4 properties.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.AccountSummary}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.AccountSummary)
      com.google.analytics.admin.v1alpha.AccountSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_AccountSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_AccountSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.AccountSummary.class,
              com.google.analytics.admin.v1alpha.AccountSummary.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.AccountSummary.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPropertySummariesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      account_ = "";

      displayName_ = "";

      if (propertySummariesBuilder_ == null) {
        propertySummaries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        propertySummariesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_AccountSummary_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AccountSummary getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.AccountSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AccountSummary build() {
      com.google.analytics.admin.v1alpha.AccountSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AccountSummary buildPartial() {
      com.google.analytics.admin.v1alpha.AccountSummary result =
          new com.google.analytics.admin.v1alpha.AccountSummary(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.account_ = account_;
      result.displayName_ = displayName_;
      if (propertySummariesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          propertySummaries_ = java.util.Collections.unmodifiableList(propertySummaries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.propertySummaries_ = propertySummaries_;
      } else {
        result.propertySummaries_ = propertySummariesBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.AccountSummary) {
        return mergeFrom((com.google.analytics.admin.v1alpha.AccountSummary) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.AccountSummary other) {
      if (other == com.google.analytics.admin.v1alpha.AccountSummary.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (propertySummariesBuilder_ == null) {
        if (!other.propertySummaries_.isEmpty()) {
          if (propertySummaries_.isEmpty()) {
            propertySummaries_ = other.propertySummaries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePropertySummariesIsMutable();
            propertySummaries_.addAll(other.propertySummaries_);
          }
          onChanged();
        }
      } else {
        if (!other.propertySummaries_.isEmpty()) {
          if (propertySummariesBuilder_.isEmpty()) {
            propertySummariesBuilder_.dispose();
            propertySummariesBuilder_ = null;
            propertySummaries_ = other.propertySummaries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            propertySummariesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPropertySummariesFieldBuilder()
                    : null;
          } else {
            propertySummariesBuilder_.addAllMessages(other.propertySummaries_);
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
      com.google.analytics.admin.v1alpha.AccountSummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.AccountSummary) e.getUnfinishedMessage();
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
     * Resource name for this account summary.
     * Format: accountSummaries/{account_id}
     * Example: "accountSummaries/1000"
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
     * Resource name for this account summary.
     * Format: accountSummaries/{account_id}
     * Example: "accountSummaries/1000"
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
     * Resource name for this account summary.
     * Format: accountSummaries/{account_id}
     * Example: "accountSummaries/1000"
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
     * Resource name for this account summary.
     * Format: accountSummaries/{account_id}
     * Example: "accountSummaries/1000"
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
     * Resource name for this account summary.
     * Format: accountSummaries/{account_id}
     * Example: "accountSummaries/1000"
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

    private java.lang.Object account_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of account referred to by this account summary
     * Format: accounts/{account_id}
     * Example: "accounts/1000"
     * </pre>
     *
     * <code>string account = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The account.
     */
    public java.lang.String getAccount() {
      java.lang.Object ref = account_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        account_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of account referred to by this account summary
     * Format: accounts/{account_id}
     * Example: "accounts/1000"
     * </pre>
     *
     * <code>string account = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for account.
     */
    public com.google.protobuf.ByteString getAccountBytes() {
      java.lang.Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of account referred to by this account summary
     * Format: accounts/{account_id}
     * Example: "accounts/1000"
     * </pre>
     *
     * <code>string account = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The account to set.
     * @return This builder for chaining.
     */
    public Builder setAccount(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      account_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of account referred to by this account summary
     * Format: accounts/{account_id}
     * Example: "accounts/1000"
     * </pre>
     *
     * <code>string account = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAccount() {

      account_ = getDefaultInstance().getAccount();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of account referred to by this account summary
     * Format: accounts/{account_id}
     * Example: "accounts/1000"
     * </pre>
     *
     * <code>string account = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for account to set.
     * @return This builder for chaining.
     */
    public Builder setAccountBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      account_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Display name for the account referred to in this account summary.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Display name for the account referred to in this account summary.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Display name for the account referred to in this account summary.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Display name for the account referred to in this account summary.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {

      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Display name for the account referred to in this account summary.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      displayName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.analytics.admin.v1alpha.PropertySummary> propertySummaries_ =
        java.util.Collections.emptyList();

    private void ensurePropertySummariesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        propertySummaries_ =
            new java.util.ArrayList<com.google.analytics.admin.v1alpha.PropertySummary>(
                propertySummaries_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.PropertySummary,
            com.google.analytics.admin.v1alpha.PropertySummary.Builder,
            com.google.analytics.admin.v1alpha.PropertySummaryOrBuilder>
        propertySummariesBuilder_;

    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.PropertySummary>
        getPropertySummariesList() {
      if (propertySummariesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(propertySummaries_);
      } else {
        return propertySummariesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public int getPropertySummariesCount() {
      if (propertySummariesBuilder_ == null) {
        return propertySummaries_.size();
      } else {
        return propertySummariesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public com.google.analytics.admin.v1alpha.PropertySummary getPropertySummaries(int index) {
      if (propertySummariesBuilder_ == null) {
        return propertySummaries_.get(index);
      } else {
        return propertySummariesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public Builder setPropertySummaries(
        int index, com.google.analytics.admin.v1alpha.PropertySummary value) {
      if (propertySummariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertySummariesIsMutable();
        propertySummaries_.set(index, value);
        onChanged();
      } else {
        propertySummariesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public Builder setPropertySummaries(
        int index, com.google.analytics.admin.v1alpha.PropertySummary.Builder builderForValue) {
      if (propertySummariesBuilder_ == null) {
        ensurePropertySummariesIsMutable();
        propertySummaries_.set(index, builderForValue.build());
        onChanged();
      } else {
        propertySummariesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public Builder addPropertySummaries(com.google.analytics.admin.v1alpha.PropertySummary value) {
      if (propertySummariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertySummariesIsMutable();
        propertySummaries_.add(value);
        onChanged();
      } else {
        propertySummariesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public Builder addPropertySummaries(
        int index, com.google.analytics.admin.v1alpha.PropertySummary value) {
      if (propertySummariesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertySummariesIsMutable();
        propertySummaries_.add(index, value);
        onChanged();
      } else {
        propertySummariesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public Builder addPropertySummaries(
        com.google.analytics.admin.v1alpha.PropertySummary.Builder builderForValue) {
      if (propertySummariesBuilder_ == null) {
        ensurePropertySummariesIsMutable();
        propertySummaries_.add(builderForValue.build());
        onChanged();
      } else {
        propertySummariesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public Builder addPropertySummaries(
        int index, com.google.analytics.admin.v1alpha.PropertySummary.Builder builderForValue) {
      if (propertySummariesBuilder_ == null) {
        ensurePropertySummariesIsMutable();
        propertySummaries_.add(index, builderForValue.build());
        onChanged();
      } else {
        propertySummariesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public Builder addAllPropertySummaries(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.PropertySummary> values) {
      if (propertySummariesBuilder_ == null) {
        ensurePropertySummariesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, propertySummaries_);
        onChanged();
      } else {
        propertySummariesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public Builder clearPropertySummaries() {
      if (propertySummariesBuilder_ == null) {
        propertySummaries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        propertySummariesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public Builder removePropertySummaries(int index) {
      if (propertySummariesBuilder_ == null) {
        ensurePropertySummariesIsMutable();
        propertySummaries_.remove(index);
        onChanged();
      } else {
        propertySummariesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public com.google.analytics.admin.v1alpha.PropertySummary.Builder getPropertySummariesBuilder(
        int index) {
      return getPropertySummariesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public com.google.analytics.admin.v1alpha.PropertySummaryOrBuilder
        getPropertySummariesOrBuilder(int index) {
      if (propertySummariesBuilder_ == null) {
        return propertySummaries_.get(index);
      } else {
        return propertySummariesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.PropertySummaryOrBuilder>
        getPropertySummariesOrBuilderList() {
      if (propertySummariesBuilder_ != null) {
        return propertySummariesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(propertySummaries_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public com.google.analytics.admin.v1alpha.PropertySummary.Builder
        addPropertySummariesBuilder() {
      return getPropertySummariesFieldBuilder()
          .addBuilder(com.google.analytics.admin.v1alpha.PropertySummary.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public com.google.analytics.admin.v1alpha.PropertySummary.Builder addPropertySummariesBuilder(
        int index) {
      return getPropertySummariesFieldBuilder()
          .addBuilder(
              index, com.google.analytics.admin.v1alpha.PropertySummary.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of summaries for child accounts of this account.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.PropertySummary property_summaries = 4;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.PropertySummary.Builder>
        getPropertySummariesBuilderList() {
      return getPropertySummariesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.PropertySummary,
            com.google.analytics.admin.v1alpha.PropertySummary.Builder,
            com.google.analytics.admin.v1alpha.PropertySummaryOrBuilder>
        getPropertySummariesFieldBuilder() {
      if (propertySummariesBuilder_ == null) {
        propertySummariesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.PropertySummary,
                com.google.analytics.admin.v1alpha.PropertySummary.Builder,
                com.google.analytics.admin.v1alpha.PropertySummaryOrBuilder>(
                propertySummaries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        propertySummaries_ = null;
      }
      return propertySummariesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.AccountSummary)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.AccountSummary)
  private static final com.google.analytics.admin.v1alpha.AccountSummary DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.AccountSummary();
  }

  public static com.google.analytics.admin.v1alpha.AccountSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountSummary> PARSER =
      new com.google.protobuf.AbstractParser<AccountSummary>() {
        @java.lang.Override
        public AccountSummary parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AccountSummary(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AccountSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AccountSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
