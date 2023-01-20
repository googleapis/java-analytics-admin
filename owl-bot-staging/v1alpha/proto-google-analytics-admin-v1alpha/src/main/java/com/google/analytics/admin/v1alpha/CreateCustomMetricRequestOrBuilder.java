// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface CreateCustomMetricRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CreateCustomMetricRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The CustomMetric to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the customMetric field is set.
   */
  boolean hasCustomMetric();
  /**
   * <pre>
   * Required. The CustomMetric to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customMetric.
   */
  com.google.analytics.admin.v1alpha.CustomMetric getCustomMetric();
  /**
   * <pre>
   * Required. The CustomMetric to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.analytics.admin.v1alpha.CustomMetricOrBuilder getCustomMetricOrBuilder();
}
