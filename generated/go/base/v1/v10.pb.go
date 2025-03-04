// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.0
// 	protoc        (unknown)
// source: base/v1/v10.proto

package base

import (
	_ "github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-openapiv2/options"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// Request message for the Do rpc.
type DoRequest struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	Data          string                 `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *DoRequest) Reset() {
	*x = DoRequest{}
	mi := &file_base_v1_v10_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *DoRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DoRequest) ProtoMessage() {}

func (x *DoRequest) ProtoReflect() protoreflect.Message {
	mi := &file_base_v1_v10_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DoRequest.ProtoReflect.Descriptor instead.
func (*DoRequest) Descriptor() ([]byte, []int) {
	return file_base_v1_v10_proto_rawDescGZIP(), []int{0}
}

func (x *DoRequest) GetData() string {
	if x != nil {
		return x.Data
	}
	return ""
}

// Response message for the Do rpc.
type DoResponse struct {
	state         protoimpl.MessageState `protogen:"open.v1"`
	Data          string                 `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *DoResponse) Reset() {
	*x = DoResponse{}
	mi := &file_base_v1_v10_proto_msgTypes[1]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *DoResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DoResponse) ProtoMessage() {}

func (x *DoResponse) ProtoReflect() protoreflect.Message {
	mi := &file_base_v1_v10_proto_msgTypes[1]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DoResponse.ProtoReflect.Descriptor instead.
func (*DoResponse) Descriptor() ([]byte, []int) {
	return file_base_v1_v10_proto_rawDescGZIP(), []int{1}
}

func (x *DoResponse) GetData() string {
	if x != nil {
		return x.Data
	}
	return ""
}

var File_base_v1_v10_proto protoreflect.FileDescriptor

var file_base_v1_v10_proto_rawDesc = []byte{
	0x0a, 0x11, 0x62, 0x61, 0x73, 0x65, 0x2f, 0x76, 0x31, 0x2f, 0x76, 0x31, 0x30, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x10, 0x76, 0x31, 0x30, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x62, 0x61,
	0x73, 0x65, 0x2e, 0x76, 0x31, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70,
	0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x67, 0x65, 0x6e, 0x2d,
	0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x76, 0x32, 0x2f, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x22, 0x1f, 0x0a, 0x09, 0x44, 0x6f, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x64, 0x61, 0x74, 0x61, 0x22, 0x20, 0x0a, 0x0a, 0x44, 0x6f, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x32, 0xf7, 0x01, 0x0a, 0x03, 0x56, 0x31, 0x30, 0x12, 0x56,
	0x0a, 0x02, 0x44, 0x6f, 0x12, 0x1b, 0x2e, 0x76, 0x31, 0x30, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x62, 0x61, 0x73, 0x65, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x6f, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x1c, 0x2e, 0x76, 0x31, 0x30, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x62, 0x61, 0x73,
	0x65, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x6f, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22,
	0x15, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x0f, 0x3a, 0x01, 0x2a, 0x22, 0x0a, 0x2f, 0x76, 0x31, 0x30,
	0x2f, 0x76, 0x31, 0x3a, 0x64, 0x6f, 0x1a, 0x97, 0x01, 0x92, 0x41, 0x93, 0x01, 0x12, 0x30, 0x28,
	0x41, 0x4c, 0x50, 0x48, 0x41, 0x29, 0x20, 0x56, 0x31, 0x30, 0x20, 0x41, 0x50, 0x49, 0x2e, 0x20,
	0x42, 0x61, 0x73, 0x65, 0x20, 0x55, 0x52, 0x4c, 0x3a, 0x20, 0x68, 0x74, 0x74, 0x70, 0x73, 0x3a,
	0x2f, 0x2f, 0x61, 0x70, 0x69, 0x2e, 0x64, 0x72, 0x69, 0x76, 0x61, 0x6c, 0x2e, 0x61, 0x69, 0x1a,
	0x5f, 0x0a, 0x24, 0x53, 0x65, 0x65, 0x20, 0x68, 0x65, 0x72, 0x65, 0x20, 0x66, 0x6f, 0x72, 0x20,
	0x74, 0x68, 0x65, 0x20, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x20, 0x64, 0x65, 0x66, 0x69,
	0x6e, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x12, 0x37, 0x68, 0x74, 0x74, 0x70, 0x73, 0x3a, 0x2f,
	0x2f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x64, 0x72, 0x69, 0x76,
	0x61, 0x6c, 0x2d, 0x61, 0x69, 0x2f, 0x76, 0x31, 0x30, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x74, 0x72, 0x65, 0x65, 0x2f, 0x6d, 0x61, 0x69, 0x6e, 0x2f, 0x76, 0x31, 0x30, 0x2f, 0x76, 0x31,
	0x42, 0xbc, 0x05, 0x92, 0x41, 0x96, 0x05, 0x12, 0x81, 0x05, 0x0a, 0x11, 0x56, 0x31, 0x30, 0x20,
	0x41, 0x50, 0x49, 0x20, 0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x12, 0xe4, 0x04,
	0x44, 0x72, 0x69, 0x76, 0x61, 0x6c, 0x20, 0x41, 0x49, 0x27, 0x73, 0x20, 0x2a, 0x2a, 0x56, 0x31,
	0x30, 0x2a, 0x2a, 0x20, 0x41, 0x50, 0x49, 0x20, 0x69, 0x73, 0x20, 0x61, 0x20, 0x52, 0x45, 0x53,
	0x54, 0x66, 0x75, 0x6c, 0x20, 0x41, 0x50, 0x49, 0x20, 0x74, 0x68, 0x61, 0x74, 0x20, 0x63, 0x61,
	0x6e, 0x20, 0x62, 0x65, 0x20, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x65, 0x64, 0x20, 0x62, 0x79,
	0x20, 0x61, 0x6e, 0x20, 0x48, 0x54, 0x54, 0x50, 0x20, 0x63, 0x6c, 0x69, 0x65, 0x6e, 0x74, 0x20,
	0x73, 0x75, 0x63, 0x68, 0x20, 0x61, 0x73, 0x20, 0x60, 0x63, 0x75, 0x72, 0x6c, 0x60, 0x2c, 0x20,
	0x6f, 0x72, 0x20, 0x61, 0x6e, 0x79, 0x20, 0x48, 0x54, 0x54, 0x50, 0x20, 0x6c, 0x69, 0x62, 0x72,
	0x61, 0x72, 0x79, 0x20, 0x77, 0x68, 0x69, 0x63, 0x68, 0x20, 0x69, 0x73, 0x20, 0x70, 0x61, 0x72,
	0x74, 0x20, 0x6f, 0x66, 0x20, 0x6d, 0x6f, 0x73, 0x74, 0x20, 0x6d, 0x6f, 0x64, 0x65, 0x72, 0x6e,
	0x20, 0x70, 0x72, 0x6f, 0x67, 0x72, 0x61, 0x6d, 0x6d, 0x69, 0x6e, 0x67, 0x20, 0x6c, 0x61, 0x6e,
	0x67, 0x75, 0x61, 0x67, 0x65, 0x73, 0x2e, 0x20, 0x54, 0x68, 0x69, 0x73, 0x20, 0x41, 0x50, 0x49,
	0x20, 0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x20, 0x69, 0x73, 0x20, 0x61, 0x75,
	0x74, 0x6f, 0x67, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x64, 0x20, 0x66, 0x72, 0x6f, 0x6d,
	0x20, 0x5b, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x20, 0x62, 0x75, 0x66, 0x66, 0x65,
	0x72, 0x73, 0x5d, 0x28, 0x68, 0x74, 0x74, 0x70, 0x73, 0x3a, 0x2f, 0x2f, 0x64, 0x65, 0x76, 0x65,
	0x6c, 0x6f, 0x70, 0x65, 0x72, 0x73, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x6f, 0x6c, 0x2d, 0x62, 0x75, 0x66, 0x66, 0x65,
	0x72, 0x73, 0x29, 0x20, 0x64, 0x65, 0x66, 0x69, 0x6e, 0x65, 0x64, 0x20, 0x69, 0x6e, 0x20, 0x74,
	0x68, 0x69, 0x73, 0x20, 0x5b, 0x72, 0x65, 0x70, 0x6f, 0x73, 0x69, 0x74, 0x6f, 0x72, 0x79, 0x5d,
	0x28, 0x68, 0x74, 0x74, 0x70, 0x73, 0x3a, 0x2f, 0x2f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e,
	0x63, 0x6f, 0x6d, 0x2f, 0x64, 0x72, 0x69, 0x76, 0x61, 0x6c, 0x2d, 0x61, 0x69, 0x2f, 0x76, 0x31,
	0x30, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x29, 0x2e, 0x0a, 0x0a, 0x53, 0x6f, 0x6d, 0x65, 0x20,
	0x65, 0x6e, 0x64, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0x2c, 0x20, 0x65, 0x73, 0x70, 0x65, 0x63,
	0x69, 0x61, 0x6c, 0x6c, 0x79, 0x20, 0x74, 0x68, 0x6f, 0x73, 0x65, 0x20, 0x74, 0x68, 0x61, 0x74,
	0x20, 0x72, 0x65, 0x74, 0x75, 0x72, 0x6e, 0x20, 0x6c, 0x69, 0x73, 0x74, 0x73, 0x20, 0x6f, 0x66,
	0x20, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x2c, 0x20, 0x68, 0x61, 0x76, 0x65,
	0x20, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x69, 0x6e, 0x67, 0x20, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x73, 0x3b, 0x20, 0x6e, 0x65, 0x77, 0x6c, 0x69, 0x6e, 0x65, 0x2d, 0x73, 0x65,
	0x70, 0x61, 0x72, 0x61, 0x74, 0x65, 0x64, 0x20, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x20, 0x6f,
	0x66, 0x20, 0xe2, 0x80, 0x9c, 0x63, 0x68, 0x75, 0x6e, 0x6b, 0x73, 0xe2, 0x80, 0x9d, 0x2e, 0x20,
	0x45, 0x61, 0x63, 0x68, 0x20, 0x63, 0x68, 0x75, 0x6e, 0x6b, 0x20, 0x69, 0x73, 0x20, 0x61, 0x6e,
	0x20, 0x65, 0x6e, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x20, 0x74, 0x68, 0x61, 0x74, 0x20, 0x63,
	0x61, 0x6e, 0x20, 0x63, 0x6f, 0x6e, 0x74, 0x61, 0x69, 0x6e, 0x20, 0x65, 0x69, 0x74, 0x68, 0x65,
	0x72, 0x20, 0x61, 0x20, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x20, 0x6d, 0x65, 0x73,
	0x73, 0x61, 0x67, 0x65, 0x20, 0x6f, 0x72, 0x20, 0x61, 0x6e, 0x20, 0x65, 0x72, 0x72, 0x6f, 0x72,
	0x2e, 0x20, 0x4f, 0x6e, 0x6c, 0x79, 0x20, 0x74, 0x68, 0x65, 0x20, 0x6c, 0x61, 0x73, 0x74, 0x20,
	0x63, 0x68, 0x75, 0x6e, 0x6b, 0x20, 0x77, 0x69, 0x6c, 0x6c, 0x20, 0x69, 0x6e, 0x63, 0x6c, 0x75,
	0x64, 0x65, 0x20, 0x61, 0x6e, 0x20, 0x65, 0x72, 0x72, 0x6f, 0x72, 0x2c, 0x20, 0x69, 0x66, 0x20,
	0x61, 0x6e, 0x79, 0x2e, 0x32, 0x05, 0x61, 0x6c, 0x70, 0x68, 0x61, 0x1a, 0x0d, 0x61, 0x70, 0x69,
	0x2e, 0x64, 0x72, 0x69, 0x76, 0x61, 0x6c, 0x2e, 0x61, 0x69, 0x2a, 0x01, 0x02, 0x5a, 0x20, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x64, 0x72, 0x69, 0x76, 0x61, 0x6c,
	0x2d, 0x61, 0x69, 0x2f, 0x76, 0x31, 0x30, 0x2d, 0x67, 0x6f, 0x2f, 0x62, 0x61, 0x73, 0x65, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_base_v1_v10_proto_rawDescOnce sync.Once
	file_base_v1_v10_proto_rawDescData = file_base_v1_v10_proto_rawDesc
)

func file_base_v1_v10_proto_rawDescGZIP() []byte {
	file_base_v1_v10_proto_rawDescOnce.Do(func() {
		file_base_v1_v10_proto_rawDescData = protoimpl.X.CompressGZIP(file_base_v1_v10_proto_rawDescData)
	})
	return file_base_v1_v10_proto_rawDescData
}

var file_base_v1_v10_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_base_v1_v10_proto_goTypes = []any{
	(*DoRequest)(nil),  // 0: v10proto.base.v1.DoRequest
	(*DoResponse)(nil), // 1: v10proto.base.v1.DoResponse
}
var file_base_v1_v10_proto_depIdxs = []int32{
	0, // 0: v10proto.base.v1.V10.Do:input_type -> v10proto.base.v1.DoRequest
	1, // 1: v10proto.base.v1.V10.Do:output_type -> v10proto.base.v1.DoResponse
	1, // [1:2] is the sub-list for method output_type
	0, // [0:1] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_base_v1_v10_proto_init() }
func file_base_v1_v10_proto_init() {
	if File_base_v1_v10_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_base_v1_v10_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_base_v1_v10_proto_goTypes,
		DependencyIndexes: file_base_v1_v10_proto_depIdxs,
		MessageInfos:      file_base_v1_v10_proto_msgTypes,
	}.Build()
	File_base_v1_v10_proto = out.File
	file_base_v1_v10_proto_rawDesc = nil
	file_base_v1_v10_proto_goTypes = nil
	file_base_v1_v10_proto_depIdxs = nil
}
