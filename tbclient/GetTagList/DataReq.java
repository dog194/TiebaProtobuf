package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_FROM = 0;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1451common;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer from;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1452common;
        public Integer from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1452common = dataReq.f1451common;
            this.from = dataReq.from;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1451common = builder.f1452common;
            Integer num = builder.from;
            if (num == null) {
                this.from = DEFAULT_FROM;
                return;
            } else {
                this.from = num;
                return;
            }
        }
        this.f1451common = builder.f1452common;
        this.from = builder.from;
    }
}