package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DrawThreadPopUp extends Message {
    public static final Integer DEFAULT_IS_MATCH_LEVEL = 0;
    public static final Integer DEFAULT_NEED_FORUM_LEVEL = 0;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_match_level;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer need_forum_level;

    public static final class Builder extends Message.Builder<DrawThreadPopUp> {
        public Integer is_match_level;
        public Integer need_forum_level;

        public Builder() {
        }

        public Builder(DrawThreadPopUp drawThreadPopUp) {
            super(drawThreadPopUp);
            if (drawThreadPopUp == null) {
                return;
            }
            this.is_match_level = drawThreadPopUp.is_match_level;
            this.need_forum_level = drawThreadPopUp.need_forum_level;
        }

        @Override // com.squareup.wire.Message.Builder
        public DrawThreadPopUp build(boolean z) {
            return new DrawThreadPopUp(this, z);
        }
    }

    public DrawThreadPopUp(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_match_level;
            if (num == null) {
                this.is_match_level = DEFAULT_IS_MATCH_LEVEL;
            } else {
                this.is_match_level = num;
            }
            Integer num2 = builder.need_forum_level;
            if (num2 == null) {
                this.need_forum_level = DEFAULT_NEED_FORUM_LEVEL;
                return;
            } else {
                this.need_forum_level = num2;
                return;
            }
        }
        this.is_match_level = builder.is_match_level;
        this.need_forum_level = builder.need_forum_level;
    }
}