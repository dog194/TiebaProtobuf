package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_WORD = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1522common;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String word;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1523common;
        public String word;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1523common = dataReq.f1522common;
            this.word = dataReq.word;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1522common = builder.f1523common;
            String str = builder.word;
            if (str == null) {
                this.word = "";
                return;
            } else {
                this.word = str;
                return;
            }
        }
        this.f1522common = builder.f1523common;
        this.word = builder.word;
    }
}