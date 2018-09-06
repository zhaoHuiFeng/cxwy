package com.haojukej.common;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * JsonMessage class
 *
 * @author huifengzhao
 * @date 2018/08/20
 */
public class JsonMessage implements Serializable {
    static {
        SerializeConfig serializeConfig = SerializeConfig.globalInstance;
        serializeConfig.put(Long.class, ToStringSerializer.instance);
        serializeConfig.put(Long.TYPE, ToStringSerializer.instance);
        serializeConfig.put(BigInteger.class, ToStringSerializer.instance);
        serializeConfig.put(Long.TYPE, ToStringSerializer.instance);
    }

    public static final String CODE = "code";
    public static final String MSG = "msg";
    public static final String DATA = "data";

    private int code;
    private String msg;
    private Object data;

    public JsonMessage(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JsonMessage(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

    public JSONObject toJson() {
        return (JSONObject) JSONObject.toJSON(this);
    }

    public String toFormatJson() {
        return JSONObject.toJSONString(this, SerializerFeature.PrettyFormat);
    }

    public static JSONObject toJson(int code, String msg) {
        return toJson(code, msg, (Object) null);
    }

    public static JSONObject toJson(int code, String msg, Object data) {
        JsonMessage jsonMessage = new JsonMessage(code, msg, data);
        return jsonMessage.toJson();
    }

    public static String getString(int code, String msg) {
        return getString(code, msg, (Object) null);
    }

    public static String getString(int code, String msg, Object data) {
        return toJson(code, msg, data).toString();
    }
}
