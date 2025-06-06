package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Comment extends Message {
    public static final Long DEFAULT_COMMENT_NUM = 0L;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long comment_num;

    public static final class Builder extends Message.Builder<Comment> {
        public Long comment_num;

        public Builder() {
        }

        public Builder(Comment comment) {
            super(comment);
            if (comment == null) {
                return;
            }
            this.comment_num = comment.comment_num;
        }

        @Override // com.squareup.wire.Message.Builder
        public Comment build(boolean z) {
            return new Comment(this, z);
        }
    }

    public Comment(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.comment_num;
            if (l == null) {
                this.comment_num = DEFAULT_COMMENT_NUM;
                return;
            } else {
                this.comment_num = l;
                return;
            }
        }
        this.comment_num = builder.comment_num;
    }
}