package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1339common;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer live_close;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer vip_close;
    public static final Integer DEFAULT_VIP_CLOSE = 0;
    public static final Integer DEFAULT_LIVE_CLOSE = 0;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1340common;
        public Integer live_close;
        public Integer vip_close;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1340common = dataReq.f1339common;
            this.vip_close = dataReq.vip_close;
            this.live_close = dataReq.live_close;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1339common = builder.f1340common;
            Integer num = builder.vip_close;
            if (num == null) {
                this.vip_close = DEFAULT_VIP_CLOSE;
            } else {
                this.vip_close = num;
            }
            Integer num2 = builder.live_close;
            if (num2 == null) {
                this.live_close = DEFAULT_LIVE_CLOSE;
                return;
            } else {
                this.live_close = num2;
                return;
            }
        }
        this.f1339common = builder.f1340common;
        this.vip_close = builder.vip_close;
        this.live_close = builder.live_close;
    }
}