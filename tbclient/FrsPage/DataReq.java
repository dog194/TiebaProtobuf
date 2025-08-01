package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AD_BEAR_CONTEXT = "";
    public static final String DEFAULT_AD_BEAR_SID = "";
    public static final Double DEFAULT_AD_BEAR_SID_PRICE;
    public static final String DEFAULT_AD_CONTEXT_LIST = "";
    public static final String DEFAULT_AD_EXTERNAL_INFO = "";
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final Integer DEFAULT_CALL_FROM;
    public static final String DEFAULT_CALL_URL = "";
    public static final Integer DEFAULT_CATEGORY_ID;
    public static final String DEFAULT_CHATROOM_NEW_MSG = "";
    public static final Boolean DEFAULT_CHECK_LOGIN;
    public static final Integer DEFAULT_CLASS_ID;
    public static final String DEFAULT_COOKIE = "";
    public static final Integer DEFAULT_CTIME;
    public static final Integer DEFAULT_DATA_SIZE;
    public static final String DEFAULT_DA_IDFA = "";
    public static final Boolean DEFAULT_DEBUG;
    public static final Integer DEFAULT_DEFAULT_SORT_TYPE;
    public static final String DEFAULT_EMAIL = "";
    public static final Integer DEFAULT_FIRST_GET_LESS_DATA;
    public static final Integer DEFAULT_FIRST_GET_NORMAL_DATA;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_FRS_TAB_TYPE_DEFAULT = "";
    public static final Integer DEFAULT_HAS_AD_BEAR;
    public static final Long DEFAULT_HOT_THREAD_ID;
    public static final Integer DEFAULT_IP_INT;
    public static final String DEFAULT_IP_STR = "";
    public static final Integer DEFAULT_ISSDK;
    public static final Integer DEFAULT_IS_DEFAULT_NAVTAB;
    public static final Integer DEFAULT_IS_NEWFEED;
    public static final Integer DEFAULT_IS_NEWFRS;
    public static final Integer DEFAULT_IS_SELECTION;
    public static final String DEFAULT_KW = "";
    public static final String DEFAULT_LASTIDS = "";
    public static final Long DEFAULT_LAST_CLICK_TID;
    public static final Integer DEFAULT_LOAD_TYPE;
    public static final Boolean DEFAULT_LOGIN;
    public static final String DEFAULT_LOG_PARAM = "";
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_MODULE_NAME = "";
    public static final Integer DEFAULT_NET_ERROR;
    public static final Integer DEFAULT_NO_UN;
    public static final String DEFAULT_OBJ_LOCATE = "";
    public static final String DEFAULT_OBJ_SOURCE = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final Integer DEFAULT_PN;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_PUSH_TID;
    public static final Integer DEFAULT_Q_TYPE;
    public static final Integer DEFAULT_REQUEST_TIMES;
    public static final Integer DEFAULT_RESULT_NUM;
    public static final Double DEFAULT_SCR_DIP;
    public static final String DEFAULT_SHOUBAI_CUID = "";
    public static final String DEFAULT_SIMPLIFY_FIELD = "";
    public static final Integer DEFAULT_SMILE_GRADE;
    public static final Integer DEFAULT_SORT_TYPE;
    public static final Integer DEFAULT_ST_PARAM;
    public static final String DEFAULT_ST_TYPE = "";
    public static final Boolean DEFAULT_SUPPORT_NOUN;
    public static final String DEFAULT_TOP_CARD_ID = "";
    public static final String DEFAULT_UP_SCHEMA = "";
    public static final Long DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_YUELAOU_LOCATE = "";
    public static final String DEFAULT_YUELAOU_PARAMS = "";

    @ProtoField(tag = 65, type = Message.Datatype.STRING)
    public final String ad_bear_context;

    @ProtoField(tag = 67, type = Message.Datatype.STRING)
    public final String ad_bear_sid;

    @ProtoField(tag = 68, type = Message.Datatype.DOUBLE)
    public final Double ad_bear_sid_price;

    @ProtoField(tag = 60, type = Message.Datatype.STRING)
    public final String ad_context_list;

    @ProtoField(tag = 62, type = Message.Datatype.STRING)
    public final String ad_ext_params;

    @ProtoField(tag = 78, type = Message.Datatype.STRING)
    public final String ad_external_info;

    @ProtoField(tag = 51)
    public final AdParam ad_param;

    @ProtoField(tag = 50)
    public final AppPosInfo app_pos;

    @ProtoField(tag = 64)
    public final AppTransmitData app_transmit_data;

    @ProtoField(tag = 56, type = Message.Datatype.INT32)
    public final Integer call_from;

    @ProtoField(tag = 54, type = Message.Datatype.STRING)
    public final String call_url;

    @ProtoField(tag = 44, type = Message.Datatype.INT32)
    public final Integer category_id;

    @ProtoField(tag = 72, type = Message.Datatype.STRING)
    public final String chatroom_new_msg;

    @ProtoField(tag = 20, type = Message.Datatype.BOOL)
    public final Boolean check_login;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer cid;

    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer class_id;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 39)
    public final CommonReq f1365common;

    @ProtoField(tag = 38, type = Message.Datatype.STRING)
    public final String cookie;

    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer ctime;

    @ProtoField(tag = 42, type = Message.Datatype.STRING)
    public final String da_idfa;

    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer data_size;

    @ProtoField(tag = 37, type = Message.Datatype.BOOL)
    public final Boolean debug;

    @ProtoField(tag = 63, type = Message.Datatype.INT32)
    public final Integer default_sort_type;

    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String email;

    @ProtoField(tag = 91, type = Message.Datatype.INT32)
    public final Integer first_get_less_data;

    @ProtoField(tag = 92, type = Message.Datatype.INT32)
    public final Integer first_get_normal_data;

    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer frs_rn;

    @ProtoField(tag = 75, type = Message.Datatype.STRING)
    public final String frs_tab_type_default;

    @ProtoField(tag = 66, type = Message.Datatype.INT32)
    public final Integer has_ad_bear;

    @ProtoField(tag = 58, type = Message.Datatype.INT64)
    public final Long hot_thread_id;

    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer ip_int;

    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String ip_str;

    @ProtoField(tag = 59, type = Message.Datatype.INT32)
    public final Integer is_default_navtab;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_good;

    @ProtoField(tag = 71, type = Message.Datatype.INT32)
    public final Integer is_newfeed;

    @ProtoField(tag = 73, type = Message.Datatype.INT32)
    public final Integer is_newfrs;

    @ProtoField(tag = 55, type = Message.Datatype.INT32)
    public final Integer is_selection;

    @ProtoField(tag = 41, type = Message.Datatype.INT32)
    public final Integer issdk;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String kw;

    @ProtoField(tag = 48, type = Message.Datatype.UINT64)
    public final Long last_click_tid;

    @ProtoField(tag = 40, type = Message.Datatype.STRING)
    public final String lastids;

    @ProtoField(tag = 49, type = Message.Datatype.INT32)
    public final Integer load_type;

    @ProtoField(tag = 76, type = Message.Datatype.STRING)
    public final String log_param;

    @ProtoField(tag = 30, type = Message.Datatype.BOOL)
    public final Boolean login;

    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String mobile;

    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String module_name;

    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer need_badge;

    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer net_error;

    @ProtoField(tag = 33, type = Message.Datatype.INT32)
    public final Integer no_un;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer noval;

    @ProtoField(tag = 52, type = Message.Datatype.STRING)
    public final String obj_locate;

    @ProtoField(tag = 53, type = Message.Datatype.STRING)
    public final String obj_source;

    @ProtoField(tag = 43, type = Message.Datatype.STRING)
    public final String platform;

    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer pn;

    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String portrait;

    @ProtoField(tag = 70, type = Message.Datatype.INT64)
    public final Long push_tid;

    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer q_type;

    @ProtoField(tag = 69, type = Message.Datatype.INT32)
    public final Integer request_times;

    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer result_num;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rn;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rn_need;

    @ProtoField(tag = 13, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer scr_h;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer scr_w;

    @ProtoField(tag = 57, type = Message.Datatype.STRING)
    public final String shoubai_cuid;

    @ProtoField(tag = 77, type = Message.Datatype.STRING)
    public final String simplify_field;

    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer smile_grade;

    @ProtoField(tag = 47, type = Message.Datatype.INT32)
    public final Integer sort_type;

    @ProtoField(tag = 27, type = Message.Datatype.INT32)
    public final Integer st_param;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String st_type;

    @ProtoField(tag = 29, type = Message.Datatype.BOOL)
    public final Boolean support_noun;

    @ProtoField(tag = 74, type = Message.Datatype.STRING)
    public final String top_card_id;

    @ProtoField(tag = 61, type = Message.Datatype.STRING)
    public final String up_schema;

    @ProtoField(tag = 31, type = Message.Datatype.INT64)
    public final Long user_id;

    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String user_name;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer with_group;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer withcal;

    @ProtoField(tag = 45, type = Message.Datatype.STRING)
    public final String yuelaou_locate;

    @ProtoField(tag = 46, type = Message.Datatype.STRING)
    public final String yuelaou_params;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_RN_NEED = 0;
    public static final Integer DEFAULT_IS_GOOD = 0;
    public static final Integer DEFAULT_CID = 0;
    public static final Integer DEFAULT_WITHCAL = 0;
    public static final Integer DEFAULT_NOVAL = 0;
    public static final Integer DEFAULT_WITH_GROUP = 0;
    public static final Integer DEFAULT_NEED_BADGE = 0;
    public static final Integer DEFAULT_FRS_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;

    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_bear_context;
        public String ad_bear_sid;
        public Double ad_bear_sid_price;
        public String ad_context_list;
        public String ad_ext_params;
        public String ad_external_info;
        public AdParam ad_param;
        public AppPosInfo app_pos;
        public AppTransmitData app_transmit_data;
        public Integer call_from;
        public String call_url;
        public Integer category_id;
        public String chatroom_new_msg;
        public Boolean check_login;
        public Integer cid;
        public Integer class_id;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1366common;
        public String cookie;
        public Integer ctime;
        public String da_idfa;
        public Integer data_size;
        public Boolean debug;
        public Integer default_sort_type;
        public String email;
        public Integer first_get_less_data;
        public Integer first_get_normal_data;
        public String forum_name;
        public Integer frs_rn;
        public String frs_tab_type_default;
        public Integer has_ad_bear;
        public Long hot_thread_id;
        public Integer ip_int;
        public String ip_str;
        public Integer is_default_navtab;
        public Integer is_good;
        public Integer is_newfeed;
        public Integer is_newfrs;
        public Integer is_selection;
        public Integer issdk;
        public String kw;
        public Long last_click_tid;
        public String lastids;
        public Integer load_type;
        public String log_param;
        public Boolean login;
        public String mobile;
        public String module_name;
        public Integer need_badge;
        public Integer net_error;
        public Integer no_un;
        public Integer noval;
        public String obj_locate;
        public String obj_source;
        public String platform;
        public Integer pn;
        public String portrait;
        public Long push_tid;
        public Integer q_type;
        public Integer request_times;
        public Integer result_num;
        public Integer rn;
        public Integer rn_need;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String shoubai_cuid;
        public String simplify_field;
        public Integer smile_grade;
        public Integer sort_type;
        public Integer st_param;
        public String st_type;
        public Boolean support_noun;
        public String top_card_id;
        public String up_schema;
        public Long user_id;
        public String user_name;
        public Integer with_group;
        public Integer withcal;
        public String yuelaou_locate;
        public String yuelaou_params;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.kw = dataReq.kw;
            this.rn = dataReq.rn;
            this.rn_need = dataReq.rn_need;
            this.is_good = dataReq.is_good;
            this.cid = dataReq.cid;
            this.withcal = dataReq.withcal;
            this.noval = dataReq.noval;
            this.with_group = dataReq.with_group;
            this.need_badge = dataReq.need_badge;
            this.frs_rn = dataReq.frs_rn;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.pn = dataReq.pn;
            this.st_type = dataReq.st_type;
            this.ctime = dataReq.ctime;
            this.data_size = dataReq.data_size;
            this.net_error = dataReq.net_error;
            this.check_login = dataReq.check_login;
            this.forum_name = dataReq.forum_name;
            this.result_num = dataReq.result_num;
            this.class_id = dataReq.class_id;
            this.ip_str = dataReq.ip_str;
            this.ip_int = dataReq.ip_int;
            this.module_name = dataReq.module_name;
            this.st_param = dataReq.st_param;
            this.smile_grade = dataReq.smile_grade;
            this.support_noun = dataReq.support_noun;
            this.login = dataReq.login;
            this.user_id = dataReq.user_id;
            this.user_name = dataReq.user_name;
            this.no_un = dataReq.no_un;
            this.portrait = dataReq.portrait;
            this.mobile = dataReq.mobile;
            this.email = dataReq.email;
            this.debug = dataReq.debug;
            this.cookie = dataReq.cookie;
            this.f1366common = dataReq.f1365common;
            this.lastids = dataReq.lastids;
            this.issdk = dataReq.issdk;
            this.da_idfa = dataReq.da_idfa;
            this.platform = dataReq.platform;
            this.category_id = dataReq.category_id;
            this.yuelaou_locate = dataReq.yuelaou_locate;
            this.yuelaou_params = dataReq.yuelaou_params;
            this.sort_type = dataReq.sort_type;
            this.last_click_tid = dataReq.last_click_tid;
            this.load_type = dataReq.load_type;
            this.app_pos = dataReq.app_pos;
            this.ad_param = dataReq.ad_param;
            this.obj_locate = dataReq.obj_locate;
            this.obj_source = dataReq.obj_source;
            this.call_url = dataReq.call_url;
            this.is_selection = dataReq.is_selection;
            this.call_from = dataReq.call_from;
            this.shoubai_cuid = dataReq.shoubai_cuid;
            this.hot_thread_id = dataReq.hot_thread_id;
            this.is_default_navtab = dataReq.is_default_navtab;
            this.ad_context_list = dataReq.ad_context_list;
            this.up_schema = dataReq.up_schema;
            this.ad_ext_params = dataReq.ad_ext_params;
            this.default_sort_type = dataReq.default_sort_type;
            this.app_transmit_data = dataReq.app_transmit_data;
            this.ad_bear_context = dataReq.ad_bear_context;
            this.has_ad_bear = dataReq.has_ad_bear;
            this.ad_bear_sid = dataReq.ad_bear_sid;
            this.ad_bear_sid_price = dataReq.ad_bear_sid_price;
            this.request_times = dataReq.request_times;
            this.push_tid = dataReq.push_tid;
            this.is_newfeed = dataReq.is_newfeed;
            this.chatroom_new_msg = dataReq.chatroom_new_msg;
            this.is_newfrs = dataReq.is_newfrs;
            this.top_card_id = dataReq.top_card_id;
            this.frs_tab_type_default = dataReq.frs_tab_type_default;
            this.log_param = dataReq.log_param;
            this.simplify_field = dataReq.simplify_field;
            this.ad_external_info = dataReq.ad_external_info;
            this.first_get_less_data = dataReq.first_get_less_data;
            this.first_get_normal_data = dataReq.first_get_normal_data;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_SCR_DIP = valueOf;
        DEFAULT_Q_TYPE = 0;
        DEFAULT_PN = 0;
        DEFAULT_CTIME = 0;
        DEFAULT_DATA_SIZE = 0;
        DEFAULT_NET_ERROR = 0;
        DEFAULT_CHECK_LOGIN = Boolean.FALSE;
        DEFAULT_RESULT_NUM = 0;
        DEFAULT_CLASS_ID = 0;
        DEFAULT_IP_INT = 0;
        DEFAULT_ST_PARAM = 0;
        DEFAULT_SMILE_GRADE = 0;
        Boolean bool = Boolean.FALSE;
        DEFAULT_SUPPORT_NOUN = bool;
        DEFAULT_LOGIN = bool;
        DEFAULT_USER_ID = 0L;
        DEFAULT_NO_UN = 0;
        DEFAULT_DEBUG = Boolean.FALSE;
        DEFAULT_ISSDK = 0;
        DEFAULT_CATEGORY_ID = 0;
        DEFAULT_SORT_TYPE = 0;
        DEFAULT_LAST_CLICK_TID = 0L;
        DEFAULT_LOAD_TYPE = 0;
        DEFAULT_IS_SELECTION = 0;
        DEFAULT_CALL_FROM = 0;
        DEFAULT_HOT_THREAD_ID = 0L;
        DEFAULT_IS_DEFAULT_NAVTAB = 0;
        DEFAULT_DEFAULT_SORT_TYPE = 0;
        DEFAULT_HAS_AD_BEAR = 0;
        DEFAULT_AD_BEAR_SID_PRICE = valueOf;
        DEFAULT_REQUEST_TIMES = 0;
        DEFAULT_PUSH_TID = 0L;
        DEFAULT_IS_NEWFEED = 0;
        DEFAULT_IS_NEWFRS = 0;
        DEFAULT_FIRST_GET_LESS_DATA = 0;
        DEFAULT_FIRST_GET_NORMAL_DATA = 0;
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.kw;
            if (str == null) {
                this.kw = "";
            } else {
                this.kw = str;
            }
            Integer num = builder.rn;
            if (num == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num;
            }
            Integer num2 = builder.rn_need;
            if (num2 == null) {
                this.rn_need = DEFAULT_RN_NEED;
            } else {
                this.rn_need = num2;
            }
            Integer num3 = builder.is_good;
            if (num3 == null) {
                this.is_good = DEFAULT_IS_GOOD;
            } else {
                this.is_good = num3;
            }
            Integer num4 = builder.cid;
            if (num4 == null) {
                this.cid = DEFAULT_CID;
            } else {
                this.cid = num4;
            }
            Integer num5 = builder.withcal;
            if (num5 == null) {
                this.withcal = DEFAULT_WITHCAL;
            } else {
                this.withcal = num5;
            }
            Integer num6 = builder.noval;
            if (num6 == null) {
                this.noval = DEFAULT_NOVAL;
            } else {
                this.noval = num6;
            }
            Integer num7 = builder.with_group;
            if (num7 == null) {
                this.with_group = DEFAULT_WITH_GROUP;
            } else {
                this.with_group = num7;
            }
            Integer num8 = builder.need_badge;
            if (num8 == null) {
                this.need_badge = DEFAULT_NEED_BADGE;
            } else {
                this.need_badge = num8;
            }
            Integer num9 = builder.frs_rn;
            if (num9 == null) {
                this.frs_rn = DEFAULT_FRS_RN;
            } else {
                this.frs_rn = num9;
            }
            Integer num10 = builder.scr_w;
            if (num10 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num10;
            }
            Integer num11 = builder.scr_h;
            if (num11 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num11;
            }
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d;
            }
            Integer num12 = builder.q_type;
            if (num12 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num12;
            }
            Integer num13 = builder.pn;
            if (num13 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num13;
            }
            String str2 = builder.st_type;
            if (str2 == null) {
                this.st_type = "";
            } else {
                this.st_type = str2;
            }
            Integer num14 = builder.ctime;
            if (num14 == null) {
                this.ctime = DEFAULT_CTIME;
            } else {
                this.ctime = num14;
            }
            Integer num15 = builder.data_size;
            if (num15 == null) {
                this.data_size = DEFAULT_DATA_SIZE;
            } else {
                this.data_size = num15;
            }
            Integer num16 = builder.net_error;
            if (num16 == null) {
                this.net_error = DEFAULT_NET_ERROR;
            } else {
                this.net_error = num16;
            }
            Boolean bool = builder.check_login;
            if (bool == null) {
                this.check_login = DEFAULT_CHECK_LOGIN;
            } else {
                this.check_login = bool;
            }
            String str3 = builder.forum_name;
            if (str3 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str3;
            }
            Integer num17 = builder.result_num;
            if (num17 == null) {
                this.result_num = DEFAULT_RESULT_NUM;
            } else {
                this.result_num = num17;
            }
            Integer num18 = builder.class_id;
            if (num18 == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = num18;
            }
            String str4 = builder.ip_str;
            if (str4 == null) {
                this.ip_str = "";
            } else {
                this.ip_str = str4;
            }
            Integer num19 = builder.ip_int;
            if (num19 == null) {
                this.ip_int = DEFAULT_IP_INT;
            } else {
                this.ip_int = num19;
            }
            String str5 = builder.module_name;
            if (str5 == null) {
                this.module_name = "";
            } else {
                this.module_name = str5;
            }
            Integer num20 = builder.st_param;
            if (num20 == null) {
                this.st_param = DEFAULT_ST_PARAM;
            } else {
                this.st_param = num20;
            }
            Integer num21 = builder.smile_grade;
            if (num21 == null) {
                this.smile_grade = DEFAULT_SMILE_GRADE;
            } else {
                this.smile_grade = num21;
            }
            Boolean bool2 = builder.support_noun;
            if (bool2 == null) {
                this.support_noun = DEFAULT_SUPPORT_NOUN;
            } else {
                this.support_noun = bool2;
            }
            Boolean bool3 = builder.login;
            if (bool3 == null) {
                this.login = DEFAULT_LOGIN;
            } else {
                this.login = bool3;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str6 = builder.user_name;
            if (str6 == null) {
                this.user_name = "";
            } else {
                this.user_name = str6;
            }
            Integer num22 = builder.no_un;
            if (num22 == null) {
                this.no_un = DEFAULT_NO_UN;
            } else {
                this.no_un = num22;
            }
            String str7 = builder.portrait;
            if (str7 == null) {
                this.portrait = "";
            } else {
                this.portrait = str7;
            }
            String str8 = builder.mobile;
            if (str8 == null) {
                this.mobile = "";
            } else {
                this.mobile = str8;
            }
            String str9 = builder.email;
            if (str9 == null) {
                this.email = "";
            } else {
                this.email = str9;
            }
            Boolean bool4 = builder.debug;
            if (bool4 == null) {
                this.debug = DEFAULT_DEBUG;
            } else {
                this.debug = bool4;
            }
            String str10 = builder.cookie;
            if (str10 == null) {
                this.cookie = "";
            } else {
                this.cookie = str10;
            }
            this.f1365common = builder.f1366common;
            String str11 = builder.lastids;
            if (str11 == null) {
                this.lastids = "";
            } else {
                this.lastids = str11;
            }
            Integer num23 = builder.issdk;
            if (num23 == null) {
                this.issdk = DEFAULT_ISSDK;
            } else {
                this.issdk = num23;
            }
            String str12 = builder.da_idfa;
            if (str12 == null) {
                this.da_idfa = "";
            } else {
                this.da_idfa = str12;
            }
            String str13 = builder.platform;
            if (str13 == null) {
                this.platform = "";
            } else {
                this.platform = str13;
            }
            Integer num24 = builder.category_id;
            if (num24 == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = num24;
            }
            String str14 = builder.yuelaou_locate;
            if (str14 == null) {
                this.yuelaou_locate = "";
            } else {
                this.yuelaou_locate = str14;
            }
            String str15 = builder.yuelaou_params;
            if (str15 == null) {
                this.yuelaou_params = "";
            } else {
                this.yuelaou_params = str15;
            }
            Integer num25 = builder.sort_type;
            if (num25 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num25;
            }
            Long l2 = builder.last_click_tid;
            if (l2 == null) {
                this.last_click_tid = DEFAULT_LAST_CLICK_TID;
            } else {
                this.last_click_tid = l2;
            }
            Integer num26 = builder.load_type;
            if (num26 == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = num26;
            }
            this.app_pos = builder.app_pos;
            this.ad_param = builder.ad_param;
            String str16 = builder.obj_locate;
            if (str16 == null) {
                this.obj_locate = "";
            } else {
                this.obj_locate = str16;
            }
            String str17 = builder.obj_source;
            if (str17 == null) {
                this.obj_source = "";
            } else {
                this.obj_source = str17;
            }
            String str18 = builder.call_url;
            if (str18 == null) {
                this.call_url = "";
            } else {
                this.call_url = str18;
            }
            Integer num27 = builder.is_selection;
            if (num27 == null) {
                this.is_selection = DEFAULT_IS_SELECTION;
            } else {
                this.is_selection = num27;
            }
            Integer num28 = builder.call_from;
            if (num28 == null) {
                this.call_from = DEFAULT_CALL_FROM;
            } else {
                this.call_from = num28;
            }
            String str19 = builder.shoubai_cuid;
            if (str19 == null) {
                this.shoubai_cuid = "";
            } else {
                this.shoubai_cuid = str19;
            }
            Long l3 = builder.hot_thread_id;
            if (l3 == null) {
                this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
            } else {
                this.hot_thread_id = l3;
            }
            Integer num29 = builder.is_default_navtab;
            if (num29 == null) {
                this.is_default_navtab = DEFAULT_IS_DEFAULT_NAVTAB;
            } else {
                this.is_default_navtab = num29;
            }
            String str20 = builder.ad_context_list;
            if (str20 == null) {
                this.ad_context_list = "";
            } else {
                this.ad_context_list = str20;
            }
            String str21 = builder.up_schema;
            if (str21 == null) {
                this.up_schema = "";
            } else {
                this.up_schema = str21;
            }
            String str22 = builder.ad_ext_params;
            if (str22 == null) {
                this.ad_ext_params = "";
            } else {
                this.ad_ext_params = str22;
            }
            Integer num30 = builder.default_sort_type;
            if (num30 == null) {
                this.default_sort_type = DEFAULT_DEFAULT_SORT_TYPE;
            } else {
                this.default_sort_type = num30;
            }
            this.app_transmit_data = builder.app_transmit_data;
            String str23 = builder.ad_bear_context;
            if (str23 == null) {
                this.ad_bear_context = "";
            } else {
                this.ad_bear_context = str23;
            }
            Integer num31 = builder.has_ad_bear;
            if (num31 == null) {
                this.has_ad_bear = DEFAULT_HAS_AD_BEAR;
            } else {
                this.has_ad_bear = num31;
            }
            String str24 = builder.ad_bear_sid;
            if (str24 == null) {
                this.ad_bear_sid = "";
            } else {
                this.ad_bear_sid = str24;
            }
            Double d2 = builder.ad_bear_sid_price;
            if (d2 == null) {
                this.ad_bear_sid_price = DEFAULT_AD_BEAR_SID_PRICE;
            } else {
                this.ad_bear_sid_price = d2;
            }
            Integer num32 = builder.request_times;
            if (num32 == null) {
                this.request_times = DEFAULT_REQUEST_TIMES;
            } else {
                this.request_times = num32;
            }
            Long l4 = builder.push_tid;
            if (l4 == null) {
                this.push_tid = DEFAULT_PUSH_TID;
            } else {
                this.push_tid = l4;
            }
            Integer num33 = builder.is_newfeed;
            if (num33 == null) {
                this.is_newfeed = DEFAULT_IS_NEWFEED;
            } else {
                this.is_newfeed = num33;
            }
            String str25 = builder.chatroom_new_msg;
            if (str25 == null) {
                this.chatroom_new_msg = "";
            } else {
                this.chatroom_new_msg = str25;
            }
            Integer num34 = builder.is_newfrs;
            if (num34 == null) {
                this.is_newfrs = DEFAULT_IS_NEWFRS;
            } else {
                this.is_newfrs = num34;
            }
            String str26 = builder.top_card_id;
            if (str26 == null) {
                this.top_card_id = "";
            } else {
                this.top_card_id = str26;
            }
            String str27 = builder.frs_tab_type_default;
            if (str27 == null) {
                this.frs_tab_type_default = "";
            } else {
                this.frs_tab_type_default = str27;
            }
            String str28 = builder.log_param;
            if (str28 == null) {
                this.log_param = "";
            } else {
                this.log_param = str28;
            }
            String str29 = builder.simplify_field;
            if (str29 == null) {
                this.simplify_field = "";
            } else {
                this.simplify_field = str29;
            }
            String str30 = builder.ad_external_info;
            if (str30 == null) {
                this.ad_external_info = "";
            } else {
                this.ad_external_info = str30;
            }
            Integer num35 = builder.first_get_less_data;
            if (num35 == null) {
                this.first_get_less_data = DEFAULT_FIRST_GET_LESS_DATA;
            } else {
                this.first_get_less_data = num35;
            }
            Integer num36 = builder.first_get_normal_data;
            if (num36 == null) {
                this.first_get_normal_data = DEFAULT_FIRST_GET_NORMAL_DATA;
                return;
            } else {
                this.first_get_normal_data = num36;
                return;
            }
        }
        this.kw = builder.kw;
        this.rn = builder.rn;
        this.rn_need = builder.rn_need;
        this.is_good = builder.is_good;
        this.cid = builder.cid;
        this.withcal = builder.withcal;
        this.noval = builder.noval;
        this.with_group = builder.with_group;
        this.need_badge = builder.need_badge;
        this.frs_rn = builder.frs_rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.pn = builder.pn;
        this.st_type = builder.st_type;
        this.ctime = builder.ctime;
        this.data_size = builder.data_size;
        this.net_error = builder.net_error;
        this.check_login = builder.check_login;
        this.forum_name = builder.forum_name;
        this.result_num = builder.result_num;
        this.class_id = builder.class_id;
        this.ip_str = builder.ip_str;
        this.ip_int = builder.ip_int;
        this.module_name = builder.module_name;
        this.st_param = builder.st_param;
        this.smile_grade = builder.smile_grade;
        this.support_noun = builder.support_noun;
        this.login = builder.login;
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.no_un = builder.no_un;
        this.portrait = builder.portrait;
        this.mobile = builder.mobile;
        this.email = builder.email;
        this.debug = builder.debug;
        this.cookie = builder.cookie;
        this.f1365common = builder.f1366common;
        this.lastids = builder.lastids;
        this.issdk = builder.issdk;
        this.da_idfa = builder.da_idfa;
        this.platform = builder.platform;
        this.category_id = builder.category_id;
        this.yuelaou_locate = builder.yuelaou_locate;
        this.yuelaou_params = builder.yuelaou_params;
        this.sort_type = builder.sort_type;
        this.last_click_tid = builder.last_click_tid;
        this.load_type = builder.load_type;
        this.app_pos = builder.app_pos;
        this.ad_param = builder.ad_param;
        this.obj_locate = builder.obj_locate;
        this.obj_source = builder.obj_source;
        this.call_url = builder.call_url;
        this.is_selection = builder.is_selection;
        this.call_from = builder.call_from;
        this.shoubai_cuid = builder.shoubai_cuid;
        this.hot_thread_id = builder.hot_thread_id;
        this.is_default_navtab = builder.is_default_navtab;
        this.ad_context_list = builder.ad_context_list;
        this.up_schema = builder.up_schema;
        this.ad_ext_params = builder.ad_ext_params;
        this.default_sort_type = builder.default_sort_type;
        this.app_transmit_data = builder.app_transmit_data;
        this.ad_bear_context = builder.ad_bear_context;
        this.has_ad_bear = builder.has_ad_bear;
        this.ad_bear_sid = builder.ad_bear_sid;
        this.ad_bear_sid_price = builder.ad_bear_sid_price;
        this.request_times = builder.request_times;
        this.push_tid = builder.push_tid;
        this.is_newfeed = builder.is_newfeed;
        this.chatroom_new_msg = builder.chatroom_new_msg;
        this.is_newfrs = builder.is_newfrs;
        this.top_card_id = builder.top_card_id;
        this.frs_tab_type_default = builder.frs_tab_type_default;
        this.log_param = builder.log_param;
        this.simplify_field = builder.simplify_field;
        this.ad_external_info = builder.ad_external_info;
        this.first_get_less_data = builder.first_get_less_data;
        this.first_get_normal_data = builder.first_get_normal_data;
    }
}