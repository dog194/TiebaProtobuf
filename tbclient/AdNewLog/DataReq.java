package tbclient.AdNewLog;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CHANNEL = "";
    public static final Integer DEFAULT_DA_FROM = 0;
    public static final String DEFAULT_DA_LOCATE = "";
    public static final String DEFAULT_DA_TYPE = "";
    public static final String DEFAULT_EXTRA_PARAM = "";
    public static final String DEFAULT_ORDER_ID = "";
    public static final String DEFAULT_TOKEN = "";

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String channel;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1315common;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer da_from;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String da_locate;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String da_type;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String extra_param;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String order_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String token;

    public static final class Builder extends Message.Builder<DataReq> {
        public String channel;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1316common;
        public Integer da_from;
        public String da_locate;
        public String da_type;
        public String extra_param;
        public String order_id;
        public String token;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1316common = dataReq.f1315common;
            this.token = dataReq.token;
            this.da_locate = dataReq.da_locate;
            this.da_from = dataReq.da_from;
            this.extra_param = dataReq.extra_param;
            this.order_id = dataReq.order_id;
            this.da_type = dataReq.da_type;
            this.channel = dataReq.channel;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1315common = builder.f1316common;
            String str = builder.token;
            if (str == null) {
                this.token = "";
            } else {
                this.token = str;
            }
            String str2 = builder.da_locate;
            if (str2 == null) {
                this.da_locate = "";
            } else {
                this.da_locate = str2;
            }
            Integer num = builder.da_from;
            if (num == null) {
                this.da_from = DEFAULT_DA_FROM;
            } else {
                this.da_from = num;
            }
            String str3 = builder.extra_param;
            if (str3 == null) {
                this.extra_param = "";
            } else {
                this.extra_param = str3;
            }
            String str4 = builder.order_id;
            if (str4 == null) {
                this.order_id = "";
            } else {
                this.order_id = str4;
            }
            String str5 = builder.da_type;
            if (str5 == null) {
                this.da_type = "";
            } else {
                this.da_type = str5;
            }
            String str6 = builder.channel;
            if (str6 == null) {
                this.channel = "";
                return;
            } else {
                this.channel = str6;
                return;
            }
        }
        this.f1315common = builder.f1316common;
        this.token = builder.token;
        this.da_locate = builder.da_locate;
        this.da_from = builder.da_from;
        this.extra_param = builder.extra_param;
        this.order_id = builder.order_id;
        this.da_type = builder.da_type;
        this.channel = builder.channel;
    }
}