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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Singleton resource under a WebDataStream, configuring measurement of
 * additional site interactions and content.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.EnhancedMeasurementSettings}
 */
public final class EnhancedMeasurementSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.EnhancedMeasurementSettings)
    EnhancedMeasurementSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EnhancedMeasurementSettings.newBuilder() to construct.
  private EnhancedMeasurementSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EnhancedMeasurementSettings() {
    name_ = "";
    searchQueryParameter_ = "";
    uriQueryParameter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EnhancedMeasurementSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private EnhancedMeasurementSettings(
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

              name_ = s;
              break;
            }
          case 16:
            {
              streamEnabled_ = input.readBool();
              break;
            }
          case 24:
            {
              pageViewsEnabled_ = input.readBool();
              break;
            }
          case 32:
            {
              scrollsEnabled_ = input.readBool();
              break;
            }
          case 40:
            {
              outboundClicksEnabled_ = input.readBool();
              break;
            }
          case 56:
            {
              siteSearchEnabled_ = input.readBool();
              break;
            }
          case 72:
            {
              videoEngagementEnabled_ = input.readBool();
              break;
            }
          case 80:
            {
              fileDownloadsEnabled_ = input.readBool();
              break;
            }
          case 96:
            {
              pageLoadsEnabled_ = input.readBool();
              break;
            }
          case 104:
            {
              pageChangesEnabled_ = input.readBool();
              break;
            }
          case 130:
            {
              java.lang.String s = input.readStringRequireUtf8();

              searchQueryParameter_ = s;
              break;
            }
          case 138:
            {
              java.lang.String s = input.readStringRequireUtf8();

              uriQueryParameter_ = s;
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
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_EnhancedMeasurementSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_EnhancedMeasurementSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings.class,
            com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this Data Stream.
   * Format:
   * properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings
   * Example: "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. Resource name of this Data Stream.
   * Format:
   * properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings
   * Example: "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

  public static final int STREAM_ENABLED_FIELD_NUMBER = 2;
  private boolean streamEnabled_;
  /**
   *
   *
   * <pre>
   * Indicates whether Enhanced Measurement Settings will be used to
   * automatically measure interactions and content on this web stream.
   * Changing this value does not affect the settings themselves, but determines
   * whether they are respected.
   * </pre>
   *
   * <code>bool stream_enabled = 2;</code>
   *
   * @return The streamEnabled.
   */
  @java.lang.Override
  public boolean getStreamEnabled() {
    return streamEnabled_;
  }

  public static final int PAGE_VIEWS_ENABLED_FIELD_NUMBER = 3;
  private boolean pageViewsEnabled_;
  /**
   *
   *
   * <pre>
   * Output only. If enabled, capture a page view event each time a page loads or the
   * website changes the browser history state.
   * </pre>
   *
   * <code>bool page_views_enabled = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The pageViewsEnabled.
   */
  @java.lang.Override
  public boolean getPageViewsEnabled() {
    return pageViewsEnabled_;
  }

  public static final int SCROLLS_ENABLED_FIELD_NUMBER = 4;
  private boolean scrollsEnabled_;
  /**
   *
   *
   * <pre>
   * If enabled, capture scroll events each time a visitor gets to the bottom of
   * a page.
   * </pre>
   *
   * <code>bool scrolls_enabled = 4;</code>
   *
   * @return The scrollsEnabled.
   */
  @java.lang.Override
  public boolean getScrollsEnabled() {
    return scrollsEnabled_;
  }

  public static final int OUTBOUND_CLICKS_ENABLED_FIELD_NUMBER = 5;
  private boolean outboundClicksEnabled_;
  /**
   *
   *
   * <pre>
   * If enabled, capture an outbound click event each time a visitor clicks a
   * link that leads them away from your domain.
   * </pre>
   *
   * <code>bool outbound_clicks_enabled = 5;</code>
   *
   * @return The outboundClicksEnabled.
   */
  @java.lang.Override
  public boolean getOutboundClicksEnabled() {
    return outboundClicksEnabled_;
  }

  public static final int SITE_SEARCH_ENABLED_FIELD_NUMBER = 7;
  private boolean siteSearchEnabled_;
  /**
   *
   *
   * <pre>
   * If enabled, capture a view search results event each time a visitor
   * performs a search on your site (based on a query parameter).
   * </pre>
   *
   * <code>bool site_search_enabled = 7;</code>
   *
   * @return The siteSearchEnabled.
   */
  @java.lang.Override
  public boolean getSiteSearchEnabled() {
    return siteSearchEnabled_;
  }

  public static final int VIDEO_ENGAGEMENT_ENABLED_FIELD_NUMBER = 9;
  private boolean videoEngagementEnabled_;
  /**
   *
   *
   * <pre>
   * If enabled, capture video play, progress, and complete events as visitors
   * view embedded videos on your site.
   * </pre>
   *
   * <code>bool video_engagement_enabled = 9;</code>
   *
   * @return The videoEngagementEnabled.
   */
  @java.lang.Override
  public boolean getVideoEngagementEnabled() {
    return videoEngagementEnabled_;
  }

  public static final int FILE_DOWNLOADS_ENABLED_FIELD_NUMBER = 10;
  private boolean fileDownloadsEnabled_;
  /**
   *
   *
   * <pre>
   * If enabled, capture a file download event each time a link is clicked with
   * a common document, compressed file, application, video, or audio extension.
   * </pre>
   *
   * <code>bool file_downloads_enabled = 10;</code>
   *
   * @return The fileDownloadsEnabled.
   */
  @java.lang.Override
  public boolean getFileDownloadsEnabled() {
    return fileDownloadsEnabled_;
  }

  public static final int PAGE_LOADS_ENABLED_FIELD_NUMBER = 12;
  private boolean pageLoadsEnabled_;
  /**
   *
   *
   * <pre>
   * Output only. If enabled, capture a page view event each time a page loads.
   * </pre>
   *
   * <code>bool page_loads_enabled = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The pageLoadsEnabled.
   */
  @java.lang.Override
  public boolean getPageLoadsEnabled() {
    return pageLoadsEnabled_;
  }

  public static final int PAGE_CHANGES_ENABLED_FIELD_NUMBER = 13;
  private boolean pageChangesEnabled_;
  /**
   *
   *
   * <pre>
   * If enabled, capture a page view event each time the website changes the
   * browser history state.
   * </pre>
   *
   * <code>bool page_changes_enabled = 13;</code>
   *
   * @return The pageChangesEnabled.
   */
  @java.lang.Override
  public boolean getPageChangesEnabled() {
    return pageChangesEnabled_;
  }

  public static final int SEARCH_QUERY_PARAMETER_FIELD_NUMBER = 16;
  private volatile java.lang.Object searchQueryParameter_;
  /**
   *
   *
   * <pre>
   * Required. URL query parameters to interpret as site search parameters.
   * Max length is 1024 characters. Must not be empty.
   * </pre>
   *
   * <code>string search_query_parameter = 16 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The searchQueryParameter.
   */
  @java.lang.Override
  public java.lang.String getSearchQueryParameter() {
    java.lang.Object ref = searchQueryParameter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      searchQueryParameter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. URL query parameters to interpret as site search parameters.
   * Max length is 1024 characters. Must not be empty.
   * </pre>
   *
   * <code>string search_query_parameter = 16 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for searchQueryParameter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSearchQueryParameterBytes() {
    java.lang.Object ref = searchQueryParameter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      searchQueryParameter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_QUERY_PARAMETER_FIELD_NUMBER = 17;
  private volatile java.lang.Object uriQueryParameter_;
  /**
   *
   *
   * <pre>
   * Additional URL query parameters.
   * Max length is 1024 characters.
   * </pre>
   *
   * <code>string uri_query_parameter = 17;</code>
   *
   * @return The uriQueryParameter.
   */
  @java.lang.Override
  public java.lang.String getUriQueryParameter() {
    java.lang.Object ref = uriQueryParameter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uriQueryParameter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Additional URL query parameters.
   * Max length is 1024 characters.
   * </pre>
   *
   * <code>string uri_query_parameter = 17;</code>
   *
   * @return The bytes for uriQueryParameter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUriQueryParameterBytes() {
    java.lang.Object ref = uriQueryParameter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uriQueryParameter_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (streamEnabled_ != false) {
      output.writeBool(2, streamEnabled_);
    }
    if (pageViewsEnabled_ != false) {
      output.writeBool(3, pageViewsEnabled_);
    }
    if (scrollsEnabled_ != false) {
      output.writeBool(4, scrollsEnabled_);
    }
    if (outboundClicksEnabled_ != false) {
      output.writeBool(5, outboundClicksEnabled_);
    }
    if (siteSearchEnabled_ != false) {
      output.writeBool(7, siteSearchEnabled_);
    }
    if (videoEngagementEnabled_ != false) {
      output.writeBool(9, videoEngagementEnabled_);
    }
    if (fileDownloadsEnabled_ != false) {
      output.writeBool(10, fileDownloadsEnabled_);
    }
    if (pageLoadsEnabled_ != false) {
      output.writeBool(12, pageLoadsEnabled_);
    }
    if (pageChangesEnabled_ != false) {
      output.writeBool(13, pageChangesEnabled_);
    }
    if (!getSearchQueryParameterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 16, searchQueryParameter_);
    }
    if (!getUriQueryParameterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 17, uriQueryParameter_);
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
    if (streamEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, streamEnabled_);
    }
    if (pageViewsEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, pageViewsEnabled_);
    }
    if (scrollsEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, scrollsEnabled_);
    }
    if (outboundClicksEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, outboundClicksEnabled_);
    }
    if (siteSearchEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, siteSearchEnabled_);
    }
    if (videoEngagementEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(9, videoEngagementEnabled_);
    }
    if (fileDownloadsEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(10, fileDownloadsEnabled_);
    }
    if (pageLoadsEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(12, pageLoadsEnabled_);
    }
    if (pageChangesEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(13, pageChangesEnabled_);
    }
    if (!getSearchQueryParameterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(16, searchQueryParameter_);
    }
    if (!getUriQueryParameterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(17, uriQueryParameter_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings other =
        (com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings) obj;

    if (!getName().equals(other.getName())) return false;
    if (getStreamEnabled() != other.getStreamEnabled()) return false;
    if (getPageViewsEnabled() != other.getPageViewsEnabled()) return false;
    if (getScrollsEnabled() != other.getScrollsEnabled()) return false;
    if (getOutboundClicksEnabled() != other.getOutboundClicksEnabled()) return false;
    if (getSiteSearchEnabled() != other.getSiteSearchEnabled()) return false;
    if (getVideoEngagementEnabled() != other.getVideoEngagementEnabled()) return false;
    if (getFileDownloadsEnabled() != other.getFileDownloadsEnabled()) return false;
    if (getPageLoadsEnabled() != other.getPageLoadsEnabled()) return false;
    if (getPageChangesEnabled() != other.getPageChangesEnabled()) return false;
    if (!getSearchQueryParameter().equals(other.getSearchQueryParameter())) return false;
    if (!getUriQueryParameter().equals(other.getUriQueryParameter())) return false;
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
    hash = (37 * hash) + STREAM_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getStreamEnabled());
    hash = (37 * hash) + PAGE_VIEWS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPageViewsEnabled());
    hash = (37 * hash) + SCROLLS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getScrollsEnabled());
    hash = (37 * hash) + OUTBOUND_CLICKS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getOutboundClicksEnabled());
    hash = (37 * hash) + SITE_SEARCH_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSiteSearchEnabled());
    hash = (37 * hash) + VIDEO_ENGAGEMENT_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getVideoEngagementEnabled());
    hash = (37 * hash) + FILE_DOWNLOADS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getFileDownloadsEnabled());
    hash = (37 * hash) + PAGE_LOADS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPageLoadsEnabled());
    hash = (37 * hash) + PAGE_CHANGES_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPageChangesEnabled());
    hash = (37 * hash) + SEARCH_QUERY_PARAMETER_FIELD_NUMBER;
    hash = (53 * hash) + getSearchQueryParameter().hashCode();
    hash = (37 * hash) + URI_QUERY_PARAMETER_FIELD_NUMBER;
    hash = (53 * hash) + getUriQueryParameter().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parseFrom(
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
      com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings prototype) {
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
   * Singleton resource under a WebDataStream, configuring measurement of
   * additional site interactions and content.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.EnhancedMeasurementSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.EnhancedMeasurementSettings)
      com.google.analytics.admin.v1alpha.EnhancedMeasurementSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_EnhancedMeasurementSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_EnhancedMeasurementSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings.class,
              com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings.newBuilder()
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

      streamEnabled_ = false;

      pageViewsEnabled_ = false;

      scrollsEnabled_ = false;

      outboundClicksEnabled_ = false;

      siteSearchEnabled_ = false;

      videoEngagementEnabled_ = false;

      fileDownloadsEnabled_ = false;

      pageLoadsEnabled_ = false;

      pageChangesEnabled_ = false;

      searchQueryParameter_ = "";

      uriQueryParameter_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_EnhancedMeasurementSettings_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings build() {
      com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings buildPartial() {
      com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings result =
          new com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings(this);
      result.name_ = name_;
      result.streamEnabled_ = streamEnabled_;
      result.pageViewsEnabled_ = pageViewsEnabled_;
      result.scrollsEnabled_ = scrollsEnabled_;
      result.outboundClicksEnabled_ = outboundClicksEnabled_;
      result.siteSearchEnabled_ = siteSearchEnabled_;
      result.videoEngagementEnabled_ = videoEngagementEnabled_;
      result.fileDownloadsEnabled_ = fileDownloadsEnabled_;
      result.pageLoadsEnabled_ = pageLoadsEnabled_;
      result.pageChangesEnabled_ = pageChangesEnabled_;
      result.searchQueryParameter_ = searchQueryParameter_;
      result.uriQueryParameter_ = uriQueryParameter_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings) {
        return mergeFrom((com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings other) {
      if (other
          == com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getStreamEnabled() != false) {
        setStreamEnabled(other.getStreamEnabled());
      }
      if (other.getPageViewsEnabled() != false) {
        setPageViewsEnabled(other.getPageViewsEnabled());
      }
      if (other.getScrollsEnabled() != false) {
        setScrollsEnabled(other.getScrollsEnabled());
      }
      if (other.getOutboundClicksEnabled() != false) {
        setOutboundClicksEnabled(other.getOutboundClicksEnabled());
      }
      if (other.getSiteSearchEnabled() != false) {
        setSiteSearchEnabled(other.getSiteSearchEnabled());
      }
      if (other.getVideoEngagementEnabled() != false) {
        setVideoEngagementEnabled(other.getVideoEngagementEnabled());
      }
      if (other.getFileDownloadsEnabled() != false) {
        setFileDownloadsEnabled(other.getFileDownloadsEnabled());
      }
      if (other.getPageLoadsEnabled() != false) {
        setPageLoadsEnabled(other.getPageLoadsEnabled());
      }
      if (other.getPageChangesEnabled() != false) {
        setPageChangesEnabled(other.getPageChangesEnabled());
      }
      if (!other.getSearchQueryParameter().isEmpty()) {
        searchQueryParameter_ = other.searchQueryParameter_;
        onChanged();
      }
      if (!other.getUriQueryParameter().isEmpty()) {
        uriQueryParameter_ = other.uriQueryParameter_;
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
      com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings)
                e.getUnfinishedMessage();
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
     *
     *
     * <pre>
     * Output only. Resource name of this Data Stream.
     * Format:
     * properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings
     * Example: "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name of this Data Stream.
     * Format:
     * properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings
     * Example: "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name of this Data Stream.
     * Format:
     * properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings
     * Example: "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name of this Data Stream.
     * Format:
     * properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings
     * Example: "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name of this Data Stream.
     * Format:
     * properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings
     * Example: "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

    private boolean streamEnabled_;
    /**
     *
     *
     * <pre>
     * Indicates whether Enhanced Measurement Settings will be used to
     * automatically measure interactions and content on this web stream.
     * Changing this value does not affect the settings themselves, but determines
     * whether they are respected.
     * </pre>
     *
     * <code>bool stream_enabled = 2;</code>
     *
     * @return The streamEnabled.
     */
    @java.lang.Override
    public boolean getStreamEnabled() {
      return streamEnabled_;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether Enhanced Measurement Settings will be used to
     * automatically measure interactions and content on this web stream.
     * Changing this value does not affect the settings themselves, but determines
     * whether they are respected.
     * </pre>
     *
     * <code>bool stream_enabled = 2;</code>
     *
     * @param value The streamEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setStreamEnabled(boolean value) {

      streamEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether Enhanced Measurement Settings will be used to
     * automatically measure interactions and content on this web stream.
     * Changing this value does not affect the settings themselves, but determines
     * whether they are respected.
     * </pre>
     *
     * <code>bool stream_enabled = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStreamEnabled() {

      streamEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean pageViewsEnabled_;
    /**
     *
     *
     * <pre>
     * Output only. If enabled, capture a page view event each time a page loads or the
     * website changes the browser history state.
     * </pre>
     *
     * <code>bool page_views_enabled = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The pageViewsEnabled.
     */
    @java.lang.Override
    public boolean getPageViewsEnabled() {
      return pageViewsEnabled_;
    }
    /**
     *
     *
     * <pre>
     * Output only. If enabled, capture a page view event each time a page loads or the
     * website changes the browser history state.
     * </pre>
     *
     * <code>bool page_views_enabled = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The pageViewsEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setPageViewsEnabled(boolean value) {

      pageViewsEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. If enabled, capture a page view event each time a page loads or the
     * website changes the browser history state.
     * </pre>
     *
     * <code>bool page_views_enabled = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageViewsEnabled() {

      pageViewsEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean scrollsEnabled_;
    /**
     *
     *
     * <pre>
     * If enabled, capture scroll events each time a visitor gets to the bottom of
     * a page.
     * </pre>
     *
     * <code>bool scrolls_enabled = 4;</code>
     *
     * @return The scrollsEnabled.
     */
    @java.lang.Override
    public boolean getScrollsEnabled() {
      return scrollsEnabled_;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture scroll events each time a visitor gets to the bottom of
     * a page.
     * </pre>
     *
     * <code>bool scrolls_enabled = 4;</code>
     *
     * @param value The scrollsEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setScrollsEnabled(boolean value) {

      scrollsEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture scroll events each time a visitor gets to the bottom of
     * a page.
     * </pre>
     *
     * <code>bool scrolls_enabled = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScrollsEnabled() {

      scrollsEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean outboundClicksEnabled_;
    /**
     *
     *
     * <pre>
     * If enabled, capture an outbound click event each time a visitor clicks a
     * link that leads them away from your domain.
     * </pre>
     *
     * <code>bool outbound_clicks_enabled = 5;</code>
     *
     * @return The outboundClicksEnabled.
     */
    @java.lang.Override
    public boolean getOutboundClicksEnabled() {
      return outboundClicksEnabled_;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture an outbound click event each time a visitor clicks a
     * link that leads them away from your domain.
     * </pre>
     *
     * <code>bool outbound_clicks_enabled = 5;</code>
     *
     * @param value The outboundClicksEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setOutboundClicksEnabled(boolean value) {

      outboundClicksEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture an outbound click event each time a visitor clicks a
     * link that leads them away from your domain.
     * </pre>
     *
     * <code>bool outbound_clicks_enabled = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOutboundClicksEnabled() {

      outboundClicksEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean siteSearchEnabled_;
    /**
     *
     *
     * <pre>
     * If enabled, capture a view search results event each time a visitor
     * performs a search on your site (based on a query parameter).
     * </pre>
     *
     * <code>bool site_search_enabled = 7;</code>
     *
     * @return The siteSearchEnabled.
     */
    @java.lang.Override
    public boolean getSiteSearchEnabled() {
      return siteSearchEnabled_;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture a view search results event each time a visitor
     * performs a search on your site (based on a query parameter).
     * </pre>
     *
     * <code>bool site_search_enabled = 7;</code>
     *
     * @param value The siteSearchEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setSiteSearchEnabled(boolean value) {

      siteSearchEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture a view search results event each time a visitor
     * performs a search on your site (based on a query parameter).
     * </pre>
     *
     * <code>bool site_search_enabled = 7;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSiteSearchEnabled() {

      siteSearchEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean videoEngagementEnabled_;
    /**
     *
     *
     * <pre>
     * If enabled, capture video play, progress, and complete events as visitors
     * view embedded videos on your site.
     * </pre>
     *
     * <code>bool video_engagement_enabled = 9;</code>
     *
     * @return The videoEngagementEnabled.
     */
    @java.lang.Override
    public boolean getVideoEngagementEnabled() {
      return videoEngagementEnabled_;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture video play, progress, and complete events as visitors
     * view embedded videos on your site.
     * </pre>
     *
     * <code>bool video_engagement_enabled = 9;</code>
     *
     * @param value The videoEngagementEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setVideoEngagementEnabled(boolean value) {

      videoEngagementEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture video play, progress, and complete events as visitors
     * view embedded videos on your site.
     * </pre>
     *
     * <code>bool video_engagement_enabled = 9;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVideoEngagementEnabled() {

      videoEngagementEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean fileDownloadsEnabled_;
    /**
     *
     *
     * <pre>
     * If enabled, capture a file download event each time a link is clicked with
     * a common document, compressed file, application, video, or audio extension.
     * </pre>
     *
     * <code>bool file_downloads_enabled = 10;</code>
     *
     * @return The fileDownloadsEnabled.
     */
    @java.lang.Override
    public boolean getFileDownloadsEnabled() {
      return fileDownloadsEnabled_;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture a file download event each time a link is clicked with
     * a common document, compressed file, application, video, or audio extension.
     * </pre>
     *
     * <code>bool file_downloads_enabled = 10;</code>
     *
     * @param value The fileDownloadsEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setFileDownloadsEnabled(boolean value) {

      fileDownloadsEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture a file download event each time a link is clicked with
     * a common document, compressed file, application, video, or audio extension.
     * </pre>
     *
     * <code>bool file_downloads_enabled = 10;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFileDownloadsEnabled() {

      fileDownloadsEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean pageLoadsEnabled_;
    /**
     *
     *
     * <pre>
     * Output only. If enabled, capture a page view event each time a page loads.
     * </pre>
     *
     * <code>bool page_loads_enabled = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The pageLoadsEnabled.
     */
    @java.lang.Override
    public boolean getPageLoadsEnabled() {
      return pageLoadsEnabled_;
    }
    /**
     *
     *
     * <pre>
     * Output only. If enabled, capture a page view event each time a page loads.
     * </pre>
     *
     * <code>bool page_loads_enabled = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The pageLoadsEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setPageLoadsEnabled(boolean value) {

      pageLoadsEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. If enabled, capture a page view event each time a page loads.
     * </pre>
     *
     * <code>bool page_loads_enabled = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageLoadsEnabled() {

      pageLoadsEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean pageChangesEnabled_;
    /**
     *
     *
     * <pre>
     * If enabled, capture a page view event each time the website changes the
     * browser history state.
     * </pre>
     *
     * <code>bool page_changes_enabled = 13;</code>
     *
     * @return The pageChangesEnabled.
     */
    @java.lang.Override
    public boolean getPageChangesEnabled() {
      return pageChangesEnabled_;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture a page view event each time the website changes the
     * browser history state.
     * </pre>
     *
     * <code>bool page_changes_enabled = 13;</code>
     *
     * @param value The pageChangesEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setPageChangesEnabled(boolean value) {

      pageChangesEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If enabled, capture a page view event each time the website changes the
     * browser history state.
     * </pre>
     *
     * <code>bool page_changes_enabled = 13;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageChangesEnabled() {

      pageChangesEnabled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object searchQueryParameter_ = "";
    /**
     *
     *
     * <pre>
     * Required. URL query parameters to interpret as site search parameters.
     * Max length is 1024 characters. Must not be empty.
     * </pre>
     *
     * <code>string search_query_parameter = 16 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The searchQueryParameter.
     */
    public java.lang.String getSearchQueryParameter() {
      java.lang.Object ref = searchQueryParameter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        searchQueryParameter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. URL query parameters to interpret as site search parameters.
     * Max length is 1024 characters. Must not be empty.
     * </pre>
     *
     * <code>string search_query_parameter = 16 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for searchQueryParameter.
     */
    public com.google.protobuf.ByteString getSearchQueryParameterBytes() {
      java.lang.Object ref = searchQueryParameter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        searchQueryParameter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. URL query parameters to interpret as site search parameters.
     * Max length is 1024 characters. Must not be empty.
     * </pre>
     *
     * <code>string search_query_parameter = 16 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The searchQueryParameter to set.
     * @return This builder for chaining.
     */
    public Builder setSearchQueryParameter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      searchQueryParameter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. URL query parameters to interpret as site search parameters.
     * Max length is 1024 characters. Must not be empty.
     * </pre>
     *
     * <code>string search_query_parameter = 16 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSearchQueryParameter() {

      searchQueryParameter_ = getDefaultInstance().getSearchQueryParameter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. URL query parameters to interpret as site search parameters.
     * Max length is 1024 characters. Must not be empty.
     * </pre>
     *
     * <code>string search_query_parameter = 16 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for searchQueryParameter to set.
     * @return This builder for chaining.
     */
    public Builder setSearchQueryParameterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      searchQueryParameter_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object uriQueryParameter_ = "";
    /**
     *
     *
     * <pre>
     * Additional URL query parameters.
     * Max length is 1024 characters.
     * </pre>
     *
     * <code>string uri_query_parameter = 17;</code>
     *
     * @return The uriQueryParameter.
     */
    public java.lang.String getUriQueryParameter() {
      java.lang.Object ref = uriQueryParameter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uriQueryParameter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Additional URL query parameters.
     * Max length is 1024 characters.
     * </pre>
     *
     * <code>string uri_query_parameter = 17;</code>
     *
     * @return The bytes for uriQueryParameter.
     */
    public com.google.protobuf.ByteString getUriQueryParameterBytes() {
      java.lang.Object ref = uriQueryParameter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uriQueryParameter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Additional URL query parameters.
     * Max length is 1024 characters.
     * </pre>
     *
     * <code>string uri_query_parameter = 17;</code>
     *
     * @param value The uriQueryParameter to set.
     * @return This builder for chaining.
     */
    public Builder setUriQueryParameter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      uriQueryParameter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional URL query parameters.
     * Max length is 1024 characters.
     * </pre>
     *
     * <code>string uri_query_parameter = 17;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUriQueryParameter() {

      uriQueryParameter_ = getDefaultInstance().getUriQueryParameter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Additional URL query parameters.
     * Max length is 1024 characters.
     * </pre>
     *
     * <code>string uri_query_parameter = 17;</code>
     *
     * @param value The bytes for uriQueryParameter to set.
     * @return This builder for chaining.
     */
    public Builder setUriQueryParameterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      uriQueryParameter_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.EnhancedMeasurementSettings)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.EnhancedMeasurementSettings)
  private static final com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings();
  }

  public static com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnhancedMeasurementSettings> PARSER =
      new com.google.protobuf.AbstractParser<EnhancedMeasurementSettings>() {
        @java.lang.Override
        public EnhancedMeasurementSettings parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new EnhancedMeasurementSettings(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<EnhancedMeasurementSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnhancedMeasurementSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
