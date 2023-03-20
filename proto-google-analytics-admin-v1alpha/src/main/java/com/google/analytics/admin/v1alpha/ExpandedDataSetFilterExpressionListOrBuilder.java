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
// source: google/analytics/admin/v1alpha/expanded_data_set.proto

package com.google.analytics.admin.v1alpha;

public interface ExpandedDataSetFilterExpressionListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
   * </code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression>
      getFilterExpressionsList();
  /**
   *
   *
   * <pre>
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
   * </code>
   */
  com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression getFilterExpressions(
      int index);
  /**
   *
   *
   * <pre>
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
   * </code>
   */
  int getFilterExpressionsCount();
  /**
   *
   *
   * <pre>
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionOrBuilder>
      getFilterExpressionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
   * </code>
   */
  com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionOrBuilder
      getFilterExpressionsOrBuilder(int index);
}
