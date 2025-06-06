package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ShowPostContent extends Message {
    public static final String DEFAULT_USER_SHOW_NAME = "";

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long post_id;

    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer ptype;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<PbContent> text;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer type;

    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long user_id;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String user_show_name;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<PbContent> DEFAULT_TEXT = Collections.emptyList();
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_PTYPE = 0;

    public static final class Builder extends Message.Builder<ShowPostContent> {
        public Long post_id;
        public Integer ptype;
        public List<PbContent> text;
        public Integer type;
        public Long user_id;
        public String user_show_name;

        public Builder() {
        }

        public Builder(ShowPostContent showPostContent) {
            super(showPostContent);
            if (showPostContent == null) {
                return;
            }
            this.post_id = showPostContent.post_id;
            this.type = showPostContent.type;
            this.text = Message.copyOf(showPostContent.text);
            this.user_id = showPostContent.user_id;
            this.user_show_name = showPostContent.user_show_name;
            this.ptype = showPostContent.ptype;
        }

        @Override // com.squareup.wire.Message.Builder
        public ShowPostContent build(boolean z) {
            return new ShowPostContent(this, z);
        }
    }

    public ShowPostContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.post_id;
            if (l == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            List<PbContent> list = builder.text;
            if (list == null) {
                this.text = DEFAULT_TEXT;
            } else {
                this.text = Message.immutableCopyOf(list);
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            String str = builder.user_show_name;
            if (str == null) {
                this.user_show_name = "";
            } else {
                this.user_show_name = str;
            }
            Integer num2 = builder.ptype;
            if (num2 == null) {
                this.ptype = DEFAULT_PTYPE;
                return;
            } else {
                this.ptype = num2;
                return;
            }
        }
        this.post_id = builder.post_id;
        this.type = builder.type;
        this.text = Message.immutableCopyOf(builder.text);
        this.user_id = builder.user_id;
        this.user_show_name = builder.user_show_name;
        this.ptype = builder.ptype;
    }
}