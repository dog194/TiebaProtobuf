package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ADDR_NAME = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String addr_name;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1449common;

    public static final class Builder extends Message.Builder<DataReq> {
        public String addr_name;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1450common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.addr_name = dataReq.addr_name;
            this.f1450common = dataReq.f1449common;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.addr_name;
            if (str == null) {
                this.addr_name = "";
            } else {
                this.addr_name = str;
            }
            this.f1449common = builder.f1450common;
            return;
        }
        this.addr_name = builder.addr_name;
        this.f1449common = builder.f1450common;
    }
}