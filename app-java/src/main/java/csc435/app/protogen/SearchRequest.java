// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_retrieval.proto

// Protobuf Java Version: 3.25.1
package csc435.app.protogen;

/**
 * <pre>
 * TO-DO update the SearchRequest message to contain the term to be searched
 * </pre>
 *
 * Protobuf type {@code SearchRequest}
 */
public final class SearchRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SearchRequest)
    SearchRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchRequest.newBuilder() to construct.
  private SearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchRequest() {
    type_ = 0;
    word1_ = "";
    word2_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return csc435.app.protogen.FileRetrievalProto.internal_static_SearchRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return csc435.app.protogen.FileRetrievalProto.internal_static_SearchRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            csc435.app.protogen.SearchRequest.class, csc435.app.protogen.SearchRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code SearchRequest.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SINGLE = 0;</code>
     */
    SINGLE(0),
    /**
     * <code>DOUBLE = 1;</code>
     */
    DOUBLE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SINGLE = 0;</code>
     */
    public static final int SINGLE_VALUE = 0;
    /**
     * <code>DOUBLE = 1;</code>
     */
    public static final int DOUBLE_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return SINGLE;
        case 1: return DOUBLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return csc435.app.protogen.SearchRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:SearchRequest.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <code>.SearchRequest.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.SearchRequest.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public csc435.app.protogen.SearchRequest.Type getType() {
    csc435.app.protogen.SearchRequest.Type result = csc435.app.protogen.SearchRequest.Type.forNumber(type_);
    return result == null ? csc435.app.protogen.SearchRequest.Type.UNRECOGNIZED : result;
  }

  public static final int WORD1_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object word1_ = "";
  /**
   * <code>string word1 = 2;</code>
   * @return The word1.
   */
  @java.lang.Override
  public java.lang.String getWord1() {
    java.lang.Object ref = word1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      word1_ = s;
      return s;
    }
  }
  /**
   * <code>string word1 = 2;</code>
   * @return The bytes for word1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWord1Bytes() {
    java.lang.Object ref = word1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      word1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORD2_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object word2_ = "";
  /**
   * <code>string word2 = 3;</code>
   * @return The word2.
   */
  @java.lang.Override
  public java.lang.String getWord2() {
    java.lang.Object ref = word2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      word2_ = s;
      return s;
    }
  }
  /**
   * <code>string word2 = 3;</code>
   * @return The bytes for word2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWord2Bytes() {
    java.lang.Object ref = word2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      word2_ = b;
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
    if (type_ != csc435.app.protogen.SearchRequest.Type.SINGLE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(word1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, word1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(word2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, word2_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != csc435.app.protogen.SearchRequest.Type.SINGLE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(word1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, word1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(word2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, word2_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof csc435.app.protogen.SearchRequest)) {
      return super.equals(obj);
    }
    csc435.app.protogen.SearchRequest other = (csc435.app.protogen.SearchRequest) obj;

    if (type_ != other.type_) return false;
    if (!getWord1()
        .equals(other.getWord1())) return false;
    if (!getWord2()
        .equals(other.getWord2())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + WORD1_FIELD_NUMBER;
    hash = (53 * hash) + getWord1().hashCode();
    hash = (37 * hash) + WORD2_FIELD_NUMBER;
    hash = (53 * hash) + getWord2().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static csc435.app.protogen.SearchRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static csc435.app.protogen.SearchRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static csc435.app.protogen.SearchRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static csc435.app.protogen.SearchRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static csc435.app.protogen.SearchRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static csc435.app.protogen.SearchRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static csc435.app.protogen.SearchRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static csc435.app.protogen.SearchRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static csc435.app.protogen.SearchRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static csc435.app.protogen.SearchRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static csc435.app.protogen.SearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static csc435.app.protogen.SearchRequest parseFrom(
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
  public static Builder newBuilder(csc435.app.protogen.SearchRequest prototype) {
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
   * <pre>
   * TO-DO update the SearchRequest message to contain the term to be searched
   * </pre>
   *
   * Protobuf type {@code SearchRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SearchRequest)
      csc435.app.protogen.SearchRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return csc435.app.protogen.FileRetrievalProto.internal_static_SearchRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return csc435.app.protogen.FileRetrievalProto.internal_static_SearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              csc435.app.protogen.SearchRequest.class, csc435.app.protogen.SearchRequest.Builder.class);
    }

    // Construct using csc435.app.protogen.SearchRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      word1_ = "";
      word2_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return csc435.app.protogen.FileRetrievalProto.internal_static_SearchRequest_descriptor;
    }

    @java.lang.Override
    public csc435.app.protogen.SearchRequest getDefaultInstanceForType() {
      return csc435.app.protogen.SearchRequest.getDefaultInstance();
    }

    @java.lang.Override
    public csc435.app.protogen.SearchRequest build() {
      csc435.app.protogen.SearchRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public csc435.app.protogen.SearchRequest buildPartial() {
      csc435.app.protogen.SearchRequest result = new csc435.app.protogen.SearchRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(csc435.app.protogen.SearchRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.word1_ = word1_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.word2_ = word2_;
      }
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
      if (other instanceof csc435.app.protogen.SearchRequest) {
        return mergeFrom((csc435.app.protogen.SearchRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(csc435.app.protogen.SearchRequest other) {
      if (other == csc435.app.protogen.SearchRequest.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getWord1().isEmpty()) {
        word1_ = other.word1_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getWord2().isEmpty()) {
        word2_ = other.word2_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              word1_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              word2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <code>.SearchRequest.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.SearchRequest.Type type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.SearchRequest.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public csc435.app.protogen.SearchRequest.Type getType() {
      csc435.app.protogen.SearchRequest.Type result = csc435.app.protogen.SearchRequest.Type.forNumber(type_);
      return result == null ? csc435.app.protogen.SearchRequest.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>.SearchRequest.Type type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(csc435.app.protogen.SearchRequest.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.SearchRequest.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object word1_ = "";
    /**
     * <code>string word1 = 2;</code>
     * @return The word1.
     */
    public java.lang.String getWord1() {
      java.lang.Object ref = word1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        word1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string word1 = 2;</code>
     * @return The bytes for word1.
     */
    public com.google.protobuf.ByteString
        getWord1Bytes() {
      java.lang.Object ref = word1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        word1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string word1 = 2;</code>
     * @param value The word1 to set.
     * @return This builder for chaining.
     */
    public Builder setWord1(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      word1_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string word1 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWord1() {
      word1_ = getDefaultInstance().getWord1();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string word1 = 2;</code>
     * @param value The bytes for word1 to set.
     * @return This builder for chaining.
     */
    public Builder setWord1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      word1_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object word2_ = "";
    /**
     * <code>string word2 = 3;</code>
     * @return The word2.
     */
    public java.lang.String getWord2() {
      java.lang.Object ref = word2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        word2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string word2 = 3;</code>
     * @return The bytes for word2.
     */
    public com.google.protobuf.ByteString
        getWord2Bytes() {
      java.lang.Object ref = word2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        word2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string word2 = 3;</code>
     * @param value The word2 to set.
     * @return This builder for chaining.
     */
    public Builder setWord2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      word2_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string word2 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWord2() {
      word2_ = getDefaultInstance().getWord2();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string word2 = 3;</code>
     * @param value The bytes for word2 to set.
     * @return This builder for chaining.
     */
    public Builder setWord2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      word2_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:SearchRequest)
  }

  // @@protoc_insertion_point(class_scope:SearchRequest)
  private static final csc435.app.protogen.SearchRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new csc435.app.protogen.SearchRequest();
  }

  public static csc435.app.protogen.SearchRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchRequest>() {
    @java.lang.Override
    public SearchRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SearchRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public csc435.app.protogen.SearchRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

