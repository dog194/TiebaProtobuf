package tbclient.GetLockWindowTid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final Long DEFAULT_TID = 0L;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;

    public static final class Builder extends Message.Builder<DataRes> {
        public Long tid;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.tid = dataRes.tid;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = l;
                return;
            }
        }
        this.tid = builder.tid;
    }
}