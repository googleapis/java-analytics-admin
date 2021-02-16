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

public interface UserLinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.UserLink)
    com.google.protobuf.MessageOrBuilder {

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
  java.lang.String getName();
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
  com.google.protobuf.ByteString getNameBytes();

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
  java.lang.String getEmailAddress();
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
  com.google.protobuf.ByteString getEmailAddressBytes();

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
  java.util.List<java.lang.String> getDirectRolesList();
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
  int getDirectRolesCount();
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
  java.lang.String getDirectRoles(int index);
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
  com.google.protobuf.ByteString getDirectRolesBytes(int index);
}
