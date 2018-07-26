/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.auth.sts;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangw on 2017/8/10.
 */

public class GenerateSessionAccessKeyResponse extends AcsResponse {

    @SerializedName("RequestId")
    private String requestId;

    @SerializedName("SessionAccessKey")
    private SessionAccessKey sessionAccessKey;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public SessionAccessKey getSessionAccessKey() {
        return sessionAccessKey;
    }

    public void setSessionAccessKey(SessionAccessKey sessionAccessKey) {
        this.sessionAccessKey = sessionAccessKey;
    }

    public static class SessionAccessKey {

        @SerializedName("SessionAccessKeyId")
        private String sessionAccessKeyId;

        @SerializedName("SessionAccessKeySecret")
        private String sessionAccessKeySecret;

        @SerializedName("Expiration")
        private String expiration;

        public String getSessionAccessKeyId() {
            return sessionAccessKeyId;
        }

        public void setSessionAccessKeyId(String sessionAccessKeyId) {
            this.sessionAccessKeyId = sessionAccessKeyId;
        }

        public String getSessionAccessKeySecert() {
            return sessionAccessKeySecret;
        }

        public void setSessionAccessKeySecert(String sessionAccessKeySecert) {
            this.sessionAccessKeySecret = sessionAccessKeySecert;
        }

        public String getExpiration() {
            return expiration;
        }

        public void setExpiration(String expiration) {
            this.expiration = expiration;
        }
    }

    @Override
    public GenerateSessionAccessKeyResponse getInstance(UnmarshallerContext context) {
        return GetSessionAccessKeyResponseUnmarshaller.unmarshall(this, context);
    }
}
