package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdMixFloor;
import tbclient.App;
import tbclient.FeedKV;
import tbclient.ItemInfo;
import tbclient.SortOption;
import tbclient.SportPageHeadInfo;
import tbclient.SportScheduleInfo;
import tbclient.ThreadInfo;
import tbclient.User;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_AD_SAMPLE_MAP_KEY = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<AdMixFloor> ad_mix_list;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String ad_sample_map_key;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer ad_show_select;

    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<App> app_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> general_list;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;

    @ProtoField(tag = 8)
    public final ItemInfo item_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 15)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer new_thread_num;

    @ProtoField(tag = 14)
    public final PageData page_data;

    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<SortOption> sort_option;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer sort_type;

    @ProtoField(tag = 5)
    public final SportPageHeadInfo sport_head_info;

    @ProtoField(tag = 4)
    public final SportScheduleInfo sport_schedule_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<User> user_list;
    public static final List<ThreadInfo> DEFAULT_GENERAL_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_NEW_THREAD_NUM = 0;
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final List<SortOption> DEFAULT_SORT_OPTION = Collections.emptyList();
    public static final List<App> DEFAULT_APP_LIST = Collections.emptyList();
    public static final Integer DEFAULT_AD_SHOW_SELECT = 0;
    public static final List<AdMixFloor> DEFAULT_AD_MIX_LIST = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    public static final class Builder extends Message.Builder<DataRes> {
        public List<AdMixFloor> ad_mix_list;
        public String ad_sample_map_key;
        public Integer ad_show_select;
        public List<App> app_list;
        public List<ThreadInfo> general_list;
        public Integer has_more;
        public ItemInfo item_info;
        public List<FeedKV> log_param;
        public Integer new_thread_num;
        public PageData page_data;
        public List<SortOption> sort_option;
        public Integer sort_type;
        public SportPageHeadInfo sport_head_info;
        public SportScheduleInfo sport_schedule_info;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.general_list = Message.copyOf(dataRes.general_list);
            this.has_more = dataRes.has_more;
            this.user_list = Message.copyOf(dataRes.user_list);
            this.sport_schedule_info = dataRes.sport_schedule_info;
            this.sport_head_info = dataRes.sport_head_info;
            this.new_thread_num = dataRes.new_thread_num;
            this.sort_type = dataRes.sort_type;
            this.item_info = dataRes.item_info;
            this.sort_option = Message.copyOf(dataRes.sort_option);
            this.app_list = Message.copyOf(dataRes.app_list);
            this.ad_show_select = dataRes.ad_show_select;
            this.ad_mix_list = Message.copyOf(dataRes.ad_mix_list);
            this.ad_sample_map_key = dataRes.ad_sample_map_key;
            this.page_data = dataRes.page_data;
            this.log_param = Message.copyOf(dataRes.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.general_list;
            if (list == null) {
                this.general_list = DEFAULT_GENERAL_LIST;
            } else {
                this.general_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            List<User> list2 = builder.user_list;
            if (list2 == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list2);
            }
            this.sport_schedule_info = builder.sport_schedule_info;
            this.sport_head_info = builder.sport_head_info;
            Integer num2 = builder.new_thread_num;
            if (num2 == null) {
                this.new_thread_num = DEFAULT_NEW_THREAD_NUM;
            } else {
                this.new_thread_num = num2;
            }
            Integer num3 = builder.sort_type;
            if (num3 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num3;
            }
            this.item_info = builder.item_info;
            List<SortOption> list3 = builder.sort_option;
            if (list3 == null) {
                this.sort_option = DEFAULT_SORT_OPTION;
            } else {
                this.sort_option = Message.immutableCopyOf(list3);
            }
            List<App> list4 = builder.app_list;
            if (list4 == null) {
                this.app_list = DEFAULT_APP_LIST;
            } else {
                this.app_list = Message.immutableCopyOf(list4);
            }
            Integer num4 = builder.ad_show_select;
            if (num4 == null) {
                this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
            } else {
                this.ad_show_select = num4;
            }
            List<AdMixFloor> list5 = builder.ad_mix_list;
            if (list5 == null) {
                this.ad_mix_list = DEFAULT_AD_MIX_LIST;
            } else {
                this.ad_mix_list = Message.immutableCopyOf(list5);
            }
            String str = builder.ad_sample_map_key;
            if (str == null) {
                this.ad_sample_map_key = "";
            } else {
                this.ad_sample_map_key = str;
            }
            this.page_data = builder.page_data;
            List<FeedKV> list6 = builder.log_param;
            if (list6 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list6);
                return;
            }
        }
        this.general_list = Message.immutableCopyOf(builder.general_list);
        this.has_more = builder.has_more;
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.sport_schedule_info = builder.sport_schedule_info;
        this.sport_head_info = builder.sport_head_info;
        this.new_thread_num = builder.new_thread_num;
        this.sort_type = builder.sort_type;
        this.item_info = builder.item_info;
        this.sort_option = Message.immutableCopyOf(builder.sort_option);
        this.app_list = Message.immutableCopyOf(builder.app_list);
        this.ad_show_select = builder.ad_show_select;
        this.ad_mix_list = Message.immutableCopyOf(builder.ad_mix_list);
        this.ad_sample_map_key = builder.ad_sample_map_key;
        this.page_data = builder.page_data;
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}