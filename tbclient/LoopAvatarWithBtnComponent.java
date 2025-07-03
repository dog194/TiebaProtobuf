package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class LoopAvatarWithBtnComponent extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final List<String> DEFAULT_IMG_URLS = Collections.emptyList();

    @ProtoField(tag = 3)
    public final FeedButton button;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> img_urls;

    public static final class Builder extends Message.Builder<LoopAvatarWithBtnComponent> {
        public FeedButton button;
        public String content;
        public List<String> img_urls;

        public Builder() {
        }

        public Builder(LoopAvatarWithBtnComponent loopAvatarWithBtnComponent) {
            super(loopAvatarWithBtnComponent);
            if (loopAvatarWithBtnComponent == null) {
                return;
            }
            this.img_urls = Message.copyOf(loopAvatarWithBtnComponent.img_urls);
            this.content = loopAvatarWithBtnComponent.content;
            this.button = loopAvatarWithBtnComponent.button;
        }

        @Override // com.squareup.wire.Message.Builder
        public LoopAvatarWithBtnComponent build(boolean z) {
            return new LoopAvatarWithBtnComponent(this, z);
        }
    }

    public LoopAvatarWithBtnComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<String> list = builder.img_urls;
            if (list == null) {
                this.img_urls = DEFAULT_IMG_URLS;
            } else {
                this.img_urls = Message.immutableCopyOf(list);
            }
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            this.button = builder.button;
            return;
        }
        this.img_urls = Message.immutableCopyOf(builder.img_urls);
        this.content = builder.content;
        this.button = builder.button;
    }
}