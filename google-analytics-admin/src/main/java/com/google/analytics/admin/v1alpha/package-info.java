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

/**
 * A client to Google Analytics Admin API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>=========================== AnalyticsAdminServiceClient ===========================
 *
 * <p>Service Description: Service Interface for the Analytics Admin API (GA4).
 *
 * <p>Sample for AnalyticsAdminServiceClient:
 *
 * <pre>
 * <code>
 * try (AnalyticsAdminServiceClient analyticsAdminServiceClient = AnalyticsAdminServiceClient.create()) {
 *   AccountName name = AccountName.of("[ACCOUNT]");
 *   Account response = analyticsAdminServiceClient.getAccount(name);
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.analytics.admin.v1alpha;

import javax.annotation.Generated;
