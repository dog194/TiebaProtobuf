package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class NewRecommend extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String avatar;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer is_brand_forum;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer member_count;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Integer DEFAULT_IS_BRAND_FORUM = 0;

    public static final class Builder extends Message.Builder<NewRecommend> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_brand_forum;
        public Integer member_count;

        public Builder() {
        }

        public Builder(NewRecommend newRecommend) {
            super(newRecommend);
            if (newRecommend == null) {
                return;
            }
            this.forum_id = newRecommend.forum_id;
            this.forum_name = newRecommend.forum_name;
            this.member_count = newRecommend.member_count;
            this.avatar = newRecommend.avatar;
            this.is_brand_forum = newRecommend.is_brand_forum;
        }

        @Override // com.squareup.wire.Message.Builder
        public NewRecommend build(boolean z) {
            return new NewRecommend(this, z);
        }
    }

    public NewRecommend(Builder builder, boolean z) {
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
            Integer num = builder.member_count;
            if (num == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num2 = builder.is_brand_forum;
            if (num2 == null) {
                this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
                return;
            } else {
                this.is_brand_forum = num2;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.member_count = builder.member_count;
        this.avatar = builder.avatar;
        this.is_brand_forum = builder.is_brand_forum;
    }
}