package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ChatPrivate extends Message {
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_URL_RES = "";

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long bot_id;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer can_show;

    @ProtoField(tag = 5)
    public final ChatSug chat_sug;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long height;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer no_msg;

    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long plot_id;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url_res;
    public static final Long DEFAULT_HEIGHT = 0L;
    public static final Long DEFAULT_BOT_ID = 0L;
    public static final Long DEFAULT_PLOT_ID = 0L;
    public static final Integer DEFAULT_NO_MSG = 0;
    public static final Integer DEFAULT_CAN_SHOW = 0;

    public static final class Builder extends Message.Builder<ChatPrivate> {
        public Long bot_id;
        public Integer can_show;
        public ChatSug chat_sug;
        public Long height;
        public Integer no_msg;
        public Long plot_id;
        public String url;
        public String url_res;

        public Builder() {
        }

        public Builder(ChatPrivate chatPrivate) {
            super(chatPrivate);
            if (chatPrivate == null) {
                return;
            }
            this.url = chatPrivate.url;
            this.url_res = chatPrivate.url_res;
            this.height = chatPrivate.height;
            this.bot_id = chatPrivate.bot_id;
            this.chat_sug = chatPrivate.chat_sug;
            this.plot_id = chatPrivate.plot_id;
            this.no_msg = chatPrivate.no_msg;
            this.can_show = chatPrivate.can_show;
        }

        @Override // com.squareup.wire.Message.Builder
        public ChatPrivate build(boolean z) {
            return new ChatPrivate(this, z);
        }
    }

    public ChatPrivate(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.url_res;
            if (str2 == null) {
                this.url_res = "";
            } else {
                this.url_res = str2;
            }
            Long l = builder.height;
            if (l == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = l;
            }
            Long l2 = builder.bot_id;
            if (l2 == null) {
                this.bot_id = DEFAULT_BOT_ID;
            } else {
                this.bot_id = l2;
            }
            this.chat_sug = builder.chat_sug;
            Long l3 = builder.plot_id;
            if (l3 == null) {
                this.plot_id = DEFAULT_PLOT_ID;
            } else {
                this.plot_id = l3;
            }
            Integer num = builder.no_msg;
            if (num == null) {
                this.no_msg = DEFAULT_NO_MSG;
            } else {
                this.no_msg = num;
            }
            Integer num2 = builder.can_show;
            if (num2 == null) {
                this.can_show = DEFAULT_CAN_SHOW;
                return;
            } else {
                this.can_show = num2;
                return;
            }
        }
        this.url = builder.url;
        this.url_res = builder.url_res;
        this.height = builder.height;
        this.bot_id = builder.bot_id;
        this.chat_sug = builder.chat_sug;
        this.plot_id = builder.plot_id;
        this.no_msg = builder.no_msg;
        this.can_show = builder.can_show;
    }
}