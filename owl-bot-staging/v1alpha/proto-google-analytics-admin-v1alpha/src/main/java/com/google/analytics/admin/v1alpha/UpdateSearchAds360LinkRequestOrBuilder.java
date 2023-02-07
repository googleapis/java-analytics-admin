// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface UpdateSearchAds360LinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.UpdateSearchAds360LinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The SearchAds360Link to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 1;</code>
   * @return Whether the searchAds360Link field is set.
   */
  boolean hasSearchAds360Link();
  /**
   * <pre>
   * The SearchAds360Link to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 1;</code>
   * @return The searchAds360Link.
   */
  com.google.analytics.admin.v1alpha.SearchAds360Link getSearchAds360Link();
  /**
   * <pre>
   * The SearchAds360Link to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 1;</code>
   */
  com.google.analytics.admin.v1alpha.SearchAds360LinkOrBuilder getSearchAds360LinkOrBuilder();

  /**
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated. To replace the entire entity, use one path with the string "*" to
   * match all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated. To replace the entire entity, use one path with the string "*" to
   * match all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated. To replace the entire entity, use one path with the string "*" to
   * match all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
