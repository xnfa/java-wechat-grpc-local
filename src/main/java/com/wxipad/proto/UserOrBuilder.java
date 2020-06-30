// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WechatProto.proto

package com.wxipad.proto;

public interface UserOrBuilder extends
        // @@protoc_insertion_point(interface_extends:User)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 标识
     * </pre>
     *
     * <code>int64 uin = 1;</code>
     */
    long getUin();

    /**
     * <pre>
     * 网络跟踪key
     * </pre>
     *
     * <code>bytes cookies = 2;</code>
     */
    com.google.protobuf.ByteString getCookies();

    /**
     * <pre>
     * 会话密钥
     * </pre>
     *
     * <code>bytes sessionKey = 3;</code>
     */
    com.google.protobuf.ByteString getSessionKey();

    /**
     * <pre>
     * 设备 ID
     * </pre>
     *
     * <code>string deviceId = 4;</code>
     */
    String getDeviceId();

    /**
     * <pre>
     * 设备 ID
     * </pre>
     *
     * <code>string deviceId = 4;</code>
     */
    com.google.protobuf.ByteString
    getDeviceIdBytes();

    /**
     * <pre>
     * 设备类型
     * </pre>
     *
     * <code>string deviceType = 5;</code>
     */
    String getDeviceType();

    /**
     * <pre>
     * 设备类型
     * </pre>
     *
     * <code>string deviceType = 5;</code>
     */
    com.google.protobuf.ByteString
    getDeviceTypeBytes();

    /**
     * <pre>
     * 设备名字
     * </pre>
     *
     * <code>string deviceName = 6;</code>
     */
    String getDeviceName();

    /**
     * <pre>
     * 设备名字
     * </pre>
     *
     * <code>string deviceName = 6;</code>
     */
    com.google.protobuf.ByteString
    getDeviceNameBytes();

    /**
     * <pre>
     * 当前同步 KEY
     * </pre>
     *
     * <code>bytes currentsyncKey = 7;</code>
     */
    com.google.protobuf.ByteString getCurrentsyncKey();

    /**
     * <pre>
     * 同步消息 KEY
     * </pre>
     *
     * <code>bytes maxSyncKey = 8;</code>
     */
    com.google.protobuf.ByteString getMaxSyncKey();

    /**
     * <pre>
     * 自动授权 KEY
     * </pre>
     *
     * <code>bytes autoAuthKey = 9;</code>
     */
    com.google.protobuf.ByteString getAutoAuthKey();

    /**
     * <pre>
     * 微信 ID
     * </pre>
     *
     * <code>string userame = 10;</code>
     */
    String getUserame();

    /**
     * <pre>
     * 微信 ID
     * </pre>
     *
     * <code>string userame = 10;</code>
     */
    com.google.protobuf.ByteString
    getUserameBytes();

    /**
     * <pre>
     * 微信昵称
     * </pre>
     *
     * <code>bytes nickname = 11;</code>
     */
    com.google.protobuf.ByteString getNickname();

    /**
     * <pre>
     * 用户插件
     * </pre>
     *
     * <code>bytes userExt = 12;</code>
     */
    com.google.protobuf.ByteString getUserExt();
}