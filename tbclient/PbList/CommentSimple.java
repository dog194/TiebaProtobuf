package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class CommentSimple extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_USER_NAME = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    public static final class Builder extends Message.Builder<CommentSimple> {
        public String content;
        public String user_name;

        public Builder() {
        }

        public Builder(CommentSimple commentSimple) {
            super(commentSimple);
            if (commentSimple == null) {
                return;
            }
            this.user_name = commentSimple.user_name;
            this.content = commentSimple.content;
        }

        @Override // com.squareup.wire.Message.Builder
        public CommentSimple build(boolean z) {
            return new CommentSimple(this, z);
        }
    }

    public CommentSimple(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
                return;
            } else {
                this.content = str2;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.content = builder.content;
    }
}