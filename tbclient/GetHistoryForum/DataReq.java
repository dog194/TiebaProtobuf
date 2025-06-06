package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_HISTORY = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1398common;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String history;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1399common;
        public String history;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1399common = dataReq.f1398common;
            this.history = dataReq.history;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1398common = builder.f1399common;
            String str = builder.history;
            if (str == null) {
                this.history = "";
                return;
            } else {
                this.history = str;
                return;
            }
        }
        this.f1398common = builder.f1399common;
        this.history = builder.history;
    }
}