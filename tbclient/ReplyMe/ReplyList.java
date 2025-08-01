package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Baijiahao;
import tbclient.NewFloorInfo;
import tbclient.OriginThreadInfo;
import tbclient.User;
import tbclient.Zan;

/* loaded from: classes4.dex */
public final class ReplyList extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_DISPLAY_TEXT = "";
    public static final String DEFAULT_FIRST_SCHEME = "";
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_ITEM_TYPE = "";
    public static final String DEFAULT_POST_FROM = "";
    public static final String DEFAULT_QUOTE_CONTENT = "";
    public static final String DEFAULT_SECOND_SCHEME = "";
    public static final String DEFAULT_TARGET_SCHEME = "";
    public static final String DEFAULT_THIRD_SCHEME = "";
    public static final String DEFAULT_THREAD_IMG_URL = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 27)
    public final Baijiahao baijiahao;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String display_text;

    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String first_scheme;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String fname;

    @ProtoField(tag = 29, type = Message.Datatype.INT32)
    public final Integer has_agree;

    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer hide_fname;

    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer is_bjh;

    @ProtoField(tag = 32, type = Message.Datatype.INT32)
    public final Integer is_filter;

    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_floor;

    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer is_share_thread;

    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer is_story;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String item_type;

    @ProtoField(label = Message.Label.REPEATED, tag = 28)
    public final List<NewFloorInfo> new_floor_info;

    @ProtoField(tag = 21)
    public final OriginThreadInfo origin_thread_info;

    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String post_from;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long post_id;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String quote_content;

    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long quote_pid;

    @ProtoField(tag = 15)
    public final User quote_user;

    @ProtoField(tag = 9)
    public final User replyer;

    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String second_scheme;

    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer server_time;

    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String target_scheme;

    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String third_scheme;

    @ProtoField(tag = 25)
    public final User thread_author_user;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;

    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String thread_img_url;

    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer thread_type;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer time;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer type;

    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer unread;

    @ProtoField(tag = 18, type = Message.Datatype.UINT64)
    public final Long v_forum_id;

    @ProtoField(tag = 13)
    public final Zan zan;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_IS_FLOOR = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_UNREAD = 0;
    public static final Long DEFAULT_QUOTE_PID = 0L;
    public static final Integer DEFAULT_SERVER_TIME = 0;
    public static final Integer DEFAULT_THREAD_TYPE = 0;
    public static final Long DEFAULT_V_FORUM_ID = 0L;
    public static final Integer DEFAULT_HIDE_FNAME = 0;
    public static final Integer DEFAULT_IS_STORY = 0;
    public static final Integer DEFAULT_IS_SHARE_THREAD = 0;
    public static final Integer DEFAULT_IS_BJH = 0;
    public static final List<NewFloorInfo> DEFAULT_NEW_FLOOR_INFO = Collections.emptyList();
    public static final Integer DEFAULT_HAS_AGREE = 0;
    public static final Integer DEFAULT_IS_FILTER = 0;

    public static final class Builder extends Message.Builder<ReplyList> {
        public Baijiahao baijiahao;
        public String content;
        public String display_text;
        public String first_scheme;
        public String fname;
        public Integer has_agree;
        public Integer hide_fname;
        public Integer is_bjh;
        public Integer is_filter;
        public Integer is_floor;
        public Integer is_share_thread;
        public Integer is_story;
        public String item_type;
        public List<NewFloorInfo> new_floor_info;
        public OriginThreadInfo origin_thread_info;
        public String post_from;
        public Long post_id;
        public String quote_content;
        public Long quote_pid;
        public User quote_user;
        public User replyer;
        public String second_scheme;
        public Integer server_time;
        public String target_scheme;
        public String third_scheme;
        public User thread_author_user;
        public Long thread_id;
        public String thread_img_url;
        public Integer thread_type;
        public Integer time;
        public String title;
        public Integer type;
        public Integer unread;
        public Long v_forum_id;
        public Zan zan;

        public Builder() {
        }

        public Builder(ReplyList replyList) {
            super(replyList);
            if (replyList == null) {
                return;
            }
            this.thread_id = replyList.thread_id;
            this.post_id = replyList.post_id;
            this.time = replyList.time;
            this.title = replyList.title;
            this.fname = replyList.fname;
            this.content = replyList.content;
            this.is_floor = replyList.is_floor;
            this.quote_content = replyList.quote_content;
            this.replyer = replyList.replyer;
            this.type = replyList.type;
            this.unread = replyList.unread;
            this.item_type = replyList.item_type;
            this.zan = replyList.zan;
            this.quote_pid = replyList.quote_pid;
            this.quote_user = replyList.quote_user;
            this.server_time = replyList.server_time;
            this.thread_type = replyList.thread_type;
            this.v_forum_id = replyList.v_forum_id;
            this.hide_fname = replyList.hide_fname;
            this.is_story = replyList.is_story;
            this.origin_thread_info = replyList.origin_thread_info;
            this.post_from = replyList.post_from;
            this.is_share_thread = replyList.is_share_thread;
            this.thread_img_url = replyList.thread_img_url;
            this.thread_author_user = replyList.thread_author_user;
            this.is_bjh = replyList.is_bjh;
            this.baijiahao = replyList.baijiahao;
            this.new_floor_info = Message.copyOf(replyList.new_floor_info);
            this.has_agree = replyList.has_agree;
            this.target_scheme = replyList.target_scheme;
            this.display_text = replyList.display_text;
            this.is_filter = replyList.is_filter;
            this.first_scheme = replyList.first_scheme;
            this.second_scheme = replyList.second_scheme;
            this.third_scheme = replyList.third_scheme;
        }

        @Override // com.squareup.wire.Message.Builder
        public ReplyList build(boolean z) {
            return new ReplyList(this, z);
        }
    }

    public ReplyList(Builder builder, boolean z) {
        super(builder);
        if (z) {
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
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.fname;
            if (str2 == null) {
                this.fname = "";
            } else {
                this.fname = str2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
            } else {
                this.content = str3;
            }
            Integer num2 = builder.is_floor;
            if (num2 == null) {
                this.is_floor = DEFAULT_IS_FLOOR;
            } else {
                this.is_floor = num2;
            }
            String str4 = builder.quote_content;
            if (str4 == null) {
                this.quote_content = "";
            } else {
                this.quote_content = str4;
            }
            this.replyer = builder.replyer;
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num3;
            }
            Integer num4 = builder.unread;
            if (num4 == null) {
                this.unread = DEFAULT_UNREAD;
            } else {
                this.unread = num4;
            }
            String str5 = builder.item_type;
            if (str5 == null) {
                this.item_type = "";
            } else {
                this.item_type = str5;
            }
            this.zan = builder.zan;
            Long l3 = builder.quote_pid;
            if (l3 == null) {
                this.quote_pid = DEFAULT_QUOTE_PID;
            } else {
                this.quote_pid = l3;
            }
            this.quote_user = builder.quote_user;
            Integer num5 = builder.server_time;
            if (num5 == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = num5;
            }
            Integer num6 = builder.thread_type;
            if (num6 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num6;
            }
            Long l4 = builder.v_forum_id;
            if (l4 == null) {
                this.v_forum_id = DEFAULT_V_FORUM_ID;
            } else {
                this.v_forum_id = l4;
            }
            Integer num7 = builder.hide_fname;
            if (num7 == null) {
                this.hide_fname = DEFAULT_HIDE_FNAME;
            } else {
                this.hide_fname = num7;
            }
            Integer num8 = builder.is_story;
            if (num8 == null) {
                this.is_story = DEFAULT_IS_STORY;
            } else {
                this.is_story = num8;
            }
            this.origin_thread_info = builder.origin_thread_info;
            String str6 = builder.post_from;
            if (str6 == null) {
                this.post_from = "";
            } else {
                this.post_from = str6;
            }
            Integer num9 = builder.is_share_thread;
            if (num9 == null) {
                this.is_share_thread = DEFAULT_IS_SHARE_THREAD;
            } else {
                this.is_share_thread = num9;
            }
            String str7 = builder.thread_img_url;
            if (str7 == null) {
                this.thread_img_url = "";
            } else {
                this.thread_img_url = str7;
            }
            this.thread_author_user = builder.thread_author_user;
            Integer num10 = builder.is_bjh;
            if (num10 == null) {
                this.is_bjh = DEFAULT_IS_BJH;
            } else {
                this.is_bjh = num10;
            }
            this.baijiahao = builder.baijiahao;
            List<NewFloorInfo> list = builder.new_floor_info;
            if (list == null) {
                this.new_floor_info = DEFAULT_NEW_FLOOR_INFO;
            } else {
                this.new_floor_info = Message.immutableCopyOf(list);
            }
            Integer num11 = builder.has_agree;
            if (num11 == null) {
                this.has_agree = DEFAULT_HAS_AGREE;
            } else {
                this.has_agree = num11;
            }
            String str8 = builder.target_scheme;
            if (str8 == null) {
                this.target_scheme = "";
            } else {
                this.target_scheme = str8;
            }
            String str9 = builder.display_text;
            if (str9 == null) {
                this.display_text = "";
            } else {
                this.display_text = str9;
            }
            Integer num12 = builder.is_filter;
            if (num12 == null) {
                this.is_filter = DEFAULT_IS_FILTER;
            } else {
                this.is_filter = num12;
            }
            String str10 = builder.first_scheme;
            if (str10 == null) {
                this.first_scheme = "";
            } else {
                this.first_scheme = str10;
            }
            String str11 = builder.second_scheme;
            if (str11 == null) {
                this.second_scheme = "";
            } else {
                this.second_scheme = str11;
            }
            String str12 = builder.third_scheme;
            if (str12 == null) {
                this.third_scheme = "";
                return;
            } else {
                this.third_scheme = str12;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.time = builder.time;
        this.title = builder.title;
        this.fname = builder.fname;
        this.content = builder.content;
        this.is_floor = builder.is_floor;
        this.quote_content = builder.quote_content;
        this.replyer = builder.replyer;
        this.type = builder.type;
        this.unread = builder.unread;
        this.item_type = builder.item_type;
        this.zan = builder.zan;
        this.quote_pid = builder.quote_pid;
        this.quote_user = builder.quote_user;
        this.server_time = builder.server_time;
        this.thread_type = builder.thread_type;
        this.v_forum_id = builder.v_forum_id;
        this.hide_fname = builder.hide_fname;
        this.is_story = builder.is_story;
        this.origin_thread_info = builder.origin_thread_info;
        this.post_from = builder.post_from;
        this.is_share_thread = builder.is_share_thread;
        this.thread_img_url = builder.thread_img_url;
        this.thread_author_user = builder.thread_author_user;
        this.is_bjh = builder.is_bjh;
        this.baijiahao = builder.baijiahao;
        this.new_floor_info = Message.immutableCopyOf(builder.new_floor_info);
        this.has_agree = builder.has_agree;
        this.target_scheme = builder.target_scheme;
        this.display_text = builder.display_text;
        this.is_filter = builder.is_filter;
        this.first_scheme = builder.first_scheme;
        this.second_scheme = builder.second_scheme;
        this.third_scheme = builder.third_scheme;
    }
}