// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cancel_message.proto

package com.dfire.protocol;

public final class RpcCancelMessage {
  private RpcCancelMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CancelMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CancelMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .ExecuteKind ek = 1;</code>
     */
    boolean hasEk();
    /**
     * <code>required .ExecuteKind ek = 1;</code>
     */
    com.dfire.protocol.JobExecuteKind.ExecuteKind getEk();

    /**
     * <code>required string id = 2;</code>
     */
    boolean hasId();
    /**
     * <code>required string id = 2;</code>
     */
    java.lang.String getId();
    /**
     * <code>required string id = 2;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();
  }
  /**
   * Protobuf type {@code CancelMessage}
   */
  public  static final class CancelMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CancelMessage)
      CancelMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CancelMessage.newBuilder() to construct.
    private CancelMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CancelMessage() {
      ek_ = 0;
      id_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CancelMessage(
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
            case 8: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              com.dfire.protocol.JobExecuteKind.ExecuteKind value = com.dfire.protocol.JobExecuteKind.ExecuteKind.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                ek_ = rawValue;
              }
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              id_ = bs;
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
      return com.dfire.protocol.RpcCancelMessage.internal_static_CancelMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dfire.protocol.RpcCancelMessage.internal_static_CancelMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dfire.protocol.RpcCancelMessage.CancelMessage.class, com.dfire.protocol.RpcCancelMessage.CancelMessage.Builder.class);
    }

    private int bitField0_;
    public static final int EK_FIELD_NUMBER = 1;
    private int ek_;
    /**
     * <code>required .ExecuteKind ek = 1;</code>
     */
    public boolean hasEk() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .ExecuteKind ek = 1;</code>
     */
    public com.dfire.protocol.JobExecuteKind.ExecuteKind getEk() {
      @SuppressWarnings("deprecation")
      com.dfire.protocol.JobExecuteKind.ExecuteKind result = com.dfire.protocol.JobExecuteKind.ExecuteKind.valueOf(ek_);
      return result == null ? com.dfire.protocol.JobExecuteKind.ExecuteKind.ScheduleKind : result;
    }

    public static final int ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object id_;
    /**
     * <code>required string id = 2;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string id = 2;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          id_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasEk()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasId()) {
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
        output.writeEnum(1, ek_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, ek_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
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
      if (!(obj instanceof com.dfire.protocol.RpcCancelMessage.CancelMessage)) {
        return super.equals(obj);
      }
      com.dfire.protocol.RpcCancelMessage.CancelMessage other = (com.dfire.protocol.RpcCancelMessage.CancelMessage) obj;

      boolean result = true;
      result = result && (hasEk() == other.hasEk());
      if (hasEk()) {
        result = result && ek_ == other.ek_;
      }
      result = result && (hasId() == other.hasId());
      if (hasId()) {
        result = result && getId()
            .equals(other.getId());
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
      if (hasEk()) {
        hash = (37 * hash) + EK_FIELD_NUMBER;
        hash = (53 * hash) + ek_;
      }
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dfire.protocol.RpcCancelMessage.CancelMessage parseFrom(
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
    public static Builder newBuilder(com.dfire.protocol.RpcCancelMessage.CancelMessage prototype) {
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
     * Protobuf type {@code CancelMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CancelMessage)
        com.dfire.protocol.RpcCancelMessage.CancelMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dfire.protocol.RpcCancelMessage.internal_static_CancelMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dfire.protocol.RpcCancelMessage.internal_static_CancelMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dfire.protocol.RpcCancelMessage.CancelMessage.class, com.dfire.protocol.RpcCancelMessage.CancelMessage.Builder.class);
      }

      // Construct using com.dfire.protocol.RpcCancelMessage.CancelMessage.newBuilder()
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
        ek_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dfire.protocol.RpcCancelMessage.internal_static_CancelMessage_descriptor;
      }

      @java.lang.Override
      public com.dfire.protocol.RpcCancelMessage.CancelMessage getDefaultInstanceForType() {
        return com.dfire.protocol.RpcCancelMessage.CancelMessage.getDefaultInstance();
      }

      @java.lang.Override
      public com.dfire.protocol.RpcCancelMessage.CancelMessage build() {
        com.dfire.protocol.RpcCancelMessage.CancelMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.dfire.protocol.RpcCancelMessage.CancelMessage buildPartial() {
        com.dfire.protocol.RpcCancelMessage.CancelMessage result = new com.dfire.protocol.RpcCancelMessage.CancelMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ek_ = ek_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.id_ = id_;
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
        if (other instanceof com.dfire.protocol.RpcCancelMessage.CancelMessage) {
          return mergeFrom((com.dfire.protocol.RpcCancelMessage.CancelMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dfire.protocol.RpcCancelMessage.CancelMessage other) {
        if (other == com.dfire.protocol.RpcCancelMessage.CancelMessage.getDefaultInstance()) return this;
        if (other.hasEk()) {
          setEk(other.getEk());
        }
        if (other.hasId()) {
          bitField0_ |= 0x00000002;
          id_ = other.id_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasEk()) {
          return false;
        }
        if (!hasId()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dfire.protocol.RpcCancelMessage.CancelMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dfire.protocol.RpcCancelMessage.CancelMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int ek_ = 0;
      /**
       * <code>required .ExecuteKind ek = 1;</code>
       */
      @Override
      public boolean hasEk() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .ExecuteKind ek = 1;</code>
       */
      public com.dfire.protocol.JobExecuteKind.ExecuteKind getEk() {
        @SuppressWarnings("deprecation")
        com.dfire.protocol.JobExecuteKind.ExecuteKind result = com.dfire.protocol.JobExecuteKind.ExecuteKind.valueOf(ek_);
        return result == null ? com.dfire.protocol.JobExecuteKind.ExecuteKind.ScheduleKind : result;
      }
      /**
       * <code>required .ExecuteKind ek = 1;</code>
       */
      public Builder setEk(com.dfire.protocol.JobExecuteKind.ExecuteKind value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        ek_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .ExecuteKind ek = 1;</code>
       */
      public Builder clearEk() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ek_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <code>required string id = 2;</code>
       */
      @Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string id = 2;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            id_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string id = 2;</code>
       */
      @Override
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string id = 2;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string id = 2;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>required string id = 2;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        id_ = value;
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


      // @@protoc_insertion_point(builder_scope:CancelMessage)
    }

    // @@protoc_insertion_point(class_scope:CancelMessage)
    private static final com.dfire.protocol.RpcCancelMessage.CancelMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.dfire.protocol.RpcCancelMessage.CancelMessage();
    }

    public static com.dfire.protocol.RpcCancelMessage.CancelMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CancelMessage>
        PARSER = new com.google.protobuf.AbstractParser<CancelMessage>() {
      @java.lang.Override
      public CancelMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CancelMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CancelMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CancelMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.dfire.protocol.RpcCancelMessage.CancelMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CancelMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CancelMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024cancel_message.proto\032\022execute_kind.pro" +
      "to\"5\n\rCancelMessage\022\030\n\002ek\030\001 \002(\0162\014.Execut" +
      "eKind\022\n\n\002id\030\002 \002(\tB(\n\022com.dfire.protocolB" +
      "\020RpcCancelMessageH\001"
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
          com.dfire.protocol.JobExecuteKind.getDescriptor(),
        }, assigner);
    internal_static_CancelMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CancelMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CancelMessage_descriptor,
        new java.lang.String[] { "Ek", "Id", });
    com.dfire.protocol.JobExecuteKind.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
