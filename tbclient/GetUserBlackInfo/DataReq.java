package tbclient.GetUserBlackInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_BLACK_UID = 0L;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long black_uid;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1456common;

    public static final class Builder extends Message.Builder<DataReq> {
        public Long black_uid;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1457common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1457common = dataReq.f1456common;
            this.black_uid = dataReq.black_uid;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1456common = builder.f1457common;
            Long l = builder.black_uid;
            if (l == null) {
                this.black_uid = DEFAULT_BLACK_UID;
                return;
            } else {
                this.black_uid = l;
                return;
            }
        }
        this.f1456common = builder.f1457common;
        this.black_uid = builder.black_uid;
    }
}