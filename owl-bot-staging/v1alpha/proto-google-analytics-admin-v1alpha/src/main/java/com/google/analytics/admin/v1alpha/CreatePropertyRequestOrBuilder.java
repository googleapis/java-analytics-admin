// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface CreatePropertyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CreatePropertyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The property to create.
   * Note: the supplied property must specify its parent.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.Property property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the property field is set.
   */
  boolean hasProperty();
  /**
   * <pre>
   * Required. The property to create.
   * Note: the supplied property must specify its parent.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.Property property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The property.
   */
  com.google.analytics.admin.v1alpha.Property getProperty();
  /**
   * <pre>
   * Required. The property to create.
   * Note: the supplied property must specify its parent.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.Property property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.analytics.admin.v1alpha.PropertyOrBuilder getPropertyOrBuilder();
}
