package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppTransmitData;
import tbclient.CommonReq;
import tbclient.PushInfo;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AD_BEAR_PB_BANNER = "";
    public static final String DEFAULT_AD_BEAR_PB_COMMENT = "";
    public static final String DEFAULT_AD_CONTEXT_LIST = "";
    public static final String DEFAULT_AD_EXTERNAL_BANNER_INFO = "";
    public static final String DEFAULT_AD_EXTERNAL_INFO = "";
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final String DEFAULT_CID = "";
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_FR = "";
    public static final String DEFAULT_GAME_FID = "";
    public static final String DEFAULT_GAME_FNAME = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_LOG_PARAMS = "";
    public static final String DEFAULT_MOUNT_BOT_UK = "";
    public static final String DEFAULT_QUERY_WORD = "";
    public static final String DEFAULT_SEARCH_QUERY = "";
    public static final String DEFAULT_ST_TYPE = "";
    public static final String DEFAULT_TAB_TYPE = "";
    public static final String DEFAULT_UP_SCHEMA = "";
    public static final String DEFAULT_YUELAOU_LOCATE = "";

    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String ad_bear_pb_banner;

    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String ad_bear_pb_comment;

    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String ad_context_list;

    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String ad_ext_params;

    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String ad_external_banner_info;

    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String ad_external_info;

    @ProtoField(tag = 18)
    public final AdParam ad_param;

    @ProtoField(tag = 21)
    public final AppTransmitData app_transmit_data;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer back;

    @ProtoField(tag = 37, type = Message.Datatype.INT64)
    public final Long broadcast_id;

    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String cid;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1497common;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String da_idfa;

    @ProtoField(tag = 38, type = Message.Datatype.STRING)
    public final String fr;

    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String game_fid;

    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String game_fname;

    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String game_id;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long kz;

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long last_pid;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String log_params;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer lz;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer mark_type;

    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String mount_bot_uk;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;

    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer position;

    @ProtoField(tag = 32)
    public final PushInfo push_info;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String query_word;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer r;

    @ProtoField(tag = 36, type = Message.Datatype.INT32)
    public final Integer request_times;

    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String search_query;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String st_type;

    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long tab_id;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String tab_type;

    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long top_pid;

    @ProtoField(tag = 34, type = Message.Datatype.INT64)
    public final Long topic_fid;

    @ProtoField(tag = 33, type = Message.Datatype.INT64)
    public final Long topic_id;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String up_schema;

    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String yuelaou_locate;
    public static final Long DEFAULT_KZ = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Long DEFAULT_LAST_PID = 0L;
    public static final Integer DEFAULT_R = 0;
    public static final Integer DEFAULT_BACK = 0;
    public static final Integer DEFAULT_LZ = 0;
    public static final Integer DEFAULT_MARK_TYPE = 0;
    public static final Long DEFAULT_TAB_ID = 0L;
    public static final Long DEFAULT_TOP_PID = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_TOPIC_FID = 0L;
    public static final Integer DEFAULT_REQUEST_TIMES = 0;
    public static final Long DEFAULT_BROADCAST_ID = 0L;

    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_bear_pb_banner;
        public String ad_bear_pb_comment;
        public String ad_context_list;
        public String ad_ext_params;
        public String ad_external_banner_info;
        public String ad_external_info;
        public AdParam ad_param;
        public AppTransmitData app_transmit_data;
        public Integer back;
        public Long broadcast_id;
        public String cid;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1498common;
        public String da_idfa;
        public String fr;
        public String game_fid;
        public String game_fname;
        public String game_id;
        public Long kz;
        public Long last_pid;
        public String log_params;
        public Integer lz;
        public Integer mark_type;
        public String mount_bot_uk;
        public Integer pn;
        public Integer position;
        public PushInfo push_info;
        public String query_word;
        public Integer r;
        public Integer request_times;
        public String search_query;
        public String st_type;
        public Long tab_id;
        public String tab_type;
        public Long top_pid;
        public Long topic_fid;
        public Long topic_id;
        public String up_schema;
        public String yuelaou_locate;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1498common = dataReq.f1497common;
            this.kz = dataReq.kz;
            this.pn = dataReq.pn;
            this.last_pid = dataReq.last_pid;
            this.r = dataReq.r;
            this.back = dataReq.back;
            this.lz = dataReq.lz;
            this.mark_type = dataReq.mark_type;
            this.tab_type = dataReq.tab_type;
            this.tab_id = dataReq.tab_id;
            this.top_pid = dataReq.top_pid;
            this.st_type = dataReq.st_type;
            this.up_schema = dataReq.up_schema;
            this.log_params = dataReq.log_params;
            this.yuelaou_locate = dataReq.yuelaou_locate;
            this.query_word = dataReq.query_word;
            this.da_idfa = dataReq.da_idfa;
            this.ad_param = dataReq.ad_param;
            this.ad_context_list = dataReq.ad_context_list;
            this.ad_ext_params = dataReq.ad_ext_params;
            this.app_transmit_data = dataReq.app_transmit_data;
            this.ad_bear_pb_banner = dataReq.ad_bear_pb_banner;
            this.ad_bear_pb_comment = dataReq.ad_bear_pb_comment;
            this.ad_external_banner_info = dataReq.ad_external_banner_info;
            this.ad_external_info = dataReq.ad_external_info;
            this.game_id = dataReq.game_id;
            this.cid = dataReq.cid;
            this.position = dataReq.position;
            this.game_fid = dataReq.game_fid;
            this.game_fname = dataReq.game_fname;
            this.search_query = dataReq.search_query;
            this.push_info = dataReq.push_info;
            this.topic_id = dataReq.topic_id;
            this.topic_fid = dataReq.topic_fid;
            this.mount_bot_uk = dataReq.mount_bot_uk;
            this.request_times = dataReq.request_times;
            this.broadcast_id = dataReq.broadcast_id;
            this.fr = dataReq.fr;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1497common = builder.f1498common;
            Long l = builder.kz;
            if (l == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = l;
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Long l2 = builder.last_pid;
            if (l2 == null) {
                this.last_pid = DEFAULT_LAST_PID;
            } else {
                this.last_pid = l2;
            }
            Integer num2 = builder.r;
            if (num2 == null) {
                this.r = DEFAULT_R;
            } else {
                this.r = num2;
            }
            Integer num3 = builder.back;
            if (num3 == null) {
                this.back = DEFAULT_BACK;
            } else {
                this.back = num3;
            }
            Integer num4 = builder.lz;
            if (num4 == null) {
                this.lz = DEFAULT_LZ;
            } else {
                this.lz = num4;
            }
            Integer num5 = builder.mark_type;
            if (num5 == null) {
                this.mark_type = DEFAULT_MARK_TYPE;
            } else {
                this.mark_type = num5;
            }
            String str = builder.tab_type;
            if (str == null) {
                this.tab_type = "";
            } else {
                this.tab_type = str;
            }
            Long l3 = builder.tab_id;
            if (l3 == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = l3;
            }
            Long l4 = builder.top_pid;
            if (l4 == null) {
                this.top_pid = DEFAULT_TOP_PID;
            } else {
                this.top_pid = l4;
            }
            String str2 = builder.st_type;
            if (str2 == null) {
                this.st_type = "";
            } else {
                this.st_type = str2;
            }
            String str3 = builder.up_schema;
            if (str3 == null) {
                this.up_schema = "";
            } else {
                this.up_schema = str3;
            }
            String str4 = builder.log_params;
            if (str4 == null) {
                this.log_params = "";
            } else {
                this.log_params = str4;
            }
            String str5 = builder.yuelaou_locate;
            if (str5 == null) {
                this.yuelaou_locate = "";
            } else {
                this.yuelaou_locate = str5;
            }
            String str6 = builder.query_word;
            if (str6 == null) {
                this.query_word = "";
            } else {
                this.query_word = str6;
            }
            String str7 = builder.da_idfa;
            if (str7 == null) {
                this.da_idfa = "";
            } else {
                this.da_idfa = str7;
            }
            this.ad_param = builder.ad_param;
            String str8 = builder.ad_context_list;
            if (str8 == null) {
                this.ad_context_list = "";
            } else {
                this.ad_context_list = str8;
            }
            String str9 = builder.ad_ext_params;
            if (str9 == null) {
                this.ad_ext_params = "";
            } else {
                this.ad_ext_params = str9;
            }
            this.app_transmit_data = builder.app_transmit_data;
            String str10 = builder.ad_bear_pb_banner;
            if (str10 == null) {
                this.ad_bear_pb_banner = "";
            } else {
                this.ad_bear_pb_banner = str10;
            }
            String str11 = builder.ad_bear_pb_comment;
            if (str11 == null) {
                this.ad_bear_pb_comment = "";
            } else {
                this.ad_bear_pb_comment = str11;
            }
            String str12 = builder.ad_external_banner_info;
            if (str12 == null) {
                this.ad_external_banner_info = "";
            } else {
                this.ad_external_banner_info = str12;
            }
            String str13 = builder.ad_external_info;
            if (str13 == null) {
                this.ad_external_info = "";
            } else {
                this.ad_external_info = str13;
            }
            String str14 = builder.game_id;
            if (str14 == null) {
                this.game_id = "";
            } else {
                this.game_id = str14;
            }
            String str15 = builder.cid;
            if (str15 == null) {
                this.cid = "";
            } else {
                this.cid = str15;
            }
            Integer num6 = builder.position;
            if (num6 == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = num6;
            }
            String str16 = builder.game_fid;
            if (str16 == null) {
                this.game_fid = "";
            } else {
                this.game_fid = str16;
            }
            String str17 = builder.game_fname;
            if (str17 == null) {
                this.game_fname = "";
            } else {
                this.game_fname = str17;
            }
            String str18 = builder.search_query;
            if (str18 == null) {
                this.search_query = "";
            } else {
                this.search_query = str18;
            }
            this.push_info = builder.push_info;
            Long l5 = builder.topic_id;
            if (l5 == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l5;
            }
            Long l6 = builder.topic_fid;
            if (l6 == null) {
                this.topic_fid = DEFAULT_TOPIC_FID;
            } else {
                this.topic_fid = l6;
            }
            String str19 = builder.mount_bot_uk;
            if (str19 == null) {
                this.mount_bot_uk = "";
            } else {
                this.mount_bot_uk = str19;
            }
            Integer num7 = builder.request_times;
            if (num7 == null) {
                this.request_times = DEFAULT_REQUEST_TIMES;
            } else {
                this.request_times = num7;
            }
            Long l7 = builder.broadcast_id;
            if (l7 == null) {
                this.broadcast_id = DEFAULT_BROADCAST_ID;
            } else {
                this.broadcast_id = l7;
            }
            String str20 = builder.fr;
            if (str20 == null) {
                this.fr = "";
                return;
            } else {
                this.fr = str20;
                return;
            }
        }
        this.f1497common = builder.f1498common;
        this.kz = builder.kz;
        this.pn = builder.pn;
        this.last_pid = builder.last_pid;
        this.r = builder.r;
        this.back = builder.back;
        this.lz = builder.lz;
        this.mark_type = builder.mark_type;
        this.tab_type = builder.tab_type;
        this.tab_id = builder.tab_id;
        this.top_pid = builder.top_pid;
        this.st_type = builder.st_type;
        this.up_schema = builder.up_schema;
        this.log_params = builder.log_params;
        this.yuelaou_locate = builder.yuelaou_locate;
        this.query_word = builder.query_word;
        this.da_idfa = builder.da_idfa;
        this.ad_param = builder.ad_param;
        this.ad_context_list = builder.ad_context_list;
        this.ad_ext_params = builder.ad_ext_params;
        this.app_transmit_data = builder.app_transmit_data;
        this.ad_bear_pb_banner = builder.ad_bear_pb_banner;
        this.ad_bear_pb_comment = builder.ad_bear_pb_comment;
        this.ad_external_banner_info = builder.ad_external_banner_info;
        this.ad_external_info = builder.ad_external_info;
        this.game_id = builder.game_id;
        this.cid = builder.cid;
        this.position = builder.position;
        this.game_fid = builder.game_fid;
        this.game_fname = builder.game_fname;
        this.search_query = builder.search_query;
        this.push_info = builder.push_info;
        this.topic_id = builder.topic_id;
        this.topic_fid = builder.topic_fid;
        this.mount_bot_uk = builder.mount_bot_uk;
        this.request_times = builder.request_times;
        this.broadcast_id = builder.broadcast_id;
        this.fr = builder.fr;
    }
}