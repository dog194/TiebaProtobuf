package tbclient.DecryptCode;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_TIEBA_CODE = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1345common;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tieba_code;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1346common;
        public String tieba_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1346common = dataReq.f1345common;
            this.tieba_code = dataReq.tieba_code;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1345common = builder.f1346common;
            String str = builder.tieba_code;
            if (str == null) {
                this.tieba_code = "";
                return;
            } else {
                this.tieba_code = str;
                return;
            }
        }
        this.f1345common = builder.f1346common;
        this.tieba_code = builder.tieba_code;
    }
}