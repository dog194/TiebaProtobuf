package tbclient.GetUserByTiebaUid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TIEBA_UID = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1458common;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_uid;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1459common;
        public String tieba_uid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1459common = dataReq.f1458common;
            this.tieba_uid = dataReq.tieba_uid;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1458common = builder.f1459common;
            String str = builder.tieba_uid;
            if (str == null) {
                this.tieba_uid = "";
                return;
            } else {
                this.tieba_uid = str;
                return;
            }
        }
        this.f1458common = builder.f1459common;
        this.tieba_uid = builder.tieba_uid;
    }
}