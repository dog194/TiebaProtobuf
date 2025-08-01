package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ACTIVITY_NAME = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String activity_name;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1311common;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer q_type;

    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer request_times;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer rn;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer scr_dip;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_h;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_w;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_SCR_DIP = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_REQUEST_TIMES = 0;

    public static final class Builder extends Message.Builder<DataReq> {
        public String activity_name;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1312common;
        public Integer pn;
        public Integer q_type;
        public Integer request_times;
        public Integer rn;
        public Integer scr_dip;
        public Integer scr_h;
        public Integer scr_w;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1312common = dataReq.f1311common;
            this.activity_name = dataReq.activity_name;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.request_times = dataReq.request_times;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1311common = builder.f1312common;
            String str = builder.activity_name;
            if (str == null) {
                this.activity_name = "";
            } else {
                this.activity_name = str;
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Integer num2 = builder.rn;
            if (num2 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num2;
            }
            Integer num3 = builder.scr_w;
            if (num3 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num3;
            }
            Integer num4 = builder.scr_h;
            if (num4 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num4;
            }
            Integer num5 = builder.scr_dip;
            if (num5 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = num5;
            }
            Integer num6 = builder.q_type;
            if (num6 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num6;
            }
            Integer num7 = builder.request_times;
            if (num7 == null) {
                this.request_times = DEFAULT_REQUEST_TIMES;
                return;
            } else {
                this.request_times = num7;
                return;
            }
        }
        this.f1311common = builder.f1312common;
        this.activity_name = builder.activity_name;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.request_times = builder.request_times;
    }
}