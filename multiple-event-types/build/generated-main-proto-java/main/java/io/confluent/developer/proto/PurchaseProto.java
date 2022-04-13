// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: purchase.proto

package io.confluent.developer.proto;

public final class PurchaseProto {
  private PurchaseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PurchaseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:io.confluent.developer.proto.Purchase)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string item = 1;</code>
     * @return The item.
     */
    java.lang.String getItem();
    /**
     * <code>string item = 1;</code>
     * @return The bytes for item.
     */
    com.google.protobuf.ByteString
        getItemBytes();

    /**
     * <code>double amount = 2;</code>
     * @return The amount.
     */
    double getAmount();

    /**
     * <code>string customer_id = 3;</code>
     * @return The customerId.
     */
    java.lang.String getCustomerId();
    /**
     * <code>string customer_id = 3;</code>
     * @return The bytes for customerId.
     */
    com.google.protobuf.ByteString
        getCustomerIdBytes();
  }
  /**
   * Protobuf type {@code io.confluent.developer.proto.Purchase}
   */
  public static final class Purchase extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:io.confluent.developer.proto.Purchase)
      PurchaseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Purchase.newBuilder() to construct.
    private Purchase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Purchase() {
      item_ = "";
      customerId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Purchase();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Purchase(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              java.lang.String s = input.readStringRequireUtf8();

              item_ = s;
              break;
            }
            case 17: {

              amount_ = input.readDouble();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              customerId_ = s;
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
      return io.confluent.developer.proto.PurchaseProto.internal_static_io_confluent_developer_proto_Purchase_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.developer.proto.PurchaseProto.internal_static_io_confluent_developer_proto_Purchase_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.developer.proto.PurchaseProto.Purchase.class, io.confluent.developer.proto.PurchaseProto.Purchase.Builder.class);
    }

    public static final int ITEM_FIELD_NUMBER = 1;
    private volatile java.lang.Object item_;
    /**
     * <code>string item = 1;</code>
     * @return The item.
     */
    @java.lang.Override
    public java.lang.String getItem() {
      java.lang.Object ref = item_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        item_ = s;
        return s;
      }
    }
    /**
     * <code>string item = 1;</code>
     * @return The bytes for item.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getItemBytes() {
      java.lang.Object ref = item_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        item_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AMOUNT_FIELD_NUMBER = 2;
    private double amount_;
    /**
     * <code>double amount = 2;</code>
     * @return The amount.
     */
    @java.lang.Override
    public double getAmount() {
      return amount_;
    }

    public static final int CUSTOMER_ID_FIELD_NUMBER = 3;
    private volatile java.lang.Object customerId_;
    /**
     * <code>string customer_id = 3;</code>
     * @return The customerId.
     */
    @java.lang.Override
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      }
    }
    /**
     * <code>string customer_id = 3;</code>
     * @return The bytes for customerId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
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

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getItemBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, item_);
      }
      if (amount_ != 0D) {
        output.writeDouble(2, amount_);
      }
      if (!getCustomerIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getItemBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, item_);
      }
      if (amount_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, amount_);
      }
      if (!getCustomerIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customerId_);
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
      if (!(obj instanceof io.confluent.developer.proto.PurchaseProto.Purchase)) {
        return super.equals(obj);
      }
      io.confluent.developer.proto.PurchaseProto.Purchase other = (io.confluent.developer.proto.PurchaseProto.Purchase) obj;

      if (!getItem()
          .equals(other.getItem())) return false;
      if (java.lang.Double.doubleToLongBits(getAmount())
          != java.lang.Double.doubleToLongBits(
              other.getAmount())) return false;
      if (!getCustomerId()
          .equals(other.getCustomerId())) return false;
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
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getAmount()));
      hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCustomerId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.developer.proto.PurchaseProto.Purchase parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.developer.proto.PurchaseProto.Purchase parseFrom(
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
    public static Builder newBuilder(io.confluent.developer.proto.PurchaseProto.Purchase prototype) {
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
     * Protobuf type {@code io.confluent.developer.proto.Purchase}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:io.confluent.developer.proto.Purchase)
        io.confluent.developer.proto.PurchaseProto.PurchaseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.developer.proto.PurchaseProto.internal_static_io_confluent_developer_proto_Purchase_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.developer.proto.PurchaseProto.internal_static_io_confluent_developer_proto_Purchase_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.developer.proto.PurchaseProto.Purchase.class, io.confluent.developer.proto.PurchaseProto.Purchase.Builder.class);
      }

      // Construct using io.confluent.developer.proto.PurchaseProto.Purchase.newBuilder()
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
        item_ = "";

        amount_ = 0D;

        customerId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.confluent.developer.proto.PurchaseProto.internal_static_io_confluent_developer_proto_Purchase_descriptor;
      }

      @java.lang.Override
      public io.confluent.developer.proto.PurchaseProto.Purchase getDefaultInstanceForType() {
        return io.confluent.developer.proto.PurchaseProto.Purchase.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.developer.proto.PurchaseProto.Purchase build() {
        io.confluent.developer.proto.PurchaseProto.Purchase result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.developer.proto.PurchaseProto.Purchase buildPartial() {
        io.confluent.developer.proto.PurchaseProto.Purchase result = new io.confluent.developer.proto.PurchaseProto.Purchase(this);
        result.item_ = item_;
        result.amount_ = amount_;
        result.customerId_ = customerId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.confluent.developer.proto.PurchaseProto.Purchase) {
          return mergeFrom((io.confluent.developer.proto.PurchaseProto.Purchase)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.developer.proto.PurchaseProto.Purchase other) {
        if (other == io.confluent.developer.proto.PurchaseProto.Purchase.getDefaultInstance()) return this;
        if (!other.getItem().isEmpty()) {
          item_ = other.item_;
          onChanged();
        }
        if (other.getAmount() != 0D) {
          setAmount(other.getAmount());
        }
        if (!other.getCustomerId().isEmpty()) {
          customerId_ = other.customerId_;
          onChanged();
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
        io.confluent.developer.proto.PurchaseProto.Purchase parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.confluent.developer.proto.PurchaseProto.Purchase) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object item_ = "";
      /**
       * <code>string item = 1;</code>
       * @return The item.
       */
      public java.lang.String getItem() {
        java.lang.Object ref = item_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          item_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string item = 1;</code>
       * @return The bytes for item.
       */
      public com.google.protobuf.ByteString
          getItemBytes() {
        java.lang.Object ref = item_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          item_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string item = 1;</code>
       * @param value The item to set.
       * @return This builder for chaining.
       */
      public Builder setItem(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        item_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string item = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearItem() {
        
        item_ = getDefaultInstance().getItem();
        onChanged();
        return this;
      }
      /**
       * <code>string item = 1;</code>
       * @param value The bytes for item to set.
       * @return This builder for chaining.
       */
      public Builder setItemBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        item_ = value;
        onChanged();
        return this;
      }

      private double amount_ ;
      /**
       * <code>double amount = 2;</code>
       * @return The amount.
       */
      @java.lang.Override
      public double getAmount() {
        return amount_;
      }
      /**
       * <code>double amount = 2;</code>
       * @param value The amount to set.
       * @return This builder for chaining.
       */
      public Builder setAmount(double value) {
        
        amount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double amount = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAmount() {
        
        amount_ = 0D;
        onChanged();
        return this;
      }

      private java.lang.Object customerId_ = "";
      /**
       * <code>string customer_id = 3;</code>
       * @return The customerId.
       */
      public java.lang.String getCustomerId() {
        java.lang.Object ref = customerId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          customerId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string customer_id = 3;</code>
       * @return The bytes for customerId.
       */
      public com.google.protobuf.ByteString
          getCustomerIdBytes() {
        java.lang.Object ref = customerId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          customerId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string customer_id = 3;</code>
       * @param value The customerId to set.
       * @return This builder for chaining.
       */
      public Builder setCustomerId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        customerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string customer_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCustomerId() {
        
        customerId_ = getDefaultInstance().getCustomerId();
        onChanged();
        return this;
      }
      /**
       * <code>string customer_id = 3;</code>
       * @param value The bytes for customerId to set.
       * @return This builder for chaining.
       */
      public Builder setCustomerIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        customerId_ = value;
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


      // @@protoc_insertion_point(builder_scope:io.confluent.developer.proto.Purchase)
    }

    // @@protoc_insertion_point(class_scope:io.confluent.developer.proto.Purchase)
    private static final io.confluent.developer.proto.PurchaseProto.Purchase DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.developer.proto.PurchaseProto.Purchase();
    }

    public static io.confluent.developer.proto.PurchaseProto.Purchase getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Purchase>
        PARSER = new com.google.protobuf.AbstractParser<Purchase>() {
      @java.lang.Override
      public Purchase parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Purchase(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Purchase> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Purchase> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.developer.proto.PurchaseProto.Purchase getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_confluent_developer_proto_Purchase_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_confluent_developer_proto_Purchase_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016purchase.proto\022\034io.confluent.developer" +
      ".proto\"=\n\010Purchase\022\014\n\004item\030\001 \001(\t\022\016\n\006amou" +
      "nt\030\002 \001(\001\022\023\n\013customer_id\030\003 \001(\tB\017B\rPurchas" +
      "eProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_io_confluent_developer_proto_Purchase_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_confluent_developer_proto_Purchase_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_confluent_developer_proto_Purchase_descriptor,
        new java.lang.String[] { "Item", "Amount", "CustomerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
