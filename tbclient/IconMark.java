package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class IconMark extends Message {
    public static final String DEFAULT_TYPE = "";

    @ProtoField(tag = 2)
    public final ThemeColorInfo icon;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;

    public static final class Builder extends Message.Builder<IconMark> {
        public ThemeColorInfo icon;
        public String type;

        public Builder() {
        }

        public Builder(IconMark iconMark) {
            super(iconMark);
            if (iconMark == null) {
                return;
            }
            this.type = iconMark.type;
            this.icon = iconMark.icon;
        }

        @Override // com.squareup.wire.Message.Builder
        public IconMark build(boolean z) {
            return new IconMark(this, z);
        }
    }

    public IconMark(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            this.icon = builder.icon;
            return;
        }
        this.type = builder.type;
        this.icon = builder.icon;
    }
}