package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SpecialPost extends Message {
    public static final Integer DEFAULT_IS_RECENT_POST = 0;
    public static final String DEFAULT_SPECIAL_TIP = "";

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_recent_post;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String special_tip;

    public static final class Builder extends Message.Builder<SpecialPost> {
        public Integer is_recent_post;
        public String special_tip;

        public Builder() {
        }

        public Builder(SpecialPost specialPost) {
            super(specialPost);
            if (specialPost == null) {
                return;
            }
            this.is_recent_post = specialPost.is_recent_post;
            this.special_tip = specialPost.special_tip;
        }

        @Override // com.squareup.wire.Message.Builder
        public SpecialPost build(boolean z) {
            return new SpecialPost(this, z);
        }
    }

    public SpecialPost(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_recent_post;
            if (num == null) {
                this.is_recent_post = DEFAULT_IS_RECENT_POST;
            } else {
                this.is_recent_post = num;
            }
            String str = builder.special_tip;
            if (str == null) {
                this.special_tip = "";
                return;
            } else {
                this.special_tip = str;
                return;
            }
        }
        this.is_recent_post = builder.is_recent_post;
        this.special_tip = builder.special_tip;
    }
}