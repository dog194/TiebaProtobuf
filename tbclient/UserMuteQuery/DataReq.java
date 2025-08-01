package tbclient.UserMuteQuery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1559common;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer mute_type;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer pn;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer rn;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_MUTE_TYPE = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1560common;
        public Integer mute_type;
        public Integer pn;
        public Integer rn;
        public Long user_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.user_id = dataReq.user_id;
            this.f1560common = dataReq.f1559common;
            this.mute_type = dataReq.mute_type;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
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
            this.f1559common = builder.f1560common;
            Integer num = builder.mute_type;
            if (num == null) {
                this.mute_type = DEFAULT_MUTE_TYPE;
            } else {
                this.mute_type = num;
            }
            Integer num2 = builder.pn;
            if (num2 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num2;
            }
            Integer num3 = builder.rn;
            if (num3 == null) {
                this.rn = DEFAULT_RN;
                return;
            } else {
                this.rn = num3;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.f1559common = builder.f1560common;
        this.mute_type = builder.mute_type;
        this.pn = builder.pn;
        this.rn = builder.rn;
    }
}