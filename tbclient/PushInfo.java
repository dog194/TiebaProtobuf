package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PushInfo extends Message {
    public static final String DEFAULT_EXT = "";
    public static final Integer DEFAULT_PUSH_TIME = 0;
    public static final String DEFAULT_SERVICE_ID = "";
    public static final String DEFAULT_TARGET_URL = "";
    public static final String DEFAULT_TASK_ID = "";

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ext;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer push_time;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String service_id;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String target_url;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String task_id;

    public static final class Builder extends Message.Builder<PushInfo> {
        public String ext;
        public Integer push_time;
        public String service_id;
        public String target_url;
        public String task_id;

        public Builder() {
        }

        public Builder(PushInfo pushInfo) {
            super(pushInfo);
            if (pushInfo == null) {
                return;
            }
            this.task_id = pushInfo.task_id;
            this.service_id = pushInfo.service_id;
            this.target_url = pushInfo.target_url;
            this.push_time = pushInfo.push_time;
            this.ext = pushInfo.ext;
        }

        @Override // com.squareup.wire.Message.Builder
        public PushInfo build(boolean z) {
            return new PushInfo(this, z);
        }
    }

    public PushInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.task_id;
            if (str == null) {
                this.task_id = "";
            } else {
                this.task_id = str;
            }
            String str2 = builder.service_id;
            if (str2 == null) {
                this.service_id = "";
            } else {
                this.service_id = str2;
            }
            String str3 = builder.target_url;
            if (str3 == null) {
                this.target_url = "";
            } else {
                this.target_url = str3;
            }
            Integer num = builder.push_time;
            if (num == null) {
                this.push_time = DEFAULT_PUSH_TIME;
            } else {
                this.push_time = num;
            }
            String str4 = builder.ext;
            if (str4 == null) {
                this.ext = "";
                return;
            } else {
                this.ext = str4;
                return;
            }
        }
        this.task_id = builder.task_id;
        this.service_id = builder.service_id;
        this.target_url = builder.target_url;
        this.push_time = builder.push_time;
        this.ext = builder.ext;
    }
}