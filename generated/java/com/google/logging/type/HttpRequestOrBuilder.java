// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/logging/type/http_request.proto
// Protobuf Java Version: 4.29.1

package com.google.logging.type;

public interface HttpRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.type.HttpRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The request method. Examples: `"GET"`, `"HEAD"`, `"PUT"`, `"POST"`.
   * </pre>
   *
   * <code>string request_method = 1 [json_name = "requestMethod"];</code>
   * @return The requestMethod.
   */
  java.lang.String getRequestMethod();
  /**
   * <pre>
   * The request method. Examples: `"GET"`, `"HEAD"`, `"PUT"`, `"POST"`.
   * </pre>
   *
   * <code>string request_method = 1 [json_name = "requestMethod"];</code>
   * @return The bytes for requestMethod.
   */
  com.google.protobuf.ByteString
      getRequestMethodBytes();

  /**
   * <pre>
   * The scheme (http, https), the host name, the path and the query
   * portion of the URL that was requested.
   * Example: `"http://example.com/some/info?color=red"`.
   * </pre>
   *
   * <code>string request_url = 2 [json_name = "requestUrl"];</code>
   * @return The requestUrl.
   */
  java.lang.String getRequestUrl();
  /**
   * <pre>
   * The scheme (http, https), the host name, the path and the query
   * portion of the URL that was requested.
   * Example: `"http://example.com/some/info?color=red"`.
   * </pre>
   *
   * <code>string request_url = 2 [json_name = "requestUrl"];</code>
   * @return The bytes for requestUrl.
   */
  com.google.protobuf.ByteString
      getRequestUrlBytes();

  /**
   * <pre>
   * The size of the HTTP request message in bytes, including the request
   * headers and the request body.
   * </pre>
   *
   * <code>int64 request_size = 3 [json_name = "requestSize"];</code>
   * @return The requestSize.
   */
  long getRequestSize();

  /**
   * <pre>
   * The response code indicating the status of response.
   * Examples: 200, 404.
   * </pre>
   *
   * <code>int32 status = 4 [json_name = "status"];</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <pre>
   * The size of the HTTP response message sent back to the client, in bytes,
   * including the response headers and the response body.
   * </pre>
   *
   * <code>int64 response_size = 5 [json_name = "responseSize"];</code>
   * @return The responseSize.
   */
  long getResponseSize();

  /**
   * <pre>
   * The user agent sent by the client. Example:
   * `"Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Q312461; .NET CLR 1.0.3705)"`.
   * </pre>
   *
   * <code>string user_agent = 6 [json_name = "userAgent"];</code>
   * @return The userAgent.
   */
  java.lang.String getUserAgent();
  /**
   * <pre>
   * The user agent sent by the client. Example:
   * `"Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Q312461; .NET CLR 1.0.3705)"`.
   * </pre>
   *
   * <code>string user_agent = 6 [json_name = "userAgent"];</code>
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString
      getUserAgentBytes();

  /**
   * <pre>
   * The IP address (IPv4 or IPv6) of the client that issued the HTTP
   * request. Examples: `"192.168.1.1"`, `"FE80::0202:B3FF:FE1E:8329"`.
   * </pre>
   *
   * <code>string remote_ip = 7 [json_name = "remoteIp"];</code>
   * @return The remoteIp.
   */
  java.lang.String getRemoteIp();
  /**
   * <pre>
   * The IP address (IPv4 or IPv6) of the client that issued the HTTP
   * request. Examples: `"192.168.1.1"`, `"FE80::0202:B3FF:FE1E:8329"`.
   * </pre>
   *
   * <code>string remote_ip = 7 [json_name = "remoteIp"];</code>
   * @return The bytes for remoteIp.
   */
  com.google.protobuf.ByteString
      getRemoteIpBytes();

  /**
   * <pre>
   * The IP address (IPv4 or IPv6) of the origin server that the request was
   * sent to.
   * </pre>
   *
   * <code>string server_ip = 13 [json_name = "serverIp"];</code>
   * @return The serverIp.
   */
  java.lang.String getServerIp();
  /**
   * <pre>
   * The IP address (IPv4 or IPv6) of the origin server that the request was
   * sent to.
   * </pre>
   *
   * <code>string server_ip = 13 [json_name = "serverIp"];</code>
   * @return The bytes for serverIp.
   */
  com.google.protobuf.ByteString
      getServerIpBytes();

  /**
   * <pre>
   * The referer URL of the request, as defined in
   * [HTTP/1.1 Header Field Definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
   * </pre>
   *
   * <code>string referer = 8 [json_name = "referer"];</code>
   * @return The referer.
   */
  java.lang.String getReferer();
  /**
   * <pre>
   * The referer URL of the request, as defined in
   * [HTTP/1.1 Header Field Definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
   * </pre>
   *
   * <code>string referer = 8 [json_name = "referer"];</code>
   * @return The bytes for referer.
   */
  com.google.protobuf.ByteString
      getRefererBytes();

  /**
   * <pre>
   * The request processing latency on the server, from the time the request was
   * received until the response was sent.
   * </pre>
   *
   * <code>.google.protobuf.Duration latency = 14 [json_name = "latency"];</code>
   * @return Whether the latency field is set.
   */
  boolean hasLatency();
  /**
   * <pre>
   * The request processing latency on the server, from the time the request was
   * received until the response was sent.
   * </pre>
   *
   * <code>.google.protobuf.Duration latency = 14 [json_name = "latency"];</code>
   * @return The latency.
   */
  com.google.protobuf.Duration getLatency();
  /**
   * <pre>
   * The request processing latency on the server, from the time the request was
   * received until the response was sent.
   * </pre>
   *
   * <code>.google.protobuf.Duration latency = 14 [json_name = "latency"];</code>
   */
  com.google.protobuf.DurationOrBuilder getLatencyOrBuilder();

  /**
   * <pre>
   * Whether or not a cache lookup was attempted.
   * </pre>
   *
   * <code>bool cache_lookup = 11 [json_name = "cacheLookup"];</code>
   * @return The cacheLookup.
   */
  boolean getCacheLookup();

  /**
   * <pre>
   * Whether or not an entity was served from cache
   * (with or without validation).
   * </pre>
   *
   * <code>bool cache_hit = 9 [json_name = "cacheHit"];</code>
   * @return The cacheHit.
   */
  boolean getCacheHit();

  /**
   * <pre>
   * Whether or not the response was validated with the origin server before
   * being served from cache. This field is only meaningful if `cache_hit` is
   * True.
   * </pre>
   *
   * <code>bool cache_validated_with_origin_server = 10 [json_name = "cacheValidatedWithOriginServer"];</code>
   * @return The cacheValidatedWithOriginServer.
   */
  boolean getCacheValidatedWithOriginServer();

  /**
   * <pre>
   * The number of HTTP response bytes inserted into cache. Set only when a
   * cache fill was attempted.
   * </pre>
   *
   * <code>int64 cache_fill_bytes = 12 [json_name = "cacheFillBytes"];</code>
   * @return The cacheFillBytes.
   */
  long getCacheFillBytes();

  /**
   * <pre>
   * Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket"
   * </pre>
   *
   * <code>string protocol = 15 [json_name = "protocol"];</code>
   * @return The protocol.
   */
  java.lang.String getProtocol();
  /**
   * <pre>
   * Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket"
   * </pre>
   *
   * <code>string protocol = 15 [json_name = "protocol"];</code>
   * @return The bytes for protocol.
   */
  com.google.protobuf.ByteString
      getProtocolBytes();
}
