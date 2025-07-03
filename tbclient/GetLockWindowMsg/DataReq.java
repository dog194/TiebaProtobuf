package tbclient.GetLockWindowMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1411common;

    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long task_id;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long tid;
    public static final Long DEFAULT_TID = 0L;
    public static final Long DEFAULT_TASK_ID = 0L;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1412common;
        public Long task_id;
        public Long tid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1412common = dataReq.f1411common;
            this.tid = dataReq.tid;
            this.task_id = dataReq.task_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1411common = builder.f1412common;
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            Long l2 = builder.task_id;
            if (l2 == null) {
                this.task_id = DEFAULT_TASK_ID;
                return;
            } else {
                this.task_id = l2;
                return;
            }
        }
        this.f1411common = builder.f1412common;
        this.tid = builder.tid;
        this.task_id = builder.task_id;
    }
}