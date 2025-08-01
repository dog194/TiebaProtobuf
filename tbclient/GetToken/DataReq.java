package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_SHOUBAICUID = "";
    public static final String DEFAULT_TOKEN = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1457common;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String shoubaicuid;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String token;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1458common;
        public String shoubaicuid;
        public String token;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1458common = dataReq.f1457common;
            this.token = dataReq.token;
            this.shoubaicuid = dataReq.shoubaicuid;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1457common = builder.f1458common;
            String str = builder.token;
            if (str == null) {
                this.token = "";
            } else {
                this.token = str;
            }
            String str2 = builder.shoubaicuid;
            if (str2 == null) {
                this.shoubaicuid = "";
                return;
            } else {
                this.shoubaicuid = str2;
                return;
            }
        }
        this.f1457common = builder.f1458common;
        this.token = builder.token;
        this.shoubaicuid = builder.shoubaicuid;
    }
}