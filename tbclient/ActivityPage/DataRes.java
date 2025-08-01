package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerImage;
import tbclient.FeedKV;
import tbclient.Page;
import tbclient.ThreadInfo;

/* loaded from: classes4.dex */
public final class DataRes extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<BannerImage> banner_image;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<BannerImage> grid;

    @ProtoField(tag = 4)
    public final HotTopic hot_topic;

    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 8)
    public final Page page_info;

    @ProtoField(tag = 6)
    public final RecommendForumList recommend_forum;

    @ProtoField(tag = 7)
    public final RecommendUserList recommend_user;

    @ProtoField(tag = 5)
    public final SpecialColumnList special_column;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ThreadInfo> thread_list;
    public static final List<BannerImage> DEFAULT_BANNER_IMAGE = Collections.emptyList();
    public static final List<BannerImage> DEFAULT_GRID = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    public static final class Builder extends Message.Builder<DataRes> {
        public List<BannerImage> banner_image;
        public List<BannerImage> grid;
        public HotTopic hot_topic;
        public List<FeedKV> log_param;
        public Page page_info;
        public RecommendForumList recommend_forum;
        public RecommendUserList recommend_user;
        public SpecialColumnList special_column;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.banner_image = Message.copyOf(dataRes.banner_image);
            this.grid = Message.copyOf(dataRes.grid);
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.hot_topic = dataRes.hot_topic;
            this.special_column = dataRes.special_column;
            this.recommend_forum = dataRes.recommend_forum;
            this.recommend_user = dataRes.recommend_user;
            this.page_info = dataRes.page_info;
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
            List<BannerImage> list = builder.banner_image;
            if (list == null) {
                this.banner_image = DEFAULT_BANNER_IMAGE;
            } else {
                this.banner_image = Message.immutableCopyOf(list);
            }
            List<BannerImage> list2 = builder.grid;
            if (list2 == null) {
                this.grid = DEFAULT_GRID;
            } else {
                this.grid = Message.immutableCopyOf(list2);
            }
            List<ThreadInfo> list3 = builder.thread_list;
            if (list3 == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list3);
            }
            this.hot_topic = builder.hot_topic;
            this.special_column = builder.special_column;
            this.recommend_forum = builder.recommend_forum;
            this.recommend_user = builder.recommend_user;
            this.page_info = builder.page_info;
            List<FeedKV> list4 = builder.log_param;
            if (list4 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list4);
                return;
            }
        }
        this.banner_image = Message.immutableCopyOf(builder.banner_image);
        this.grid = Message.immutableCopyOf(builder.grid);
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.hot_topic = builder.hot_topic;
        this.special_column = builder.special_column;
        this.recommend_forum = builder.recommend_forum;
        this.recommend_user = builder.recommend_user;
        this.page_info = builder.page_info;
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}