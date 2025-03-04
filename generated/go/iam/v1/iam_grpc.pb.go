// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.5.1
// - protoc             (unknown)
// source: iam/v1/iam.proto

package iam

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.64.0 or later.
const _ = grpc.SupportPackageIsVersion9

const (
	Iam_Login_FullMethodName  = "/v12proto.iam.v1.Iam/Login"
	Iam_WhoAmI_FullMethodName = "/v12proto.iam.v1.Iam/WhoAmI"
)

// IamClient is the client API for Iam service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
//
// Iam service definition.
type IamClient interface {
	// Create an account for the V12 Platform.
	Login(ctx context.Context, in *LoginRequest, opts ...grpc.CallOption) (grpc.ServerStreamingClient[LoginResponse], error)
	// Testing endpoint.
	WhoAmI(ctx context.Context, in *WhoAmIRequest, opts ...grpc.CallOption) (*WhoAmIResponse, error)
}

type iamClient struct {
	cc grpc.ClientConnInterface
}

func NewIamClient(cc grpc.ClientConnInterface) IamClient {
	return &iamClient{cc}
}

func (c *iamClient) Login(ctx context.Context, in *LoginRequest, opts ...grpc.CallOption) (grpc.ServerStreamingClient[LoginResponse], error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	stream, err := c.cc.NewStream(ctx, &Iam_ServiceDesc.Streams[0], Iam_Login_FullMethodName, cOpts...)
	if err != nil {
		return nil, err
	}
	x := &grpc.GenericClientStream[LoginRequest, LoginResponse]{ClientStream: stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

// This type alias is provided for backwards compatibility with existing code that references the prior non-generic stream type by name.
type Iam_LoginClient = grpc.ServerStreamingClient[LoginResponse]

func (c *iamClient) WhoAmI(ctx context.Context, in *WhoAmIRequest, opts ...grpc.CallOption) (*WhoAmIResponse, error) {
	cOpts := append([]grpc.CallOption{grpc.StaticMethod()}, opts...)
	out := new(WhoAmIResponse)
	err := c.cc.Invoke(ctx, Iam_WhoAmI_FullMethodName, in, out, cOpts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// IamServer is the server API for Iam service.
// All implementations must embed UnimplementedIamServer
// for forward compatibility.
//
// Iam service definition.
type IamServer interface {
	// Create an account for the V12 Platform.
	Login(*LoginRequest, grpc.ServerStreamingServer[LoginResponse]) error
	// Testing endpoint.
	WhoAmI(context.Context, *WhoAmIRequest) (*WhoAmIResponse, error)
	mustEmbedUnimplementedIamServer()
}

// UnimplementedIamServer must be embedded to have
// forward compatible implementations.
//
// NOTE: this should be embedded by value instead of pointer to avoid a nil
// pointer dereference when methods are called.
type UnimplementedIamServer struct{}

func (UnimplementedIamServer) Login(*LoginRequest, grpc.ServerStreamingServer[LoginResponse]) error {
	return status.Errorf(codes.Unimplemented, "method Login not implemented")
}
func (UnimplementedIamServer) WhoAmI(context.Context, *WhoAmIRequest) (*WhoAmIResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method WhoAmI not implemented")
}
func (UnimplementedIamServer) mustEmbedUnimplementedIamServer() {}
func (UnimplementedIamServer) testEmbeddedByValue()             {}

// UnsafeIamServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to IamServer will
// result in compilation errors.
type UnsafeIamServer interface {
	mustEmbedUnimplementedIamServer()
}

func RegisterIamServer(s grpc.ServiceRegistrar, srv IamServer) {
	// If the following call pancis, it indicates UnimplementedIamServer was
	// embedded by pointer and is nil.  This will cause panics if an
	// unimplemented method is ever invoked, so we test this at initialization
	// time to prevent it from happening at runtime later due to I/O.
	if t, ok := srv.(interface{ testEmbeddedByValue() }); ok {
		t.testEmbeddedByValue()
	}
	s.RegisterService(&Iam_ServiceDesc, srv)
}

func _Iam_Login_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(LoginRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(IamServer).Login(m, &grpc.GenericServerStream[LoginRequest, LoginResponse]{ServerStream: stream})
}

// This type alias is provided for backwards compatibility with existing code that references the prior non-generic stream type by name.
type Iam_LoginServer = grpc.ServerStreamingServer[LoginResponse]

func _Iam_WhoAmI_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(WhoAmIRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(IamServer).WhoAmI(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: Iam_WhoAmI_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(IamServer).WhoAmI(ctx, req.(*WhoAmIRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// Iam_ServiceDesc is the grpc.ServiceDesc for Iam service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var Iam_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "v12proto.iam.v1.Iam",
	HandlerType: (*IamServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "WhoAmI",
			Handler:    _Iam_WhoAmI_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "Login",
			Handler:       _Iam_Login_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "iam/v1/iam.proto",
}
