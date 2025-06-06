package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class ReqData extends Message {
    public static final Integer DEFAULT_TIMESTAMP = 0;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1362common;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer timestamp;

    public static final class Builder extends Message.Builder<ReqData> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1363common;
        public Integer timestamp;

        public Builder() {
        }

        public Builder(ReqData reqData) {
            super(reqData);
            if (reqData == null) {
                return;
            }
            this.timestamp = reqData.timestamp;
            this.f1363common = reqData.f1362common;
        }

        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            return new ReqData(this, z);
        }
    }

    public ReqData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.timestamp;
            if (num == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
            } else {
                this.timestamp = num;
            }
            this.f1362common = builder.f1363common;
            return;
        }
        this.timestamp = builder.timestamp;
        this.f1362common = builder.f1363common;
    }
}