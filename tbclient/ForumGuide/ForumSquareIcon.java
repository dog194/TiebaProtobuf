package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ForumSquareIcon extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    public static final class Builder extends Message.Builder<ForumSquareIcon> {
        public String icon;
        public String name;

        public Builder() {
        }

        public Builder(ForumSquareIcon forumSquareIcon) {
            super(forumSquareIcon);
            if (forumSquareIcon == null) {
                return;
            }
            this.name = forumSquareIcon.name;
            this.icon = forumSquareIcon.icon;
        }

        @Override // com.squareup.wire.Message.Builder
        public ForumSquareIcon build(boolean z) {
            return new ForumSquareIcon(this, z);
        }
    }

    public ForumSquareIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str2;
                return;
            }
        }
        this.name = builder.name;
        this.icon = builder.icon;
    }
}