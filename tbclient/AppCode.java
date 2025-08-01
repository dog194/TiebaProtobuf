package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AppCode extends Message {
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_GAME_ICON = "";
    public static final String DEFAULT_POST_URL = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String button_text;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_icon;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String post_url;

    public static final class Builder extends Message.Builder<AppCode> {
        public String button_text;
        public String game_icon;
        public String post_url;

        public Builder() {
        }

        public Builder(AppCode appCode) {
            super(appCode);
            if (appCode == null) {
                return;
            }
            this.game_icon = appCode.game_icon;
            this.post_url = appCode.post_url;
            this.button_text = appCode.button_text;
        }

        @Override // com.squareup.wire.Message.Builder
        public AppCode build(boolean z) {
            return new AppCode(this, z);
        }
    }

    public AppCode(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.game_icon;
            if (str == null) {
                this.game_icon = "";
            } else {
                this.game_icon = str;
            }
            String str2 = builder.post_url;
            if (str2 == null) {
                this.post_url = "";
            } else {
                this.post_url = str2;
            }
            String str3 = builder.button_text;
            if (str3 == null) {
                this.button_text = "";
                return;
            } else {
                this.button_text = str3;
                return;
            }
        }
        this.game_icon = builder.game_icon;
        this.post_url = builder.post_url;
        this.button_text = builder.button_text;
    }
}