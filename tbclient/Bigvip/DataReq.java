package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_USER_ID = 0L;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1333common;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1334common;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.user_id = dataReq.user_id;
            this.f1334common = dataReq.f1333common;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            this.f1333common = builder.f1334common;
            return;
        }
        this.user_id = builder.user_id;
        this.f1333common = builder.f1334common;
    }
}