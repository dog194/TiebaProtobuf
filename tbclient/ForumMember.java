package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ForumMember extends Message {
    public static final String DEFAULT_LEVEL_NAME = "";

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer cur_score;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_like;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String level_name;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer levelup_score;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer user_level;
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_USER_LEVEL = 0;
    public static final Integer DEFAULT_CUR_SCORE = 0;
    public static final Integer DEFAULT_LEVELUP_SCORE = 0;

    public static final class Builder extends Message.Builder<ForumMember> {
        public Integer cur_score;
        public Integer is_like;
        public String level_name;
        public Integer levelup_score;
        public Integer user_level;

        public Builder() {
        }

        public Builder(ForumMember forumMember) {
            super(forumMember);
            if (forumMember == null) {
                return;
            }
            this.is_like = forumMember.is_like;
            this.user_level = forumMember.user_level;
            this.level_name = forumMember.level_name;
            this.cur_score = forumMember.cur_score;
            this.levelup_score = forumMember.levelup_score;
        }

        @Override // com.squareup.wire.Message.Builder
        public ForumMember build(boolean z) {
            return new ForumMember(this, z);
        }
    }

    public ForumMember(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num;
            }
            Integer num2 = builder.user_level;
            if (num2 == null) {
                this.user_level = DEFAULT_USER_LEVEL;
            } else {
                this.user_level = num2;
            }
            String str = builder.level_name;
            if (str == null) {
                this.level_name = "";
            } else {
                this.level_name = str;
            }
            Integer num3 = builder.cur_score;
            if (num3 == null) {
                this.cur_score = DEFAULT_CUR_SCORE;
            } else {
                this.cur_score = num3;
            }
            Integer num4 = builder.levelup_score;
            if (num4 == null) {
                this.levelup_score = DEFAULT_LEVELUP_SCORE;
                return;
            } else {
                this.levelup_score = num4;
                return;
            }
        }
        this.is_like = builder.is_like;
        this.user_level = builder.user_level;
        this.level_name = builder.level_name;
        this.cur_score = builder.cur_score;
        this.levelup_score = builder.levelup_score;
    }
}