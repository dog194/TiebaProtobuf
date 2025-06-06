package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String call_from;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1484common;

    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1485common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1485common = dataReq.f1484common;
            this.call_from = dataReq.call_from;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1484common = builder.f1485common;
            String str = builder.call_from;
            if (str == null) {
                this.call_from = "";
                return;
            } else {
                this.call_from = str;
                return;
            }
        }
        this.f1484common = builder.f1485common;
        this.call_from = builder.call_from;
    }
}