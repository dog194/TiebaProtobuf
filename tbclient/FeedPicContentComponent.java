package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedPicContentComponent extends Message {

    @ProtoField(tag = 2)
    public final AbstractComponent _abstract;

    @ProtoField(tag = 3)
    public final FeedPicComponent pic;

    @ProtoField(tag = 4)
    public final ThreadExtShowComponent thread_ext_show;

    @ProtoField(tag = 1)
    public final TitleComponent title;

    public static final class Builder extends Message.Builder<FeedPicContentComponent> {
        public AbstractComponent _abstract;
        public FeedPicComponent pic;
        public ThreadExtShowComponent thread_ext_show;
        public TitleComponent title;

        public Builder() {
        }

        public Builder(FeedPicContentComponent feedPicContentComponent) {
            super(feedPicContentComponent);
            if (feedPicContentComponent == null) {
                return;
            }
            this.title = feedPicContentComponent.title;
            this._abstract = feedPicContentComponent._abstract;
            this.pic = feedPicContentComponent.pic;
            this.thread_ext_show = feedPicContentComponent.thread_ext_show;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedPicContentComponent build(boolean z) {
            return new FeedPicContentComponent(this, z);
        }
    }

    public FeedPicContentComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.title = builder.title;
            this._abstract = builder._abstract;
            this.pic = builder.pic;
            this.thread_ext_show = builder.thread_ext_show;
            return;
        }
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.pic = builder.pic;
        this.thread_ext_show = builder.thread_ext_show;
    }
}