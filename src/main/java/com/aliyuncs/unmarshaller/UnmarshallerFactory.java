package com.aliyuncs.unmarshaller;

import com.aliyuncs.http.FormatType;

/**
 * @author VK.Gao
 * @date 2018/04/11
 */
public class UnmarshallerFactory {

    public static Unmarshaller getUnmarshaller(FormatType format) {
        switch (format) {
            case JSON:
                return new JsonUnmashaller();
            default:
                throw new IllegalStateException("Unsupported response format: " + format);
        }

    }

}
