package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class TextPlugin extends Message {
    public static final String DEFAULT_PLUGINS_TXT = "";
    public static final String DEFAULT_PLUGINS_TYPE = "";

    @ProtoField(tag = 3)
    public final GameDetail game_detail;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String plugins_txt;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String plugins_type;

    public static final class Builder extends Message.Builder<TextPlugin> {
        public GameDetail game_detail;
        public String plugins_txt;
        public String plugins_type;

        public Builder() {
        }

        public Builder(TextPlugin textPlugin) {
            super(textPlugin);
            if (textPlugin == null) {
                return;
            }
            this.plugins_txt = textPlugin.plugins_txt;
            this.plugins_type = textPlugin.plugins_type;
            this.game_detail = textPlugin.game_detail;
        }

        @Override // com.squareup.wire.Message.Builder
        public TextPlugin build(boolean z) {
            return new TextPlugin(this, z);
        }
    }

    public TextPlugin(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.plugins_txt;
            if (str == null) {
                this.plugins_txt = "";
            } else {
                this.plugins_txt = str;
            }
            String str2 = builder.plugins_type;
            if (str2 == null) {
                this.plugins_type = "";
            } else {
                this.plugins_type = str2;
            }
            this.game_detail = builder.game_detail;
            return;
        }
        this.plugins_txt = builder.plugins_txt;
        this.plugins_type = builder.plugins_type;
        this.game_detail = builder.game_detail;
    }
}