package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PubCardFreq extends Message {
    public static final String DEFAULT_CLOSE_DAY = "";
    public static final String DEFAULT_NOT_SHOW_TIMES = "";

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String close_day;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer continue_no_click_exit;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer continuous_not_click_times;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long end_time;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String not_show_times;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer show_interval;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long show_times;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long start_time;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_SHOW_TIMES = 0L;
    public static final Integer DEFAULT_SHOW_INTERVAL = 0;
    public static final Integer DEFAULT_CONTINUE_NO_CLICK_EXIT = 0;
    public static final Integer DEFAULT_CONTINUOUS_NOT_CLICK_TIMES = 0;

    public static final class Builder extends Message.Builder<PubCardFreq> {
        public String close_day;
        public Integer continue_no_click_exit;
        public Integer continuous_not_click_times;
        public Long end_time;
        public String not_show_times;
        public Integer show_interval;
        public Long show_times;
        public Long start_time;

        public Builder() {
        }

        public Builder(PubCardFreq pubCardFreq) {
            super(pubCardFreq);
            if (pubCardFreq == null) {
                return;
            }
            this.start_time = pubCardFreq.start_time;
            this.end_time = pubCardFreq.end_time;
            this.show_times = pubCardFreq.show_times;
            this.show_interval = pubCardFreq.show_interval;
            this.continue_no_click_exit = pubCardFreq.continue_no_click_exit;
            this.not_show_times = pubCardFreq.not_show_times;
            this.continuous_not_click_times = pubCardFreq.continuous_not_click_times;
            this.close_day = pubCardFreq.close_day;
        }

        @Override // com.squareup.wire.Message.Builder
        public PubCardFreq build(boolean z) {
            return new PubCardFreq(this, z);
        }
    }

    public PubCardFreq(Builder builder, boolean z) {
        super(builder);
        if (z) {
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
            Long l3 = builder.show_times;
            if (l3 == null) {
                this.show_times = DEFAULT_SHOW_TIMES;
            } else {
                this.show_times = l3;
            }
            Integer num = builder.show_interval;
            if (num == null) {
                this.show_interval = DEFAULT_SHOW_INTERVAL;
            } else {
                this.show_interval = num;
            }
            Integer num2 = builder.continue_no_click_exit;
            if (num2 == null) {
                this.continue_no_click_exit = DEFAULT_CONTINUE_NO_CLICK_EXIT;
            } else {
                this.continue_no_click_exit = num2;
            }
            String str = builder.not_show_times;
            if (str == null) {
                this.not_show_times = "";
            } else {
                this.not_show_times = str;
            }
            Integer num3 = builder.continuous_not_click_times;
            if (num3 == null) {
                this.continuous_not_click_times = DEFAULT_CONTINUOUS_NOT_CLICK_TIMES;
            } else {
                this.continuous_not_click_times = num3;
            }
            String str2 = builder.close_day;
            if (str2 == null) {
                this.close_day = "";
                return;
            } else {
                this.close_day = str2;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.show_times = builder.show_times;
        this.show_interval = builder.show_interval;
        this.continue_no_click_exit = builder.continue_no_click_exit;
        this.not_show_times = builder.not_show_times;
        this.continuous_not_click_times = builder.continuous_not_click_times;
        this.close_day = builder.close_day;
    }
}