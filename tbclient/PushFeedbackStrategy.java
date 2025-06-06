package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PushFeedbackStrategy extends Message {

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer interval;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer start_time;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer times;
    public static final Integer DEFAULT_TIMES = 0;
    public static final Integer DEFAULT_INTERVAL = 0;
    public static final Integer DEFAULT_START_TIME = 0;

    public static final class Builder extends Message.Builder<PushFeedbackStrategy> {
        public Integer interval;
        public Integer start_time;
        public Integer times;

        public Builder() {
        }

        public Builder(PushFeedbackStrategy pushFeedbackStrategy) {
            super(pushFeedbackStrategy);
            if (pushFeedbackStrategy == null) {
                return;
            }
            this.times = pushFeedbackStrategy.times;
            this.interval = pushFeedbackStrategy.interval;
            this.start_time = pushFeedbackStrategy.start_time;
        }

        @Override // com.squareup.wire.Message.Builder
        public PushFeedbackStrategy build(boolean z) {
            return new PushFeedbackStrategy(this, z);
        }
    }

    public PushFeedbackStrategy(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.times;
            if (num == null) {
                this.times = DEFAULT_TIMES;
            } else {
                this.times = num;
            }
            Integer num2 = builder.interval;
            if (num2 == null) {
                this.interval = DEFAULT_INTERVAL;
            } else {
                this.interval = num2;
            }
            Integer num3 = builder.start_time;
            if (num3 == null) {
                this.start_time = DEFAULT_START_TIME;
                return;
            } else {
                this.start_time = num3;
                return;
            }
        }
        this.times = builder.times;
        this.interval = builder.interval;
        this.start_time = builder.start_time;
    }
}