package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_BFROM = "";
    public static final String DEFAULT_FRS_COMMON_INFO = "";
    public static final String DEFAULT_TAB_NAME = "";

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String bfrom;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer call_from;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1423common;

    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long forum_id;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String frs_common_info;

    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer is_newfeed;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_newfrs;

    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long post_id;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer q_type;

    @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_h;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_w;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String tab_name;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_CALL_FROM = 0;
    public static final Integer DEFAULT_IS_NEWFRS = 0;
    public static final Integer DEFAULT_IS_NEWFEED = 0;

    public static final class Builder extends Message.Builder<DataReq> {
        public String bfrom;
        public Integer call_from;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1424common;
        public Long forum_id;
        public String frs_common_info;
        public Integer is_newfeed;
        public Integer is_newfrs;
        public Long post_id;
        public Integer q_type;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String tab_name;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1424common = dataReq.f1423common;
            this.thread_id = dataReq.thread_id;
            this.post_id = dataReq.post_id;
            this.forum_id = dataReq.forum_id;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.bfrom = dataReq.bfrom;
            this.call_from = dataReq.call_from;
            this.frs_common_info = dataReq.frs_common_info;
            this.is_newfrs = dataReq.is_newfrs;
            this.is_newfeed = dataReq.is_newfeed;
            this.tab_name = dataReq.tab_name;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1423common = builder.f1424common;
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.post_id;
            if (l2 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l2;
            }
            Long l3 = builder.forum_id;
            if (l3 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l3;
            }
            Integer num = builder.scr_w;
            if (num == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num;
            }
            Integer num2 = builder.scr_h;
            if (num2 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num2;
            }
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d;
            }
            Integer num3 = builder.q_type;
            if (num3 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num3;
            }
            String str = builder.bfrom;
            if (str == null) {
                this.bfrom = "";
            } else {
                this.bfrom = str;
            }
            Integer num4 = builder.call_from;
            if (num4 == null) {
                this.call_from = DEFAULT_CALL_FROM;
            } else {
                this.call_from = num4;
            }
            String str2 = builder.frs_common_info;
            if (str2 == null) {
                this.frs_common_info = "";
            } else {
                this.frs_common_info = str2;
            }
            Integer num5 = builder.is_newfrs;
            if (num5 == null) {
                this.is_newfrs = DEFAULT_IS_NEWFRS;
            } else {
                this.is_newfrs = num5;
            }
            Integer num6 = builder.is_newfeed;
            if (num6 == null) {
                this.is_newfeed = DEFAULT_IS_NEWFEED;
            } else {
                this.is_newfeed = num6;
            }
            String str3 = builder.tab_name;
            if (str3 == null) {
                this.tab_name = "";
                return;
            } else {
                this.tab_name = str3;
                return;
            }
        }
        this.f1423common = builder.f1424common;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.forum_id = builder.forum_id;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.bfrom = builder.bfrom;
        this.call_from = builder.call_from;
        this.frs_common_info = builder.frs_common_info;
        this.is_newfrs = builder.is_newfrs;
        this.is_newfeed = builder.is_newfeed;
        this.tab_name = builder.tab_name;
    }
}