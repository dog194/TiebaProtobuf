package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class HistoryForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FIRST_CATEGORY = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_VISIT_TIME = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;

    @ProtoField(tag = 14)
    public final BlockPopInfo block_pop_info;

    @ProtoField(tag = 24, type = Message.Datatype.INT32)
    public final Integer day_thread_num;

    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String first_category;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer follow_num;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 18, type = Message.Datatype.BOOL)
    public final Boolean has_postpre;

    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer hot_num;

    @ProtoField(tag = 27, type = Message.Datatype.UINT32)
    public final Integer is_forbidden;

    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer is_forum_business_account;

    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer is_like;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_liveforum;

    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer is_official_forum;

    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer level_id;

    @ProtoField(tag = 10, type = Message.Datatype.BOOL)
    public final Boolean need_trans;

    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer post_num;

    @ProtoField(tag = 19)
    public final PostPrefix post_prefix;

    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<FrsTabInfo> tab_info;

    @ProtoField(tag = 21)
    public final RecomTagInfo tag_info;

    @ProtoField(tag = 8)
    public final ThemeColorInfo theme_color;

    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer thread_num;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer unread_num;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String visit_time;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIVEFORUM = 0;
    public static final Integer DEFAULT_UNREAD_NUM = 0;
    public static final Integer DEFAULT_FOLLOW_NUM = 0;
    public static final Boolean DEFAULT_NEED_TRANS = Boolean.FALSE;
    public static final Integer DEFAULT_HOT_NUM = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final List<FrsTabInfo> DEFAULT_TAB_INFO = Collections.emptyList();
    public static final Boolean DEFAULT_HAS_POSTPRE = Boolean.FALSE;
    public static final Integer DEFAULT_IS_FORUM_BUSINESS_ACCOUNT = 0;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_DAY_THREAD_NUM = 0;
    public static final Integer DEFAULT_THREAD_NUM = 0;
    public static final Integer DEFAULT_POST_NUM = 0;
    public static final Integer DEFAULT_IS_FORBIDDEN = 0;
    public static final Integer DEFAULT_IS_OFFICIAL_FORUM = 0;

    public static final class Builder extends Message.Builder<HistoryForumInfo> {
        public String avatar;
        public BlockPopInfo block_pop_info;
        public Integer day_thread_num;
        public String first_category;
        public Integer follow_num;
        public Long forum_id;
        public String forum_name;
        public Boolean has_postpre;
        public Integer hot_num;
        public Integer is_forbidden;
        public Integer is_forum_business_account;
        public Integer is_like;
        public Integer is_liveforum;
        public Integer is_official_forum;
        public Integer level_id;
        public Boolean need_trans;
        public Integer post_num;
        public PostPrefix post_prefix;
        public List<FrsTabInfo> tab_info;
        public RecomTagInfo tag_info;
        public ThemeColorInfo theme_color;
        public Integer thread_num;
        public Integer unread_num;
        public String visit_time;

        public Builder() {
        }

        public Builder(HistoryForumInfo historyForumInfo) {
            super(historyForumInfo);
            if (historyForumInfo == null) {
                return;
            }
            this.forum_id = historyForumInfo.forum_id;
            this.forum_name = historyForumInfo.forum_name;
            this.avatar = historyForumInfo.avatar;
            this.is_liveforum = historyForumInfo.is_liveforum;
            this.unread_num = historyForumInfo.unread_num;
            this.visit_time = historyForumInfo.visit_time;
            this.follow_num = historyForumInfo.follow_num;
            this.theme_color = historyForumInfo.theme_color;
            this.need_trans = historyForumInfo.need_trans;
            this.block_pop_info = historyForumInfo.block_pop_info;
            this.hot_num = historyForumInfo.hot_num;
            this.level_id = historyForumInfo.level_id;
            this.tab_info = Message.copyOf(historyForumInfo.tab_info);
            this.has_postpre = historyForumInfo.has_postpre;
            this.post_prefix = historyForumInfo.post_prefix;
            this.is_forum_business_account = historyForumInfo.is_forum_business_account;
            this.tag_info = historyForumInfo.tag_info;
            this.first_category = historyForumInfo.first_category;
            this.is_like = historyForumInfo.is_like;
            this.day_thread_num = historyForumInfo.day_thread_num;
            this.thread_num = historyForumInfo.thread_num;
            this.post_num = historyForumInfo.post_num;
            this.is_forbidden = historyForumInfo.is_forbidden;
            this.is_official_forum = historyForumInfo.is_official_forum;
        }

        @Override // com.squareup.wire.Message.Builder
        public HistoryForumInfo build(boolean z) {
            return new HistoryForumInfo(this, z);
        }
    }

    public HistoryForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num = builder.is_liveforum;
            if (num == null) {
                this.is_liveforum = DEFAULT_IS_LIVEFORUM;
            } else {
                this.is_liveforum = num;
            }
            Integer num2 = builder.unread_num;
            if (num2 == null) {
                this.unread_num = DEFAULT_UNREAD_NUM;
            } else {
                this.unread_num = num2;
            }
            String str3 = builder.visit_time;
            if (str3 == null) {
                this.visit_time = "";
            } else {
                this.visit_time = str3;
            }
            Integer num3 = builder.follow_num;
            if (num3 == null) {
                this.follow_num = DEFAULT_FOLLOW_NUM;
            } else {
                this.follow_num = num3;
            }
            this.theme_color = builder.theme_color;
            Boolean bool = builder.need_trans;
            if (bool == null) {
                this.need_trans = DEFAULT_NEED_TRANS;
            } else {
                this.need_trans = bool;
            }
            this.block_pop_info = builder.block_pop_info;
            Integer num4 = builder.hot_num;
            if (num4 == null) {
                this.hot_num = DEFAULT_HOT_NUM;
            } else {
                this.hot_num = num4;
            }
            Integer num5 = builder.level_id;
            if (num5 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num5;
            }
            List<FrsTabInfo> list = builder.tab_info;
            if (list == null) {
                this.tab_info = DEFAULT_TAB_INFO;
            } else {
                this.tab_info = Message.immutableCopyOf(list);
            }
            Boolean bool2 = builder.has_postpre;
            if (bool2 == null) {
                this.has_postpre = DEFAULT_HAS_POSTPRE;
            } else {
                this.has_postpre = bool2;
            }
            this.post_prefix = builder.post_prefix;
            Integer num6 = builder.is_forum_business_account;
            if (num6 == null) {
                this.is_forum_business_account = DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
            } else {
                this.is_forum_business_account = num6;
            }
            this.tag_info = builder.tag_info;
            String str4 = builder.first_category;
            if (str4 == null) {
                this.first_category = "";
            } else {
                this.first_category = str4;
            }
            Integer num7 = builder.is_like;
            if (num7 == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num7;
            }
            Integer num8 = builder.day_thread_num;
            if (num8 == null) {
                this.day_thread_num = DEFAULT_DAY_THREAD_NUM;
            } else {
                this.day_thread_num = num8;
            }
            Integer num9 = builder.thread_num;
            if (num9 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = num9;
            }
            Integer num10 = builder.post_num;
            if (num10 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num10;
            }
            Integer num11 = builder.is_forbidden;
            if (num11 == null) {
                this.is_forbidden = DEFAULT_IS_FORBIDDEN;
            } else {
                this.is_forbidden = num11;
            }
            Integer num12 = builder.is_official_forum;
            if (num12 == null) {
                this.is_official_forum = DEFAULT_IS_OFFICIAL_FORUM;
                return;
            } else {
                this.is_official_forum = num12;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.is_liveforum = builder.is_liveforum;
        this.unread_num = builder.unread_num;
        this.visit_time = builder.visit_time;
        this.follow_num = builder.follow_num;
        this.theme_color = builder.theme_color;
        this.need_trans = builder.need_trans;
        this.block_pop_info = builder.block_pop_info;
        this.hot_num = builder.hot_num;
        this.level_id = builder.level_id;
        this.tab_info = Message.immutableCopyOf(builder.tab_info);
        this.has_postpre = builder.has_postpre;
        this.post_prefix = builder.post_prefix;
        this.is_forum_business_account = builder.is_forum_business_account;
        this.tag_info = builder.tag_info;
        this.first_category = builder.first_category;
        this.is_like = builder.is_like;
        this.day_thread_num = builder.day_thread_num;
        this.thread_num = builder.thread_num;
        this.post_num = builder.post_num;
        this.is_forbidden = builder.is_forbidden;
        this.is_official_forum = builder.is_official_forum;
    }
}