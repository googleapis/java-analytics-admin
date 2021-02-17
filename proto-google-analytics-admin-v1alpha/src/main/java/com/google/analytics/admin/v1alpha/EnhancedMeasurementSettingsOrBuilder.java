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

public interface EnhancedMeasurementSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.EnhancedMeasurementSettings)
    com.google.protobuf.MessageOrBuilder {

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
  java.lang.String getName();
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
  com.google.protobuf.ByteString getNameBytes();

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
  boolean getStreamEnabled();

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
  boolean getPageViewsEnabled();

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
  boolean getScrollsEnabled();

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
  boolean getOutboundClicksEnabled();

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
  boolean getSiteSearchEnabled();

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
  boolean getVideoEngagementEnabled();

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
  boolean getFileDownloadsEnabled();

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
  boolean getPageLoadsEnabled();

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
  boolean getPageChangesEnabled();

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
  java.lang.String getSearchQueryParameter();
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
  com.google.protobuf.ByteString getSearchQueryParameterBytes();

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
  java.lang.String getUriQueryParameter();
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
  com.google.protobuf.ByteString getUriQueryParameterBytes();
}
