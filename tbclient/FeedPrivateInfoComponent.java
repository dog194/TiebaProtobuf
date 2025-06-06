package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedPrivateInfoComponent extends Message {
    public static final List<JumpText> DEFAULT_SUFFIX_LIST = Collections.emptyList();

    @ProtoField(tag = 1)
    public final JumpText main_text;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<JumpText> suffix_list;

    public static final class Builder extends Message.Builder<FeedPrivateInfoComponent> {
        public JumpText main_text;
        public List<JumpText> suffix_list;

        public Builder() {
        }

        public Builder(FeedPrivateInfoComponent feedPrivateInfoComponent) {
            super(feedPrivateInfoComponent);
            if (feedPrivateInfoComponent == null) {
                return;
            }
            this.main_text = feedPrivateInfoComponent.main_text;
            this.suffix_list = Message.copyOf(feedPrivateInfoComponent.suffix_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedPrivateInfoComponent build(boolean z) {
            return new FeedPrivateInfoComponent(this, z);
        }
    }

    public FeedPrivateInfoComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.main_text = builder.main_text;
            List<JumpText> list = builder.suffix_list;
            if (list == null) {
                this.suffix_list = DEFAULT_SUFFIX_LIST;
                return;
            } else {
                this.suffix_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.main_text = builder.main_text;
        this.suffix_list = Message.immutableCopyOf(builder.suffix_list);
    }
}