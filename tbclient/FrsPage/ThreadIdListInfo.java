package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ThreadIdListInfo extends Message {

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_partial_visible;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_IS_PARTIAL_VISIBLE = 0;

    public static final class Builder extends Message.Builder<ThreadIdListInfo> {
        public Integer is_partial_visible;
        public Long tid;

        public Builder() {
        }

        public Builder(ThreadIdListInfo threadIdListInfo) {
            super(threadIdListInfo);
            if (threadIdListInfo == null) {
                return;
            }
            this.tid = threadIdListInfo.tid;
            this.is_partial_visible = threadIdListInfo.is_partial_visible;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadIdListInfo build(boolean z) {
            return new ThreadIdListInfo(this, z);
        }
    }

    public ThreadIdListInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            Integer num = builder.is_partial_visible;
            if (num == null) {
                this.is_partial_visible = DEFAULT_IS_PARTIAL_VISIBLE;
                return;
            } else {
                this.is_partial_visible = num;
                return;
            }
        }
        this.tid = builder.tid;
        this.is_partial_visible = builder.is_partial_visible;
    }
}