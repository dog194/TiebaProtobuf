package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Quote extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_IP = "";
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ip;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long post_id;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    public static final class Builder extends Message.Builder<Quote> {
        public String content;
        public String ip;
        public Long post_id;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(Quote quote) {
            super(quote);
            if (quote == null) {
                return;
            }
            this.post_id = quote.post_id;
            this.user_name = quote.user_name;
            this.user_id = quote.user_id;
            this.ip = quote.ip;
            this.content = quote.content;
        }

        @Override // com.squareup.wire.Message.Builder
        public Quote build(boolean z) {
            return new Quote(this, z);
        }
    }

    public Quote(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.post_id;
            if (l == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            String str2 = builder.ip;
            if (str2 == null) {
                this.ip = "";
            } else {
                this.ip = str2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
                return;
            } else {
                this.content = str3;
                return;
            }
        }
        this.post_id = builder.post_id;
        this.user_name = builder.user_name;
        this.user_id = builder.user_id;
        this.ip = builder.ip;
        this.content = builder.content;
    }
}