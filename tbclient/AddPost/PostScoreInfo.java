package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeedKV;

/* loaded from: classes4.dex */
public final class PostScoreInfo extends Message {
    public static final String DEFAULT_AVG_SCORE = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String avg_score;

    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long id;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedKV> score_user_num;

    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long total_user_num;
    public static final Long DEFAULT_TOTAL_USER_NUM = 0L;
    public static final List<FeedKV> DEFAULT_SCORE_USER_NUM = Collections.emptyList();
    public static final Long DEFAULT_ID = 0L;

    public static final class Builder extends Message.Builder<PostScoreInfo> {
        public String avg_score;
        public Long id;
        public List<FeedKV> score_user_num;
        public Long total_user_num;

        public Builder() {
        }

        public Builder(PostScoreInfo postScoreInfo) {
            super(postScoreInfo);
            if (postScoreInfo == null) {
                return;
            }
            this.avg_score = postScoreInfo.avg_score;
            this.total_user_num = postScoreInfo.total_user_num;
            this.score_user_num = Message.copyOf(postScoreInfo.score_user_num);
            this.id = postScoreInfo.id;
        }

        @Override // com.squareup.wire.Message.Builder
        public PostScoreInfo build(boolean z) {
            return new PostScoreInfo(this, z);
        }
    }

    public PostScoreInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.avg_score;
            if (str == null) {
                this.avg_score = "";
            } else {
                this.avg_score = str;
            }
            Long l = builder.total_user_num;
            if (l == null) {
                this.total_user_num = DEFAULT_TOTAL_USER_NUM;
            } else {
                this.total_user_num = l;
            }
            List<FeedKV> list = builder.score_user_num;
            if (list == null) {
                this.score_user_num = DEFAULT_SCORE_USER_NUM;
            } else {
                this.score_user_num = Message.immutableCopyOf(list);
            }
            Long l2 = builder.id;
            if (l2 == null) {
                this.id = DEFAULT_ID;
                return;
            } else {
                this.id = l2;
                return;
            }
        }
        this.avg_score = builder.avg_score;
        this.total_user_num = builder.total_user_num;
        this.score_user_num = Message.immutableCopyOf(builder.score_user_num);
        this.id = builder.id;
    }
}