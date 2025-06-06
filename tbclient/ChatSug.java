package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ChatSug extends Message {
    public static final String DEFAULT_ICON = "";
    public static final List<SugList> DEFAULT_SUG_LIST = Collections.emptyList();

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<SugList> sug_list;

    public static final class Builder extends Message.Builder<ChatSug> {
        public String icon;
        public List<SugList> sug_list;

        public Builder() {
        }

        public Builder(ChatSug chatSug) {
            super(chatSug);
            if (chatSug == null) {
                return;
            }
            this.icon = chatSug.icon;
            this.sug_list = Message.copyOf(chatSug.sug_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public ChatSug build(boolean z) {
            return new ChatSug(this, z);
        }
    }

    public ChatSug(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            List<SugList> list = builder.sug_list;
            if (list == null) {
                this.sug_list = DEFAULT_SUG_LIST;
                return;
            } else {
                this.sug_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.icon = builder.icon;
        this.sug_list = Message.immutableCopyOf(builder.sug_list);
    }
}