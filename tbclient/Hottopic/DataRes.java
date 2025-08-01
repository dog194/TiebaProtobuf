package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Banner;
import tbclient.RecomTopicList;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_RELATE_FORUM_TITLE = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<Banner> banner;

    @ProtoField(tag = 7)
    public final CommonInteraction bless_module;

    @ProtoField(tag = 8)
    public final CommonInteraction candle_module;

    @ProtoField(tag = 9)
    public final HotThread good_threads;

    @ProtoField(tag = 3)
    public final HotThread hot_thread;

    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_global_block;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_new_url;

    @ProtoField(tag = 2)
    public final MagicPost magic_post;

    @ProtoField(tag = 17)
    public final RecomTopicList next_topic;

    @ProtoField(tag = 6)
    public final PkModule pk_module;

    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<RelateForum> post_forum;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RelateForum> relate_forum;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String relate_forum_title;

    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<SpecialTopic> special_topic;

    @ProtoField(tag = 5)
    public final ThreadModule thread_module;

    @ProtoField(tag = 4)
    public final TopicInfo topic_info;

    @ProtoField(tag = 15)
    public final CommonInteraction weiguan_module;
    public static final List<RelateForum> DEFAULT_RELATE_FORUM = Collections.emptyList();
    public static final Integer DEFAULT_IS_NEW_URL = 0;
    public static final List<RelateForum> DEFAULT_POST_FORUM = Collections.emptyList();
    public static final Integer DEFAULT_IS_GLOBAL_BLOCK = 0;
    public static final List<SpecialTopic> DEFAULT_SPECIAL_TOPIC = Collections.emptyList();
    public static final List<Banner> DEFAULT_BANNER = Collections.emptyList();

    public static final class Builder extends Message.Builder<DataRes> {
        public List<Banner> banner;
        public CommonInteraction bless_module;
        public CommonInteraction candle_module;
        public HotThread good_threads;
        public HotThread hot_thread;
        public Integer is_global_block;
        public Integer is_new_url;
        public MagicPost magic_post;
        public RecomTopicList next_topic;
        public PkModule pk_module;
        public List<RelateForum> post_forum;
        public List<RelateForum> relate_forum;
        public String relate_forum_title;
        public List<SpecialTopic> special_topic;
        public ThreadModule thread_module;
        public TopicInfo topic_info;
        public CommonInteraction weiguan_module;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.relate_forum = Message.copyOf(dataRes.relate_forum);
            this.magic_post = dataRes.magic_post;
            this.hot_thread = dataRes.hot_thread;
            this.topic_info = dataRes.topic_info;
            this.thread_module = dataRes.thread_module;
            this.pk_module = dataRes.pk_module;
            this.bless_module = dataRes.bless_module;
            this.candle_module = dataRes.candle_module;
            this.good_threads = dataRes.good_threads;
            this.is_new_url = dataRes.is_new_url;
            this.post_forum = Message.copyOf(dataRes.post_forum);
            this.is_global_block = dataRes.is_global_block;
            this.special_topic = Message.copyOf(dataRes.special_topic);
            this.relate_forum_title = dataRes.relate_forum_title;
            this.weiguan_module = dataRes.weiguan_module;
            this.banner = Message.copyOf(dataRes.banner);
            this.next_topic = dataRes.next_topic;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<RelateForum> list = builder.relate_forum;
            if (list == null) {
                this.relate_forum = DEFAULT_RELATE_FORUM;
            } else {
                this.relate_forum = Message.immutableCopyOf(list);
            }
            this.magic_post = builder.magic_post;
            this.hot_thread = builder.hot_thread;
            this.topic_info = builder.topic_info;
            this.thread_module = builder.thread_module;
            this.pk_module = builder.pk_module;
            this.bless_module = builder.bless_module;
            this.candle_module = builder.candle_module;
            this.good_threads = builder.good_threads;
            Integer num = builder.is_new_url;
            if (num == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = num;
            }
            List<RelateForum> list2 = builder.post_forum;
            if (list2 == null) {
                this.post_forum = DEFAULT_POST_FORUM;
            } else {
                this.post_forum = Message.immutableCopyOf(list2);
            }
            Integer num2 = builder.is_global_block;
            if (num2 == null) {
                this.is_global_block = DEFAULT_IS_GLOBAL_BLOCK;
            } else {
                this.is_global_block = num2;
            }
            List<SpecialTopic> list3 = builder.special_topic;
            if (list3 == null) {
                this.special_topic = DEFAULT_SPECIAL_TOPIC;
            } else {
                this.special_topic = Message.immutableCopyOf(list3);
            }
            String str = builder.relate_forum_title;
            if (str == null) {
                this.relate_forum_title = "";
            } else {
                this.relate_forum_title = str;
            }
            this.weiguan_module = builder.weiguan_module;
            List<Banner> list4 = builder.banner;
            if (list4 == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = Message.immutableCopyOf(list4);
            }
            this.next_topic = builder.next_topic;
            return;
        }
        this.relate_forum = Message.immutableCopyOf(builder.relate_forum);
        this.magic_post = builder.magic_post;
        this.hot_thread = builder.hot_thread;
        this.topic_info = builder.topic_info;
        this.thread_module = builder.thread_module;
        this.pk_module = builder.pk_module;
        this.bless_module = builder.bless_module;
        this.candle_module = builder.candle_module;
        this.good_threads = builder.good_threads;
        this.is_new_url = builder.is_new_url;
        this.post_forum = Message.immutableCopyOf(builder.post_forum);
        this.is_global_block = builder.is_global_block;
        this.special_topic = Message.immutableCopyOf(builder.special_topic);
        this.relate_forum_title = builder.relate_forum_title;
        this.weiguan_module = builder.weiguan_module;
        this.banner = Message.immutableCopyOf(builder.banner);
        this.next_topic = builder.next_topic;
    }
}