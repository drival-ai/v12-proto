// Copyright 2019 Google LLC.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.36.0
// 	protoc        (unknown)
// source: google/type/fraction.proto

package fraction

import (
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

// Represents a fraction in terms of a numerator divided by a denominator.
type Fraction struct {
	state protoimpl.MessageState `protogen:"open.v1"`
	// The portion of the denominator in the faction, e.g. 2 in 2/3.
	Numerator int64 `protobuf:"varint,1,opt,name=numerator,proto3" json:"numerator,omitempty"`
	// The value by which the numerator is divided, e.g. 3 in 2/3. Must be
	// positive.
	Denominator   int64 `protobuf:"varint,2,opt,name=denominator,proto3" json:"denominator,omitempty"`
	unknownFields protoimpl.UnknownFields
	sizeCache     protoimpl.SizeCache
}

func (x *Fraction) Reset() {
	*x = Fraction{}
	mi := &file_google_type_fraction_proto_msgTypes[0]
	ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
	ms.StoreMessageInfo(mi)
}

func (x *Fraction) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Fraction) ProtoMessage() {}

func (x *Fraction) ProtoReflect() protoreflect.Message {
	mi := &file_google_type_fraction_proto_msgTypes[0]
	if x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Fraction.ProtoReflect.Descriptor instead.
func (*Fraction) Descriptor() ([]byte, []int) {
	return file_google_type_fraction_proto_rawDescGZIP(), []int{0}
}

func (x *Fraction) GetNumerator() int64 {
	if x != nil {
		return x.Numerator
	}
	return 0
}

func (x *Fraction) GetDenominator() int64 {
	if x != nil {
		return x.Denominator
	}
	return 0
}

var File_google_type_fraction_proto protoreflect.FileDescriptor

var file_google_type_fraction_proto_rawDesc = []byte{
	0x0a, 0x1a, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x66, 0x72,
	0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x22, 0x4a, 0x0a, 0x08, 0x46, 0x72, 0x61,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x1c, 0x0a, 0x09, 0x6e, 0x75, 0x6d, 0x65, 0x72, 0x61, 0x74,
	0x6f, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x6e, 0x75, 0x6d, 0x65, 0x72, 0x61,
	0x74, 0x6f, 0x72, 0x12, 0x20, 0x0a, 0x0b, 0x64, 0x65, 0x6e, 0x6f, 0x6d, 0x69, 0x6e, 0x61, 0x74,
	0x6f, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0b, 0x64, 0x65, 0x6e, 0x6f, 0x6d, 0x69,
	0x6e, 0x61, 0x74, 0x6f, 0x72, 0x42, 0x66, 0x0a, 0x0f, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x6f, 0x6f,
	0x67, 0x6c, 0x65, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x42, 0x0d, 0x46, 0x72, 0x61, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x3c, 0x67, 0x6f, 0x6f, 0x67, 0x6c,
	0x65, 0x2e, 0x67, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6f, 0x72, 0x67, 0x2f, 0x67, 0x65, 0x6e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x61, 0x70, 0x69, 0x73,
	0x2f, 0x74, 0x79, 0x70, 0x65, 0x2f, 0x66, 0x72, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x3b, 0x66,
	0x72, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0xa2, 0x02, 0x03, 0x47, 0x54, 0x50, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_google_type_fraction_proto_rawDescOnce sync.Once
	file_google_type_fraction_proto_rawDescData = file_google_type_fraction_proto_rawDesc
)

func file_google_type_fraction_proto_rawDescGZIP() []byte {
	file_google_type_fraction_proto_rawDescOnce.Do(func() {
		file_google_type_fraction_proto_rawDescData = protoimpl.X.CompressGZIP(file_google_type_fraction_proto_rawDescData)
	})
	return file_google_type_fraction_proto_rawDescData
}

var file_google_type_fraction_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_google_type_fraction_proto_goTypes = []any{
	(*Fraction)(nil), // 0: google.type.Fraction
}
var file_google_type_fraction_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_google_type_fraction_proto_init() }
func file_google_type_fraction_proto_init() {
	if File_google_type_fraction_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_google_type_fraction_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_google_type_fraction_proto_goTypes,
		DependencyIndexes: file_google_type_fraction_proto_depIdxs,
		MessageInfos:      file_google_type_fraction_proto_msgTypes,
	}.Build()
	File_google_type_fraction_proto = out.File
	file_google_type_fraction_proto_rawDesc = nil
	file_google_type_fraction_proto_goTypes = nil
	file_google_type_fraction_proto_depIdxs = nil
}
