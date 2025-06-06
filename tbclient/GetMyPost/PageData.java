package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.LayoutFactory;

/* loaded from: classes4.dex */
public final class PageData extends Message {

    @ProtoField(tag = 1)
    public final LayoutFactory feed;

    public static final class Builder extends Message.Builder<PageData> {
        public LayoutFactory feed;

        public Builder() {
        }

        public Builder(PageData pageData) {
            super(pageData);
            if (pageData == null) {
                return;
            }
            this.feed = pageData.feed;
        }

        @Override // com.squareup.wire.Message.Builder
        public PageData build(boolean z) {
            return new PageData(this, z);
        }
    }

    public PageData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.feed = builder.feed;
        } else {
            this.feed = builder.feed;
        }
    }
}