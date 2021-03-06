/*
 * Copyright (c) 2004 Nu Echo Inc. All rights reserved.
 */
package com.nuecho.rivr.voicexml.turn.input;

import javax.json.*;

import com.nuecho.rivr.core.util.*;
import com.nuecho.rivr.voicexml.util.json.*;

/**
 * @author Nu Echo Inc.
 */
public final class TransferStatusInfo implements JsonSerializable {

    private static final String DURATION_PROPERTY = "duration";
    private static final String STATUS_PROPERTY = "status";
    private final TransferStatus mStatus;
    private final TimeValue mDuration;

    public TransferStatusInfo(TransferStatus status, TimeValue duration) {
        Assert.notNull(status, STATUS_PROPERTY);
        Assert.notNull(duration, DURATION_PROPERTY);
        mStatus = status;
        mDuration = duration;
    }

    public TransferStatus getStatus() {
        return mStatus;
    }

    public TimeValue getDuration() {
        return mDuration;
    }

    @Override
    public String toString() {
        return asJson().toString();
    }

    @Override
    public JsonValue asJson() {
        JsonObjectBuilder builder = JsonUtils.createObjectBuilder();
        JsonUtils.add(builder, STATUS_PROPERTY, mStatus.asJson());
        builder.add(DURATION_PROPERTY, mDuration.getMilliseconds());
        return builder.build();
    }
}