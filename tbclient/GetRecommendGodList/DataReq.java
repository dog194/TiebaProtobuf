package tbclient.GetRecommendGodList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_PN = 0;
    public static final String DEFAULT_PORTRAIT = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1437common;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1438common;
        public Integer pn;
        public String portrait;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1438common = dataReq.f1437common;
            this.portrait = dataReq.portrait;
            this.pn = dataReq.pn;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1437common = builder.f1438common;
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
                return;
            } else {
                this.pn = num;
                return;
            }
        }
        this.f1437common = builder.f1438common;
        this.portrait = builder.portrait;
        this.pn = builder.pn;
    }
}