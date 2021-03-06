/*
 * Copyright (C)2016 - SMBJ Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hierynomus.msdtyp.ace;

import com.hierynomus.protocol.commons.EnumWithValue;

public enum AceType implements EnumWithValue<AceType> {
    ACCESS_ALLOWED_ACE_TYPE(0x00L),
    ACCESS_DENIED_ACE_TYPE(0x01L),
    SYSTEM_AUDIT_ACE_TYPE(0x02L),
    SYSTEM_ALARM_ACE_TYPE(0x03L),
    ACCESS_ALLOWED_COMPOUND_ACE_TYPE(0x04L),
    ACCESS_ALLOWED_OBJECT_ACE_TYPE(0x05L),
    ACCESS_DENIED_OBJECT_ACE_TYPE(0x06L),
    SYSTEM_AUDIT_OBJECT_ACE_TYPE(0x07L),
    SYSTEM_ALARM_OBJECT_ACE_TYPE(0x08L),
    ACCESS_ALLOWED_CALLBACK_ACE_TYPE(0x09L),
    ACCESS_DENIED_CALLBACK_ACE_TYPE(0x0AL),
    ACCESS_ALLOWED_CALLBACK_OBJECT_ACE_TYPE(0x0BL),
    ACCESS_DENIED_CALLBACK_OBJECT_ACE_TYPE(0x0CL),
    SYSTEM_AUDIT_CALLBACK_ACE_TYPE(0x0DL),
    SYSTEM_ALARM_CALLBACK_ACE_TYPE(0x0EL),
    SYSTEM_AUDIT_CALLBACK_OBJECT_ACE_TYPE(0x0FL),
    SYSTEM_ALARM_CALLBACK_OBJECT_ACE_TYPE(0x10L),
    SYSTEM_MANDATORY_LABEL_ACE_TYPE(0x11L),
    SYSTEM_RESOURCE_ATTRIBUTE_ACE_TYPE(0x12L),
    SYSTEM_SCOPED_POLICY_ID_ACE_TYPE(0x13L);

    private long value;

    AceType(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}
