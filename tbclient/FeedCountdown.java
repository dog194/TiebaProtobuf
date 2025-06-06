package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedCountdown extends Message {
    public static final Long DEFAULT_ENDTIME = 0L;
    public static final String DEFAULT_ENDTIME_TAIL = "";
    public static final String DEFAULT_ENDTIME_TYPE = "";

    @ProtoField(tag = 1)
    public final ThemeColorInfo color;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long endtime;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String endtime_tail;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String endtime_type;

    public static final class Builder extends Message.Builder<FeedCountdown> {
        public ThemeColorInfo color;
        public Long endtime;
        public String endtime_tail;
        public String endtime_type;

        public Builder() {
        }

        public Builder(FeedCountdown feedCountdown) {
            super(feedCountdown);
            if (feedCountdown == null) {
                return;
            }
            this.color = feedCountdown.color;
            this.endtime = feedCountdown.endtime;
            this.endtime_type = feedCountdown.endtime_type;
            this.endtime_tail = feedCountdown.endtime_tail;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedCountdown build(boolean z) {
            return new FeedCountdown(this, z);
        }
    }

    public FeedCountdown(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.color = builder.color;
            Long l = builder.endtime;
            if (l == null) {
                this.endtime = DEFAULT_ENDTIME;
            } else {
                this.endtime = l;
            }
            String str = builder.endtime_type;
            if (str == null) {
                this.endtime_type = "";
            } else {
                this.endtime_type = str;
            }
            String str2 = builder.endtime_tail;
            if (str2 == null) {
                this.endtime_tail = "";
                return;
            } else {
                this.endtime_tail = str2;
                return;
            }
        }
        this.color = builder.color;
        this.endtime = builder.endtime;
        this.endtime_type = builder.endtime_type;
        this.endtime_tail = builder.endtime_tail;
    }
}