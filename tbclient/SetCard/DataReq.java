package tbclient.SetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_PROPS_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1535common;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long props_id;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer type;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1536common;
        public Long props_id;
        public Integer type;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1536common = dataReq.f1535common;
            this.props_id = dataReq.props_id;
            this.type = dataReq.type;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1535common = builder.f1536common;
            Long l = builder.props_id;
            if (l == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = l;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = num;
                return;
            }
        }
        this.f1535common = builder.f1536common;
        this.props_id = builder.props_id;
        this.type = builder.type;
    }
}