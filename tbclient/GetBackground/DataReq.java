package tbclient.GetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PROPS_ID = 0;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1371common;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1372common;
        public Integer props_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.props_id = dataReq.props_id;
            this.f1372common = dataReq.f1371common;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            this.f1371common = builder.f1372common;
            return;
        }
        this.props_id = builder.props_id;
        this.f1371common = builder.f1372common;
    }
}