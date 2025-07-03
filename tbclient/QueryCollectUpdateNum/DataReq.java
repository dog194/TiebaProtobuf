package tbclient.QueryCollectUpdateNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_COLLECT_MARK = 0;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer collect_mark;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1513common;

    public static final class Builder extends Message.Builder<DataReq> {
        public Integer collect_mark;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1514common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.collect_mark = dataReq.collect_mark;
            this.f1514common = dataReq.f1513common;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.collect_mark;
            if (num == null) {
                this.collect_mark = DEFAULT_COLLECT_MARK;
            } else {
                this.collect_mark = num;
            }
            this.f1513common = builder.f1514common;
            return;
        }
        this.collect_mark = builder.collect_mark;
        this.f1513common = builder.f1514common;
    }
}