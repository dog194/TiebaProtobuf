package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ThreadDrawInfo extends Message {

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer audit_status;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long draw_id;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadDrawPrize> draw_prize;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer join_status;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer open_status;

    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long open_time;
    public static final Long DEFAULT_DRAW_ID = 0L;
    public static final List<ThreadDrawPrize> DEFAULT_DRAW_PRIZE = Collections.emptyList();
    public static final Integer DEFAULT_AUDIT_STATUS = 0;
    public static final Integer DEFAULT_JOIN_STATUS = 0;
    public static final Integer DEFAULT_OPEN_STATUS = 0;
    public static final Long DEFAULT_OPEN_TIME = 0L;

    public static final class Builder extends Message.Builder<ThreadDrawInfo> {
        public Integer audit_status;
        public Long draw_id;
        public List<ThreadDrawPrize> draw_prize;
        public Integer join_status;
        public Integer open_status;
        public Long open_time;

        public Builder() {
        }

        public Builder(ThreadDrawInfo threadDrawInfo) {
            super(threadDrawInfo);
            if (threadDrawInfo == null) {
                return;
            }
            this.draw_id = threadDrawInfo.draw_id;
            this.draw_prize = Message.copyOf(threadDrawInfo.draw_prize);
            this.audit_status = threadDrawInfo.audit_status;
            this.join_status = threadDrawInfo.join_status;
            this.open_status = threadDrawInfo.open_status;
            this.open_time = threadDrawInfo.open_time;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadDrawInfo build(boolean z) {
            return new ThreadDrawInfo(this, z);
        }
    }

    public ThreadDrawInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.draw_id;
            if (l == null) {
                this.draw_id = DEFAULT_DRAW_ID;
            } else {
                this.draw_id = l;
            }
            List<ThreadDrawPrize> list = builder.draw_prize;
            if (list == null) {
                this.draw_prize = DEFAULT_DRAW_PRIZE;
            } else {
                this.draw_prize = Message.immutableCopyOf(list);
            }
            Integer num = builder.audit_status;
            if (num == null) {
                this.audit_status = DEFAULT_AUDIT_STATUS;
            } else {
                this.audit_status = num;
            }
            Integer num2 = builder.join_status;
            if (num2 == null) {
                this.join_status = DEFAULT_JOIN_STATUS;
            } else {
                this.join_status = num2;
            }
            Integer num3 = builder.open_status;
            if (num3 == null) {
                this.open_status = DEFAULT_OPEN_STATUS;
            } else {
                this.open_status = num3;
            }
            Long l2 = builder.open_time;
            if (l2 == null) {
                this.open_time = DEFAULT_OPEN_TIME;
                return;
            } else {
                this.open_time = l2;
                return;
            }
        }
        this.draw_id = builder.draw_id;
        this.draw_prize = Message.immutableCopyOf(builder.draw_prize);
        this.audit_status = builder.audit_status;
        this.join_status = builder.join_status;
        this.open_status = builder.open_status;
        this.open_time = builder.open_time;
    }
}