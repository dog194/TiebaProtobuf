package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
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
    public static final String DEFAULT_CALL_URL = "";
    public static final String DEFAULT_CID = "";
    public static final String DEFAULT_COME_FROM = "";
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_EQID = "";
    public static final String DEFAULT_FEED_NID = "";
    public static final String DEFAULT_GAME_FID = "";
    public static final String DEFAULT_GAME_FNAME = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_JFROM = "";
    public static final String DEFAULT_LASTIDS = "";
    public static final String DEFAULT_LOG_PARAM = "";
    public static final String DEFAULT_MOUNT_BOT_UK = "";
    public static final String DEFAULT_MSG_CLICK = "";
    public static final String DEFAULT_OBJ_LOCATE = "";
    public static final String DEFAULT_OBJ_PARAM1 = "";
    public static final String DEFAULT_OBJ_SOURCE = "";
    public static final String DEFAULT_ORI_UGC_NID = "";
    public static final String DEFAULT_ORI_UGC_TID = "";
    public static final String DEFAULT_ORI_UGC_VID = "";
    public static final String DEFAULT_PB_TEST_INFO = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_QUERY_WORD = "";
    public static final String DEFAULT_SEARCH_QUERY = "";
    public static final String DEFAULT_SHOUBAI_CUID = "";
    public static final String DEFAULT_ST_FROM = "";
    public static final String DEFAULT_ST_LINK = "";
    public static final String DEFAULT_ST_TYPE = "";
    public static final String DEFAULT_TAB_TYPE = "";
    public static final String DEFAULT_UP_SCHEMA = "";
    public static final String DEFAULT_YUELAOU_LOCATE = "";
    public static final String DEFAULT_YUELAOU_PARAMS = "";

    @ProtoField(tag = 95, type = Message.Datatype.STRING)
    public final String ad_bear_pb_banner;

    @ProtoField(tag = 96, type = Message.Datatype.STRING)
    public final String ad_bear_pb_comment;

    @ProtoField(tag = 68, type = Message.Datatype.STRING)
    public final String ad_context_list;

    @ProtoField(tag = 72, type = Message.Datatype.STRING)
    public final String ad_ext_params;

    @ProtoField(tag = 103, type = Message.Datatype.STRING)
    public final String ad_external_banner_info;

    @ProtoField(tag = 104, type = Message.Datatype.STRING)
    public final String ad_external_info;

    @ProtoField(tag = 58)
    public final AdParam ad_param;

    @ProtoField(tag = 67, type = Message.Datatype.INT32)
    public final Integer after_ad_thread_count;

    @ProtoField(tag = 101, type = Message.Datatype.INT64)
    public final Long aladdin_src_id;

    @ProtoField(tag = 53)
    public final AppPosInfo app_pos;

    @ProtoField(tag = 77)
    public final AppTransmitData app_transmit_data;

    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer arround;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer back;

    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer banner;

    @ProtoField(tag = 73, type = Message.Datatype.INT64)
    public final Long broadcast_id;

    @ProtoField(tag = 60, type = Message.Datatype.STRING)
    public final String call_url;

    @ProtoField(tag = 90, type = Message.Datatype.STRING)
    public final String cid;

    @ProtoField(tag = 83, type = Message.Datatype.STRING)
    public final String come_from;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 25)
    public final CommonReq f1499common;

    @ProtoField(tag = 42, type = Message.Datatype.STRING)
    public final String da_idfa;

    @ProtoField(tag = 99, type = Message.Datatype.STRING)
    public final String eqid;

    @ProtoField(tag = 55, type = Message.Datatype.STRING)
    public final String feed_nid;

    @ProtoField(tag = 45, type = Message.Datatype.UINT64)
    public final Long fid;

    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer floor_rn;

    @ProtoField(tag = 74, type = Message.Datatype.INT32)
    public final Integer floor_sort_type;

    @ProtoField(tag = 56, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 71, type = Message.Datatype.INT32)
    public final Integer from_push;

    @ProtoField(tag = 54, type = Message.Datatype.UINT32)
    public final Integer from_smart_frs;

    @ProtoField(tag = 93, type = Message.Datatype.STRING)
    public final String game_fid;

    @ProtoField(tag = 94, type = Message.Datatype.STRING)
    public final String game_fname;

    @ProtoField(tag = 89, type = Message.Datatype.STRING)
    public final String game_id;

    @ProtoField(tag = 76, type = Message.Datatype.INT32)
    public final Integer immersion_video_comment_source;

    @ProtoField(tag = 33, type = Message.Datatype.INT32)
    public final Integer is_comm_reverse;

    @ProtoField(tag = 79, type = Message.Datatype.INT32)
    public final Integer is_edit_comment_req;

    @ProtoField(tag = 78, type = Message.Datatype.INT32)
    public final Integer is_fold_comment_req;

    @ProtoField(tag = 34, type = Message.Datatype.INT32)
    public final Integer is_jumpfloor;

    @ProtoField(tag = 100, type = Message.Datatype.INT32)
    public final Integer is_note;

    @ProtoField(tag = 31, type = Message.Datatype.INT32)
    public final Integer issdk;

    @ProtoField(tag = 46, type = Message.Datatype.STRING)
    public final String jfrom;

    @ProtoField(tag = 44, type = Message.Datatype.UINT64)
    public final Long jid;

    @ProtoField(tag = 35, type = Message.Datatype.INT32)
    public final Integer jumpfloor_num;

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long kz;

    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer last;

    @ProtoField(tag = 81, type = Message.Datatype.INT64)
    public final Long last_pid;

    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String lastids;

    @ProtoField(tag = 88, type = Message.Datatype.STRING)
    public final String log_param;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer lz;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer mark;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer message_id;

    @ProtoField(tag = 87, type = Message.Datatype.STRING)
    public final String mount_bot_uk;

    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String msg_click;

    @ProtoField(tag = 107, type = Message.Datatype.INT32)
    public final Integer need_data_type;

    @ProtoField(tag = 59, type = Message.Datatype.INT32)
    public final Integer need_log;

    @ProtoField(tag = 57, type = Message.Datatype.INT32)
    public final Integer need_repost_recommend_forum;

    @ProtoField(tag = 51, type = Message.Datatype.STRING)
    public final String obj_locate;

    @ProtoField(tag = 52, type = Message.Datatype.STRING)
    public final String obj_param1;

    @ProtoField(tag = 50, type = Message.Datatype.STRING)
    public final String obj_source;

    @ProtoField(tag = 62, type = Message.Datatype.STRING)
    public final String ori_ugc_nid;

    @ProtoField(tag = 63, type = Message.Datatype.STRING)
    public final String ori_ugc_tid;

    @ProtoField(tag = 65, type = Message.Datatype.INT32)
    public final Integer ori_ugc_type;

    @ProtoField(tag = 66, type = Message.Datatype.STRING)
    public final String ori_ugc_vid;

    @ProtoField(tag = 91, type = Message.Datatype.INT32)
    public final Integer page_from;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pb_rn;

    @ProtoField(tag = 70, type = Message.Datatype.STRING)
    public final String pb_test_info;

    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long pid;

    @ProtoField(tag = 43, type = Message.Datatype.STRING)
    public final String platform;

    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer pn;

    @ProtoField(tag = 92, type = Message.Datatype.INT32)
    public final Integer position;

    @ProtoField(tag = 86)
    public final PushInfo push_info;

    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer q_type;

    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String query_word;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer r;

    @ProtoField(tag = 80, type = Message.Datatype.INT32)
    public final Integer request_times;

    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer rn;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer s_model;

    @ProtoField(tag = 16, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;

    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer scr_h;

    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer scr_w;

    @ProtoField(tag = 84, type = Message.Datatype.STRING)
    public final String search_query;

    @ProtoField(tag = 108, type = Message.Datatype.INT32)
    public final Integer session_request_times;

    @ProtoField(tag = 61, type = Message.Datatype.STRING)
    public final String shoubai_cuid;

    @ProtoField(tag = 82, type = Message.Datatype.INT32)
    public final Integer similar_from;

    @ProtoField(tag = 75, type = Message.Datatype.INT32)
    public final Integer source_type;

    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String st_from;

    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String st_link;

    @ProtoField(tag = 29, type = Message.Datatype.INT32)
    public final Integer st_stat;

    @ProtoField(tag = 30, type = Message.Datatype.INT64)
    public final Long st_task;

    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String st_type;

    @ProtoField(tag = 98, type = Message.Datatype.UINT64)
    public final Long tab_id;

    @ProtoField(tag = 97, type = Message.Datatype.STRING)
    public final String tab_type;

    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer thread_type;

    @ProtoField(tag = 102, type = Message.Datatype.INT64)
    public final Long top_pid;

    @ProtoField(tag = 106, type = Message.Datatype.INT64)
    public final Long topic_fid;

    @ProtoField(tag = 105, type = Message.Datatype.INT64)
    public final Long topic_id;

    @ProtoField(tag = 69, type = Message.Datatype.STRING)
    public final String up_schema;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer weipost;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer with_floor;

    @ProtoField(tag = 47, type = Message.Datatype.STRING)
    public final String yuelaou_locate;

    @ProtoField(tag = 48, type = Message.Datatype.STRING)
    public final String yuelaou_params;
    public static final Integer DEFAULT_PB_RN = 0;
    public static final Integer DEFAULT_MARK = 0;
    public static final Integer DEFAULT_BACK = 0;
    public static final Long DEFAULT_KZ = 0L;
    public static final Integer DEFAULT_LZ = 0;
    public static final Integer DEFAULT_R = 0;
    public static final Long DEFAULT_PID = 0L;
    public static final Integer DEFAULT_WITH_FLOOR = 0;
    public static final Integer DEFAULT_FLOOR_RN = 0;
    public static final Integer DEFAULT_WEIPOST = 0;
    public static final Integer DEFAULT_MESSAGE_ID = 0;
    public static final Integer DEFAULT_S_MODEL = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final Integer DEFAULT_BANNER = 0;
    public static final Integer DEFAULT_ARROUND = 0;
    public static final Integer DEFAULT_LAST = 0;
    public static final Integer DEFAULT_ST_STAT = 0;
    public static final Long DEFAULT_ST_TASK = 0L;
    public static final Integer DEFAULT_ISSDK = 0;
    public static final Integer DEFAULT_IS_COMM_REVERSE = 0;
    public static final Integer DEFAULT_IS_JUMPFLOOR = 0;
    public static final Integer DEFAULT_JUMPFLOOR_NUM = 0;
    public static final Long DEFAULT_JID = 0L;
    public static final Long DEFAULT_FID = 0L;
    public static final Integer DEFAULT_FROM_SMART_FRS = 0;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_NEED_REPOST_RECOMMEND_FORUM = 0;
    public static final Integer DEFAULT_NEED_LOG = 0;
    public static final Integer DEFAULT_ORI_UGC_TYPE = 0;
    public static final Integer DEFAULT_AFTER_AD_THREAD_COUNT = 0;
    public static final Integer DEFAULT_FROM_PUSH = 0;
    public static final Long DEFAULT_BROADCAST_ID = 0L;
    public static final Integer DEFAULT_FLOOR_SORT_TYPE = 0;
    public static final Integer DEFAULT_SOURCE_TYPE = 0;
    public static final Integer DEFAULT_IMMERSION_VIDEO_COMMENT_SOURCE = 0;
    public static final Integer DEFAULT_IS_FOLD_COMMENT_REQ = 0;
    public static final Integer DEFAULT_IS_EDIT_COMMENT_REQ = 0;
    public static final Integer DEFAULT_REQUEST_TIMES = 0;
    public static final Long DEFAULT_LAST_PID = 0L;
    public static final Integer DEFAULT_SIMILAR_FROM = 0;
    public static final Integer DEFAULT_PAGE_FROM = 0;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Long DEFAULT_TAB_ID = 0L;
    public static final Integer DEFAULT_IS_NOTE = 0;
    public static final Long DEFAULT_ALADDIN_SRC_ID = 0L;
    public static final Long DEFAULT_TOP_PID = 0L;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_TOPIC_FID = 0L;
    public static final Integer DEFAULT_NEED_DATA_TYPE = 0;
    public static final Integer DEFAULT_SESSION_REQUEST_TIMES = 0;

    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_bear_pb_banner;
        public String ad_bear_pb_comment;
        public String ad_context_list;
        public String ad_ext_params;
        public String ad_external_banner_info;
        public String ad_external_info;
        public AdParam ad_param;
        public Integer after_ad_thread_count;
        public Long aladdin_src_id;
        public AppPosInfo app_pos;
        public AppTransmitData app_transmit_data;
        public Integer arround;
        public Integer back;
        public Integer banner;
        public Long broadcast_id;
        public String call_url;
        public String cid;
        public String come_from;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1500common;
        public String da_idfa;
        public String eqid;
        public String feed_nid;
        public Long fid;
        public Integer floor_rn;
        public Integer floor_sort_type;
        public Long forum_id;
        public Integer from_push;
        public Integer from_smart_frs;
        public String game_fid;
        public String game_fname;
        public String game_id;
        public Integer immersion_video_comment_source;
        public Integer is_comm_reverse;
        public Integer is_edit_comment_req;
        public Integer is_fold_comment_req;
        public Integer is_jumpfloor;
        public Integer is_note;
        public Integer issdk;
        public String jfrom;
        public Long jid;
        public Integer jumpfloor_num;
        public Long kz;
        public Integer last;
        public Long last_pid;
        public String lastids;
        public String log_param;
        public Integer lz;
        public Integer mark;
        public Integer message_id;
        public String mount_bot_uk;
        public String msg_click;
        public Integer need_data_type;
        public Integer need_log;
        public Integer need_repost_recommend_forum;
        public String obj_locate;
        public String obj_param1;
        public String obj_source;
        public String ori_ugc_nid;
        public String ori_ugc_tid;
        public Integer ori_ugc_type;
        public String ori_ugc_vid;
        public Integer page_from;
        public Integer pb_rn;
        public String pb_test_info;
        public Long pid;
        public String platform;
        public Integer pn;
        public Integer position;
        public PushInfo push_info;
        public Integer q_type;
        public String query_word;
        public Integer r;
        public Integer request_times;
        public Integer rn;
        public Integer s_model;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String search_query;
        public Integer session_request_times;
        public String shoubai_cuid;
        public Integer similar_from;
        public Integer source_type;
        public String st_from;
        public String st_link;
        public Integer st_stat;
        public Long st_task;
        public String st_type;
        public Long tab_id;
        public String tab_type;
        public Integer thread_type;
        public Long top_pid;
        public Long topic_fid;
        public Long topic_id;
        public String up_schema;
        public Integer weipost;
        public Integer with_floor;
        public String yuelaou_locate;
        public String yuelaou_params;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.pb_rn = dataReq.pb_rn;
            this.mark = dataReq.mark;
            this.back = dataReq.back;
            this.kz = dataReq.kz;
            this.lz = dataReq.lz;
            this.r = dataReq.r;
            this.pid = dataReq.pid;
            this.with_floor = dataReq.with_floor;
            this.floor_rn = dataReq.floor_rn;
            this.weipost = dataReq.weipost;
            this.message_id = dataReq.message_id;
            this.s_model = dataReq.s_model;
            this.rn = dataReq.rn;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.pn = dataReq.pn;
            this.st_type = dataReq.st_type;
            this.thread_type = dataReq.thread_type;
            this.banner = dataReq.banner;
            this.arround = dataReq.arround;
            this.last = dataReq.last;
            this.msg_click = dataReq.msg_click;
            this.f1500common = dataReq.f1499common;
            this.lastids = dataReq.lastids;
            this.st_from = dataReq.st_from;
            this.st_link = dataReq.st_link;
            this.st_stat = dataReq.st_stat;
            this.st_task = dataReq.st_task;
            this.issdk = dataReq.issdk;
            this.query_word = dataReq.query_word;
            this.is_comm_reverse = dataReq.is_comm_reverse;
            this.is_jumpfloor = dataReq.is_jumpfloor;
            this.jumpfloor_num = dataReq.jumpfloor_num;
            this.da_idfa = dataReq.da_idfa;
            this.platform = dataReq.platform;
            this.jid = dataReq.jid;
            this.fid = dataReq.fid;
            this.jfrom = dataReq.jfrom;
            this.yuelaou_locate = dataReq.yuelaou_locate;
            this.yuelaou_params = dataReq.yuelaou_params;
            this.obj_source = dataReq.obj_source;
            this.obj_locate = dataReq.obj_locate;
            this.obj_param1 = dataReq.obj_param1;
            this.app_pos = dataReq.app_pos;
            this.from_smart_frs = dataReq.from_smart_frs;
            this.feed_nid = dataReq.feed_nid;
            this.forum_id = dataReq.forum_id;
            this.need_repost_recommend_forum = dataReq.need_repost_recommend_forum;
            this.ad_param = dataReq.ad_param;
            this.need_log = dataReq.need_log;
            this.call_url = dataReq.call_url;
            this.shoubai_cuid = dataReq.shoubai_cuid;
            this.ori_ugc_nid = dataReq.ori_ugc_nid;
            this.ori_ugc_tid = dataReq.ori_ugc_tid;
            this.ori_ugc_type = dataReq.ori_ugc_type;
            this.ori_ugc_vid = dataReq.ori_ugc_vid;
            this.after_ad_thread_count = dataReq.after_ad_thread_count;
            this.ad_context_list = dataReq.ad_context_list;
            this.up_schema = dataReq.up_schema;
            this.pb_test_info = dataReq.pb_test_info;
            this.from_push = dataReq.from_push;
            this.ad_ext_params = dataReq.ad_ext_params;
            this.broadcast_id = dataReq.broadcast_id;
            this.floor_sort_type = dataReq.floor_sort_type;
            this.source_type = dataReq.source_type;
            this.immersion_video_comment_source = dataReq.immersion_video_comment_source;
            this.app_transmit_data = dataReq.app_transmit_data;
            this.is_fold_comment_req = dataReq.is_fold_comment_req;
            this.is_edit_comment_req = dataReq.is_edit_comment_req;
            this.request_times = dataReq.request_times;
            this.last_pid = dataReq.last_pid;
            this.similar_from = dataReq.similar_from;
            this.come_from = dataReq.come_from;
            this.search_query = dataReq.search_query;
            this.push_info = dataReq.push_info;
            this.mount_bot_uk = dataReq.mount_bot_uk;
            this.log_param = dataReq.log_param;
            this.game_id = dataReq.game_id;
            this.cid = dataReq.cid;
            this.page_from = dataReq.page_from;
            this.position = dataReq.position;
            this.game_fid = dataReq.game_fid;
            this.game_fname = dataReq.game_fname;
            this.ad_bear_pb_banner = dataReq.ad_bear_pb_banner;
            this.ad_bear_pb_comment = dataReq.ad_bear_pb_comment;
            this.tab_type = dataReq.tab_type;
            this.tab_id = dataReq.tab_id;
            this.eqid = dataReq.eqid;
            this.is_note = dataReq.is_note;
            this.aladdin_src_id = dataReq.aladdin_src_id;
            this.top_pid = dataReq.top_pid;
            this.ad_external_banner_info = dataReq.ad_external_banner_info;
            this.ad_external_info = dataReq.ad_external_info;
            this.topic_id = dataReq.topic_id;
            this.topic_fid = dataReq.topic_fid;
            this.need_data_type = dataReq.need_data_type;
            this.session_request_times = dataReq.session_request_times;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.pb_rn;
            if (num == null) {
                this.pb_rn = DEFAULT_PB_RN;
            } else {
                this.pb_rn = num;
            }
            Integer num2 = builder.mark;
            if (num2 == null) {
                this.mark = DEFAULT_MARK;
            } else {
                this.mark = num2;
            }
            Integer num3 = builder.back;
            if (num3 == null) {
                this.back = DEFAULT_BACK;
            } else {
                this.back = num3;
            }
            Long l = builder.kz;
            if (l == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = l;
            }
            Integer num4 = builder.lz;
            if (num4 == null) {
                this.lz = DEFAULT_LZ;
            } else {
                this.lz = num4;
            }
            Integer num5 = builder.r;
            if (num5 == null) {
                this.r = DEFAULT_R;
            } else {
                this.r = num5;
            }
            Long l2 = builder.pid;
            if (l2 == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = l2;
            }
            Integer num6 = builder.with_floor;
            if (num6 == null) {
                this.with_floor = DEFAULT_WITH_FLOOR;
            } else {
                this.with_floor = num6;
            }
            Integer num7 = builder.floor_rn;
            if (num7 == null) {
                this.floor_rn = DEFAULT_FLOOR_RN;
            } else {
                this.floor_rn = num7;
            }
            Integer num8 = builder.weipost;
            if (num8 == null) {
                this.weipost = DEFAULT_WEIPOST;
            } else {
                this.weipost = num8;
            }
            Integer num9 = builder.message_id;
            if (num9 == null) {
                this.message_id = DEFAULT_MESSAGE_ID;
            } else {
                this.message_id = num9;
            }
            Integer num10 = builder.s_model;
            if (num10 == null) {
                this.s_model = DEFAULT_S_MODEL;
            } else {
                this.s_model = num10;
            }
            Integer num11 = builder.rn;
            if (num11 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num11;
            }
            Integer num12 = builder.scr_w;
            if (num12 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num12;
            }
            Integer num13 = builder.scr_h;
            if (num13 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num13;
            }
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d;
            }
            Integer num14 = builder.q_type;
            if (num14 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num14;
            }
            Integer num15 = builder.pn;
            if (num15 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num15;
            }
            String str = builder.st_type;
            if (str == null) {
                this.st_type = "";
            } else {
                this.st_type = str;
            }
            Integer num16 = builder.thread_type;
            if (num16 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num16;
            }
            Integer num17 = builder.banner;
            if (num17 == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = num17;
            }
            Integer num18 = builder.arround;
            if (num18 == null) {
                this.arround = DEFAULT_ARROUND;
            } else {
                this.arround = num18;
            }
            Integer num19 = builder.last;
            if (num19 == null) {
                this.last = DEFAULT_LAST;
            } else {
                this.last = num19;
            }
            String str2 = builder.msg_click;
            if (str2 == null) {
                this.msg_click = "";
            } else {
                this.msg_click = str2;
            }
            this.f1499common = builder.f1500common;
            String str3 = builder.lastids;
            if (str3 == null) {
                this.lastids = "";
            } else {
                this.lastids = str3;
            }
            String str4 = builder.st_from;
            if (str4 == null) {
                this.st_from = "";
            } else {
                this.st_from = str4;
            }
            String str5 = builder.st_link;
            if (str5 == null) {
                this.st_link = "";
            } else {
                this.st_link = str5;
            }
            Integer num20 = builder.st_stat;
            if (num20 == null) {
                this.st_stat = DEFAULT_ST_STAT;
            } else {
                this.st_stat = num20;
            }
            Long l3 = builder.st_task;
            if (l3 == null) {
                this.st_task = DEFAULT_ST_TASK;
            } else {
                this.st_task = l3;
            }
            Integer num21 = builder.issdk;
            if (num21 == null) {
                this.issdk = DEFAULT_ISSDK;
            } else {
                this.issdk = num21;
            }
            String str6 = builder.query_word;
            if (str6 == null) {
                this.query_word = "";
            } else {
                this.query_word = str6;
            }
            Integer num22 = builder.is_comm_reverse;
            if (num22 == null) {
                this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
            } else {
                this.is_comm_reverse = num22;
            }
            Integer num23 = builder.is_jumpfloor;
            if (num23 == null) {
                this.is_jumpfloor = DEFAULT_IS_JUMPFLOOR;
            } else {
                this.is_jumpfloor = num23;
            }
            Integer num24 = builder.jumpfloor_num;
            if (num24 == null) {
                this.jumpfloor_num = DEFAULT_JUMPFLOOR_NUM;
            } else {
                this.jumpfloor_num = num24;
            }
            String str7 = builder.da_idfa;
            if (str7 == null) {
                this.da_idfa = "";
            } else {
                this.da_idfa = str7;
            }
            String str8 = builder.platform;
            if (str8 == null) {
                this.platform = "";
            } else {
                this.platform = str8;
            }
            Long l4 = builder.jid;
            if (l4 == null) {
                this.jid = DEFAULT_JID;
            } else {
                this.jid = l4;
            }
            Long l5 = builder.fid;
            if (l5 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l5;
            }
            String str9 = builder.jfrom;
            if (str9 == null) {
                this.jfrom = "";
            } else {
                this.jfrom = str9;
            }
            String str10 = builder.yuelaou_locate;
            if (str10 == null) {
                this.yuelaou_locate = "";
            } else {
                this.yuelaou_locate = str10;
            }
            String str11 = builder.yuelaou_params;
            if (str11 == null) {
                this.yuelaou_params = "";
            } else {
                this.yuelaou_params = str11;
            }
            String str12 = builder.obj_source;
            if (str12 == null) {
                this.obj_source = "";
            } else {
                this.obj_source = str12;
            }
            String str13 = builder.obj_locate;
            if (str13 == null) {
                this.obj_locate = "";
            } else {
                this.obj_locate = str13;
            }
            String str14 = builder.obj_param1;
            if (str14 == null) {
                this.obj_param1 = "";
            } else {
                this.obj_param1 = str14;
            }
            this.app_pos = builder.app_pos;
            Integer num25 = builder.from_smart_frs;
            if (num25 == null) {
                this.from_smart_frs = DEFAULT_FROM_SMART_FRS;
            } else {
                this.from_smart_frs = num25;
            }
            String str15 = builder.feed_nid;
            if (str15 == null) {
                this.feed_nid = "";
            } else {
                this.feed_nid = str15;
            }
            Long l6 = builder.forum_id;
            if (l6 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l6;
            }
            Integer num26 = builder.need_repost_recommend_forum;
            if (num26 == null) {
                this.need_repost_recommend_forum = DEFAULT_NEED_REPOST_RECOMMEND_FORUM;
            } else {
                this.need_repost_recommend_forum = num26;
            }
            this.ad_param = builder.ad_param;
            Integer num27 = builder.need_log;
            if (num27 == null) {
                this.need_log = DEFAULT_NEED_LOG;
            } else {
                this.need_log = num27;
            }
            String str16 = builder.call_url;
            if (str16 == null) {
                this.call_url = "";
            } else {
                this.call_url = str16;
            }
            String str17 = builder.shoubai_cuid;
            if (str17 == null) {
                this.shoubai_cuid = "";
            } else {
                this.shoubai_cuid = str17;
            }
            String str18 = builder.ori_ugc_nid;
            if (str18 == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = str18;
            }
            String str19 = builder.ori_ugc_tid;
            if (str19 == null) {
                this.ori_ugc_tid = "";
            } else {
                this.ori_ugc_tid = str19;
            }
            Integer num28 = builder.ori_ugc_type;
            if (num28 == null) {
                this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
            } else {
                this.ori_ugc_type = num28;
            }
            String str20 = builder.ori_ugc_vid;
            if (str20 == null) {
                this.ori_ugc_vid = "";
            } else {
                this.ori_ugc_vid = str20;
            }
            Integer num29 = builder.after_ad_thread_count;
            if (num29 == null) {
                this.after_ad_thread_count = DEFAULT_AFTER_AD_THREAD_COUNT;
            } else {
                this.after_ad_thread_count = num29;
            }
            String str21 = builder.ad_context_list;
            if (str21 == null) {
                this.ad_context_list = "";
            } else {
                this.ad_context_list = str21;
            }
            String str22 = builder.up_schema;
            if (str22 == null) {
                this.up_schema = "";
            } else {
                this.up_schema = str22;
            }
            String str23 = builder.pb_test_info;
            if (str23 == null) {
                this.pb_test_info = "";
            } else {
                this.pb_test_info = str23;
            }
            Integer num30 = builder.from_push;
            if (num30 == null) {
                this.from_push = DEFAULT_FROM_PUSH;
            } else {
                this.from_push = num30;
            }
            String str24 = builder.ad_ext_params;
            if (str24 == null) {
                this.ad_ext_params = "";
            } else {
                this.ad_ext_params = str24;
            }
            Long l7 = builder.broadcast_id;
            if (l7 == null) {
                this.broadcast_id = DEFAULT_BROADCAST_ID;
            } else {
                this.broadcast_id = l7;
            }
            Integer num31 = builder.floor_sort_type;
            if (num31 == null) {
                this.floor_sort_type = DEFAULT_FLOOR_SORT_TYPE;
            } else {
                this.floor_sort_type = num31;
            }
            Integer num32 = builder.source_type;
            if (num32 == null) {
                this.source_type = DEFAULT_SOURCE_TYPE;
            } else {
                this.source_type = num32;
            }
            Integer num33 = builder.immersion_video_comment_source;
            if (num33 == null) {
                this.immersion_video_comment_source = DEFAULT_IMMERSION_VIDEO_COMMENT_SOURCE;
            } else {
                this.immersion_video_comment_source = num33;
            }
            this.app_transmit_data = builder.app_transmit_data;
            Integer num34 = builder.is_fold_comment_req;
            if (num34 == null) {
                this.is_fold_comment_req = DEFAULT_IS_FOLD_COMMENT_REQ;
            } else {
                this.is_fold_comment_req = num34;
            }
            Integer num35 = builder.is_edit_comment_req;
            if (num35 == null) {
                this.is_edit_comment_req = DEFAULT_IS_EDIT_COMMENT_REQ;
            } else {
                this.is_edit_comment_req = num35;
            }
            Integer num36 = builder.request_times;
            if (num36 == null) {
                this.request_times = DEFAULT_REQUEST_TIMES;
            } else {
                this.request_times = num36;
            }
            Long l8 = builder.last_pid;
            if (l8 == null) {
                this.last_pid = DEFAULT_LAST_PID;
            } else {
                this.last_pid = l8;
            }
            Integer num37 = builder.similar_from;
            if (num37 == null) {
                this.similar_from = DEFAULT_SIMILAR_FROM;
            } else {
                this.similar_from = num37;
            }
            String str25 = builder.come_from;
            if (str25 == null) {
                this.come_from = "";
            } else {
                this.come_from = str25;
            }
            String str26 = builder.search_query;
            if (str26 == null) {
                this.search_query = "";
            } else {
                this.search_query = str26;
            }
            this.push_info = builder.push_info;
            String str27 = builder.mount_bot_uk;
            if (str27 == null) {
                this.mount_bot_uk = "";
            } else {
                this.mount_bot_uk = str27;
            }
            String str28 = builder.log_param;
            if (str28 == null) {
                this.log_param = "";
            } else {
                this.log_param = str28;
            }
            String str29 = builder.game_id;
            if (str29 == null) {
                this.game_id = "";
            } else {
                this.game_id = str29;
            }
            String str30 = builder.cid;
            if (str30 == null) {
                this.cid = "";
            } else {
                this.cid = str30;
            }
            Integer num38 = builder.page_from;
            if (num38 == null) {
                this.page_from = DEFAULT_PAGE_FROM;
            } else {
                this.page_from = num38;
            }
            Integer num39 = builder.position;
            if (num39 == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = num39;
            }
            String str31 = builder.game_fid;
            if (str31 == null) {
                this.game_fid = "";
            } else {
                this.game_fid = str31;
            }
            String str32 = builder.game_fname;
            if (str32 == null) {
                this.game_fname = "";
            } else {
                this.game_fname = str32;
            }
            String str33 = builder.ad_bear_pb_banner;
            if (str33 == null) {
                this.ad_bear_pb_banner = "";
            } else {
                this.ad_bear_pb_banner = str33;
            }
            String str34 = builder.ad_bear_pb_comment;
            if (str34 == null) {
                this.ad_bear_pb_comment = "";
            } else {
                this.ad_bear_pb_comment = str34;
            }
            String str35 = builder.tab_type;
            if (str35 == null) {
                this.tab_type = "";
            } else {
                this.tab_type = str35;
            }
            Long l9 = builder.tab_id;
            if (l9 == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = l9;
            }
            String str36 = builder.eqid;
            if (str36 == null) {
                this.eqid = "";
            } else {
                this.eqid = str36;
            }
            Integer num40 = builder.is_note;
            if (num40 == null) {
                this.is_note = DEFAULT_IS_NOTE;
            } else {
                this.is_note = num40;
            }
            Long l10 = builder.aladdin_src_id;
            if (l10 == null) {
                this.aladdin_src_id = DEFAULT_ALADDIN_SRC_ID;
            } else {
                this.aladdin_src_id = l10;
            }
            Long l11 = builder.top_pid;
            if (l11 == null) {
                this.top_pid = DEFAULT_TOP_PID;
            } else {
                this.top_pid = l11;
            }
            String str37 = builder.ad_external_banner_info;
            if (str37 == null) {
                this.ad_external_banner_info = "";
            } else {
                this.ad_external_banner_info = str37;
            }
            String str38 = builder.ad_external_info;
            if (str38 == null) {
                this.ad_external_info = "";
            } else {
                this.ad_external_info = str38;
            }
            Long l12 = builder.topic_id;
            if (l12 == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l12;
            }
            Long l13 = builder.topic_fid;
            if (l13 == null) {
                this.topic_fid = DEFAULT_TOPIC_FID;
            } else {
                this.topic_fid = l13;
            }
            Integer num41 = builder.need_data_type;
            if (num41 == null) {
                this.need_data_type = DEFAULT_NEED_DATA_TYPE;
            } else {
                this.need_data_type = num41;
            }
            Integer num42 = builder.session_request_times;
            if (num42 == null) {
                this.session_request_times = DEFAULT_SESSION_REQUEST_TIMES;
                return;
            } else {
                this.session_request_times = num42;
                return;
            }
        }
        this.pb_rn = builder.pb_rn;
        this.mark = builder.mark;
        this.back = builder.back;
        this.kz = builder.kz;
        this.lz = builder.lz;
        this.r = builder.r;
        this.pid = builder.pid;
        this.with_floor = builder.with_floor;
        this.floor_rn = builder.floor_rn;
        this.weipost = builder.weipost;
        this.message_id = builder.message_id;
        this.s_model = builder.s_model;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.pn = builder.pn;
        this.st_type = builder.st_type;
        this.thread_type = builder.thread_type;
        this.banner = builder.banner;
        this.arround = builder.arround;
        this.last = builder.last;
        this.msg_click = builder.msg_click;
        this.f1499common = builder.f1500common;
        this.lastids = builder.lastids;
        this.st_from = builder.st_from;
        this.st_link = builder.st_link;
        this.st_stat = builder.st_stat;
        this.st_task = builder.st_task;
        this.issdk = builder.issdk;
        this.query_word = builder.query_word;
        this.is_comm_reverse = builder.is_comm_reverse;
        this.is_jumpfloor = builder.is_jumpfloor;
        this.jumpfloor_num = builder.jumpfloor_num;
        this.da_idfa = builder.da_idfa;
        this.platform = builder.platform;
        this.jid = builder.jid;
        this.fid = builder.fid;
        this.jfrom = builder.jfrom;
        this.yuelaou_locate = builder.yuelaou_locate;
        this.yuelaou_params = builder.yuelaou_params;
        this.obj_source = builder.obj_source;
        this.obj_locate = builder.obj_locate;
        this.obj_param1 = builder.obj_param1;
        this.app_pos = builder.app_pos;
        this.from_smart_frs = builder.from_smart_frs;
        this.feed_nid = builder.feed_nid;
        this.forum_id = builder.forum_id;
        this.need_repost_recommend_forum = builder.need_repost_recommend_forum;
        this.ad_param = builder.ad_param;
        this.need_log = builder.need_log;
        this.call_url = builder.call_url;
        this.shoubai_cuid = builder.shoubai_cuid;
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.ori_ugc_vid = builder.ori_ugc_vid;
        this.after_ad_thread_count = builder.after_ad_thread_count;
        this.ad_context_list = builder.ad_context_list;
        this.up_schema = builder.up_schema;
        this.pb_test_info = builder.pb_test_info;
        this.from_push = builder.from_push;
        this.ad_ext_params = builder.ad_ext_params;
        this.broadcast_id = builder.broadcast_id;
        this.floor_sort_type = builder.floor_sort_type;
        this.source_type = builder.source_type;
        this.immersion_video_comment_source = builder.immersion_video_comment_source;
        this.app_transmit_data = builder.app_transmit_data;
        this.is_fold_comment_req = builder.is_fold_comment_req;
        this.is_edit_comment_req = builder.is_edit_comment_req;
        this.request_times = builder.request_times;
        this.last_pid = builder.last_pid;
        this.similar_from = builder.similar_from;
        this.come_from = builder.come_from;
        this.search_query = builder.search_query;
        this.push_info = builder.push_info;
        this.mount_bot_uk = builder.mount_bot_uk;
        this.log_param = builder.log_param;
        this.game_id = builder.game_id;
        this.cid = builder.cid;
        this.page_from = builder.page_from;
        this.position = builder.position;
        this.game_fid = builder.game_fid;
        this.game_fname = builder.game_fname;
        this.ad_bear_pb_banner = builder.ad_bear_pb_banner;
        this.ad_bear_pb_comment = builder.ad_bear_pb_comment;
        this.tab_type = builder.tab_type;
        this.tab_id = builder.tab_id;
        this.eqid = builder.eqid;
        this.is_note = builder.is_note;
        this.aladdin_src_id = builder.aladdin_src_id;
        this.top_pid = builder.top_pid;
        this.ad_external_banner_info = builder.ad_external_banner_info;
        this.ad_external_info = builder.ad_external_info;
        this.topic_id = builder.topic_id;
        this.topic_fid = builder.topic_fid;
        this.need_data_type = builder.need_data_type;
        this.session_request_times = builder.session_request_times;
    }
}