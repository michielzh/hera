// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: execute_message.proto

package com.dfire.protocol;

public final class RpcExecuteMessage {
  private RpcExecuteMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExecuteMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExecuteMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string actionId = 1;</code>
     */
    boolean hasActionId();
    /**
     * <code>required string actionId = 1;</code>
     */
    java.lang.String getActionId();
    /**
     * <code>required string actionId = 1;</code>
     */
    com.google.protobuf.ByteString
        getActionIdBytes();

    /**
     * <code>optional sint32 exitCode = 2;</code>
     */
    boolean hasExitCode();
    /**
     * <code>optional sint32 exitCode = 2;</code>
     */
    int getExitCode();
  }
  /**
   * Protobuf type {@code ExecuteMessage}
   */
  public  static final class ExecuteMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExecuteMessage)
      ExecuteMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExecuteMessage.newBuilder() to construct.
    private ExecuteMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExecuteMessage() {
      actionId_ = "";
      exitCode_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExecuteMessage(
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              actionId_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              exitCode_ = input.readSInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dfire.protocol.RpcExecuteMessage.internal_static_ExecuteMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dfire.protocol.RpcExecuteMessage.internal_static_ExecuteMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dfire.protocol.RpcExecuteMessage.ExecuteMessage.class, com.dfire.protocol.RpcExecuteMessage.ExecuteMessage.Builder.class);
    }

    private int bitField0_;
    public static final int ACTIONID_FIELD_NUMBER = 1;
    private volatile java.lang.Object actionId_;
    /**
     * <code>required string actionId = 1;</code>
     */
    public boolean hasActionId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string actionId = 1;</code>
     */
    public java.lang.String getActionId() {
      java.lang.Object ref = actionId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          actionId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string actionId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getActionIdBytes() {
      java.lang.Object ref = actionId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EXITCODE_FIELD_NUMBER = 2;
    private int exitCode_;
    /**
     * <code>optional sint32 exitCode = 2;</code>
     */
    public boolean hasExitCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional sint32 exitCode = 2;</code>
     */
    public int getExitCode() {
      return exitCode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasActionId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, actionId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeSInt32(2, exitCode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, actionId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(2, exitCode_);
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
      if (!(obj instanceof com.dfire.protocol.RpcExecuteMessage.ExecuteMessage)) {
        return super.equals(obj);
      }
      com.dfire.protocol.RpcExecuteMessage.ExecuteMessage other = (com.dfire.protocol.RpcExecuteMessage.ExecuteMessage) obj;

      boolean result = true;
      result = result && (hasActionId() == other.hasActionId());
      if (hasActionId()) {
        result = result && getActionId()
            .equals(other.getActionId());
      }
      result = result && (hasExitCode() == other.hasExitCode());
      if (hasExitCode()) {
        result = result && (getExitCode()
            == other.getExitCode());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasActionId()) {
        hash = (37 * hash) + ACTIONID_FIELD_NUMBER;
        hash = (53 * hash) + getActionId().hashCode();
      }
      if (hasExitCode()) {
        hash = (37 * hash) + EXITCODE_FIELD_NUMBER;
        hash = (53 * hash) + getExitCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.dfire.protocol.RpcExecuteMessage.ExecuteMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ExecuteMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExecuteMessage)
        com.dfire.protocol.RpcExecuteMessage.ExecuteMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dfire.protocol.RpcExecuteMessage.internal_static_ExecuteMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dfire.protocol.RpcExecuteMessage.internal_static_ExecuteMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dfire.protocol.RpcExecuteMessage.ExecuteMessage.class, com.dfire.protocol.RpcExecuteMessage.ExecuteMessage.Builder.class);
      }

      // Construct using com.dfire.protocol.RpcExecuteMessage.ExecuteMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        actionId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        exitCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dfire.protocol.RpcExecuteMessage.internal_static_ExecuteMessage_descriptor;
      }

      @java.lang.Override
      public com.dfire.protocol.RpcExecuteMessage.ExecuteMessage getDefaultInstanceForType() {
        return com.dfire.protocol.RpcExecuteMessage.ExecuteMessage.getDefaultInstance();
      }

      @java.lang.Override
      public com.dfire.protocol.RpcExecuteMessage.ExecuteMessage build() {
        com.dfire.protocol.RpcExecuteMessage.ExecuteMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.dfire.protocol.RpcExecuteMessage.ExecuteMessage buildPartial() {
        com.dfire.protocol.RpcExecuteMessage.ExecuteMessage result = new com.dfire.protocol.RpcExecuteMessage.ExecuteMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.actionId_ = actionId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.exitCode_ = exitCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dfire.protocol.RpcExecuteMessage.ExecuteMessage) {
          return mergeFrom((com.dfire.protocol.RpcExecuteMessage.ExecuteMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dfire.protocol.RpcExecuteMessage.ExecuteMessage other) {
        if (other == com.dfire.protocol.RpcExecuteMessage.ExecuteMessage.getDefaultInstance()) return this;
        if (other.hasActionId()) {
          bitField0_ |= 0x00000001;
          actionId_ = other.actionId_;
          onChanged();
        }
        if (other.hasExitCode()) {
          setExitCode(other.getExitCode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasActionId()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dfire.protocol.RpcExecuteMessage.ExecuteMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dfire.protocol.RpcExecuteMessage.ExecuteMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object actionId_ = "";
      /**
       * <code>required string actionId = 1;</code>
       */
      public boolean hasActionId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string actionId = 1;</code>
       */
      public java.lang.String getActionId() {
        java.lang.Object ref = actionId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            actionId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string actionId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getActionIdBytes() {
        java.lang.Object ref = actionId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          actionId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string actionId = 1;</code>
       */
      public Builder setActionId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        actionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string actionId = 1;</code>
       */
      public Builder clearActionId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        actionId_ = getDefaultInstance().getActionId();
        onChanged();
        return this;
      }
      /**
       * <code>required string actionId = 1;</code>
       */
      public Builder setActionIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        actionId_ = value;
        onChanged();
        return this;
      }

      private int exitCode_ ;
      /**
       * <code>optional sint32 exitCode = 2;</code>
       */
      public boolean hasExitCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional sint32 exitCode = 2;</code>
       */
      public int getExitCode() {
        return exitCode_;
      }
      /**
       * <code>optional sint32 exitCode = 2;</code>
       */
      public Builder setExitCode(int value) {
        bitField0_ |= 0x00000002;
        exitCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint32 exitCode = 2;</code>
       */
      public Builder clearExitCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        exitCode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ExecuteMessage)
    }

    // @@protoc_insertion_point(class_scope:ExecuteMessage)
    private static final com.dfire.protocol.RpcExecuteMessage.ExecuteMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.dfire.protocol.RpcExecuteMessage.ExecuteMessage();
    }

    public static com.dfire.protocol.RpcExecuteMessage.ExecuteMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ExecuteMessage>
        PARSER = new com.google.protobuf.AbstractParser<ExecuteMessage>() {
      @java.lang.Override
      public ExecuteMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExecuteMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExecuteMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExecuteMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.dfire.protocol.RpcExecuteMessage.ExecuteMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExecuteMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExecuteMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025execute_message.proto\"4\n\016ExecuteMessag" +
      "e\022\020\n\010actionId\030\001 \002(\t\022\020\n\010exitCode\030\002 \001(\021B)\n" +
      "\022com.dfire.protocolB\021RpcExecuteMessageH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ExecuteMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExecuteMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExecuteMessage_descriptor,
        new java.lang.String[] { "ActionId", "ExitCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
