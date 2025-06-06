package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ThreadScoreItem extends Message {
    public static final String DEFAULT_AVG_SCORE = "";
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String avg_score;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 5)
    public final Post hot_comment;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long id;

    @ProtoField(tag = 10)
    public final Post my_comment;

    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer my_score;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<FeedKV> score_user_num;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long total_user_num;
    public static final Long DEFAULT_ID = 0L;
    public static final List<FeedKV> DEFAULT_SCORE_USER_NUM = Collections.emptyList();
    public static final Long DEFAULT_TOTAL_USER_NUM = 0L;
    public static final Integer DEFAULT_MY_SCORE = 0;

    public static final class Builder extends Message.Builder<ThreadScoreItem> {
        public String avg_score;
        public String content;
        public Post hot_comment;
        public Long id;
        public Post my_comment;
        public Integer my_score;
        public String pic;
        public List<FeedKV> score_user_num;
        public String title;
        public Long total_user_num;

        public Builder() {
        }

        public Builder(ThreadScoreItem threadScoreItem) {
            super(threadScoreItem);
            if (threadScoreItem == null) {
                return;
            }
            this.id = threadScoreItem.id;
            this.pic = threadScoreItem.pic;
            this.title = threadScoreItem.title;
            this.content = threadScoreItem.content;
            this.hot_comment = threadScoreItem.hot_comment;
            this.score_user_num = Message.copyOf(threadScoreItem.score_user_num);
            this.total_user_num = threadScoreItem.total_user_num;
            this.avg_score = threadScoreItem.avg_score;
            this.my_score = threadScoreItem.my_score;
            this.my_comment = threadScoreItem.my_comment;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadScoreItem build(boolean z) {
            return new ThreadScoreItem(this, z);
        }
    }

    public ThreadScoreItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.pic;
            if (str == null) {
                this.pic = "";
            } else {
                this.pic = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
            } else {
                this.content = str3;
            }
            this.hot_comment = builder.hot_comment;
            List<FeedKV> list = builder.score_user_num;
            if (list == null) {
                this.score_user_num = DEFAULT_SCORE_USER_NUM;
            } else {
                this.score_user_num = Message.immutableCopyOf(list);
            }
            Long l2 = builder.total_user_num;
            if (l2 == null) {
                this.total_user_num = DEFAULT_TOTAL_USER_NUM;
            } else {
                this.total_user_num = l2;
            }
            String str4 = builder.avg_score;
            if (str4 == null) {
                this.avg_score = "";
            } else {
                this.avg_score = str4;
            }
            Integer num = builder.my_score;
            if (num == null) {
                this.my_score = DEFAULT_MY_SCORE;
            } else {
                this.my_score = num;
            }
            this.my_comment = builder.my_comment;
            return;
        }
        this.id = builder.id;
        this.pic = builder.pic;
        this.title = builder.title;
        this.content = builder.content;
        this.hot_comment = builder.hot_comment;
        this.score_user_num = Message.immutableCopyOf(builder.score_user_num);
        this.total_user_num = builder.total_user_num;
        this.avg_score = builder.avg_score;
        this.my_score = builder.my_score;
        this.my_comment = builder.my_comment;
    }
}