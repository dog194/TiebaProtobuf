package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedSocialComponent extends Message {
    public static final String DEFAULT_COMMENT_SCHEME = "";

    @ProtoField(tag = 1)
    public final Agree agree;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer comment_num;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String comment_scheme;

    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long fid;

    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long first_post_id;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_grayreply;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_grayshare;

    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_store;

    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<LayoutManageInfo> manage_list;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer share_num;

    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long tid;
    public static final Integer DEFAULT_COMMENT_NUM = 0;
    public static final Integer DEFAULT_SHARE_NUM = 0;
    public static final Long DEFAULT_TID = 0L;
    public static final Long DEFAULT_FID = 0L;
    public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_GRAYREPLY = 0;
    public static final Integer DEFAULT_IS_GRAYSHARE = 0;
    public static final Integer DEFAULT_IS_STORE = 0;
    public static final Long DEFAULT_FIRST_POST_ID = 0L;

    public static final class Builder extends Message.Builder<FeedSocialComponent> {
        public Agree agree;
        public Integer comment_num;
        public String comment_scheme;
        public Long fid;
        public Long first_post_id;
        public Integer is_grayreply;
        public Integer is_grayshare;
        public Integer is_store;
        public List<LayoutManageInfo> manage_list;
        public Integer share_num;
        public Long tid;

        public Builder() {
        }

        public Builder(FeedSocialComponent feedSocialComponent) {
            super(feedSocialComponent);
            if (feedSocialComponent == null) {
                return;
            }
            this.agree = feedSocialComponent.agree;
            this.comment_num = feedSocialComponent.comment_num;
            this.share_num = feedSocialComponent.share_num;
            this.tid = feedSocialComponent.tid;
            this.fid = feedSocialComponent.fid;
            this.manage_list = Message.copyOf(feedSocialComponent.manage_list);
            this.is_grayreply = feedSocialComponent.is_grayreply;
            this.is_grayshare = feedSocialComponent.is_grayshare;
            this.is_store = feedSocialComponent.is_store;
            this.first_post_id = feedSocialComponent.first_post_id;
            this.comment_scheme = feedSocialComponent.comment_scheme;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedSocialComponent build(boolean z) {
            return new FeedSocialComponent(this, z);
        }
    }

    public FeedSocialComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.agree = builder.agree;
            Integer num = builder.comment_num;
            if (num == null) {
                this.comment_num = DEFAULT_COMMENT_NUM;
            } else {
                this.comment_num = num;
            }
            Integer num2 = builder.share_num;
            if (num2 == null) {
                this.share_num = DEFAULT_SHARE_NUM;
            } else {
                this.share_num = num2;
            }
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            Long l2 = builder.fid;
            if (l2 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l2;
            }
            List<LayoutManageInfo> list = builder.manage_list;
            if (list == null) {
                this.manage_list = DEFAULT_MANAGE_LIST;
            } else {
                this.manage_list = Message.immutableCopyOf(list);
            }
            Integer num3 = builder.is_grayreply;
            if (num3 == null) {
                this.is_grayreply = DEFAULT_IS_GRAYREPLY;
            } else {
                this.is_grayreply = num3;
            }
            Integer num4 = builder.is_grayshare;
            if (num4 == null) {
                this.is_grayshare = DEFAULT_IS_GRAYSHARE;
            } else {
                this.is_grayshare = num4;
            }
            Integer num5 = builder.is_store;
            if (num5 == null) {
                this.is_store = DEFAULT_IS_STORE;
            } else {
                this.is_store = num5;
            }
            Long l3 = builder.first_post_id;
            if (l3 == null) {
                this.first_post_id = DEFAULT_FIRST_POST_ID;
            } else {
                this.first_post_id = l3;
            }
            String str = builder.comment_scheme;
            if (str == null) {
                this.comment_scheme = "";
                return;
            } else {
                this.comment_scheme = str;
                return;
            }
        }
        this.agree = builder.agree;
        this.comment_num = builder.comment_num;
        this.share_num = builder.share_num;
        this.tid = builder.tid;
        this.fid = builder.fid;
        this.manage_list = Message.immutableCopyOf(builder.manage_list);
        this.is_grayreply = builder.is_grayreply;
        this.is_grayshare = builder.is_grayshare;
        this.is_store = builder.is_store;
        this.first_post_id = builder.first_post_id;
        this.comment_scheme = builder.comment_scheme;
    }
}