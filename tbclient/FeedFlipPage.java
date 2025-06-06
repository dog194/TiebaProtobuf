package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedFlipPage extends Message {

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ComponentFactory> feed_page_content;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer show_num_per_page;
    public static final Integer DEFAULT_SHOW_NUM_PER_PAGE = 0;
    public static final List<ComponentFactory> DEFAULT_FEED_PAGE_CONTENT = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedFlipPage> {
        public List<ComponentFactory> feed_page_content;
        public Integer show_num_per_page;

        public Builder() {
        }

        public Builder(FeedFlipPage feedFlipPage) {
            super(feedFlipPage);
            if (feedFlipPage == null) {
                return;
            }
            this.show_num_per_page = feedFlipPage.show_num_per_page;
            this.feed_page_content = Message.copyOf(feedFlipPage.feed_page_content);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedFlipPage build(boolean z) {
            return new FeedFlipPage(this, z);
        }
    }

    public FeedFlipPage(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.show_num_per_page;
            if (num == null) {
                this.show_num_per_page = DEFAULT_SHOW_NUM_PER_PAGE;
            } else {
                this.show_num_per_page = num;
            }
            List<ComponentFactory> list = builder.feed_page_content;
            if (list == null) {
                this.feed_page_content = DEFAULT_FEED_PAGE_CONTENT;
                return;
            } else {
                this.feed_page_content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.show_num_per_page = builder.show_num_per_page;
        this.feed_page_content = Message.immutableCopyOf(builder.feed_page_content);
    }
}