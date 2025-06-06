package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GameDetail;

/* loaded from: classes4.dex */
public final class BreadcrumbNavigation extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TYPE = "";

    @ProtoField(tag = 5)
    public final GameDetail game_detail;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String type;

    public static final class Builder extends Message.Builder<BreadcrumbNavigation> {
        public GameDetail game_detail;
        public String icon;
        public String jump_url;
        public String title;
        public String type;

        public Builder() {
        }

        public Builder(BreadcrumbNavigation breadcrumbNavigation) {
            super(breadcrumbNavigation);
            if (breadcrumbNavigation == null) {
                return;
            }
            this.title = breadcrumbNavigation.title;
            this.icon = breadcrumbNavigation.icon;
            this.jump_url = breadcrumbNavigation.jump_url;
            this.type = breadcrumbNavigation.type;
            this.game_detail = breadcrumbNavigation.game_detail;
        }

        @Override // com.squareup.wire.Message.Builder
        public BreadcrumbNavigation build(boolean z) {
            return new BreadcrumbNavigation(this, z);
        }
    }

    public BreadcrumbNavigation(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            String str3 = builder.jump_url;
            if (str3 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str3;
            }
            String str4 = builder.type;
            if (str4 == null) {
                this.type = "";
            } else {
                this.type = str4;
            }
            this.game_detail = builder.game_detail;
            return;
        }
        this.title = builder.title;
        this.icon = builder.icon;
        this.jump_url = builder.jump_url;
        this.type = builder.type;
        this.game_detail = builder.game_detail;
    }
}