package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FloatInfo extends Message {
    public static final String DEFAULT_FLOAT_URL = "";
    public static final String DEFAULT_JUMP_URL = "";

    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long activity_id;

    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> dynamic_url;

    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long end_time;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String float_url;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String jump_url;

    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer show_type;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long start_time;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final List<String> DEFAULT_DYNAMIC_URL = Collections.emptyList();
    public static final Long DEFAULT_ACTIVITY_ID = 0L;
    public static final Integer DEFAULT_SHOW_TYPE = 0;

    public static final class Builder extends Message.Builder<FloatInfo> {
        public Long activity_id;
        public List<String> dynamic_url;
        public Long end_time;
        public String float_url;
        public String jump_url;
        public Integer show_type;
        public Long start_time;

        public Builder() {
        }

        public Builder(FloatInfo floatInfo) {
            super(floatInfo);
            if (floatInfo == null) {
                return;
            }
            this.float_url = floatInfo.float_url;
            this.start_time = floatInfo.start_time;
            this.end_time = floatInfo.end_time;
            this.dynamic_url = Message.copyOf(floatInfo.dynamic_url);
            this.activity_id = floatInfo.activity_id;
            this.jump_url = floatInfo.jump_url;
            this.show_type = floatInfo.show_type;
        }

        @Override // com.squareup.wire.Message.Builder
        public FloatInfo build(boolean z) {
            return new FloatInfo(this, z);
        }
    }

    public FloatInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.float_url;
            if (str == null) {
                this.float_url = "";
            } else {
                this.float_url = str;
            }
            Long l = builder.start_time;
            if (l == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l;
            }
            Long l2 = builder.end_time;
            if (l2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = l2;
            }
            List<String> list = builder.dynamic_url;
            if (list == null) {
                this.dynamic_url = DEFAULT_DYNAMIC_URL;
            } else {
                this.dynamic_url = Message.immutableCopyOf(list);
            }
            Long l3 = builder.activity_id;
            if (l3 == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = l3;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            Integer num = builder.show_type;
            if (num == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
                return;
            } else {
                this.show_type = num;
                return;
            }
        }
        this.float_url = builder.float_url;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.dynamic_url = Message.immutableCopyOf(builder.dynamic_url);
        this.activity_id = builder.activity_id;
        this.jump_url = builder.jump_url;
        this.show_type = builder.show_type;
    }
}