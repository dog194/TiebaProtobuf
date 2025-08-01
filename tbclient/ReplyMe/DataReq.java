package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CALL_FROM = "";
    public static final String DEFAULT_IDS = "";

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String call_from;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 3)
    public final CommonReq f1525common;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ids;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_first;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pn;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer q_type;

    @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_h;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer scr_w;

    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long tid;

    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long time;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_IS_FIRST = 0;
    public static final Long DEFAULT_TIME = 0L;
    public static final Long DEFAULT_TID = 0L;

    public static final class Builder extends Message.Builder<DataReq> {
        public String call_from;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1526common;
        public String ids;
        public Integer is_first;
        public Integer pn;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Long tid;
        public Long time;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.pn = dataReq.pn;
            this.ids = dataReq.ids;
            this.f1526common = dataReq.f1525common;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.is_first = dataReq.is_first;
            this.call_from = dataReq.call_from;
            this.time = dataReq.time;
            this.tid = dataReq.tid;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            String str = builder.ids;
            if (str == null) {
                this.ids = "";
            } else {
                this.ids = str;
            }
            this.f1525common = builder.f1526common;
            Integer num2 = builder.scr_w;
            if (num2 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num2;
            }
            Integer num3 = builder.scr_h;
            if (num3 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num3;
            }
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d;
            }
            Integer num4 = builder.q_type;
            if (num4 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num4;
            }
            Integer num5 = builder.is_first;
            if (num5 == null) {
                this.is_first = DEFAULT_IS_FIRST;
            } else {
                this.is_first = num5;
            }
            String str2 = builder.call_from;
            if (str2 == null) {
                this.call_from = "";
            } else {
                this.call_from = str2;
            }
            Long l = builder.time;
            if (l == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = l;
            }
            Long l2 = builder.tid;
            if (l2 == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = l2;
                return;
            }
        }
        this.pn = builder.pn;
        this.ids = builder.ids;
        this.f1525common = builder.f1526common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.is_first = builder.is_first;
        this.call_from = builder.call_from;
        this.time = builder.time;
        this.tid = builder.tid;
    }
}