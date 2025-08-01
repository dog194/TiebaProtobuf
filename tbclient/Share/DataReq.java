package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1543common;

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long fid;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer from;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_FROM = 0;
    public static final Long DEFAULT_FID = 0L;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1544common;
        public Long fid;
        public Integer from;
        public Long tid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1544common = dataReq.f1543common;
            this.tid = dataReq.tid;
            this.from = dataReq.from;
            this.fid = dataReq.fid;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1543common = builder.f1544common;
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            Integer num = builder.from;
            if (num == null) {
                this.from = DEFAULT_FROM;
            } else {
                this.from = num;
            }
            Long l2 = builder.fid;
            if (l2 == null) {
                this.fid = DEFAULT_FID;
                return;
            } else {
                this.fid = l2;
                return;
            }
        }
        this.f1543common = builder.f1544common;
        this.tid = builder.tid;
        this.from = builder.from;
        this.fid = builder.fid;
    }
}