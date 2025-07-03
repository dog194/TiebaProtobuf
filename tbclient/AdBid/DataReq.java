package tbclient.AdBid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AD_CONTEXT_LIST = "";
    public static final String DEFAULT_AD_EXTERNAL_BANNER_INFO = "";
    public static final String DEFAULT_AD_EXTERNAL_INFO = "";
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final String DEFAULT_CALL_FROM = "";
    public static final String DEFAULT_CID = "";
    public static final String DEFAULT_GAME_FID = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_OBJ_LOCATE = "";
    public static final String DEFAULT_OBJ_PARAM1 = "";
    public static final String DEFAULT_OBJ_SOURCE = "";

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String ad_context_list;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ad_ext_params;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ad_external_banner_info;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ad_external_info;

    @ProtoField(tag = 2)
    public final AppTransmitData app_transmit_data;

    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer back;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String call_from;

    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String cid;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1313common;

    @ProtoField(tag = 21, type = Message.Datatype.UINT64)
    public final Long fid;

    @ProtoField(tag = 16, type = Message.Datatype.INT64)
    public final Long floor_rn;

    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String game_fid;

    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String game_id;

    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer is_comm_reverse;

    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer is_fold_comment_req;

    @ProtoField(tag = 24, type = Message.Datatype.INT32)
    public final Integer issdk;

    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long kz;

    @ProtoField(tag = 22, type = Message.Datatype.INT64)
    public final Long last_pid;

    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer lz;

    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String obj_locate;

    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String obj_param1;

    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String obj_source;

    @ProtoField(tag = 27, type = Message.Datatype.INT32)
    public final Integer page_from;

    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long pid;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer pn;

    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer position;

    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer r;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer rn;

    @ProtoField(tag = 31, type = Message.Datatype.UINT64)
    public final Long tab_id;

    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer with_floor;
    public static final Long DEFAULT_KZ = 0L;
    public static final Long DEFAULT_PID = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_LZ = 0;
    public static final Integer DEFAULT_R = 0;
    public static final Integer DEFAULT_WITH_FLOOR = 0;
    public static final Long DEFAULT_FLOOR_RN = 0L;
    public static final Integer DEFAULT_IS_COMM_REVERSE = 0;
    public static final Long DEFAULT_FID = 0L;
    public static final Long DEFAULT_LAST_PID = 0L;
    public static final Integer DEFAULT_BACK = 0;
    public static final Integer DEFAULT_ISSDK = 0;
    public static final Integer DEFAULT_PAGE_FROM = 0;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_IS_FOLD_COMMENT_REQ = 0;
    public static final Long DEFAULT_TAB_ID = 0L;

    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_context_list;
        public String ad_ext_params;
        public String ad_external_banner_info;
        public String ad_external_info;
        public AppTransmitData app_transmit_data;
        public Integer back;
        public String call_from;
        public String cid;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1314common;
        public Long fid;
        public Long floor_rn;
        public Long forum_id;
        public String game_fid;
        public String game_id;
        public Integer is_comm_reverse;
        public Integer is_fold_comment_req;
        public Integer issdk;
        public Long kz;
        public Long last_pid;
        public Integer lz;
        public String obj_locate;
        public String obj_param1;
        public String obj_source;
        public Integer page_from;
        public Long pid;
        public Integer pn;
        public Integer position;
        public Integer r;
        public Integer rn;
        public Long tab_id;
        public Integer with_floor;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1314common = dataReq.f1313common;
            this.app_transmit_data = dataReq.app_transmit_data;
            this.ad_external_info = dataReq.ad_external_info;
            this.ad_external_banner_info = dataReq.ad_external_banner_info;
            this.call_from = dataReq.call_from;
            this.ad_ext_params = dataReq.ad_ext_params;
            this.ad_context_list = dataReq.ad_context_list;
            this.kz = dataReq.kz;
            this.pid = dataReq.pid;
            this.forum_id = dataReq.forum_id;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.lz = dataReq.lz;
            this.r = dataReq.r;
            this.with_floor = dataReq.with_floor;
            this.floor_rn = dataReq.floor_rn;
            this.is_comm_reverse = dataReq.is_comm_reverse;
            this.obj_source = dataReq.obj_source;
            this.obj_locate = dataReq.obj_locate;
            this.obj_param1 = dataReq.obj_param1;
            this.fid = dataReq.fid;
            this.last_pid = dataReq.last_pid;
            this.back = dataReq.back;
            this.issdk = dataReq.issdk;
            this.cid = dataReq.cid;
            this.game_id = dataReq.game_id;
            this.page_from = dataReq.page_from;
            this.position = dataReq.position;
            this.game_fid = dataReq.game_fid;
            this.is_fold_comment_req = dataReq.is_fold_comment_req;
            this.tab_id = dataReq.tab_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1313common = builder.f1314common;
            this.app_transmit_data = builder.app_transmit_data;
            String str = builder.ad_external_info;
            if (str == null) {
                this.ad_external_info = "";
            } else {
                this.ad_external_info = str;
            }
            String str2 = builder.ad_external_banner_info;
            if (str2 == null) {
                this.ad_external_banner_info = "";
            } else {
                this.ad_external_banner_info = str2;
            }
            String str3 = builder.call_from;
            if (str3 == null) {
                this.call_from = "";
            } else {
                this.call_from = str3;
            }
            String str4 = builder.ad_ext_params;
            if (str4 == null) {
                this.ad_ext_params = "";
            } else {
                this.ad_ext_params = str4;
            }
            String str5 = builder.ad_context_list;
            if (str5 == null) {
                this.ad_context_list = "";
            } else {
                this.ad_context_list = str5;
            }
            Long l = builder.kz;
            if (l == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = l;
            }
            Long l2 = builder.pid;
            if (l2 == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = l2;
            }
            Long l3 = builder.forum_id;
            if (l3 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l3;
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
            Integer num3 = builder.lz;
            if (num3 == null) {
                this.lz = DEFAULT_LZ;
            } else {
                this.lz = num3;
            }
            Integer num4 = builder.r;
            if (num4 == null) {
                this.r = DEFAULT_R;
            } else {
                this.r = num4;
            }
            Integer num5 = builder.with_floor;
            if (num5 == null) {
                this.with_floor = DEFAULT_WITH_FLOOR;
            } else {
                this.with_floor = num5;
            }
            Long l4 = builder.floor_rn;
            if (l4 == null) {
                this.floor_rn = DEFAULT_FLOOR_RN;
            } else {
                this.floor_rn = l4;
            }
            Integer num6 = builder.is_comm_reverse;
            if (num6 == null) {
                this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
            } else {
                this.is_comm_reverse = num6;
            }
            String str6 = builder.obj_source;
            if (str6 == null) {
                this.obj_source = "";
            } else {
                this.obj_source = str6;
            }
            String str7 = builder.obj_locate;
            if (str7 == null) {
                this.obj_locate = "";
            } else {
                this.obj_locate = str7;
            }
            String str8 = builder.obj_param1;
            if (str8 == null) {
                this.obj_param1 = "";
            } else {
                this.obj_param1 = str8;
            }
            Long l5 = builder.fid;
            if (l5 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l5;
            }
            Long l6 = builder.last_pid;
            if (l6 == null) {
                this.last_pid = DEFAULT_LAST_PID;
            } else {
                this.last_pid = l6;
            }
            Integer num7 = builder.back;
            if (num7 == null) {
                this.back = DEFAULT_BACK;
            } else {
                this.back = num7;
            }
            Integer num8 = builder.issdk;
            if (num8 == null) {
                this.issdk = DEFAULT_ISSDK;
            } else {
                this.issdk = num8;
            }
            String str9 = builder.cid;
            if (str9 == null) {
                this.cid = "";
            } else {
                this.cid = str9;
            }
            String str10 = builder.game_id;
            if (str10 == null) {
                this.game_id = "";
            } else {
                this.game_id = str10;
            }
            Integer num9 = builder.page_from;
            if (num9 == null) {
                this.page_from = DEFAULT_PAGE_FROM;
            } else {
                this.page_from = num9;
            }
            Integer num10 = builder.position;
            if (num10 == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = num10;
            }
            String str11 = builder.game_fid;
            if (str11 == null) {
                this.game_fid = "";
            } else {
                this.game_fid = str11;
            }
            Integer num11 = builder.is_fold_comment_req;
            if (num11 == null) {
                this.is_fold_comment_req = DEFAULT_IS_FOLD_COMMENT_REQ;
            } else {
                this.is_fold_comment_req = num11;
            }
            Long l7 = builder.tab_id;
            if (l7 == null) {
                this.tab_id = DEFAULT_TAB_ID;
                return;
            } else {
                this.tab_id = l7;
                return;
            }
        }
        this.f1313common = builder.f1314common;
        this.app_transmit_data = builder.app_transmit_data;
        this.ad_external_info = builder.ad_external_info;
        this.ad_external_banner_info = builder.ad_external_banner_info;
        this.call_from = builder.call_from;
        this.ad_ext_params = builder.ad_ext_params;
        this.ad_context_list = builder.ad_context_list;
        this.kz = builder.kz;
        this.pid = builder.pid;
        this.forum_id = builder.forum_id;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.lz = builder.lz;
        this.r = builder.r;
        this.with_floor = builder.with_floor;
        this.floor_rn = builder.floor_rn;
        this.is_comm_reverse = builder.is_comm_reverse;
        this.obj_source = builder.obj_source;
        this.obj_locate = builder.obj_locate;
        this.obj_param1 = builder.obj_param1;
        this.fid = builder.fid;
        this.last_pid = builder.last_pid;
        this.back = builder.back;
        this.issdk = builder.issdk;
        this.cid = builder.cid;
        this.game_id = builder.game_id;
        this.page_from = builder.page_from;
        this.position = builder.position;
        this.game_fid = builder.game_fid;
        this.is_fold_comment_req = builder.is_fold_comment_req;
        this.tab_id = builder.tab_id;
    }
}