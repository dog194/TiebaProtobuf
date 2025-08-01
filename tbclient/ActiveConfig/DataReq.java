package tbclient.ActiveConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1309common;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_first_up;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_schema_up;
    public static final Integer DEFAULT_IS_SCHEMA_UP = 0;
    public static final Integer DEFAULT_IS_FIRST_UP = 0;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1310common;
        public Integer is_first_up;
        public Integer is_schema_up;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1310common = dataReq.f1309common;
            this.is_schema_up = dataReq.is_schema_up;
            this.is_first_up = dataReq.is_first_up;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1309common = builder.f1310common;
            Integer num = builder.is_schema_up;
            if (num == null) {
                this.is_schema_up = DEFAULT_IS_SCHEMA_UP;
            } else {
                this.is_schema_up = num;
            }
            Integer num2 = builder.is_first_up;
            if (num2 == null) {
                this.is_first_up = DEFAULT_IS_FIRST_UP;
                return;
            } else {
                this.is_first_up = num2;
                return;
            }
        }
        this.f1309common = builder.f1310common;
        this.is_schema_up = builder.is_schema_up;
        this.is_first_up = builder.is_first_up;
    }
}