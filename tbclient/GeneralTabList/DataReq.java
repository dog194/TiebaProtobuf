package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AD_BEAR_CONTEXT = "";
    public static final String DEFAULT_AD_BEAR_SID = "";
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_FRS_COMMON_INFO = "";
    public static final String DEFAULT_FRS_TAB_TYPE_DEFAULT = "";
    public static final String DEFAULT_LOG_PARAM = "";
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_TOP_CARD_ID = "";

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String ad_bear_context;

    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String ad_bear_sid;

    @ProtoField(tag = 19, type = Message.Datatype.DOUBLE)
    public final Double ad_bear_sid_price;

    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String ad_ext_params;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1367common;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String frs_common_info;

    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String frs_tab_type_default;

    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer has_ad_bear;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_default_navtab;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_general_tab;

    @ProtoField(tag = 27, type = Message.Datatype.UINT32)
    public final Integer is_newfeed;

    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer is_newfrs;

    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer is_video_doublerow;

    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long last_thread_id;

    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String log_param;

    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer partition_type;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pn;

    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer request_times;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer rn;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_dip;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer scr_h;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_w;

    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer sort_type;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tab_id;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String tab_name;

    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer tab_type;

    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String top_card_id;
    public static final Integer DEFAULT_TAB_ID = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_SCR_DIP = 0;
    public static final Long DEFAULT_LAST_THREAD_ID = 0L;
    public static final Integer DEFAULT_IS_DEFAULT_NAVTAB = 0;
    public static final Integer DEFAULT_IS_GENERAL_TAB = 0;
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final Integer DEFAULT_TAB_TYPE = 0;
    public static final Integer DEFAULT_HAS_AD_BEAR = 0;
    public static final Double DEFAULT_AD_BEAR_SID_PRICE = Double.valueOf(0.0d);
    public static final Integer DEFAULT_REQUEST_TIMES = 0;
    public static final Integer DEFAULT_IS_NEWFRS = 0;
    public static final Integer DEFAULT_IS_VIDEO_DOUBLEROW = 0;
    public static final Integer DEFAULT_IS_NEWFEED = 0;
    public static final Integer DEFAULT_PARTITION_TYPE = 0;

    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_bear_context;
        public String ad_bear_sid;
        public Double ad_bear_sid_price;
        public String ad_ext_params;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1368common;
        public Long forum_id;
        public String forum_name;
        public String frs_common_info;
        public String frs_tab_type_default;
        public Integer has_ad_bear;
        public Integer is_default_navtab;
        public Integer is_general_tab;
        public Integer is_newfeed;
        public Integer is_newfrs;
        public Integer is_video_doublerow;
        public Long last_thread_id;
        public String log_param;
        public Integer partition_type;
        public Integer pn;
        public Integer request_times;
        public Integer rn;
        public Integer scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer sort_type;
        public Integer tab_id;
        public String tab_name;
        public Integer tab_type;
        public String top_card_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1368common = dataReq.f1367common;
            this.tab_id = dataReq.tab_id;
            this.forum_id = dataReq.forum_id;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.last_thread_id = dataReq.last_thread_id;
            this.is_default_navtab = dataReq.is_default_navtab;
            this.tab_name = dataReq.tab_name;
            this.is_general_tab = dataReq.is_general_tab;
            this.sort_type = dataReq.sort_type;
            this.tab_type = dataReq.tab_type;
            this.ad_ext_params = dataReq.ad_ext_params;
            this.ad_bear_context = dataReq.ad_bear_context;
            this.has_ad_bear = dataReq.has_ad_bear;
            this.ad_bear_sid = dataReq.ad_bear_sid;
            this.ad_bear_sid_price = dataReq.ad_bear_sid_price;
            this.request_times = dataReq.request_times;
            this.frs_common_info = dataReq.frs_common_info;
            this.is_newfrs = dataReq.is_newfrs;
            this.is_video_doublerow = dataReq.is_video_doublerow;
            this.top_card_id = dataReq.top_card_id;
            this.log_param = dataReq.log_param;
            this.is_newfeed = dataReq.is_newfeed;
            this.frs_tab_type_default = dataReq.frs_tab_type_default;
            this.forum_name = dataReq.forum_name;
            this.partition_type = dataReq.partition_type;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1367common = builder.f1368common;
            Integer num = builder.tab_id;
            if (num == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
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
            } else {
                this.rn = num3;
            }
            Integer num4 = builder.scr_w;
            if (num4 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num4;
            }
            Integer num5 = builder.scr_h;
            if (num5 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num5;
            }
            Integer num6 = builder.scr_dip;
            if (num6 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = num6;
            }
            Long l2 = builder.last_thread_id;
            if (l2 == null) {
                this.last_thread_id = DEFAULT_LAST_THREAD_ID;
            } else {
                this.last_thread_id = l2;
            }
            Integer num7 = builder.is_default_navtab;
            if (num7 == null) {
                this.is_default_navtab = DEFAULT_IS_DEFAULT_NAVTAB;
            } else {
                this.is_default_navtab = num7;
            }
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            Integer num8 = builder.is_general_tab;
            if (num8 == null) {
                this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
            } else {
                this.is_general_tab = num8;
            }
            Integer num9 = builder.sort_type;
            if (num9 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num9;
            }
            Integer num10 = builder.tab_type;
            if (num10 == null) {
                this.tab_type = DEFAULT_TAB_TYPE;
            } else {
                this.tab_type = num10;
            }
            String str2 = builder.ad_ext_params;
            if (str2 == null) {
                this.ad_ext_params = "";
            } else {
                this.ad_ext_params = str2;
            }
            String str3 = builder.ad_bear_context;
            if (str3 == null) {
                this.ad_bear_context = "";
            } else {
                this.ad_bear_context = str3;
            }
            Integer num11 = builder.has_ad_bear;
            if (num11 == null) {
                this.has_ad_bear = DEFAULT_HAS_AD_BEAR;
            } else {
                this.has_ad_bear = num11;
            }
            String str4 = builder.ad_bear_sid;
            if (str4 == null) {
                this.ad_bear_sid = "";
            } else {
                this.ad_bear_sid = str4;
            }
            Double d = builder.ad_bear_sid_price;
            if (d == null) {
                this.ad_bear_sid_price = DEFAULT_AD_BEAR_SID_PRICE;
            } else {
                this.ad_bear_sid_price = d;
            }
            Integer num12 = builder.request_times;
            if (num12 == null) {
                this.request_times = DEFAULT_REQUEST_TIMES;
            } else {
                this.request_times = num12;
            }
            String str5 = builder.frs_common_info;
            if (str5 == null) {
                this.frs_common_info = "";
            } else {
                this.frs_common_info = str5;
            }
            Integer num13 = builder.is_newfrs;
            if (num13 == null) {
                this.is_newfrs = DEFAULT_IS_NEWFRS;
            } else {
                this.is_newfrs = num13;
            }
            Integer num14 = builder.is_video_doublerow;
            if (num14 == null) {
                this.is_video_doublerow = DEFAULT_IS_VIDEO_DOUBLEROW;
            } else {
                this.is_video_doublerow = num14;
            }
            String str6 = builder.top_card_id;
            if (str6 == null) {
                this.top_card_id = "";
            } else {
                this.top_card_id = str6;
            }
            String str7 = builder.log_param;
            if (str7 == null) {
                this.log_param = "";
            } else {
                this.log_param = str7;
            }
            Integer num15 = builder.is_newfeed;
            if (num15 == null) {
                this.is_newfeed = DEFAULT_IS_NEWFEED;
            } else {
                this.is_newfeed = num15;
            }
            String str8 = builder.frs_tab_type_default;
            if (str8 == null) {
                this.frs_tab_type_default = "";
            } else {
                this.frs_tab_type_default = str8;
            }
            String str9 = builder.forum_name;
            if (str9 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str9;
            }
            Integer num16 = builder.partition_type;
            if (num16 == null) {
                this.partition_type = DEFAULT_PARTITION_TYPE;
                return;
            } else {
                this.partition_type = num16;
                return;
            }
        }
        this.f1367common = builder.f1368common;
        this.tab_id = builder.tab_id;
        this.forum_id = builder.forum_id;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.last_thread_id = builder.last_thread_id;
        this.is_default_navtab = builder.is_default_navtab;
        this.tab_name = builder.tab_name;
        this.is_general_tab = builder.is_general_tab;
        this.sort_type = builder.sort_type;
        this.tab_type = builder.tab_type;
        this.ad_ext_params = builder.ad_ext_params;
        this.ad_bear_context = builder.ad_bear_context;
        this.has_ad_bear = builder.has_ad_bear;
        this.ad_bear_sid = builder.ad_bear_sid;
        this.ad_bear_sid_price = builder.ad_bear_sid_price;
        this.request_times = builder.request_times;
        this.frs_common_info = builder.frs_common_info;
        this.is_newfrs = builder.is_newfrs;
        this.is_video_doublerow = builder.is_video_doublerow;
        this.top_card_id = builder.top_card_id;
        this.log_param = builder.log_param;
        this.is_newfeed = builder.is_newfeed;
        this.frs_tab_type_default = builder.frs_tab_type_default;
        this.forum_name = builder.forum_name;
        this.partition_type = builder.partition_type;
    }
}