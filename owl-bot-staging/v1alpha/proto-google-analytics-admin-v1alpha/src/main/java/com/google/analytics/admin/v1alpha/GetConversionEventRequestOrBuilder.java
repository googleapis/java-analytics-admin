// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface GetConversionEventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.GetConversionEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the conversion event to retrieve.
   * Format: properties/{property}/conversionEvents/{conversion_event}
   * Example: "properties/123/conversionEvents/456"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the conversion event to retrieve.
   * Format: properties/{property}/conversionEvents/{conversion_event}
   * Example: "properties/123/conversionEvents/456"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
