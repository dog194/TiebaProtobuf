package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Link extends Message {
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    public static final class Builder extends Message.Builder<Link> {
        public String text;
        public String url;

        public Builder() {
        }

        public Builder(Link link) {
            super(link);
            if (link == null) {
                return;
            }
            this.text = link.text;
            this.url = link.url;
        }

        @Override // com.squareup.wire.Message.Builder
        public Link build(boolean z) {
            return new Link(this, z);
        }
    }

    public Link(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.text = builder.text;
        this.url = builder.url;
    }
}