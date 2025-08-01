package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AD_BEAR_CONTEXT = "";
    public static final String DEFAULT_AD_CONTEXT_LIST = "";
    public static final String DEFAULT_AD_EXTERNAL_INFO = "";
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final String DEFAULT_AGE_TAG = "";
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_FIRST_DIR = "";
    public static final String DEFAULT_INVOKE_SOURCE = "";
    public static final String DEFAULT_LASTIDS = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_QUERY_EQID = "";
    public static final String DEFAULT_SECOND_DIR = "";
    public static final String DEFAULT_SEX_TAG = "";
    public static final String DEFAULT_SHOUBAI_CUID = "";

    @ProtoField(tag = 43, type = Message.Datatype.STRING)
    public final String ad_bear_context;

    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String ad_context_list;

    @ProtoField(tag = 37, type = Message.Datatype.STRING)
    public final String ad_ext_params;

    @ProtoField(tag = 45, type = Message.Datatype.STRING)
    public final String ad_external_info;

    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String age_tag;

    @ProtoField(tag = 36)
    public final AppPosInfo app_pos;

    @ProtoField(tag = 38)
    public final AppTransmitData app_transmit_data;

    @ProtoField(tag = 46, type = Message.Datatype.UINT32)
    public final Integer cache_column_style;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1503common;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String da_idfa;

    @ProtoField(tag = 48, type = Message.Datatype.UINT64)
    public final Long fake_forum_id;

    @ProtoField(tag = 47, type = Message.Datatype.UINT64)
    public final Long fake_thread_id;

    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String first_dir;

    @ProtoField(tag = 25, type = Message.Datatype.INT64)
    public final Long from_tid;

    @ProtoField(label = Message.Label.REPEATED, tag = 20, type = Message.Datatype.STRING)
    public final List<String> interest_tag;

    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String invoke_source;

    @ProtoField(tag = 44, type = Message.Datatype.UINT32)
    public final Integer is_new_user;

    @ProtoField(tag = 40, type = Message.Datatype.INT32)
    public final Integer is_newfeed;

    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer issdk;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String lastids;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer load_type;

    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer need_age_module;

    @ProtoField(tag = 22, type = Message.Datatype.UINT32)
    public final Integer need_forumlist;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer need_tags;

    @ProtoField(tag = 27, type = Message.Datatype.INT32)
    public final Integer new_install;

    @ProtoField(tag = 23, type = Message.Datatype.UINT32)
    public final Integer new_net_type;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer page_thread_count;

    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String platform;

    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer pn;

    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer pre_ad_thread_count;

    @ProtoField(tag = 39, type = Message.Datatype.INT64)
    public final Long push_tid;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer q_type;

    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String query_eqid;

    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer request_times;

    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;

    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer scr_h;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_w;

    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String second_dir;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String sex_tag;

    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String shoubai_cuid;

    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer sug_count;

    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer tag_changed;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tag_code;
    public static final Integer DEFAULT_TAG_CODE = 0;
    public static final Integer DEFAULT_NEED_TAGS = 0;
    public static final Integer DEFAULT_LOAD_TYPE = 0;
    public static final Integer DEFAULT_PAGE_THREAD_COUNT = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_SUG_COUNT = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_ISSDK = 0;
    public static final Integer DEFAULT_NEED_AGE_MODULE = 0;
    public static final List<String> DEFAULT_INTEREST_TAG = Collections.emptyList();
    public static final Integer DEFAULT_TAG_CHANGED = 0;
    public static final Integer DEFAULT_NEED_FORUMLIST = 0;
    public static final Integer DEFAULT_NEW_NET_TYPE = 0;
    public static final Long DEFAULT_FROM_TID = 0L;
    public static final Integer DEFAULT_PRE_AD_THREAD_COUNT = 0;
    public static final Integer DEFAULT_NEW_INSTALL = 0;
    public static final Integer DEFAULT_REQUEST_TIMES = 0;
    public static final Long DEFAULT_PUSH_TID = 0L;
    public static final Integer DEFAULT_IS_NEWFEED = 0;
    public static final Integer DEFAULT_IS_NEW_USER = 0;
    public static final Integer DEFAULT_CACHE_COLUMN_STYLE = 0;
    public static final Long DEFAULT_FAKE_THREAD_ID = 0L;
    public static final Long DEFAULT_FAKE_FORUM_ID = 0L;

    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_bear_context;
        public String ad_context_list;
        public String ad_ext_params;
        public String ad_external_info;
        public String age_tag;
        public AppPosInfo app_pos;
        public AppTransmitData app_transmit_data;
        public Integer cache_column_style;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1504common;
        public String da_idfa;
        public Long fake_forum_id;
        public Long fake_thread_id;
        public String first_dir;
        public Long from_tid;
        public List<String> interest_tag;
        public String invoke_source;
        public Integer is_new_user;
        public Integer is_newfeed;
        public Integer issdk;
        public String lastids;
        public Integer load_type;
        public Integer need_age_module;
        public Integer need_forumlist;
        public Integer need_tags;
        public Integer new_install;
        public Integer new_net_type;
        public Integer page_thread_count;
        public String platform;
        public Integer pn;
        public Integer pre_ad_thread_count;
        public Long push_tid;
        public Integer q_type;
        public String query_eqid;
        public Integer request_times;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String second_dir;
        public String sex_tag;
        public String shoubai_cuid;
        public Integer sug_count;
        public Integer tag_changed;
        public Integer tag_code;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1504common = dataReq.f1503common;
            this.tag_code = dataReq.tag_code;
            this.need_tags = dataReq.need_tags;
            this.load_type = dataReq.load_type;
            this.page_thread_count = dataReq.page_thread_count;
            this.pn = dataReq.pn;
            this.sug_count = dataReq.sug_count;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.lastids = dataReq.lastids;
            this.issdk = dataReq.issdk;
            this.da_idfa = dataReq.da_idfa;
            this.platform = dataReq.platform;
            this.sex_tag = dataReq.sex_tag;
            this.age_tag = dataReq.age_tag;
            this.need_age_module = dataReq.need_age_module;
            this.interest_tag = Message.copyOf(dataReq.interest_tag);
            this.tag_changed = dataReq.tag_changed;
            this.need_forumlist = dataReq.need_forumlist;
            this.new_net_type = dataReq.new_net_type;
            this.shoubai_cuid = dataReq.shoubai_cuid;
            this.from_tid = dataReq.from_tid;
            this.pre_ad_thread_count = dataReq.pre_ad_thread_count;
            this.new_install = dataReq.new_install;
            this.request_times = dataReq.request_times;
            this.invoke_source = dataReq.invoke_source;
            this.ad_context_list = dataReq.ad_context_list;
            this.query_eqid = dataReq.query_eqid;
            this.first_dir = dataReq.first_dir;
            this.second_dir = dataReq.second_dir;
            this.app_pos = dataReq.app_pos;
            this.ad_ext_params = dataReq.ad_ext_params;
            this.app_transmit_data = dataReq.app_transmit_data;
            this.push_tid = dataReq.push_tid;
            this.is_newfeed = dataReq.is_newfeed;
            this.ad_bear_context = dataReq.ad_bear_context;
            this.is_new_user = dataReq.is_new_user;
            this.ad_external_info = dataReq.ad_external_info;
            this.cache_column_style = dataReq.cache_column_style;
            this.fake_thread_id = dataReq.fake_thread_id;
            this.fake_forum_id = dataReq.fake_forum_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1503common = builder.f1504common;
            Integer num = builder.tag_code;
            if (num == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = num;
            }
            Integer num2 = builder.need_tags;
            if (num2 == null) {
                this.need_tags = DEFAULT_NEED_TAGS;
            } else {
                this.need_tags = num2;
            }
            Integer num3 = builder.load_type;
            if (num3 == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = num3;
            }
            Integer num4 = builder.page_thread_count;
            if (num4 == null) {
                this.page_thread_count = DEFAULT_PAGE_THREAD_COUNT;
            } else {
                this.page_thread_count = num4;
            }
            Integer num5 = builder.pn;
            if (num5 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num5;
            }
            Integer num6 = builder.sug_count;
            if (num6 == null) {
                this.sug_count = DEFAULT_SUG_COUNT;
            } else {
                this.sug_count = num6;
            }
            Integer num7 = builder.scr_w;
            if (num7 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num7;
            }
            Integer num8 = builder.scr_h;
            if (num8 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num8;
            }
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d;
            }
            Integer num9 = builder.q_type;
            if (num9 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num9;
            }
            String str = builder.lastids;
            if (str == null) {
                this.lastids = "";
            } else {
                this.lastids = str;
            }
            Integer num10 = builder.issdk;
            if (num10 == null) {
                this.issdk = DEFAULT_ISSDK;
            } else {
                this.issdk = num10;
            }
            String str2 = builder.da_idfa;
            if (str2 == null) {
                this.da_idfa = "";
            } else {
                this.da_idfa = str2;
            }
            String str3 = builder.platform;
            if (str3 == null) {
                this.platform = "";
            } else {
                this.platform = str3;
            }
            String str4 = builder.sex_tag;
            if (str4 == null) {
                this.sex_tag = "";
            } else {
                this.sex_tag = str4;
            }
            String str5 = builder.age_tag;
            if (str5 == null) {
                this.age_tag = "";
            } else {
                this.age_tag = str5;
            }
            Integer num11 = builder.need_age_module;
            if (num11 == null) {
                this.need_age_module = DEFAULT_NEED_AGE_MODULE;
            } else {
                this.need_age_module = num11;
            }
            List<String> list = builder.interest_tag;
            if (list == null) {
                this.interest_tag = DEFAULT_INTEREST_TAG;
            } else {
                this.interest_tag = Message.immutableCopyOf(list);
            }
            Integer num12 = builder.tag_changed;
            if (num12 == null) {
                this.tag_changed = DEFAULT_TAG_CHANGED;
            } else {
                this.tag_changed = num12;
            }
            Integer num13 = builder.need_forumlist;
            if (num13 == null) {
                this.need_forumlist = DEFAULT_NEED_FORUMLIST;
            } else {
                this.need_forumlist = num13;
            }
            Integer num14 = builder.new_net_type;
            if (num14 == null) {
                this.new_net_type = DEFAULT_NEW_NET_TYPE;
            } else {
                this.new_net_type = num14;
            }
            String str6 = builder.shoubai_cuid;
            if (str6 == null) {
                this.shoubai_cuid = "";
            } else {
                this.shoubai_cuid = str6;
            }
            Long l = builder.from_tid;
            if (l == null) {
                this.from_tid = DEFAULT_FROM_TID;
            } else {
                this.from_tid = l;
            }
            Integer num15 = builder.pre_ad_thread_count;
            if (num15 == null) {
                this.pre_ad_thread_count = DEFAULT_PRE_AD_THREAD_COUNT;
            } else {
                this.pre_ad_thread_count = num15;
            }
            Integer num16 = builder.new_install;
            if (num16 == null) {
                this.new_install = DEFAULT_NEW_INSTALL;
            } else {
                this.new_install = num16;
            }
            Integer num17 = builder.request_times;
            if (num17 == null) {
                this.request_times = DEFAULT_REQUEST_TIMES;
            } else {
                this.request_times = num17;
            }
            String str7 = builder.invoke_source;
            if (str7 == null) {
                this.invoke_source = "";
            } else {
                this.invoke_source = str7;
            }
            String str8 = builder.ad_context_list;
            if (str8 == null) {
                this.ad_context_list = "";
            } else {
                this.ad_context_list = str8;
            }
            String str9 = builder.query_eqid;
            if (str9 == null) {
                this.query_eqid = "";
            } else {
                this.query_eqid = str9;
            }
            String str10 = builder.first_dir;
            if (str10 == null) {
                this.first_dir = "";
            } else {
                this.first_dir = str10;
            }
            String str11 = builder.second_dir;
            if (str11 == null) {
                this.second_dir = "";
            } else {
                this.second_dir = str11;
            }
            this.app_pos = builder.app_pos;
            String str12 = builder.ad_ext_params;
            if (str12 == null) {
                this.ad_ext_params = "";
            } else {
                this.ad_ext_params = str12;
            }
            this.app_transmit_data = builder.app_transmit_data;
            Long l2 = builder.push_tid;
            if (l2 == null) {
                this.push_tid = DEFAULT_PUSH_TID;
            } else {
                this.push_tid = l2;
            }
            Integer num18 = builder.is_newfeed;
            if (num18 == null) {
                this.is_newfeed = DEFAULT_IS_NEWFEED;
            } else {
                this.is_newfeed = num18;
            }
            String str13 = builder.ad_bear_context;
            if (str13 == null) {
                this.ad_bear_context = "";
            } else {
                this.ad_bear_context = str13;
            }
            Integer num19 = builder.is_new_user;
            if (num19 == null) {
                this.is_new_user = DEFAULT_IS_NEW_USER;
            } else {
                this.is_new_user = num19;
            }
            String str14 = builder.ad_external_info;
            if (str14 == null) {
                this.ad_external_info = "";
            } else {
                this.ad_external_info = str14;
            }
            Integer num20 = builder.cache_column_style;
            if (num20 == null) {
                this.cache_column_style = DEFAULT_CACHE_COLUMN_STYLE;
            } else {
                this.cache_column_style = num20;
            }
            Long l3 = builder.fake_thread_id;
            if (l3 == null) {
                this.fake_thread_id = DEFAULT_FAKE_THREAD_ID;
            } else {
                this.fake_thread_id = l3;
            }
            Long l4 = builder.fake_forum_id;
            if (l4 == null) {
                this.fake_forum_id = DEFAULT_FAKE_FORUM_ID;
                return;
            } else {
                this.fake_forum_id = l4;
                return;
            }
        }
        this.f1503common = builder.f1504common;
        this.tag_code = builder.tag_code;
        this.need_tags = builder.need_tags;
        this.load_type = builder.load_type;
        this.page_thread_count = builder.page_thread_count;
        this.pn = builder.pn;
        this.sug_count = builder.sug_count;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.lastids = builder.lastids;
        this.issdk = builder.issdk;
        this.da_idfa = builder.da_idfa;
        this.platform = builder.platform;
        this.sex_tag = builder.sex_tag;
        this.age_tag = builder.age_tag;
        this.need_age_module = builder.need_age_module;
        this.interest_tag = Message.immutableCopyOf(builder.interest_tag);
        this.tag_changed = builder.tag_changed;
        this.need_forumlist = builder.need_forumlist;
        this.new_net_type = builder.new_net_type;
        this.shoubai_cuid = builder.shoubai_cuid;
        this.from_tid = builder.from_tid;
        this.pre_ad_thread_count = builder.pre_ad_thread_count;
        this.new_install = builder.new_install;
        this.request_times = builder.request_times;
        this.invoke_source = builder.invoke_source;
        this.ad_context_list = builder.ad_context_list;
        this.query_eqid = builder.query_eqid;
        this.first_dir = builder.first_dir;
        this.second_dir = builder.second_dir;
        this.app_pos = builder.app_pos;
        this.ad_ext_params = builder.ad_ext_params;
        this.app_transmit_data = builder.app_transmit_data;
        this.push_tid = builder.push_tid;
        this.is_newfeed = builder.is_newfeed;
        this.ad_bear_context = builder.ad_bear_context;
        this.is_new_user = builder.is_new_user;
        this.ad_external_info = builder.ad_external_info;
        this.cache_column_style = builder.cache_column_style;
        this.fake_thread_id = builder.fake_thread_id;
        this.fake_forum_id = builder.fake_forum_id;
    }
}