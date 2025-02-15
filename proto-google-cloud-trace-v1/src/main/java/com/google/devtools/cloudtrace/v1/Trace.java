/*
 * Copyright 2019 Google LLC
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
// source: google/devtools/cloudtrace/v1/trace.proto

package com.google.devtools.cloudtrace.v1;

/**
 *
 *
 * <pre>
 * A trace describes how long it takes for an application to perform an
 * operation. It consists of a set of spans, each of which represent a single
 * timed event within the operation.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudtrace.v1.Trace}
 */
public final class Trace extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudtrace.v1.Trace)
    TraceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Trace.newBuilder() to construct.
  private Trace(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Trace() {
    projectId_ = "";
    traceId_ = "";
    spans_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Trace(
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

              projectId_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              traceId_ = s;
              break;
            }
          case 26:
            {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                spans_ = new java.util.ArrayList<com.google.devtools.cloudtrace.v1.TraceSpan>();
                mutable_bitField0_ |= 0x00000004;
              }
              spans_.add(
                  input.readMessage(
                      com.google.devtools.cloudtrace.v1.TraceSpan.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        spans_ = java.util.Collections.unmodifiableList(spans_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.cloudtrace.v1.TraceProto
        .internal_static_google_devtools_cloudtrace_v1_Trace_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudtrace.v1.TraceProto
        .internal_static_google_devtools_cloudtrace_v1_Trace_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudtrace.v1.Trace.class,
            com.google.devtools.cloudtrace.v1.Trace.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   *
   *
   * <pre>
   * Project ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Project ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRACE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object traceId_;
  /**
   *
   *
   * <pre>
   * Globally unique identifier for the trace. This identifier is a 128-bit
   * numeric value formatted as a 32-byte hex string. For example,
   * `382d4f4c6b7bb2f4a972559d9085001d`.
   * </pre>
   *
   * <code>string trace_id = 2;</code>
   */
  public java.lang.String getTraceId() {
    java.lang.Object ref = traceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      traceId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Globally unique identifier for the trace. This identifier is a 128-bit
   * numeric value formatted as a 32-byte hex string. For example,
   * `382d4f4c6b7bb2f4a972559d9085001d`.
   * </pre>
   *
   * <code>string trace_id = 2;</code>
   */
  public com.google.protobuf.ByteString getTraceIdBytes() {
    java.lang.Object ref = traceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      traceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPANS_FIELD_NUMBER = 3;
  private java.util.List<com.google.devtools.cloudtrace.v1.TraceSpan> spans_;
  /**
   *
   *
   * <pre>
   * Collection of spans in the trace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
   */
  public java.util.List<com.google.devtools.cloudtrace.v1.TraceSpan> getSpansList() {
    return spans_;
  }
  /**
   *
   *
   * <pre>
   * Collection of spans in the trace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
   */
  public java.util.List<? extends com.google.devtools.cloudtrace.v1.TraceSpanOrBuilder>
      getSpansOrBuilderList() {
    return spans_;
  }
  /**
   *
   *
   * <pre>
   * Collection of spans in the trace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
   */
  public int getSpansCount() {
    return spans_.size();
  }
  /**
   *
   *
   * <pre>
   * Collection of spans in the trace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
   */
  public com.google.devtools.cloudtrace.v1.TraceSpan getSpans(int index) {
    return spans_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Collection of spans in the trace.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
   */
  public com.google.devtools.cloudtrace.v1.TraceSpanOrBuilder getSpansOrBuilder(int index) {
    return spans_.get(index);
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
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!getTraceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, traceId_);
    }
    for (int i = 0; i < spans_.size(); i++) {
      output.writeMessage(3, spans_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!getTraceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, traceId_);
    }
    for (int i = 0; i < spans_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, spans_.get(i));
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
    if (!(obj instanceof com.google.devtools.cloudtrace.v1.Trace)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudtrace.v1.Trace other = (com.google.devtools.cloudtrace.v1.Trace) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (!getTraceId().equals(other.getTraceId())) return false;
    if (!getSpansList().equals(other.getSpansList())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + TRACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTraceId().hashCode();
    if (getSpansCount() > 0) {
      hash = (37 * hash) + SPANS_FIELD_NUMBER;
      hash = (53 * hash) + getSpansList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v1.Trace parseFrom(
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

  public static Builder newBuilder(com.google.devtools.cloudtrace.v1.Trace prototype) {
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
   * A trace describes how long it takes for an application to perform an
   * operation. It consists of a set of spans, each of which represent a single
   * timed event within the operation.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudtrace.v1.Trace}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudtrace.v1.Trace)
      com.google.devtools.cloudtrace.v1.TraceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.cloudtrace.v1.TraceProto
          .internal_static_google_devtools_cloudtrace_v1_Trace_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudtrace.v1.TraceProto
          .internal_static_google_devtools_cloudtrace_v1_Trace_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudtrace.v1.Trace.class,
              com.google.devtools.cloudtrace.v1.Trace.Builder.class);
    }

    // Construct using com.google.devtools.cloudtrace.v1.Trace.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSpansFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      projectId_ = "";

      traceId_ = "";

      if (spansBuilder_ == null) {
        spans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        spansBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.cloudtrace.v1.TraceProto
          .internal_static_google_devtools_cloudtrace_v1_Trace_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v1.Trace getDefaultInstanceForType() {
      return com.google.devtools.cloudtrace.v1.Trace.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v1.Trace build() {
      com.google.devtools.cloudtrace.v1.Trace result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v1.Trace buildPartial() {
      com.google.devtools.cloudtrace.v1.Trace result =
          new com.google.devtools.cloudtrace.v1.Trace(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.projectId_ = projectId_;
      result.traceId_ = traceId_;
      if (spansBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          spans_ = java.util.Collections.unmodifiableList(spans_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.spans_ = spans_;
      } else {
        result.spans_ = spansBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.devtools.cloudtrace.v1.Trace) {
        return mergeFrom((com.google.devtools.cloudtrace.v1.Trace) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudtrace.v1.Trace other) {
      if (other == com.google.devtools.cloudtrace.v1.Trace.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getTraceId().isEmpty()) {
        traceId_ = other.traceId_;
        onChanged();
      }
      if (spansBuilder_ == null) {
        if (!other.spans_.isEmpty()) {
          if (spans_.isEmpty()) {
            spans_ = other.spans_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureSpansIsMutable();
            spans_.addAll(other.spans_);
          }
          onChanged();
        }
      } else {
        if (!other.spans_.isEmpty()) {
          if (spansBuilder_.isEmpty()) {
            spansBuilder_.dispose();
            spansBuilder_ = null;
            spans_ = other.spans_;
            bitField0_ = (bitField0_ & ~0x00000004);
            spansBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSpansFieldBuilder()
                    : null;
          } else {
            spansBuilder_.addAllMessages(other.spans_);
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
      com.google.devtools.cloudtrace.v1.Trace parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.cloudtrace.v1.Trace) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * Project ID of the Cloud project where the trace data is stored.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Project ID of the Cloud project where the trace data is stored.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Project ID of the Cloud project where the trace data is stored.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Project ID of the Cloud project where the trace data is stored.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder clearProjectId() {

      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Project ID of the Cloud project where the trace data is stored.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object traceId_ = "";
    /**
     *
     *
     * <pre>
     * Globally unique identifier for the trace. This identifier is a 128-bit
     * numeric value formatted as a 32-byte hex string. For example,
     * `382d4f4c6b7bb2f4a972559d9085001d`.
     * </pre>
     *
     * <code>string trace_id = 2;</code>
     */
    public java.lang.String getTraceId() {
      java.lang.Object ref = traceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        traceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Globally unique identifier for the trace. This identifier is a 128-bit
     * numeric value formatted as a 32-byte hex string. For example,
     * `382d4f4c6b7bb2f4a972559d9085001d`.
     * </pre>
     *
     * <code>string trace_id = 2;</code>
     */
    public com.google.protobuf.ByteString getTraceIdBytes() {
      java.lang.Object ref = traceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        traceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Globally unique identifier for the trace. This identifier is a 128-bit
     * numeric value formatted as a 32-byte hex string. For example,
     * `382d4f4c6b7bb2f4a972559d9085001d`.
     * </pre>
     *
     * <code>string trace_id = 2;</code>
     */
    public Builder setTraceId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      traceId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Globally unique identifier for the trace. This identifier is a 128-bit
     * numeric value formatted as a 32-byte hex string. For example,
     * `382d4f4c6b7bb2f4a972559d9085001d`.
     * </pre>
     *
     * <code>string trace_id = 2;</code>
     */
    public Builder clearTraceId() {

      traceId_ = getDefaultInstance().getTraceId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Globally unique identifier for the trace. This identifier is a 128-bit
     * numeric value formatted as a 32-byte hex string. For example,
     * `382d4f4c6b7bb2f4a972559d9085001d`.
     * </pre>
     *
     * <code>string trace_id = 2;</code>
     */
    public Builder setTraceIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      traceId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.devtools.cloudtrace.v1.TraceSpan> spans_ =
        java.util.Collections.emptyList();

    private void ensureSpansIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        spans_ = new java.util.ArrayList<com.google.devtools.cloudtrace.v1.TraceSpan>(spans_);
        bitField0_ |= 0x00000004;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.cloudtrace.v1.TraceSpan,
            com.google.devtools.cloudtrace.v1.TraceSpan.Builder,
            com.google.devtools.cloudtrace.v1.TraceSpanOrBuilder>
        spansBuilder_;

    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public java.util.List<com.google.devtools.cloudtrace.v1.TraceSpan> getSpansList() {
      if (spansBuilder_ == null) {
        return java.util.Collections.unmodifiableList(spans_);
      } else {
        return spansBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public int getSpansCount() {
      if (spansBuilder_ == null) {
        return spans_.size();
      } else {
        return spansBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public com.google.devtools.cloudtrace.v1.TraceSpan getSpans(int index) {
      if (spansBuilder_ == null) {
        return spans_.get(index);
      } else {
        return spansBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public Builder setSpans(int index, com.google.devtools.cloudtrace.v1.TraceSpan value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.set(index, value);
        onChanged();
      } else {
        spansBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public Builder setSpans(
        int index, com.google.devtools.cloudtrace.v1.TraceSpan.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.set(index, builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public Builder addSpans(com.google.devtools.cloudtrace.v1.TraceSpan value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.add(value);
        onChanged();
      } else {
        spansBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public Builder addSpans(int index, com.google.devtools.cloudtrace.v1.TraceSpan value) {
      if (spansBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSpansIsMutable();
        spans_.add(index, value);
        onChanged();
      } else {
        spansBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public Builder addSpans(com.google.devtools.cloudtrace.v1.TraceSpan.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.add(builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public Builder addSpans(
        int index, com.google.devtools.cloudtrace.v1.TraceSpan.Builder builderForValue) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.add(index, builderForValue.build());
        onChanged();
      } else {
        spansBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public Builder addAllSpans(
        java.lang.Iterable<? extends com.google.devtools.cloudtrace.v1.TraceSpan> values) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, spans_);
        onChanged();
      } else {
        spansBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public Builder clearSpans() {
      if (spansBuilder_ == null) {
        spans_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        spansBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public Builder removeSpans(int index) {
      if (spansBuilder_ == null) {
        ensureSpansIsMutable();
        spans_.remove(index);
        onChanged();
      } else {
        spansBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public com.google.devtools.cloudtrace.v1.TraceSpan.Builder getSpansBuilder(int index) {
      return getSpansFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public com.google.devtools.cloudtrace.v1.TraceSpanOrBuilder getSpansOrBuilder(int index) {
      if (spansBuilder_ == null) {
        return spans_.get(index);
      } else {
        return spansBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public java.util.List<? extends com.google.devtools.cloudtrace.v1.TraceSpanOrBuilder>
        getSpansOrBuilderList() {
      if (spansBuilder_ != null) {
        return spansBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(spans_);
      }
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public com.google.devtools.cloudtrace.v1.TraceSpan.Builder addSpansBuilder() {
      return getSpansFieldBuilder()
          .addBuilder(com.google.devtools.cloudtrace.v1.TraceSpan.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public com.google.devtools.cloudtrace.v1.TraceSpan.Builder addSpansBuilder(int index) {
      return getSpansFieldBuilder()
          .addBuilder(index, com.google.devtools.cloudtrace.v1.TraceSpan.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Collection of spans in the trace.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.TraceSpan spans = 3;</code>
     */
    public java.util.List<com.google.devtools.cloudtrace.v1.TraceSpan.Builder>
        getSpansBuilderList() {
      return getSpansFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.cloudtrace.v1.TraceSpan,
            com.google.devtools.cloudtrace.v1.TraceSpan.Builder,
            com.google.devtools.cloudtrace.v1.TraceSpanOrBuilder>
        getSpansFieldBuilder() {
      if (spansBuilder_ == null) {
        spansBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.devtools.cloudtrace.v1.TraceSpan,
                com.google.devtools.cloudtrace.v1.TraceSpan.Builder,
                com.google.devtools.cloudtrace.v1.TraceSpanOrBuilder>(
                spans_, ((bitField0_ & 0x00000004) != 0), getParentForChildren(), isClean());
        spans_ = null;
      }
      return spansBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudtrace.v1.Trace)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudtrace.v1.Trace)
  private static final com.google.devtools.cloudtrace.v1.Trace DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudtrace.v1.Trace();
  }

  public static com.google.devtools.cloudtrace.v1.Trace getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Trace> PARSER =
      new com.google.protobuf.AbstractParser<Trace>() {
        @java.lang.Override
        public Trace parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Trace(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Trace> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Trace> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.cloudtrace.v1.Trace getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
