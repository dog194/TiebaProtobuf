package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class TimeLineInfo extends Message {
    public static final String DEFAULT_BG_COLOR = "";
    public static final String DEFAULT_SHOW_TIME = "";
    public static final String DEFAULT_SMALL_TITLE = "";
    public static final Long DEFAULT_TID = 0L;
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bg_color;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String show_time;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String small_title;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    public static final class Builder extends Message.Builder<TimeLineInfo> {
        public String bg_color;
        public String show_time;
        public String small_title;
        public Long tid;
        public String title;

        public Builder() {
        }

        public Builder(TimeLineInfo timeLineInfo) {
            super(timeLineInfo);
            if (timeLineInfo == null) {
                return;
            }
            this.tid = timeLineInfo.tid;
            this.title = timeLineInfo.title;
            this.show_time = timeLineInfo.show_time;
            this.bg_color = timeLineInfo.bg_color;
            this.small_title = timeLineInfo.small_title;
        }

        @Override // com.squareup.wire.Message.Builder
        public TimeLineInfo build(boolean z) {
            return new TimeLineInfo(this, z);
        }
    }

    public TimeLineInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.show_time;
            if (str2 == null) {
                this.show_time = "";
            } else {
                this.show_time = str2;
            }
            String str3 = builder.bg_color;
            if (str3 == null) {
                this.bg_color = "";
            } else {
                this.bg_color = str3;
            }
            String str4 = builder.small_title;
            if (str4 == null) {
                this.small_title = "";
                return;
            } else {
                this.small_title = str4;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this.show_time = builder.show_time;
        this.bg_color = builder.bg_color;
        this.small_title = builder.small_title;
    }
}