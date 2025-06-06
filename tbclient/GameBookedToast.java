package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GameBookedToast extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_SCHEME = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String scheme;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    public static final class Builder extends Message.Builder<GameBookedToast> {
        public String desc;
        public String icon;
        public String scheme;
        public String title;

        public Builder() {
        }

        public Builder(GameBookedToast gameBookedToast) {
            super(gameBookedToast);
            if (gameBookedToast == null) {
                return;
            }
            this.title = gameBookedToast.title;
            this.desc = gameBookedToast.desc;
            this.icon = gameBookedToast.icon;
            this.scheme = gameBookedToast.scheme;
        }

        @Override // com.squareup.wire.Message.Builder
        public GameBookedToast build(boolean z) {
            return new GameBookedToast(this, z);
        }
    }

    public GameBookedToast(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
            } else {
                this.desc = str2;
            }
            String str3 = builder.icon;
            if (str3 == null) {
                this.icon = "";
            } else {
                this.icon = str3;
            }
            String str4 = builder.scheme;
            if (str4 == null) {
                this.scheme = "";
                return;
            } else {
                this.scheme = str4;
                return;
            }
        }
        this.title = builder.title;
        this.desc = builder.desc;
        this.icon = builder.icon;
        this.scheme = builder.scheme;
    }
}