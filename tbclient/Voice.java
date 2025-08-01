package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Voice extends Message {
    public static final String DEFAULT_VOICE_MD5 = "";
    public static final String DEFAULT_VOICE_URL = "";

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer during_time;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long uid;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String voice_md5;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String voice_url;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_DURING_TIME = 0;
    public static final Long DEFAULT_UID = 0L;

    public static final class Builder extends Message.Builder<Voice> {
        public Integer during_time;
        public Integer type;
        public Long uid;
        public String voice_md5;
        public String voice_url;

        public Builder() {
        }

        public Builder(Voice voice) {
            super(voice);
            if (voice == null) {
                return;
            }
            this.type = voice.type;
            this.during_time = voice.during_time;
            this.voice_md5 = voice.voice_md5;
            this.voice_url = voice.voice_url;
            this.uid = voice.uid;
        }

        @Override // com.squareup.wire.Message.Builder
        public Voice build(boolean z) {
            return new Voice(this, z);
        }
    }

    public Voice(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.during_time;
            if (num2 == null) {
                this.during_time = DEFAULT_DURING_TIME;
            } else {
                this.during_time = num2;
            }
            String str = builder.voice_md5;
            if (str == null) {
                this.voice_md5 = "";
            } else {
                this.voice_md5 = str;
            }
            String str2 = builder.voice_url;
            if (str2 == null) {
                this.voice_url = "";
            } else {
                this.voice_url = str2;
            }
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
                return;
            } else {
                this.uid = l;
                return;
            }
        }
        this.type = builder.type;
        this.during_time = builder.during_time;
        this.voice_md5 = builder.voice_md5;
        this.voice_url = builder.voice_url;
        this.uid = builder.uid;
    }
}